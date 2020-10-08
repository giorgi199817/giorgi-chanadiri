package giorgi.chanadiri;
import java.util.Scanner;
public class Main {
        public static void main(String[] args){
            int pirveli, meore, mimateba, gayofa;

            Scanner scanner = new Scanner(System.in);

            System.out.print("შეიყვანეთ ორი ციფრი : ");
            pirveli = scanner.nextInt();
            meore= scanner.nextInt();

            mimateba = pirveli + meore;


            gayofa =  pirveli / meore;

            System.out.println("Sum = " + mimateba);
            System.out.println("Division = " + gayofa);
        }

    }


