import java.util.Scanner;
public class HavaDurumu {
    public static void main(String[] args) {
        int heat;
         Scanner input= new Scanner(System.in);

        System.out.println(" Lutfen Sicakligi Giriniz: ");
        heat= input.nextInt();

      if ( heat<5) {
          System.out.println(" Kayak Yapabilirsiniz.");
      } else if ((heat >= 5) && (heat <= 25)) {
          if (heat <=15) {
              System.out.println("Sinemaya Gidebilirsiniz.");

          } if(heat>=10) {
              System.out.println(" Piknige Gidebilirsiniz.");
          }

        }
      else {
          System.out.println("Yuzmeye Gidebilirsiniz.");
      }
    }
}
