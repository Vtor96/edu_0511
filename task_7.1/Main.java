import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

/*
 * task_7.1 - реализовать многопоточность в прокси чеккере первым и вторым способом
 * task_7.2 - рабочие ip адреса необходимо складывать в файл good.txt
 *  */

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C:\\java\\text.txt");
            int i;
            String proxy = "";

            while ((i = fin.read()) != -1){
                if(i == 13)
                    continue;
                else if(i == 10){
                    String ip = proxy.split(":")[0];
                    String port = proxy.split(":")[1];

                    /*MyThread myThread1 = new MyThread(checkProxy(ip, Integer.parseInt(port)));
                    myThread1.start();*/

                    Thread myRunnableThread1 = new Thread(new MyRunnableThread(checkProxy(ip, Integer.parseInt(port))));
                    myRunnableThread1.start();

                    /* 3 способ
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(checkProxy(ip,Integer.parseInt(port)));
                        }
                    });
                    thread.start();*/

                    proxy = "";
                }else if(i != 9){
                    proxy += (char)i;
                }else{
                    proxy += ":";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String checkProxy(String ip, int port){
        try{
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URLConnection urlConnection = new URL("https://vozhzhaev.ru/test.php").openConnection(proxy);
            InputStream is = urlConnection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            int rc;
            StringBuilder sb = new StringBuilder();
            while ((rc = reader.read()) != -1){
                sb.append((char)rc);
            }
            return "IP: " + ip + ":" + port + ANSI_GREEN + " работает" + ANSI_RESET;
        } catch (Exception e){
            return "IP: " + ip + ":" + port + ANSI_RED + " не работает" + ANSI_RESET;
        }
    }
}

/* 1 способ
class MyThread extends Thread{
    private String task;

    public MyThread(String task) {
        super();
        this.task = task;
    }

    @Override
    public void run(){
            System.out.println(task);
    }
}*/

//2 способ
class MyRunnableThread implements Runnable{
    private String task;

    public MyRunnableThread(String task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
            System.out.println(task);
    }
}
