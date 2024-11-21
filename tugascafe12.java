import java.util.Scanner;
public class tugascafe12 {
    static void daftar() {
        System.out.println("Rekap penjualan :");
        System.out.println("Kopi = 20, 20, 25, 20, 10, 60, 10");
        System.out.println("Teh = 30, 80, 40, 10, 15, 20, 25");
        System.out.println("Es degan = 5, 9, 20, 25, 10, 5, 45");
        System.out.println("Roti bakar = 50, 8, 17, 18, 10, 30, 6");
        System.out.println("Gorengan = 15, 10, 16, 15, 10, 10, 55");
        

    }
    static int tertinggi(int datajual[][]){
        int tertinggi = 0;
            String namabioskop12, namahari12;
        for (int i = 0; i < datajual.length; i++) {
            for (int j = 0; j < datajual[i].length; j++) {
                int nilai = datajual [i][j];
                if (nilai > tertinggi ){
                    tertinggi = nilai;
                }
            }
        }
        return (tertinggi);
    }
    static void rata2 (int datajual[][]) {
        int totala = datajual[0][0] + datajual[0][1] +datajual[0][2] +datajual[0][3] +datajual[0][4] +datajual[0][5] +datajual[0][6];
        int totalb = datajual[1][0] + datajual[1][1] +datajual[1][2] +datajual[1][3] +datajual[1][4] +datajual[1][5] +datajual[1][6];
        int totalc = datajual[2][0] + datajual[2][1] +datajual[2][2] +datajual[2][3] +datajual[2][4] +datajual[2][5] +datajual[2][6];
        int totald = datajual[3][0] + datajual[3][1] +datajual[3][2] +datajual[3][3] +datajual[3][4] +datajual[3][5] +datajual[3][6];
        int totale = datajual[4][0] + datajual[4][1] +datajual[4][2] +datajual[4][3] +datajual[4][4] +datajual[4][5] +datajual[4][6];
        System.out.println("Rata-rata penjualan Kopi: " + totala/7);
        System.out.println("Rata-rata penjualan Teh: " + totalb/7);
        System.out.println("Rata-rata penjualan Es degan: " + totalc/7);
        System.out.println("Rata-rata penjualan Roti bakar: " + totald/7);
        System.out.println("Rata-rata penjualan Gorengan: " + totale/7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data;
        int datajual[][] = new int[][] {
            {20, 20, 25, 20, 10, 60, 10},
            {30, 80, 40, 10, 15, 20, 25},
            {5, 9, 20, 25, 10, 5, 45},
            {50, 8, 17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55}
        };
    

        String menu[] = new String[] {
            "Kopi", "Teh", "Es degan", "Roti Bakar", "Gorengan"
        };

        daftar();
        tertinggi(datajual);
        rata2(datajual);
    }

    
    

}
