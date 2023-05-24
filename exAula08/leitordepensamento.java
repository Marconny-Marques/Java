package exAula08;

public class leitordepensamento {
    private static final String txtVal = null;

    public static void main(String[] args) {
        initComponents();
        System.out.println("Vou pensar em um valor entre 1 e 5. Tente adivinhar");
    }

    private static void initComponents() {
    }

    /**
     *
     */
    private Object lblFrase;

    public Object getLblFrase() {
        return lblFrase;
    }

    public void setLblFrase(Object lblFrase) {
        this.lblFrase = lblFrase;
    }

    /**
     * @param evt
     * @param object 
     * 
     */
    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt, Object object) {
        double n = 1 + Math.random() * (6 - 1);
        final var valor = (int) n;
        
        
        

        String f1 = "ACERTOU!";
        String f2 = "Errou! Eu pensei no valor" + valor;

        int num;
        final String res = (valor != num)?f1:f2;

        
    }
}
