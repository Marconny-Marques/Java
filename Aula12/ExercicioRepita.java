package Aula12;

import javax.swing.JOptionPane;

public class ExercicioRepita {
    public static void main(String[] args) {
        int n, s = 0;
        do { 
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html> "));
        s += n; 
        } while(n !=0);
        JOptionPane.showMessageDialog(null, "<html>Resultado final <hr>" + "A soma vale</html> " + s);
    }
}
