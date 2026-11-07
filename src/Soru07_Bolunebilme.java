import java.util.Scanner;

/** Soru 7: Bölünebilme Kontrolü */
public class Soru07_Bolunebilme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Bir sayi giriniz");
         int sayi=sc.nextInt();
         if (sayi%3==0 && sayi%5!=0) { System.out.println("Sayi 3'e bolunebilir.");}
         if (sayi%5==0 && sayi%3!=0) { System.out.println("Sayi 5'e bolunebilir.");}
         if (sayi%5==0 && sayi%3==0) { System.out.println("Sayi hem 3'e hem 5'e bolunebilir.");}
         if (sayi%5!=0 && sayi%3!=0) { System.out.println("Sayi ne 3'e ne 5'e bolunur");
            
        }
        
        scanner.close();
    }
}
