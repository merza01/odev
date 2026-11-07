import java.util.Scanner;

/** Soru 5: Not Değerlendirme */
public class Soru05_NotDegerlendirme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Notunuzu giriniz;");
         int not=sc.nextInt();
         if (not>=90 && not<=100){ System.out.println("Not degerlendirmeniz AA ' dir.");}
         if (not>=80 && not<=89) { System.out.println("Not degerlendirmeniz BA ' dir.");}
         if (not>=70 && not<=79) { System.out.println("Not degerlendirmeniz BB ' dir.");        }
         if (not>=60 && not<=69){ System.out.println("Not degerlendirmeniz CB ' dir.");}
         if (not>=50 && not<=59){ System.out.println("Not degerlendirmeniz CC ' dir.");}
         if (not>=0 && not<=49){ System.out.println("Not degerlendirmeniz FF ' dir.");}
         if (not>100){ System.out.println("Girdiginiz not hatalidir");} 
         else System.out.println("Girdiginiz not hatalidir");
               
        scanner.close();
    }
}
