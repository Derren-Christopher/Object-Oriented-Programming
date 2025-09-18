class Player {
    public String username;
    public Avatar avatar;
    public Game game;
    public static int totalPlayer = 0;// TODO: Deklarasikan atribut: username (String), avatar (Avatar), game (Game)
    // TODO: Deklarasikan static int totalPlayer untuk menghitung total player
    // dibuat

    // TODO: Constructor set username dan avatar, dan increment totalPlayer
    Player(String username, Avatar avatar) {
        this.username = username;
        this.avatar = avatar;
        totalPlayer++;// HINT: this.username = username; dst.
    }

    // TODO: Method joinGame: set game ke g kemudian panggil g.joinGame(this)
    void joinGame(Game g) {
        this.game = g;
        g.joinGame(this);
    }

    // TODO: Tampilkan profil sesuai format:
    // Username: <username>.
    // Avatar: <namaSkin> (Lv.<level>).
    // Sedang bermain: <namaGame>.
    // ATAU jika belum gabung: Belum bergabung ke game.
    // Diakhiri 1 baris kosong
    void showProfile() {
        System.out.println("Username: " + username +".");
        System.out.println("Avatar: " + this.avatar.namaSkin + " (Lv." + this.avatar.level + ").");
        if (this.game == null){
            System.out.println("Belum bergabung ke game.");
        } else {
            System.out.println("Sedang bermain: " + this.game.namaGame + ".");
        }
        System.out.println();// HINT: Cek game == null
    }

    // TODO: Kembalikan totalPlayer
    static int getTotalPlayer() {
        return totalPlayer; // ganti dengan nilai dari totalPlayer
    }
}