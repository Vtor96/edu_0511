import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

import static java.net.Proxy.Type.HTTP;


public class Main{
    public static void main(String[] args){
        try{
            FileInputStream fin= new FileInputStream("C:\\java\\text.txt");
            FileOutputStream fos=new FileOutputStream("C:\\java\\good.txt");

            int i;
            String proxy = "";
            String[] proxyArr = proxy.split("\n");

            while ((i = fin.read()) != -1){ proxy += (char)i; }

            for (i = 0; i < proxyArr.length; i++){
                String ip = proxyArr[i].split("\t")[0];
                int port = Integer.parseInt(proxyArr[i].split("\t")[1].trim());
                CheckProxyThread t = new CheckProxyThread(ip, port, fos);
                t.start();
            }
        } catch (IOException e){ e.printStackTrace(); }
    }

    static boolean checkProxy(String ip,int port){
        URLConnection connection = null;

        try {
            Proxy proxy = new Proxy(HTTP,new InetSocketAddress(ip, port));

            connection = new URL("https://vozhzhaev.ru/test.php").openConnection(proxy);

            InputStream is = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);

            char[] buffer = new char[256];
            int rc;

            StringBuilder sb = new StringBuilder();

            while ((rc = reader.read(buffer)) != -1)
                sb.append(buffer, 0, rc);

            reader.close();
            if (sb.toString().equals("111"))
                return true;
        }catch (IOException e){
            return false;
        }
        return false;
    }
}

class CheckProxyThread extends Thread{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    private String ip;
    private int port;
    private  FileOutputStream fos;

    public void run(){
        if(Main.checkProxy(ip, port)){
            System.out.println(ip + ":" + port + ANSI_GREEN + " - Работает" + ANSI_RESET);
            byte[] buffer = (ip + ":" + port + "\n").getBytes();
            try {
                fos.write(buffer, 0, buffer.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(ip + ":" + port + ANSI_RED + " - Не работает" + ANSI_RESET);
        }
    }

    public CheckProxyThread(String ip, int port,FileOutputStream fos) {
        this.ip = ip;
        this.port = port;
        this.fos = fos;
    }
}
