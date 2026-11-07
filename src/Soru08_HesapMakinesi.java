import java.util.Scanner;

/** Soru 8: Basit Hesap Makinesi */
public class Soru08_HesapMakinesi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Sayiyi giriniz:");
         int s1=sc.nextInt();
         System.out.println("2. Sayiyi giriniz:");
         int s2=sc.nextInt();
         System.out.println("Yapmak istediginiz islemi seciniz: yapmak istediginiz islemtoplama ise + , cikarma ise -, bolme ise /, carpma ise * tusuna basin");
         char islem=sc.next().charAt(0);
         
             if (islem=='+') { int sonuc=s1+s2; 
             System.out.println("Sectiginiz islemin sonucu:"+s1+"+"+s2+"="+sonuc);}
             if (islem=='-') { int sonuc=s1-s2; 
             System.out.println("Sectiginiz islemin sonucu:"+s1+"-"+s2+"="+sonuc);}
             if (islem=='*') { int sonuc=s1*s2; 
             System.out.println("Sectiginiz islemin sonucu:"+s1+"*"+s2+"="+sonuc);}
             if (islem=='/') { 
                 if (s2!=0){int sonuc=s1/s2;  System.out.println("Sectiginiz islemin sonucu:"+s1+"/"+s2+"="+sonuc);} 
                 if (s2==0) { System.out.println("Bu islem tanimsizdir");}}
             else if (islem!='+'|| islem!='-'||islem!='*'||islem!='/') {System.out.println("Gecersiz islem");}

        scanner.close();
    }
}
