import java.util.Scanner;

public class Meeting_room {
    private Scanner input = new Scanner(System.in);
    private String atasNama;
    private int peserta;
    private int hargaNasiKotak;
    private int hargaSnack;
    private int jumlahNasiKotak;
    private int jumlahSnack;
    private int kapasitas;
    private int stokRuang;
    private int totalHarga;
    private boolean status;
    private int harga;

    public Meeting_room() {
        this.kapasitas = 20;
        this.stokRuang = 2;
        this.status = false;
        this.harga = 2000000;
    }

    public Meeting_room(String atasNama, int peserta) {
        this();
        this.atasNama = atasNama;
        this.peserta = peserta;
    }

    public void sewaMeetingRoom() {
        if (stokRuang <= 0) {
            System.out.println("Maaf, semua ruang meeting sudah penuh.");
            return;
        }
        
        System.out.print("Masukkan nama pemesan: ");
        atasNama = input.nextLine();
        System.out.print("Masukkan jumlah peserta: ");
        peserta = input.nextInt();
        
        if (peserta > kapasitas) {
            System.out.println("Jumlah peserta melebihi kapasitas ruangan (max " + kapasitas + ").");
            return;
        }
        
        System.out.println("Pilih jenis makanan:");
        System.out.println("1. Nasi Kotak (Rp 8.000)");
        System.out.println("2. Snack (Rp 5.000)");
        System.out.println("3. Nasi Kotak dan Snack (Rp 13.000)");
        System.out.print("Silahkan pilih : ");
        int pilih = input.nextInt();
        
        switch (pilih) {
            case 1:
                hargaNasiKotak = 8000;
                hargaSnack = 0;
                break;
            case 2:
                hargaNasiKotak = 0;
                hargaSnack = 5000;
                break;
            case 3:
                hargaNasiKotak = 8000;
                hargaSnack = 5000;
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
                return;
        }

        if (hargaNasiKotak > 0) {
            System.out.print("Masukkan jumlah nasi kotak yang dipesan: ");
            jumlahNasiKotak = input.nextInt();
        }
        
        if (hargaSnack > 0) {
            System.out.print("Masukkan jumlah snack yang dipesan: ");
            jumlahSnack = input.nextInt();
        }

        perhitunganHarga();
        bookRoom();
        lihatTamu();
    }

    private void perhitunganHarga() {
        totalHarga = (jumlahNasiKotak * hargaNasiKotak) + (jumlahSnack * hargaSnack) + harga;
    }

    private void bookRoom() {
        if (!status) {
            status = true;
            stokRuang--;
            System.out.println("Ruangan berhasil dipesan.");
        } else {
            System.out.println("Ruangan sudah dipesan sebelumnya.");
        }
    }

    public void lihatTamu() {
        if(status){
            System.out.println("Belum ada yang memesan Aula!!!");
        }else{
        System.out.println();
        System.out.println("======================================================================");
        System.out.println("Informasi Pemesanan Meeting Room:");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Atas Nama: " + atasNama);
        System.out.println("Jumlah Peserta: " + peserta);
        System.out.println("Nasi Kotak: " + jumlahNasiKotak + " (Harga per Nasi Kotak: Rp " + hargaNasiKotak + ")");
        System.out.println("Snack: " + jumlahSnack + " (Harga per Snack: Rp " + hargaSnack + ")");
        System.out.println("Total Harga per ruangan: Rp " + harga);    
        System.out.println("Total Biaya: Rp " + totalHarga);
        System.out.println("Status Ruangan: " + (status ? "Sudah dipesan" : "Tersedia"));
        System.out.println("Sisa Stok Ruangan: " + stokRuang);
        System.out.println("=======================================================================");
        System.out.println();
        }
    }
}