package DadosAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraMedia {

public static void CalcularMedia(Scanner scanner) {


    //Variáveis e afins


    String continuar = "s";
    double soma = 0;
    double media = 0;
    double nota;
    int quantidadeNotas;
    String aluno ="";


    //Perguntar aluno 

    System.out.println("Qual o nome do aluno que pretende registrar?");
    aluno = scanner.next();
    

    //Lista de notas e adicionar notas

    ArrayList<Double> listaNotas = new ArrayList<>();

    while (continuar.equalsIgnoreCase("s")){

        System.out.println("Informe uma nota");

        if (scanner.hasNextDouble()){
    
        nota = scanner.nextDouble();

    

        //Verifica se a nota é válida

    if (nota >= 0 && nota <= 10){

          listaNotas.add(nota);
        System.out.println("Adicionar nova nota?");
        continuar = scanner.next();
    }
}
    
    else{

        System.out.println("A nota é inválida! Insira uma nota de 0 a 10.");

        continuar = "s";

        scanner.next();
    }



    }

    quantidadeNotas = listaNotas.size();


    //Somar notas

    if (quantidadeNotas > 0){

    for (int i = 0; i < quantidadeNotas; i++){

        soma = soma + listaNotas.get(i);
    }

    System.out.println("A soma das notas é: " + soma);

    //Calcular a média dos alunos.



    media = soma / quantidadeNotas;

    System.out.printf("A média do aluno é: %.2f%n ", media);
}

    else{

        System.out.println("Nenhuma nota digitada");

    
    

    }
 
        DadosAlunos.adicionarAlunos(aluno, media);

} 


}