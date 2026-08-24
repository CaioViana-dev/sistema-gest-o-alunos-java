package DadosAlunos;
import java.util.Scanner;

public class MenuInicial {
    public static void main(String[] args) {

        DadosAlunos.carregarDados(); //Carrega o banco de dados
        int selecionar = 0;

   Scanner scanner = new Scanner(System.in);
      
      while(true){

        System.out.println("Bem vindo(a), selecione uma opção: \n 1. Cadastrar nota \n 2. Consultar aluno \n 3. Listar todos \n 4. Salvar e sair");
        
        if (scanner.hasNextInt()){

        selecionar = scanner.nextInt();

        switch(selecionar){

        case 1 -> CalculadoraMedia.CalcularMedia(scanner); //Chama a calculadora
        case 2 ->  DadosAlunos.consultarAlunos(scanner); //Consulta aluno específico
        case 3 -> DadosAlunos.exibirAlunos(); //Mostra a nota de todos os alunos registrados    
        case 4 -> {scanner.close();
            DadosAlunos.SalvarDados();         //Encerra o programa
            return;
       }
       default -> System.out.println("Opção inválida");
        }
    }

    else {

        System.out.println("Opção inválida");
        scanner.next();
    }
    }
}
}
