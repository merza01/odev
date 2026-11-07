import java.util.Scanner;

/** Soru 2: Pozitif, Negatif veya Sıfır */
public class Soru02_PozitifNegatifSifir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Bir sayi giriniz.");
        int s1 =sc.nextInt();
        if (s1==0) { System.out.println("Girdiginiz "  +s1+" sayisi sifirdir.");   }                                                                                                                   
        else if (s1>0) { System.out.println("Girdiginiz "+s1+" sayisi pozitiftir");}
        else if (s1<0) { System.out.println("Girdiginiz "+s1+" sayisi negatiftir"); }
        
        scanner.close();
    }
}
