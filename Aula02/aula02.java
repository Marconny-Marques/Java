package Aula02;

public class aula02 {
    public static void main(String[] args) {
        caneta c1 = new caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar(); 
        
        c1.status();
        c1.rabsicar();
    }
}
