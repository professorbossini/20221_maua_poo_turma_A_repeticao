import javax.swing.JOptionPane;
public class ExemploDoWhile {
    public static void main(String[] args) {
        //1, 2 ou 3
        int op = 0;
        do{
            try{
                op = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite a sua opcao")
                );
            }
            catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Somente numeros, por favor");
            }
        }while(op != 1 && op != 2 && op != 3);
        JOptionPane.showMessageDialog(null, "Ok, opcao valida");
    }
}
