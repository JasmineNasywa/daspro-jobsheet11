public class pengunjungkafe12 {
    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung");
        // for (int i = 0; i < namaPengunjung.length; i++) {
        //     System.out.println("- " + namaPengunjung[i]);
        // }

        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}
