package Aula02;

public class aula02 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        caneta c1 = new caneta();
        c1.modelo ="BIC cristal";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }

    
}
