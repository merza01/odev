import java.util.Scanner;

/** Soru 4: Üç Sayının En Büyüğü */
public class Soru04_UcSayininEnBuyugu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      System.out.println("A sayisini giriniz");
         int a= sc.nextInt();
         System.out.println("B sayisini giriniz");
         int b=sc.nextInt();
         System.out.println("C sayisini giriniz");
         int c =sc.nextInt();
         
         if (a>b && a>c) { System.out.println ("En buyuk sayi A sayisidir"); }
         if (b>c && b>a) { System.out.println("En buyuk sayi B sayisidir");}
         if (c>a && c>b) { System.out.println("En buyuk sayi C sayisidir");}
         if (a==b && a==c && b==c) { System.out.println("Uc sayi esittir");}
        
        scanner.close();
    }
}
