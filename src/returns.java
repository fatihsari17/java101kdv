import java.util.Scanner;
public class returns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double para ,kdv=0.18,total,page,page2,kdv2=0.08,total2;
        System.out.print("Hesaplamak istediğiniz tutarı giriniz:");
        para = in.nextDouble();
        if (para>=0 && para<=1000){
        page = para*kdv;
        System.out.println("KDV'SİZ TUTAR: "+para);
        System.out.println("KDV: "+kdv);
        System.out.println("KDV ORANI: "+page);
        total = page +para;
        System.out.println("KDV'Lİ TUTAR: "+total);}
        else {
            page2 = para*kdv2;
            System.out.println("KDV'SİZ TUTAR: "+para);
            System.out.println("KDV: "+kdv2);
            System.out.println("KDV ORANI: "+page2);
            total2 = page2 +para;
            System.out.println("KDV'Lİ TUTAR: "+total2);

        }
        }

    }


