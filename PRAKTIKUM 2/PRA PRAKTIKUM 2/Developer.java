class Developer {
    public String namaDev;
    public double rating;// TODO: Deklarasikan atribut: namaDev (String), rating (double)

    // TODO: Buat constructor untuk menginisialisasi namaDev dan rating
    Developer(String namaDev, double rating) {
        this.namaDev = namaDev;
        this.rating = rating;// HINT: this.namaDev = namaDev; dst.
    }

    // TODO: Cetak informasi developer sesuai format:
    // "Developer: <namaDev> | Rating: <rating>."
    void infoDev() {
        System.out.println("Developer: " + namaDev + " | Rating: " + rating + ".");// HINT: Gunakan System.out.println(...)
    }
}