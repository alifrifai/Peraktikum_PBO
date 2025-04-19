import java.util.*;

// Abstract class User sebagai parent class
abstract class User {
    private final String id;  // final attribute (tidak bisa diubah setelah inisialisasi)
    private String nama;
    private String email;
    private String password;

    // Constructor
    public User(String id, String nama, String email, String password) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.password = password;
    }

    /* POLYMORPHISM: Abstract method untuk login */
    public abstract boolean login(String email, String password);

    // Getter (setId dihapus karena id bersifat final)
    public final String getId() { return id; }  // final method
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}

// INHERITANCE: Admin extends User
class Admin extends User {
    public Admin(String id, String nama, String email, String password) {
        super(id, nama, email, password);
    }

    /* POLYMORPHISM: Override method login() */
    @Override
    public boolean login(String email, String password) {
        return getEmail().equals(email) && getPassword().equals(password);
    }
}

// INHERITANCE: Customer extends User
class Customer extends User {
    private String alamat;

    public Customer(String id, String nama, String email, String password, String alamat) {
        super(id, nama, email, password);
        this.alamat = alamat;
    }

    /* POLYMORPHISM: Override method login() */
    @Override
    public boolean login(String email, String password) {
        return getEmail().equals(email) && getPassword().equals(password);
    }

    // Getter/Setter khusus Customer
    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
}

// FINAL CLASS: Film tidak bisa diinherit
final class Film {
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

    // Getter/Setter
    public String getIdFilm() { return idFilm; }
    public void setIdFilm(String idFilm) { this.idFilm = idFilm; }
    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    public double getHargaSewa() { return hargaSewa; }
    public void setHargaSewa(double hargaSewa) { this.hargaSewa = hargaSewa; }
    public boolean isKetersediaan() { return ketersediaan; }
    public void setKetersediaan(boolean ketersediaan) { this.ketersediaan = ketersediaan; }
}

// ABSTRACT CLASS: Transaksi (parent untuk Penyewaan dan Pembayaran)
abstract class Transaksi {
    private String idTransaksi;
    private String tanggal;

    public Transaksi(String idTransaksi, String tanggal) {
        this.idTransaksi = idTransaksi;
        this.tanggal = tanggal;
    }

    /* POLYMORPHISM: Abstract method untuk display details */
    public abstract void displayDetails();

    // Getter/Setter
    public String getIdTransaksi() { return idTransaksi; }
    public void setIdTransaksi(String idTransaksi) { this.idTransaksi = idTransaksi; }
    public String getTanggal() { return tanggal; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }
}

// INHERITANCE: Penyewaan extends Transaksi
class Penyewaan extends Transaksi {
    private String idFilm;
    private String idPelanggan;
    private String tanggalKembali;
    private double totalBayar;

    public Penyewaan(String idPenyewaan, String idFilm, String idPelanggan, 
                    String tanggalSewa, String tanggalKembali, double totalBayar) {
        super(idPenyewaan, tanggalSewa);
        this.idFilm = idFilm;
        this.idPelanggan = idPelanggan;
        this.tanggalKembali = tanggalKembali;
        this.totalBayar = totalBayar;
    }

    /* POLYMORPHISM: Override method displayDetails() */
    @Override
    public void displayDetails() {
        System.out.println("Detail Penyewaan:");
        System.out.println("ID: " + getIdTransaksi());
        System.out.println("Film ID: " + idFilm);
        System.out.println("Pelanggan ID: " + idPelanggan);
        System.out.println("Tanggal Sewa: " + getTanggal());
        System.out.println("Tanggal Kembali: " + tanggalKembali);
        System.out.println("Total Bayar: Rp" + totalBayar);
    }

    // Getter/Setter
    public String getIdFilm() { return idFilm; }
    public void setIdFilm(String idFilm) { this.idFilm = idFilm; }
    public String getIdPelanggan() { return idPelanggan; }
    public void setIdPelanggan(String idPelanggan) { this.idPelanggan = idPelanggan; }
    public String getTanggalKembali() { return tanggalKembali; }
    public void setTanggalKembali(String tanggalKembali) { this.tanggalKembali = tanggalKembali; }
    public double getTotalBayar() { return totalBayar; }
    public void setTotalBayar(double totalBayar) { this.totalBayar = totalBayar; }
}

// INHERITANCE: Pembayaran extends Transaksi
class Pembayaran extends Transaksi {
    private String idPenyewaan;
    private String metodePembayaran;
    private String statusPembayaran;

    public Pembayaran(String idPembayaran, String idPenyewaan, 
                     String metodePembayaran, String statusPembayaran) {
        super(idPembayaran, "Tanggal tidak tersedia");
        this.idPenyewaan = idPenyewaan;
        this.metodePembayaran = metodePembayaran;
        this.statusPembayaran = statusPembayaran;
    }

    /* POLYMORPHISM: Override method displayDetails() */
    @Override
    public void displayDetails() {
        System.out.println("Detail Pembayaran:");
        System.out.println("ID: " + getIdTransaksi());
        System.out.println("Penyewaan ID: " + idPenyewaan);
        System.out.println("Metode Pembayaran: " + metodePembayaran);
        System.out.println("Status: " + statusPembayaran);
    }

    // Getter/Setter
    public String getIdPenyewaan() { return idPenyewaan; }
    public void setIdPenyewaan(String idPenyewaan) { this.idPenyewaan = idPenyewaan; }
    public String getMetodePembayaran() { return metodePembayaran; }
    public void setMetodePembayaran(String metodePembayaran) { this.metodePembayaran = metodePembayaran; }
    public String getStatusPembayaran() { return statusPembayaran; }
    public void setStatusPembayaran(String statusPembayaran) { this.statusPembayaran = statusPembayaran; }
}

public class SewaFilm {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Film> daftarFilm = new ArrayList<>();
    static ArrayList<Customer> daftarCustomer = new ArrayList<>();
    static ArrayList<Penyewaan> daftarPenyewaan = new ArrayList<>();
    static ArrayList<Pembayaran> daftarPembayaran = new ArrayList<>();
    static Admin admin = new Admin("1", "Admin", "admin", "admin");
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
                case 3: System.out.println("Terima kasih telah menggunakan program ini..."); return;
                default: System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void loginAdmin() {
        System.out.print("Username: "); String user = input.nextLine();
        System.out.print("Password: "); String pass = input.nextLine();
        if (admin.login(user, pass)) {
            menuAdmin();
        } else {
            System.out.println("Login gagal!");
        }
    }

    static void loginCustomer() {
        System.out.println("1. Sudah punya akun?");
        System.out.println("2. Belum punya akun?");
        System.out.print("Pilih: ");
        int pilihan = input.nextInt(); input.nextLine();

        if (pilihan == 1) {
            System.out.print("Email: "); String email = input.nextLine();
            System.out.print("Password: "); String pass = input.nextLine();
            for (Customer c : daftarCustomer) {
                if (c.login(email, pass)) {
                    currentCustomer = c;
                    System.out.println("Login berhasil!");
                    menuCustomer();
                    return;
                }
            }
            System.out.println("Login gagal!");
        } else if (pilihan == 2) {
            String id = "C" + customerCounter++;
            System.out.print("Nama: "); String nama = input.nextLine();
            System.out.print("Email: "); String email = input.nextLine();
            System.out.print("Password: "); String pass = input.nextLine();
            System.out.print("Alamat: "); String alamat = input.nextLine();
            daftarCustomer.add(new Customer(id, nama, email, pass, alamat));
            System.out.println("Customer berhasil terdaftar dengan ID: " + id);
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    static void menuAdmin() {
        while (true) {
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
            int pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1: tambahFilm(); break;
                case 2: lihatFilm(); break;
                case 3: updateFilm(); break;
                case 4: hapusFilm(); break;
                case 5: lihatCustomer(); break;
                case 6: lihatPenyewaan(); break;
                case 7: lihatPembayaran(); break;
                case 8: return;
                default: System.out.println("Pilihan tidak valid!");
            }
        }
    }

    /* POLYMORPHISM: Method overloading lihatFilm() */
    static void lihatFilm() {
        System.out.println("\nDAFTAR FILM");
        System.out.printf("%-5s | %-20s | %-15s | %-10s | %-10s\n", 
            "ID", "Judul", "Genre", "Harga", "Tersedia");
        for (Film f : daftarFilm) {
            System.out.printf("%-5s | %-20s | %-15s | Rp%-8.2f | %-10s\n", 
                f.getIdFilm(), f.getJudul(), f.getGenre(), f.getHargaSewa(), 
                f.isKetersediaan() ? "Ya" : "Tidak");
        }
    }

    static void lihatFilm(String genre) {
        System.out.println("\nDAFTAR FILM - GENRE: " + genre);
        System.out.printf("%-5s | %-20s | %-15s | %-10s | %-10s\n", 
            "ID", "Judul", "Genre", "Harga", "Tersedia");
        for (Film f : daftarFilm) {
            if (f.getGenre().equalsIgnoreCase(genre)) {
                System.out.printf("%-5s | %-20s | %-15s | Rp%-8.2f | %-10s\n", 
                    f.getIdFilm(), f.getJudul(), f.getGenre(), f.getHargaSewa(), 
                    f.isKetersediaan() ? "Ya" : "Tidak");
            }
        }
    }

    static void tambahFilm() {
        String id = "F" + filmCounter++;
        System.out.print("Judul: "); String judul = input.nextLine();
        System.out.print("Genre: "); String genre = input.nextLine();
        System.out.print("Harga Sewa: "); double harga = input.nextDouble(); input.nextLine();
        daftarFilm.add(new Film(id, judul, genre, harga, true));
        System.out.println("Film berhasil ditambahkan dengan ID: " + id);
    }

    static void updateFilm() {
        lihatFilm();
        System.out.print("\nMasukkan ID Film yang ingin diupdate: ");
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
        if (!judul.isEmpty()) filmToUpdate.setJudul(judul);

        System.out.print("Genre baru (kosongkan jika tidak ingin mengubah): ");
        String genre = input.nextLine();
        if (!genre.isEmpty()) filmToUpdate.setGenre(genre);

        System.out.print("Harga Sewa baru (kosongkan jika tidak ingin mengubah): ");
        String hargaInput = input.nextLine();
        if (!hargaInput.isEmpty()) {
            filmToUpdate.setHargaSewa(Double.parseDouble(hargaInput));
        }

        System.out.println("Film berhasil diupdate!");
    }

    static void hapusFilm() {
        lihatFilm();
        System.out.print("\nMasukkan ID Film yang ingin dihapus: ");
        String idFilm = input.nextLine();
        Film filmToDelete = null;

        for (Film film : daftarFilm) {
            if (film.getIdFilm().equals(idFilm)) {
                filmToDelete = film;
                break;
            }
        }

        if (filmToDelete != null) {
            daftarFilm.remove(filmToDelete);
            System.out.println("Film berhasil dihapus!");
        } else {
            System.out.println("Film tidak ditemukan!");
        }
    }

    static void lihatCustomer() {
        System.out.println("\nDAFTAR CUSTOMER");
        System.out.printf("%-5s | %-20s | %-25s | %-30s\n", 
            "ID", "Nama", "Email", "Alamat");
        for (Customer c : daftarCustomer) {
            System.out.printf("%-5s | %-20s | %-25s | %-30s\n", 
                c.getId(), c.getNama(), c.getEmail(), c.getAlamat());
        }
    }

    static void menuCustomer() {
        while (true) {
            System.out.println("\nMENU CUSTOMER");
            System.out.println("1. Lihat Semua Film");
            System.out.println("2. Lihat Film Berdasarkan Genre");
            System.out.println("3. Sewa Film");
            System.out.println("4. Lihat Riwayat Penyewaan");
            System.out.println("5. Kembali");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt(); input.nextLine();

            switch (pilihan) {
                case 1: lihatFilm(); break;
                case 2: 
                    System.out.print("Masukkan genre film: ");
                    String genre = input.nextLine();
                    lihatFilm(genre);
                    break;
                case 3: tambahPenyewaan(); break;
                case 4: lihatPenyewaanCustomer(); break;
                case 5: currentCustomer = null; return;
                default: System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void tambahPenyewaan() {
        if (currentCustomer == null) {
            System.out.println("Anda harus login sebagai customer!");
            return;
        }

        lihatFilm();
        System.out.print("\nPilih ID Film: ");
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
        Penyewaan penyewaanBaru = new Penyewaan(
            idPenyewaan, idFilm, currentCustomer.getId(), 
            tanggalSewa, tanggalKembali, totalBayar
        );
        daftarPenyewaan.add(penyewaanBaru);

        String idPembayaran = "B" + pembayaranCounter++;
        Pembayaran pembayaranBaru = new Pembayaran(
            idPembayaran, idPenyewaan, metodePembayaran, "Lunas"
        );
        daftarPembayaran.add(pembayaranBaru);

        selectedFilm.setKetersediaan(false);
        
        System.out.println("\n=== DETAIL TRANSAKSI ===");
        penyewaanBaru.displayDetails();
        pembayaranBaru.displayDetails();
        System.out.println("\nPenyewaan berhasil ditambahkan!");
    }

    static void lihatPenyewaan() {
        System.out.println("\nDAFTAR PENYEWAAN");
        System.out.printf("%-10s | %-10s | %-15s | %-15s | %-15s | %-10s\n", 
            "ID", "Film", "Pelanggan", "Tgl Sewa", "Tgl Kembali", "Total");
        for (Penyewaan p : daftarPenyewaan) {
            System.out.printf("%-10s | %-10s | %-15s | %-15s | %-15s | Rp%-8.2f\n", 
                p.getIdTransaksi(), p.getIdFilm(), p.getIdPelanggan(), 
                p.getTanggal(), p.getTanggalKembali(), p.getTotalBayar());
        }
    }

    static void lihatPenyewaanCustomer() {
        if (currentCustomer == null) {
            System.out.println("Anda harus login sebagai customer!");
            return;
        }

        System.out.println("\nRIWAYAT PENYEWAAN ANDA");
        System.out.printf("%-10s | %-10s | %-15s | %-15s | %-10s\n", 
            "ID", "Film", "Tgl Sewa", "Tgl Kembali", "Total");
        
        boolean found = false;
        for (Penyewaan p : daftarPenyewaan) {
            if (p.getIdPelanggan().equals(currentCustomer.getId())) {
                found = true;
                System.out.printf("%-10s | %-10s | %-15s | %-15s | Rp%-8.2f\n", 
                    p.getIdTransaksi(), p.getIdFilm(), p.getTanggal(), 
                    p.getTanggalKembali(), p.getTotalBayar());
            }
        }
        
        if (!found) {
            System.out.println("Anda belum memiliki riwayat penyewaan.");
        }
    }

    static void lihatPembayaran() {
        System.out.println("\nDAFTAR PEMBAYARAN");
        System.out.printf("%-10s | %-10s | %-20s | %-15s\n", 
            "ID", "Penyewaan", "Metode Pembayaran", "Status");
        for (Pembayaran p : daftarPembayaran) {
            System.out.printf("%-10s | %-10s | %-20s | %-15s\n", 
                p.getIdTransaksi(), p.getIdPenyewaan(), 
                p.getMetodePembayaran(), p.getStatusPembayaran());
        }
    }
}