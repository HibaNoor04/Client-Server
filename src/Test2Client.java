import java.io.IOException;
import java.util.Scanner;

public class Test2Client {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Server s1 = new Server();
        Client c1=new Client();




        System.out.println("1: Start a Server");
        System.out.println("2: Join as Client");
        int choice=0;
        System.out.println("Choose the Operation: ");
        choice=input.nextInt();
        switch (choice)
        {
            case 1:
                try {
                    s1.RunServer();
                } catch (IOException e) {
                    System.out.println("idk g khrab scenes");
                }
                break;

            case 2:
                try {
                    c1.RunClient();
                } catch (IOException e)
                {
                    System.out.println("smt wrong");
                }
        }

    }
}
