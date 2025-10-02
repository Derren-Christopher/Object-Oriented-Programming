class Game {
    public String namaGame;
    public String genre;
    public Developer developer;
    public int playerCount = 0;
    public static int totalGame = 0;// TODO: Deklarasi atribut: namaGame (String), genre (String), developer
    // (Developer)
    // TODO: Deklarasi atribut: playerCount (int) awal 0
    // TODO: Deklarasi atribut statik: totalGame (int)

    // TODO: Constructor set semua field dan increment totalGame
    Game(String namaGame, String genre, Developer developer) {
        this.namaGame = namaGame;
        this.genre = genre;
        this.developer = developer;
        totalGame++;// HINT: this.namaGame = ...; dst.
    }

    // TODO: Saat player join, increment playerCount dan cetak:
    // "<username> bergabung ke game <namaGame>."
    void joinGame(Player p) {
        this.playerCount++;
        System.out.println( p.username + " bergabung ke game " + this.namaGame + ".");// HINT: Akses p.username
    }

    // TODO: Kembalikan totalGame
    static int getTotalGame() {
        return totalGame; // ganti dengan nilai dari totalGame
    }
}