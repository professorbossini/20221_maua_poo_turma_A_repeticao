import java.util.Scanner;
public class ExemploWhile{
    public static void main(String[] args) {
        //construir um objeto do tipo Scanner
        Scanner leitor;
        leitor = new Scanner(System.in);
        int contador = 1;
        while (contador <= 2){
            System.out.println("Digite a primeira nota");
            double nota1 = leitor.nextDouble();
            System.out.println("Digite a segunda nota");
            double nota2 = leitor.nextDouble();
            System.out.printf("Media: %.2f\n", (nota1 + nota2) / 2);
            // contador = contador + 1;
            //contador += 1;
            //contador++;
            //++contador;
        }
        leitor.close();
    }
}