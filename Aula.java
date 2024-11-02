import java.util.Scanner;

public class Aula {
    private int kapasitas;
    private int jumlahPekerja;
    private double hargaSewa;
    private String namaPenyewa;
    private String penanggungJawab;
    private String instansi;
    private String noTelepon;
    private boolean status;
    private int jumlahPeserta;

    public Aula() {
        this.kapasitas = 100;
        this.jumlahPekerja = 8;
        this.hargaSewa = 10000000;
        this.status = false;
        this.jumlahPeserta = 0;
    }

    Scanner input = new Scanner(System.in);

    public int getKapasitas() {
        return kapasitas;
    }

    public int getJumlahPekerja() {
        return jumlahPekerja;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public String getPenanggungJawab() {
        return penanggungJawab;
    }

    public String getInstansi() {
        return instansi;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public boolean status() {
        return status;
    }

    public int getJumlahPeserta() {
        return jumlahPeserta;
    }

    public void bookAula() {
        if (!status) {
            System.out.println("=== Pemesanan Aula ===");
            System.out.print("Masukkan Nama Penyewa: ");
            this.namaPenyewa = input.nextLine();
            System.out.print("Masukkan Nama Penanggung Jawab: ");
            this.penanggungJawab = input.nextLine();
            System.out.print("Masukkan Nama Instansi: ");
            this.instansi = input.nextLine();
            System.out.print("Masukkan Nomor Telepon: ");
            this.noTelepon = input.nextLine();

            System.out.print("Masukkan Jumlah Peserta: ");
            this.jumlahPeserta = input.nextInt();
            input.nextLine(); // Clear buffer

            if (jumlahPeserta <= kapasitas) {
                this.kapasitas -= jumlahPeserta;
                this.status = true;
                System.out.println("Aula berhasil dipesan atas nama: " + this.namaPenyewa);
                infoPemesananAula();
            } else {
                System.out.println("Pesanan gagal. Jumlah peserta melebihi kapasitas aula!");
                this.jumlahPeserta = 0; 
            }
        } else {
            System.out.println("Maaf, aula sudah dipesan.");
        }
    }


    public void infoPemesananAula() {
        System.out.println();
        System.out.println("==============================================================");
        System.out.println("==== INFORMASI AULA ====");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Kapasitas Tersisa: " + kapasitas + " orang");
        System.out.println("Jumlah Pekerja Bantuan: " + jumlahPekerja);
        System.out.println("Harga Sewa: Rp " + hargaSewa);
        System.out.println("Status: " + (status ? "Sudah dipesan" : "Tersedia"));
        if (status) {
            System.out.println("Nama Penyewa: " + namaPenyewa);
            System.out.println("Penanggung Jawab: " + penanggungJawab);
            System.out.println("Instansi: " + instansi);
            System.out.println("No Telepon: " + noTelepon);
            System.out.println("Jumlah Peserta: " + jumlahPeserta);
        }
        System.out.println("================================================================");
        System.out.println();
    }
}