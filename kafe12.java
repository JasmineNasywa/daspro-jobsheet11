import java.util.Scanner;
public class kafe12 {

public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
    System.out.println("Selamat datang, " + namaPelanggan + "!");

    if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }
    if (kodePromo.equals("DISKON50")){
        System.out.println("Anda mendapatkan diskon 50%");
        double diskon = 0.5;
    }else if (kodePromo.equals("DISKON30")) {
        System.out.println("Anda mendapatkan diskon 30%");
        double diskon = 0.3;       
    }else {
        System.out.println("Kode tidak valid.");
        double diskon = 0;
    }
    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi hitam - Rp 15,000");
    System.out.println("2. Capppucino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh tarik - Rp 12,000");
    System.out.println("5. Roti bakar - Rp 10,000");
    System.out.println("6. Mie goreng - Rp 18,000");
    System.out.println("============================");
    System.out.println("silahkan pilih menu yang anda inginkan");
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Masukkan nama pelanggan: ");
    String namaPelanggan = sc.nextLine();
    System.out.print("Masukkan member (true/false): ");
    boolean isMember = sc.nextBoolean();
    sc.nextLine(); 
    
    System.out.print("Masukkan kode promo: ");
    String kodePromo = sc.nextLine();

    Menu(namaPelanggan, isMember, kodePromo);

    int totalHarga = 0;
    boolean menuLainnya = true;

    while (menuLainnya) {
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        totalHarga += hitungTotalHarga(pilihanMenu, banyakItem);  

        System.out.print("\nApakah Anda ingin memesan lagi ? (true/false): ");
        menuLainnya = sc.nextBoolean();
        sc.nextLine(); 
    }

    System.out.println("Total keseluruhan harga : Rp " + totalHarga);


    System.out.println("\nMasukkan nomor menu yang ingin anda pesan : ");
    int pilihanMenu = sc.nextInt();
    System.out.println("Masukkan jumlah item yang ingin dipesan : ");
    int banyakItem = sc.nextInt();

    totalHarga = hitungTotalHarga(pilihanMenu, banyakItem);
    System.out.println("Total harga untuk pesanan anda : Rp " + totalHarga);

}

public static int hitungTotalHarga (int pilihanMenu, int banyakItem) {
    int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    int hargaTotal = (hargaItems[pilihanMenu-1] * banyakItem);
    return hargaTotal;
}
}