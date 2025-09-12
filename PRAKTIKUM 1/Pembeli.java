public class Pembeli {
    private String namaPembeli;
    private int nomorMeja;
    private double saldoPembeli;

    /**
     * Konstruktor Pembeli
     * @param nama
     * @param nomor
     * @param saldo
     */
    public Pembeli(String nama, int nomor, double saldo) {
        namaPembeli = nama;
        nomorMeja = nomor;
        saldoPembeli = saldo;// TODO: inisialisasi atribut
    }

    /**
     * getNamaPembeli
     * @return namaPembeli
     */
    public String getNamaPembeli() {
        return namaPembeli;// TODO: return namaPembeli
    }

    /**
     * setNamaPembeli
     * @param namaBaru
     * @return void
     */
    public void setNamaPembeli(String namaBaru) {
        namaPembeli = namaBaru;// TODO: set nilai namaPembeli
    }

    /**
     * getNomorMeja
     * @return nomorMeja
     */
    public int getNomorMeja() {
        return nomorMeja;// TODO: return nomorMeja
    }

    /**
     * setNomorMeja
     * @param nomorBaru
     * @return void
     */
    public void setNomorMeja(int nomorBaru) {
        nomorMeja = nomorBaru;// TODO: set nilai nomorMeja
    }

    /**
     * getSaldo
     * @return saldoPembeli
     */
    public double getSaldo() {
        return saldoPembeli;// TODO: return saldoPembeli
    }

    /**
     * setSaldo
     * @param saldoBaru
     * @return void
     */
    public void setSaldo(double saldoBaru) {
        saldoPembeli = saldoBaru;// TODO: set nilai saldo
    }

    /**
     * cekBisaBayar
     * Mengecek apakah saldo cukup untuk membayar total harga OrderMakanan
     * @param order
     * @return true jika saldo mencukupi untuk membayar total harga OrderMakanan, selain itu false
     */
    public boolean cekBisaBayar(OrderMakanan order) {
        if (saldoPembeli >= order.getTotalHarga()){
            return true;
        }  
        return false;  // TODO: implementasi perbandingan saldo vs order.getTotalHarga()
    }
}