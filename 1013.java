import java.io.IOException;
import java.util.Scanner;

public class MyClass {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor:");
        int valor1 = leitor.nextInt();
        
        System.out.println("Digite o segundo valor:");
        int valor2 = leitor.nextInt();
        
        System.out.println("Digite o terceiro valor:");
        int valor3 = leitor.nextInt();
        
        
        if (valor1 > valor2 && valor1 > valor3) {
        	System.out.println(valor1 + " eh o maior");
        } else if (valor2 > valor3) {
        	System.out.println(valor2 + " eh o maior");
        } else {
        	System.out.println(valor3 + " eh o maior");
        }
    }
	
}
