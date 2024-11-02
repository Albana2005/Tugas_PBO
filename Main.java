import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Kamar_reguler kmr = new  Kamar_reguler();
        Kamar_vip vip = new Kamar_vip();
        Meeting_room mt = new Meeting_room();
        Aula aula = new Aula();
        System.out.println("==============================");
        System.out.println("|SELAMAT DATANG DI HOTEL RATU|");
        System.out.println("==============================");
        char lanjut;
        do{
        System.out.println("==============================");
        System.out.println("|         PILIHAN KAMAR      |");
        System.out.println("==============================");
        System.out.println("| 1. Kamar Reguler           |");
        System.out.println("| 2. Kamar VIP               |");
        System.out.println("| 3. Ruang Meeting           |");
        System.out.println("| 4. Penyewaan Aula          |");
        System.out.println("| 5. Lihat Data Tamu         |");
        System.out.println("| 6. Keluar                  |");
        System.out.println("==============================");
        System.out.print("Pilihan Anda: ");
        int pilih = in.nextInt();
        switch (pilih) {
            case 1:            
            kmr.sewaKamar();    
            break;
            case 2:
            vip.sewaKamar();
            break;
            case 3:
            mt.sewaMeetingRoom();
            break;
            case 4:
            aula.bookAula();
            break;

            case 5:
            kmr.lihatTamu();
            vip.lihatTamu();
            mt.lihatTamu();
            aula.infoPemesananAula();
            break;

            case 6:
            System.out.println("TERIMA KASIH SUDAH MENGGUNAKAN HOTEL KAMI");
            System.exit(0);

            default:
            System.out.println("PILIHAN TIDAK TERSEDIA");
            
        }
            System.out.print("Apakah ingin lanjut memilih (y/n): ");
             lanjut = in.next().charAt(0);
        }while(lanjut == 'y' || lanjut == 'Y');

    }
}