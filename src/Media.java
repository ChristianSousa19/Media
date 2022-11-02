import java.util.Scanner;
public class Media {
    public static void main(String[] args) {
        System.out.println("Informe seu nome: ");
        Scanner aluno = new Scanner(System.in);
        String nome = aluno.nextLine();
        System.out.println("Informe a primeira nota: ");
        Scanner n1 = new Scanner(System.in);
        float nota1 = n1.nextFloat();
        System.out.println("Informe a segunda nota: ");
        Scanner n2 = new Scanner(System.in);
        float nota2 = n2.nextFloat();
        float m=(nota1+nota2)/2;
        System.out.format("As notas do aluno %s são %f %f sua média e %f", nome, nota1, nota2,m);
        if (m<=5) {
            System.out.format("Aluno %s reprovado",nome);
        }
        else {
            System.out.println("Aluno aprovado");
        }
    }
}






