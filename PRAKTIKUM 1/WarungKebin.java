//PRAKTIKUM 1 NO. 3
import java.lang.System;
import java.util.Scanner;

public class WarungKebin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // TODO: Baca jumlah pembeli (N)
        // HINT: Perhatikan input setelah N ini

        int i = 0;
        while (i < N) {
            sc.nextLine();
            String nama = sc.nextLine();
            int nomorMeja = sc.nextInt();
            double saldo = sc.nextDouble();// TODO: Baca data pembeli (nama, nomorMeja, saldo)
            // HINT: Perhatikan input setelah data pembeli ini
            
            sc.nextLine();
            String namaMakanan = sc.nextLine();
            int jumlah = sc.nextInt();
            double hargaSatuan = sc.nextDouble();
            // TODO: Baca data order makanan (namaMakanan, jumlah, hargaSatuan)
            // HINT: Perhatikan input setelah data order makanan ini
            
            Pembeli pembeli = new Pembeli(nama, nomorMeja, saldo);
            OrderMakanan ordermakanan = new OrderMakanan (namaMakanan, jumlah, hargaSatuan);// TODO: Buat objek Pembeli dan OrderMakanan
            
            pembeli.cekBisaBayar(ordermakanan);// TODO: Cek apakah pembeli bisa membayar sendiri pesanannya
            
            // TODO: Jika bisa bayar, kurangi saldo pembeli
            
            System.out.println("=== Pembeli " + (i+1) + " ===");
            System.out.println("Nama: " + pembeli.getNamaPembeli() + " (Meja " + pembeli.getNomorMeja() + ")");// TODO: Cetak laporan pembeli i
            System.out.println("Pesanan: " + ordermakanan.getNamaMakanan() + " x " + ordermakanan.getcountMakanan() + " @ " + ordermakanan.getHargaSatuan());// HINT: Jika pembeli tidak bisa membayar, tidak perlu tampilkan saldo setelah bayar
            System.out.println("Total: " + ordermakanan.getTotalHarga());
            if (pembeli.cekBisaBayar(ordermakanan) == true){
                System.out.println("Bisa Bayar: Bisa");
                System.out.println("Saldo setelah bayar: " + (pembeli.getSaldo() - ordermakanan.getTotalHarga()));// HINT: Perhatikan lagi format output yang diharapkan
            } else {
                System.out.println("Bisa Bayar: Gak Bisa");
            }
            System.out.println();
            i++;
        }

        sc.close();
    }

}
