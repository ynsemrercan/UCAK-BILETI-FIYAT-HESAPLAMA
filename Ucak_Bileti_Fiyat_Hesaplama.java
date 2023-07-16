import java.util.Scanner;
public class Ucak_Bileti_Fiyat_Hesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int yas;
        double mesafeKm=0.10,mesafe,yasIndirimi,indirimliTutar,secimIndirimi,normalTutar,totalTutar;


        System.out.println("Gideceğiniz Mesafeyi KM Cinsinden Giriniz: ");
        mesafe = input.nextDouble();

        System.out.println("Yaşınızı Giriniz: ");
        yas= input.nextInt();

        System.out.println("Yolculuk Tipini Seçiniz:");
        System.out.println("1 => Tek Yön\n2 => Gidiş-Dönüş ");
        int secim =input.nextInt();

        if ((yas>=0 && yas <12 ) && (secim==1) && (mesafe>0)){

            normalTutar=mesafeKm*mesafe;
            totalTutar=normalTutar/2;
            System.out.println("Ödeyeceğiniz Tutar: "+ totalTutar);


        }
        else if ((yas>=0 && yas <12 ) && (secim==2) && (mesafe>0)){

            normalTutar=mesafeKm*mesafe;
            yasIndirimi=normalTutar-(normalTutar*0.5);
            secimIndirimi=(yasIndirimi-yasIndirimi*0.20);

            totalTutar=secimIndirimi;

            System.out.println("Ödeyeceğiniz Tutar: "+ totalTutar);


        }

        else if ((yas>=12 && yas<24) && (secim==1) && (mesafe>0)){

            normalTutar=mesafeKm*mesafe;
            totalTutar=normalTutar*0.1;

            System.out.println("Ödeyeceğiniz Tutar: "+ totalTutar);

        }
        else if ((yas>=12 && yas<24) && (secim==2) && (mesafe>0)){

            normalTutar=mesafeKm*mesafe;
            yasIndirimi=normalTutar-(normalTutar*0.1);
            secimIndirimi=(yasIndirimi-yasIndirimi*0.20);

            totalTutar=secimIndirimi;

            System.out.println("Ödeyeceğiniz Tutar: "+ totalTutar);
        }
        else if((yas>=24 && yas<65) && (secim==1)){

            normalTutar=mesafe*mesafeKm;
            System.out.println("Ödeyeceğiniz Tutar: "+ normalTutar);
        }
        else if((yas>=24 && yas<65) && (secim==2) && (mesafe>0 )){

            normalTutar=mesafe*mesafeKm;
            secimIndirimi=(normalTutar-(normalTutar*0.2));
            totalTutar=secimIndirimi;
            System.out.println("Ödeyeceğiniz Tutar: "+ totalTutar);
        }

        else if((yas>=65) && secim==1 && (mesafe>0)){

            normalTutar=mesafeKm*mesafe;
            yasIndirimi=normalTutar-normalTutar*0.3;

            totalTutar=yasIndirimi;

            System.out.println("ödeyecezğiniz Tutar: "+ totalTutar);
        }
        else if ((yas>65) && secim==2 && (mesafe>0)){

            normalTutar=mesafeKm*mesafe;
            yasIndirimi=normalTutar-(normalTutar*0.3);
            secimIndirimi=(yasIndirimi-yasIndirimi*0.20);

            totalTutar=secimIndirimi;

            System.out.println("Ödeyeceğiniz Tutar: "+ totalTutar);

        }
        else {

            System.out.println("Hatalı Giriş ");
        }



        }




    }
