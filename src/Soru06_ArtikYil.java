import java.util.Scanner;

/** Soru 6: Artık Yıl Kontrolü */
public class Soru06_ArtikYil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir yil giriniz:");
          int yil=sc.nextInt();
          if (yil%4==0) { 
               if (yil%4000==0) { System.out.println("Bu yil artik yil degildir"); }    
               if (yil%100==0 && yil%400!=0) {System.out.println("Bu yil artik yil degildir");}
               if (yil%4000!=0 && yil%400==0 && yil%4==0) { System.out.println("Yil artik yildir");}
               if (yil%4==0 && yil%100!=0) {System.out.println("Bu yil artik yildir");}
            
        }
                       
          else {System.out.println("Bu yil artik yil degildir"); }    

        scanner.close();
    }
}
