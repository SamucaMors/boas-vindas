import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Olá!");
        System.out.print("Digite seu nome completo: ");
        String nome = input.nextLine();
        System.out.println("Seja bem-vindo(a) " + nome);
        System.out.print("Digite seu CPF: ");
        String cpf = input.nextLine();
        System.out.print("Digite seu idade: ");
        int idade = input.nextInt();
        System.out.print("Digite seu peso: ");
        double peso = input.nextDouble();
        System.out.print("Digite seu altura: ");
        double altura = input.nextDouble();
        System.out.print("Digite seu estado civil: ");
        input.nextLine();
        String estadoCivil = input.nextLine();

        System.out.println("Seus dados: ");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Estado civil: " + estadoCivil);

        input.close();
    }
}