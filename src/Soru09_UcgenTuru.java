import java.util.Scanner;

/** Soru 9: Üçgen Türü Belirleme */
public class Soru09_UcgenTuru {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.println("Ucgenin a kenarinin degeri:");
        int akenar=sc.nextInt();
        System.out.println("Ucgenin b kenarinin degeri:");
        int bkenar=sc.nextInt();
        System.out.println("Ucgenin c kenarinin degeri:");
        int ckenar=sc.nextInt();
        
        if (akenar+bkenar>ckenar && akenar+ckenar>bkenar && bkenar+ckenar>akenar) { 
            if (akenar!=bkenar && akenar!=ckenar && ckenar!=bkenar) { System.out.println("Bu ucgen cesitkenar ucgendir!"); }
            if (akenar==bkenar && akenar==ckenar) { System.out.println("Bu ucgen eskennar ucgendir!");}
            if (akenar==bkenar && akenar!=ckenar || bkenar==ckenar && akenar!=bkenar|| ckenar==akenar && ckenar!=bkenar) {System.out.println("Bu ucgen ikizkenar ucgendir!");}
                
           
            
        }
        else {System.out.println("Ucgen olusturulamaz!");}

        scanner.close();
    }
}
