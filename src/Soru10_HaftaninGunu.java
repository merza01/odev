import java.util.Scanner;

/** Soru 10: Haftanın Günü */
public class Soru10_HaftaninGunu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 ila 7 arasinda bir sayi giriniz (1 ve 7 dahil)");
         int gun=sc.nextInt();
         switch (gun) {
             case 1 : System.out.println("Gunlerden Pazartesidir");
            
             break;
             case 2 : System.out.println("Gunlerden Salidir");
             break;
             case 3 : System.out.println("Gunlerden Carsambadir");
             break;
             case 4 : System.out.println("Gunlerden Persembedir");
             break;
             case 5 : System.out.println("Gunlerden Cumadir");
             break;
             case 6 : System.out.println("Gunlerden Cumartesidir");
             break;
             case 7 : System.out.println("Gunlerden Pazardir");
             break;
            default:
                System.out.println("Giris hatalidir");
               
        }

        scanner.close();
    }
}
