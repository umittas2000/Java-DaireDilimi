import java.util.Scanner;

public class DaireDilimiAlani {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double pi=3.14,r,a,sonuc;

        System.out.print("Dairenin yari capi?: ");
        r = input.nextDouble();

        System.out.print("Merkez acisi? : ");
        a = input.nextDouble();

        sonuc = (pi * (r*r) *a)/360;

        System.out.print("Daire Dilimi Alani: " + sonuc);

    }
}
