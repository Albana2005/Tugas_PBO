public class Kamar {
    
    protected int harga;
    protected int kapasitas;
    

    // Konstruktor default
    public Kamar() {
        this.harga = 0;
        this.kapasitas = 2;
        
    }

    // Konstruktor dengan parameter
    public Kamar(int harga, int kapasitas) {
        this.harga = harga;
        this.kapasitas = kapasitas;
    }

    // Metode untuk menampilkan informasi kamar
    public void infoKamar() {
        System.out.println("Harga per kamar : " + harga);
        System.out.println("Kapasitas: " + kapasitas);
    
    }

    // Getter dan Setter
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    
}