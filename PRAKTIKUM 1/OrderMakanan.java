//PRAKTIKUM 1 NO. 1
public class OrderMakanan {
    private String namaMakanan;
    private int countMakanan;
    private double hargaSatuan;

    /**
     * Konstruktor OrderMakanan
     * @param nama
     * @param count
     * @param harga
     */
    public OrderMakanan(String nama, int count, double harga) {
        namaMakanan = nama;
        countMakanan = count;
        hargaSatuan = harga;// TODO: inisialisasi atribut
    }

    /**
     * getNamaMakanan
     * @return namaMakanan
     */
    public String getNamaMakanan() {
        return namaMakanan;// TODO: return namaMakanan
    }

    /**
     * setNamaMakanan
     * @param namaBaru
     */
    public void setNamaMakanan(String namaBaru) {
        namaMakanan = namaBaru;// TODO: ubah nilai namaMakanan
    }

    /**
     * getcountMakanan
     * @return countMakanan
     */
    public int getcountMakanan() {
        return countMakanan;// TODO: return countMakanan
    }

    /**
     * setcountMakanan
     * @param countBaru
     */
    public void setcountMakanan(int countBaru) {
        countMakanan = countBaru;// TODO: ubah nilai countMakanan
    }

    /**
     * getHargaSatuan
     * @return hargaSatuan
     */
    public double getHargaSatuan() {
        return hargaSatuan;// TODO: return hargaSatuan
    }

    /**
     * setHargaSatuan
     * @param hargaBaru
     */
    public void setHargaSatuan(double hargaBaru) {
        hargaSatuan = hargaBaru;// TODO: ubah nilai hargaSatuan
    }

    /**
     * increasecountMakanan
     * Menambahkan countMakanan pesanan
     * @param tambahan
     */
    public void increasecountMakanan(int tambahan) {
        if (tambahan > 0) {
            countMakanan += tambahan;   
        }
        // TODO: tambahkan nilai countMakanan dengan tambahan
        // Hint: hanya jika tambahan > 0
    }

    /**
     * decreasecountMakanan
     * Mengurangi countMakanan pesanan
     * @param pengurangan
     */
    public void decreasecountMakanan(int pengurangan) {
        if (pengurangan > 0){
            countMakanan -= pengurangan;
        }// TODO: kurangi nilai countMakanan dengan pengurangan
        // Hint: hanya jika pengurangan > 0
    }

    /**
     * getTotalHarga
     * Menghitung total harga pesanan
     * @return totalHarga
     */
    public double getTotalHarga() {
        double totalHarga = countMakanan * hargaSatuan;
        return totalHarga;// TODO: hitung total harga pesanan
    }
}
