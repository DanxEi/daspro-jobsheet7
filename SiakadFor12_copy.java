import java.util.Scanner;

public class SiakadFor12_copy {
    public static void main(String[] args) {
        Scanner lioLantam = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for (int i = 1 ; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = lioLantam.nextDouble();
            if (nilai > tertinggi) {
            tertinggi = nilai;
            }
            if (nilai < terendah) {
            terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumblah Siswa yang LULUS: " + lulus);
        System.out.println("Jumblah Siswa yang  TIDAK LULUS: " + tidakLulus);
    }
}