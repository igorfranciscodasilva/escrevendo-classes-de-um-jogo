import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do seu heroi");
        String nome = scanner.nextLine();
        System.out.println("Digite o numero correspondente ao tipo do seu heroi: 1 = mago, 2 = guerreiro, 3 = monge, e 4 = ninja");
        int numTipo = scanner.nextInt();
        String tipo;
        if(numTipo == 1) {
            tipo = "mago";
        } else if(numTipo == 2) {
            tipo = "guerreiro";
        } else if(numTipo == 3) {
            tipo = "monge";
        } else if(numTipo == 4) {
            tipo = "ninja";
        } else {
            tipo = "";
        }
        System.out.println("Digite a idade do seu heroi");
        int idade = scanner.nextInt();

        Heroi heroi = new Heroi(nome, idade, tipo);
        heroi.ataque();
    }
}
class Heroi {
    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void ataque(){
        if(tipo.equals("mago")) {
            System.out.println("O mago atacou usando magia.");
        } else if (tipo.equals("guerreiro")) {
            System.out.println("O guerreiro atacou usando espada.");
        } else if (tipo.equals("monge")) {
            System.out.println("O monge atacou usando artes marciais.");
        } else if(tipo.equals("ninja")){
            System.out.println("O ninja atacou usando shuriken.");
        } else {
            System.out.println("Tipo de herói inválido.");
        }
    }
}