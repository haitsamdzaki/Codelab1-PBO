import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Jenis Kelamin (L/P): ");
        String jenisKelamin = scanner.next().equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan";

        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        LocalDate tanggalLahir = LocalDate.parse(scanner.next());

        Period umur = Period.between(tanggalLahir, LocalDate.now());

        System.out.println("\nOutput:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Umur Anda: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan");
    }
}