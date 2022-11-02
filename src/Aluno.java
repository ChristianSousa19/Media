import java.util.Scanner;

public class Aluno {
    public static void main(String[] args){
        System.out.println("Informe seu nome: ");
        Scanner aluno=new Scanner(System.in);
        String nome=aluno.nextLine();
        System.out.println("Informe sua nota: ");
        float nota=aluno.nextFloat();
        System.out.format("O Aluno %s tirou nota %.1f",nome,nota);

    }
    }