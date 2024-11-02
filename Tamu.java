public class Tamu {
    private String nama;
    private String noTelpon;
    private int jumlahKamar;
    private int lamaMenginap;
    private int totalHarga;

    public Tamu(String nama, int jumlahKamar, int lamaMenginap, int totalHarga,String noTelpon) {
        this.nama = nama;
        this.jumlahKamar = jumlahKamar;
        this.lamaMenginap = lamaMenginap;
        this.totalHarga = totalHarga;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelpon(){
        return noTelpon;
    }

    public int getJumlahKamar() {
        return jumlahKamar;
    }

    public int getLamaMenginap() {
        return lamaMenginap;
    }

    public int getTotalHarga() {
        return totalHarga;
    }
}