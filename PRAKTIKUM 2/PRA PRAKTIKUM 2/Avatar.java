class Avatar {
    public String namaSkin;
    public int level;// TODO: Deklarasi atribut: namaSkin (String), level (int)

    // TODO: Constructor set namaSkin dan level
    Avatar(String namaSkin, int level) {
        this.namaSkin = namaSkin;
        this.level = level;// HINT: this.namaSkin = namaSkin; dst.
    }

    // TODO: Naikkan level (level++) dan cetak:
    // "Skin <namaSkin> naik ke level <level>."
    void upgradeLevel() {
        this.level++;
        System.out.println("Skin " + namaSkin + " naik ke level " + level + ".");// HINT: Urutan: tingkatkan level, lalu cetak
    }
}