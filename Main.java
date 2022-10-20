import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String Email;
        String m1 = null, m2 = "non valida";
        String[] splitstringa;
        String[] splitstringavalida = null;
        int i = 0;
        do {
            if (i == 0) {
                System.out.println("inserisci la tua mail");

            } else {
                System.out.println("mail non valida, inserire mail valida");

            }
            Email = in.next();
            splitstringa = Email.split("@", 2);
            m1 = splitstringa[0];
            if (splitstringa.length > 1) {
                m2 = splitstringa[1];
                splitstringavalida = m2.split("\\.", 2);
            }
            i = 1;
        } while (Email.contains("@") == false || Email.contains(".") == false || m2.contains(".") == false || splitstringa[0] == "" || splitstringavalida[0] == "" || splitstringavalida[1] == "");
        System.out.println("mail valida");
    }
}
