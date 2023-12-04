import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pessoa pessoa1 = new pessoa();
        System.out.println("nome: ");
        pessoa1.nome = input.nextLine();
        System.out.println("peso: ");
        pessoa1.peso = input.nextFloat();
        System.out.println("idade: ");
        pessoa1.idade = input.nextInt();

        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.peso);
        System.out.println(pessoa1.idade);
        input.close();
    }

}
