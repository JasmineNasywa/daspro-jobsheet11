import java.util.Scanner;
public class kubus12 {

    public static int hitungvolume(int r) {
        int vol = r * r * r;
        return vol;
    }

    public static int hitungLuasAlas (int r) {
        int alas = (r * r) * 6;
        return alas;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan panjang rusuk ");
        int r = sc.nextInt();

        
        System.out.println("Volume kubus adalah : ");
        hitungvolume(r);
        System.out.println("Luas Permukaan kubus adalah :");
        hitungLuasAlas(r);
    }
}
