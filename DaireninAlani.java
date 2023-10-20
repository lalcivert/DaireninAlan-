package day01;
import java.util.Scanner;
public class DaireninAlani {
    public static void main(String[] args) {

        int yariCap,taradigiAci;
        double pi=3.14,alan;

        Scanner input=new Scanner(System.in);

        System.out.println("dairenin yarıçapını giriniz: ");
        yariCap=input.nextInt();

        System.out.println("dairenin taradığı açıyı giriniz: ");
        taradigiAci=input.nextInt();

        alan=(pi*(yariCap*yariCap)*taradigiAci)/360;

        System.out.println("daire diliminin alanı: "+alan);

    }
}
