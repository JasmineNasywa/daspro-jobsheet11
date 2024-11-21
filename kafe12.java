public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
    System.out.println("Selamat datang, " + namaPelanggan + "!");

    if (isMember) {
        System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }
    if (kodePromo.equals("DISKON50")){
        System.out.println("Anda mendapatkan diskon 50%");
    }else if (kodePromo.equals("DISKON30")) {
        System.out.println("Anda mendapatkan diskon 30%");       
    }else {
        System.out.println("Kode tidak valid.");
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
    Menu("Andi", true, "DISKON50");
    Menu("Andi", true, "DISKON30");
}
