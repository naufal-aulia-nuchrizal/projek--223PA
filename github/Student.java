import java.util.Scanner;

public class Student extends LibraryMember {
    private String nim;

    public Student(String name, int memberId, String alamat, String nim) {
        super(name, memberId, alamat);
        this.nim = nim;
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Student) has borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }

    @Override
    public void returnBook(Book book, int daysLate) {
        book.setAvailable(true);
        if (daysLate > 0) {
            int fine = daysLate * 500; // Contoh denda per hari
            System.out.println("You have returned the book late. Fine: Rp" + fine);
        }
        System.out.println(getName() + " (Student) has returned the book: " + book.getTitle());
    }

    public void inputNim() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        this.nim = scanner.nextLine();
    }
}
