import java.util.Scanner;

public class Lecturer extends LibraryMember {
    private String kodeDosen;

    public Lecturer(String name, int memberId, String alamat, String kodeDosen) {
        super(name, memberId, alamat);
        this.kodeDosen = kodeDosen;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Lecturer) has borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }

    @Override
    public void returnBook(Book book, int daysLate) {
        book.setAvailable(true);
        if (daysLate > 0) {
            int fine = daysLate * 1000; // Contoh denda per hari
            System.out.println("You have returned the book late. Fine: Rp" + fine);
        }
        System.out.println(getName() + " (Lecturer) has returned the book: " + book.getTitle());
    }

    public void inputKodeDosen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kode Dosen: ");
        this.kodeDosen = scanner.nextLine();
    }
}
