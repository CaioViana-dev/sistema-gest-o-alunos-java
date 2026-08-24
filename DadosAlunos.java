package DadosAlunos;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Salvar banco de dados dos alunos


public class DadosAlunos {

    static Map<String, Double> alunos = new HashMap<>();

    public static void adicionarAlunos(String nome, double media) {

        alunos.put(nome, media);

    }
        


    //Método para salvar dados dos alunos

    public static void SalvarDados(){
       try{
        FileWriter fw = new FileWriter("BancoDeDados.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        for (Map.Entry<String, Double> aluno : alunos.entrySet()){
            bw.write(aluno.getKey() + ":" + aluno.getValue());
            bw.newLine();
        }
        bw.close();
    }catch (IOException e) {
        System.out.println("Erro ao tentar salvar dados!");
    }
    }



    //Opção de exibir todos os alunos

    public static void exibirAlunos(){
        for (Map.Entry<String, Double> aluno : alunos.entrySet()){
           System.out.printf("%s: %.2f%n", aluno.getKey(), aluno.getValue());
        }
    }


    
    //Exibir aluno específico

    public static void consultarAlunos(Scanner scanner){
        String aluno; 
        System.out.println("Qual aluno deseja consultar?");
        aluno = scanner.next();
        Double media = alunos.get(aluno);

        if (media != null){
            System.out.println("Aluno: " + aluno);
            System.out.println("Média: " + media);

        } else {
            System.out.println("Nota não encontrada!");
        }


    }

    //Importar txt para hashmap

    public static void carregarDados() {

    try {
        BufferedReader br = new BufferedReader(new FileReader("BancoDeDados.txt"));

        String linha;

        while ((linha = br.readLine()) != null) {

            String[] dados = linha.split(":");

            String nome = dados[0];
            Double media = Double.parseDouble(dados[1]);

            alunos.put(nome, media);
        }

        br.close();

    } catch (IOException e) {
        System.out.println("Erro ao carregar os dados!");
    }
}
    
}