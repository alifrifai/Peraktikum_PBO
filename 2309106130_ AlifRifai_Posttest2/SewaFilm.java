import java.util.*;

// Class Admin
class Admin {
    private String idAdmin;
    private String nama;
    private String email;
    private String password;

    public Admin(String idAdmin, String nama, String email, String password) {
        this.idAdmin = idAdmin;
        this.nama = nama;
        this.email = email;
        this.password = password;
    }

    // Getter dan Setter
    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

// Class Film
class Film {
    private String idFilm;
    private String judul;
    private String genre;
    private double hargaSewa;
    private boolean ketersediaan;

    public Film(String idFilm, String judul, String genre, double hargaSewa, boolean ketersediaan) {
        this.idFilm = idFilm;
        this.judul = judul;
        this.genre = genre;
        this.hargaSewa = hargaSewa;
        this.ketersediaan = ketersediaan;
    }

    // Getter dan Setter
    public String getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(String idFilm) {
        this.idFilm = idFilm;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public boolean isKetersediaan() {
        return ketersediaan;
    }

    public void setKetersediaan(boolean ketersediaan) {
        this.ketersediaan = ketersediaan;
    }
}

// Class Customer
class Customer {
    private String idCustomer;
    private String nama;
    private String email;
    private String password;
    private String alamat;

    public Customer(String idCustomer, String nama, String email, String password, String alamat) {
        this.idCustomer = idCustomer;
        this.nama = nama;
        this.email = email;
        this.password = password;
        this.alamat = alamat;
    }

    // Getter dan Setter
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

// Class Penyewaan
class Penyewaan {
    private String idPenyewaan;
    private String idFilm;
    private String idPelanggan;
    private String tanggalSewa;
    private String tanggalKembali;
    private double totalBayar;

    public Penyewaan(String idPenyewaan, String idFilm, String idPelanggan, String tanggalSewa, String tanggalKembali, double totalBayar) {
        this.idPenyewaan = idPenyewaan;
        this.idFilm = idFilm;
        this.idPelanggan = idPelanggan;
        this.tanggalSewa = tanggalSewa;
        this.tanggalKembali = tanggalKembali;
        this.totalBayar = totalBayar;
    }

    // Getter dan Setter
    public String getIdPenyewaan() {
        return idPenyewaan;
    }

    public void setIdPenyewaan(String idPenyewaan) {
        this.idPenyewaan = idPenyewaan;
    }

    public String getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(String idFilm) {
        this.idFilm = idFilm;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getTanggalSewa() {
        return tanggalSewa;
    }

    public void setTanggalSewa(String tanggalSewa) {
        this.tanggalSewa = tanggalSewa;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }
}

// Class Pembayaran
class Pembayaran {
    private String idPembayaran;
    private String idPenyewaan;
    private String metodePembayaran;
    private String statusPembayaran;

    public Pembayaran(String idPembayaran, String idPenyewaan, String metodePembayaran, String statusPembayaran) {
        this.idPembayaran = idPembayaran;
        this.idPenyewaan = idPenyewaan;
        this.metodePembayaran = metodePembayaran;
        this.statusPembayaran = statusPembayaran;
    }

    // Getter dan Setter
    public String getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public String getIdPenyewaan() {
        return idPenyewaan;
    }

    public void setIdPenyewaan(String idPenyewaan) {
        this.idPenyewaan = idPenyewaan;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }
}

public class SewaFilm {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Film> daftarFilm = new ArrayList<>();
    static ArrayList<Customer> daftarCustomer = new ArrayList<>();
    static ArrayList<Penyewaan> daftarPenyewaan = new ArrayList<>();
    static ArrayList<Pembayaran> daftarPembayaran = new ArrayList<>();
    static Admin admin = new Admin("1", "Admin", "admin@cineverse.com", "admin");
    static Customer currentCustomer = null;
    static int customerCounter = 1;
    static int filmCounter = 1;
    static int sewaCounter = 1;
    static int pembayaranCounter = 1;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== SISTEM MANAJEMEN PENYEWAAN FILM CINEVERSE ===");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Customer");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1: loginAdmin(); break;
                case 2: loginCustomer(); break;
                case 3: System.out.println("Terima kasih telah menggunakan program ini . . ."); return;
                default: System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void loginAdmin() {
        System.out.print("Username: "); String user = input.nextLine();
        System.out.print("Password: "); String pass = input.nextLine();
        if (user.equals("admin") && pass.equals("admin")) {
            menuAdmin();
        } else {
            System.out.println("Login gagal!");
        }
    }

    static void loginCustomer() {
        System.out.println("1. Sudah punya akun kak?");
        System.out.println("2. Belum punya akun kak?");
        System.out.print("Pilih: ");
        int pilihan = input.nextInt(); input.nextLine();

        if (pilihan == 1) {
            System.out.println("Silahkan login . . .");
            System.out.print("Email: "); String email = input.nextLine();
            System.out.print("Password: "); String pass = input.nextLine();
            for (Customer c : daftarCustomer) {
                if (c.getEmail().equals(email) && c.getPassword().equals(pass)) {
                    currentCustomer = c;
                    System.out.println("Login berhasil!");
                    menuCustomer();
                    return;
                }
            }
            System.out.println("Login gagal!");
        } else if (pilihan == 2) {
            System.out.println("Silahkan regis dulu ya kak . . .");
            String id = "C" + customerCounter++;
            System.out.print("Nama: "); String nama = input.nextLine();
            System.out.print("Email: "); String email = input.nextLine();
            System.out.print("Password: "); String pass = input.nextLine();
            System.out.print("Alamat: "); String alamat = input.nextLine();
            daftarCustomer.add(new Customer(id, nama, email, pass, alamat));
            System.out.println("Customer berhasil terdaftar dengan ID: " + id + "! Silakan login kembali.");
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    static void menuAdmin() {
        int pilihan;
        do {
            System.out.println("\nMENU ADMIN");
            System.out.println("1. Tambah Film");
            System.out.println("2. Lihat Film");
            System.out.println("3. Update Film");
            System.out.println("4. Hapus Film");
            System.out.println("5. Lihat Customer");
            System.out.println("6. Lihat Penyewaan");
            System.out.println("7. Lihat Pembayaran");
            System.out.println("8. Kembali");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1: tambahFilm(); break;
                case 2: lihatFilm(); break;
                case 3: updateFilm(); break;
                case 4: hapusFilm(); break;
                case 5: lihatCustomer(); break;
                case 6: lihatPenyewaan(); break;
                case 7: lihatPembayaran(); break;
                case 8: System.out.println("Logout..."); return;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (true);
    }

    static void tambahFilm() {
        String id = "F" + filmCounter++;
        System.out.print("Judul: "); String judul = input.nextLine();
        System.out.print("Genre: "); String genre = input.nextLine();
        System.out.print("Harga Sewa: "); double harga = input.nextDouble(); input.nextLine();
        daftarFilm.add(new Film(id, judul, genre, harga, true));
        System.out.println("Film berhasil ditambahkan dengan ID: " + id);
    }

    static void lihatFilm() {
        System.out.println("\nDAFTAR FILM");
        System.out.printf("%-5s | %-20s | %-15s | %-10s | %-10s\n", "ID", "Judul", "Genre", "Harga Sewa", "Tersedia");
        System.out.println("-------------------------------------------------------------------------------");
        for (Film f : daftarFilm) {
            System.out.printf("%-5s | %-20s | %-15s | Rp%-10.2f | %-10s\n", 
                f.getIdFilm(), f.getJudul(), f.getGenre(), f.getHargaSewa(), f.isKetersediaan() ? "Ya" : "Tidak");
        }
    }

    static void updateFilm() {
        lihatFilm();
        System.out.print("\nMasukkan ID Film yang ingin diupdate (note: perhatikan besar kecil hurufnya): ");
        String idFilm = input.nextLine();
        Film filmToUpdate = null;

        for (Film film : daftarFilm) {
            if (film.getIdFilm().equals(idFilm)) {
                filmToUpdate = film;
                break;
            }
        }

        if (filmToUpdate == null) {
            System.out.println("Film tidak ditemukan!");
            return;
        }

        System.out.print("Judul baru (kosongkan jika tidak ingin mengubah): ");
        String judul = input.nextLine();
        if (!judul.isEmpty()) {
            filmToUpdate.setJudul(judul);
        }

        System.out.print("Genre baru (kosongkan jika tidak ingin mengubah): ");
        String genre = input.nextLine();
        if (!genre.isEmpty()) {
            filmToUpdate.setGenre(genre);
        }

        System.out.print("Harga Sewa baru (kosongkan jika tidak ingin mengubah): ");
        String hargaInput = input.nextLine();
        if (!hargaInput.isEmpty()) {
            double harga = Double.parseDouble(hargaInput);
            filmToUpdate.setHargaSewa(harga);
        }

        System.out.println("Film berhasil diupdate!");
    }

    static void hapusFilm() {
        lihatFilm();
        System.out.print("\nMasukkan ID Film yang ingin dihapus (note: perhatikan besar kecil hurufnya): ");
        String idFilm = input.nextLine();
        Film filmToDelete = null;

        for (Film film : daftarFilm) {
            if (film.getIdFilm().equals(idFilm)) {
                filmToDelete = film;
                break;
            }
        }

        if (filmToDelete == null) {
            System.out.println("Film tidak ditemukan!");
            return;
        }

        daftarFilm.remove(filmToDelete);
        System.out.println("Film berhasil dihapus!");
    }

    static void lihatCustomer() {
        System.out.println("\nDAFTAR CUSTOMER");
        System.out.printf("%-5s | %-20s | %-25s | %-30s\n", "ID", "Nama", "Email", "Alamat");
        System.out.println("-------------------------------------------------------------------------------");
        for (Customer c : daftarCustomer) {
            System.out.printf("%-5s | %-20s | %-25s | %-30s\n", c.getIdCustomer(), c.getNama(), c.getEmail(), c.getAlamat());
        }
    }

    static void menuCustomer() {
        int pilihan;
        do {
            System.out.println("\nMENU CUSTOMER");
            System.out.println("1. Lihat Film");
            System.out.println("2. Sewa Film");
            System.out.println("3. Lihat Riwayat Penyewaan");
            System.out.println("4. Kembali");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1: lihatFilm(); break;
                case 2: tambahPenyewaan(); break;
                case 3: lihatPenyewaan(); break;
                case 4: System.out.println("Logout..."); return;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (true);
    }

    static void tambahPenyewaan() {
        if (currentCustomer == null) {
            System.out.println("Anda harus login sebagai customer untuk menyewa film!");
            return;
        }

        System.out.println("\n==============================");
        System.out.println("      DAFTAR FILM TERSEDIA    ");
        System.out.println("==============================");
        System.out.printf("| %-5s | %-20s | %-10s | %-10s |\n", "ID", "Judul", "Genre", "Harga");
        System.out.println("------------------------------------------------------------");

        for (Film film : daftarFilm) {
            if (film.isKetersediaan()) {
                System.out.printf("| %-5s | %-20s | %-10s | Rp%-8.2f |\n", 
                    film.getIdFilm(), film.getJudul(), film.getGenre(), film.getHargaSewa());
            }
        }
        System.out.println("------------------------------------------------------------");

        System.out.print("\nPilih ID Film (note: harus sama besarkecil angkanya!): ");
        String idFilm = input.nextLine();
        Film selectedFilm = null;

        for (Film film : daftarFilm) {
            if (film.getIdFilm().equals(idFilm) && film.isKetersediaan()) {
                selectedFilm = film;
                break;
            }
        }

        if (selectedFilm == null) {
            System.out.println("Film tidak ditemukan atau tidak tersedia!");
            return;
        }

        System.out.print("Tanggal Sewa (YYYY-MM-DD): "); 
        String tanggalSewa = input.nextLine();
        System.out.print("Tanggal Kembali (YYYY-MM-DD): "); 
        String tanggalKembali = input.nextLine();

        System.out.print("Pilih metode pembayaran (Cash/Transfer): ");
        String metodePembayaran = input.nextLine();

        double totalBayar = selectedFilm.getHargaSewa();
        String idPenyewaan = "S" + sewaCounter++;
        daftarPenyewaan.add(new Penyewaan(idPenyewaan, idFilm, currentCustomer.getIdCustomer(), tanggalSewa, tanggalKembali, totalBayar));

        String idPembayaran = "B" + pembayaranCounter++;
        daftarPembayaran.add(new Pembayaran(idPembayaran, idPenyewaan, metodePembayaran, "Lunas"));

        selectedFilm.setKetersediaan(false);
        System.out.println("\nPenyewaan berhasil ditambahkan dengan ID: " + idPenyewaan + "\n");
    }

    static void lihatPenyewaan() {
        System.out.println("DAFTAR PENYEWAAN");
        System.out.printf("| %-10s | %-10s | %-15s | %-15s | %-10s |\n", "ID", "Film", "Pelanggan", "Tgl Sewa", "Total Bayar");
        System.out.println("-------------------------------------------------------------------------");
        for (Penyewaan p : daftarPenyewaan) {
            System.out.printf("| %-10s | %-10s | %-15s | %-15s | Rp%-8.2f |\n", p.getIdPenyewaan(), p.getIdFilm(), p.getIdPelanggan(), p.getTanggalSewa(), p.getTotalBayar());
        }
        System.out.println("------------------------------------------------------------------------");
    }

    static void lihatPembayaran() {
        System.out.println("\nDAFTAR PEMBAYARAN");
        System.out.printf("%-10s | %-10s | %-20s | %-15s\n", "ID", "Penyewaan", "Metode Pembayaran", "Status");
        System.out.println("---------------------------------------------------------------");
        for (Pembayaran p : daftarPembayaran) {
            System.out.printf("%-10s | %-10s | %-20s | %-15s\n", p.getIdPembayaran(), p.getIdPenyewaan(), p.getMetodePembayaran(), p.getStatusPembayaran());
        }
    }
}