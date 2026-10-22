import java.util.Scanner;

public class Tugas1_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        int totalPendapatan = 0;
        
        System.out.println("=== PROGRAM PENJUALAN TIKET BIOSKOP ===");
        
        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            int jumlah = input.nextInt();
            
            if (jumlah == 0) {
                break;
            }
            
            int hargaKotor = jumlah * hargaTiket;
            double persenDiskon = 0;
            
            if (jumlah > 10) {
                persenDiskon = 0.15;
            } else if (jumlah > 4) {
                persenDiskon = 0.10; 
            }
            
            double potongan = hargaKotor * persenDiskon;
            double totalBayar = hargaKotor - potongan;
            
            System.out.println("Total bayar pelanggan: Rp " + totalBayar);
            System.out.println("----------------------------------------");
            
            totalTiketTerjual = totalTiketTerjual + jumlah;
            totalPendapatan = totalPendapatan + (int) totalBayar;
        }

        System.out.println("\n=== REKAPITULASI PENJUALAN HARIAN ===");
        System.out.println("Total Tiket Terjual : " + totalTiketTerjual + " tiket");
        System.out.println("Total Pendapatan    : Rp " + totalPendapatan);
    }
}