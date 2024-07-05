import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
        String nome;
        try (Scanner sc1 = new Scanner(System.in)) {
            System.out.println("Digite seu nome:");
            nome = sc1.nextLine();
        }

        if (nome.equals("Nando")) {
            System.out.println("esse ai sou eu, ué");
        } else {
            System.out.println("Prazer em te conhecer, " + nome);
        }

        int valor = 2;
        String resposta;

        while (valor == 2) {
            System.out.println("Você gostaria de adicionar suas informações em uma struct? (sim/não)");
            try (Scanner sc2 = new Scanner(System.in)) {
                resposta = sc2.nextLine();
            }

            if (resposta.equalsIgnoreCase("sim")) {
                try (Scanner sc3 = new Scanner(System.in)) {
                    System.out.println("Digite sua data de nascimento (dd/mm/aaaa):");
                    String dateBirth = sc3.nextLine();

                    Person person = new Person(nome, dateBirth);
                    System.out.println("Informações salvas: " + person);

                    valor = 1; 
                }
            } else if (resposta.equalsIgnoreCase("não")) {
                System.out.println("Ok, até a proxima.");
                valor = 1; 
            } else {
                System.out.println("Digite 'sim' ou 'não'.");
            }
        }
    }
}
