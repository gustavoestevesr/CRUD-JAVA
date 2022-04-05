import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        String opcao;
        Sistema sistema = new Sistema();

        do{
            System.out.println("1. cadastrar");
            System.out.println("2. buscar");
            System.out.println("3. remover");
            System.out.println("4. listar");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    Paciente p = new Paciente();

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();

                    System.out.print("Sexo: ");
                    String sexo = scanner.next();

                    // double =  0; char = ''
                    // Double = null; Character = null;

                    scanner.nextLine(); // limpar o enter

                    System.out.print("Laudo: ");
                    String laudo = scanner.nextLine();
                    
                    // Criação do objeto Paciente (generico)
                    p = new Paciente(nome, idade, sexo.charAt(0), laudo);
                    
                    // Adicionar o objeto na lista!
                    sistema.cadastrar(p);

                    System.out.println("Paciente adicionado!");
                    break;

                case "2":
                    System.out.print("Nome buscando: ");
                    String nomeBuscando = scanner.nextLine();

                    sistema.buscar(nomeBuscando);
                    break;

                case "3":
                    System.out.print("Nome buscando: ");
                    String nomeRemovendo = scanner.nextLine();

                    sistema.remover(nomeRemovendo);
                    break;
            
                case "4":
                    sistema.listar();
                    break;

                default:
                    break;
            }
        }while( opcao != "5" );

    }
}
