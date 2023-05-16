package HoraDoSistema;

import java.util.Date;

public class horadosistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora exata do sistema é");
        extracted(relogio);

    }

    private static void extracted(Date relogio) {
        System.out.println(relogio.toString());
    }
}
