/*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not: Ternary Operator ya da Switch Case kullanarak yapılacak. */

import java.util.Scanner;

public class nothesaplama{
    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        System.out.print("Lütfen Matematik Notunu Giriniz: ");
        int matnot=giris.nextInt();
        System.out.print("Lütfen Fizik Notunu Giriniz: ");
        int fizknot=giris.nextInt();
        System.out.print("Lütfen Kimya Notunu Giriniz: ");
        int kimynot=giris.nextInt();
        System.out.print("Lütfen Türkçe Notunu Giriniz: ");
        int türknot=giris.nextInt();
        System.out.print("Lütfen Tarih Notunu Giriniz: ");
        int trhnot=giris.nextInt();
        System.out.print("Lütfen Müzik Notunu Giriniz: ");
        int müzknot=giris.nextInt();

        float ort= (matnot+fizknot+kimynot+türknot+trhnot+müzknot)/6;

        System.out.println("Kullanıcıdan notlarının girilmesi istenen derslerin ortalaması: "+ort);

        if(ort>50){
            System.out.println("Sınıfı Geçti!");
        }
            else{
                System.out.println("Sınıfta Kaldı!");
            }
            
    }
}