package Aula02;

public class caneta {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampada;
    public void status() {
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Uma caneta:" + this.cor);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Carga:" + this.carga);
        System.out.println(" está tampada?" + this.tampada);
    }
    public void rabsicar(){
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }
    
    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
    public void rabiscar() {
    }
}
