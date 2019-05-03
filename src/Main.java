import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static int counter = 0;
    static Timer time = new Timer();
    static TimerTask task = new TimerTask() {


        public void run() {

            counter++;


            try {
                if (counter == 1) {
                    FileReader fr = new FileReader("obrazek.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String radek = br.readLine();
                    String radek1 = br.readLine();
                    String radek2 = br.readLine();
                    String radek3 = br.readLine();
                    System.out.println(radek);
                    System.out.println(radek1);
                    System.out.println(radek2);
                    System.out.println(radek3);
                    System.out.println();
                    br.close();
                } else {

                }
            } catch (IOException e) {

            }
            try {
                if (counter == 2) {
                    FileReader fr1 = new FileReader("obrazek1.txt");
                    BufferedReader br1 = new BufferedReader(fr1);
                    String radek4 = br1.readLine();
                    String radek5 = br1.readLine();
                    String radek6 = br1.readLine();
                    String radek7 = br1.readLine();
                    System.out.println(radek4);
                    System.out.println(radek5);
                    System.out.println(radek6);
                    System.out.println(radek7);
                    System.out.println();
                    br1.close();
                } else {

                }
            } catch (IOException e) {

            }
            try {
                if (counter == 3) {
                    FileReader fr2 = new FileReader("obrazek2.txt");
                    BufferedReader br2 = new BufferedReader(fr2);
                    String radek8 = br2.readLine();
                    String radek9 = br2.readLine();
                    String radek10 = br2.readLine();
                    String radek11 = br2.readLine();
                    System.out.println(radek8);
                    System.out.println(radek9);
                    System.out.println(radek10);
                    System.out.println(radek11);
                    System.out.println();
                    br2.close();
                } else {

                }
            } catch (IOException e) {

            }
            try {
                if (counter == 4) {
                    FileReader fr3 = new FileReader("obrazek3.txt");
                    BufferedReader br3 = new BufferedReader(fr3);
                    String radek12 = br3.readLine();
                    String radek13 = br3.readLine();
                    String radek14 = br3.readLine();
                    String radek15 = br3.readLine();
                    System.out.println(radek12);
                    System.out.println(radek13);
                    System.out.println(radek14);
                    System.out.println(radek15);
                    System.out.println();
                    br3.close();
                } else {

                }
            } catch (IOException e) {

            }
        }
    };


    public static void main(String[] args) {
        hra();
    }

    public static void hra() {
        time.scheduleAtFixedRate(task, 0, 2000);
    }


}
