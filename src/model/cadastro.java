package model;

import java.util.ArrayList;
import java.util.Date;

public class cadastro {

  public static void main(String[] args) {

    ArrayList<Livro> listadeLivros = new ArrayList<>();

    Livro livro1 = new Livro("Verity", "Collen Hover", "Principis", "Segunda Edição", "Vol.2");
    Livro livro2 = new Livro("Metamorfose", "Franz Kafka", "Principis", "Especial", "Vol1");
    Livro livro3 = new Livro("TWD", "Robert Kirkman", "AMC", "Especial", "Vol1");

    listadeLivros.add(livro1);
    listadeLivros.add(livro2);
    listadeLivros.add(livro3);

    Aluno aluno1 = new Aluno("Gustavo", "202010070016", "220160089", "099.776.015-00", "M");
    Aluno aluno2 = new Aluno("Eliomar Campos", "202010070017", "2099284289", "096.776.014-00", "M");

    Funcionario funcionario1 = new Funcionario("Maria Zambelli", "Gerente", "28872674278",
        "099.492.029-00", "F", 2000, new Date());

    Emprestimo emprestimo = new Emprestimo(listadeLivros, funcionario1, aluno2, new Date(), new Date());
    emprestimo.setLivros(listadeLivros);

    System.out.println("=====Dados do Emprestimo=====\n");
    System.out.println("Data do emprestimo: " + emprestimo.getData() + "\n");
    System.out.println("=====Livros=====\n");

    for (Livro l : emprestimo.getLivros()) {

      System.out.println("> Nome do Livro: " + l.getNome() + "\n");

    }

    System.out.println("Emprestimo feito por: " + emprestimo.getAluno().getNome()
        + " Matricula: " + emprestimo.getAluno().getCpf());

    System.out.println("\nData prevista para a devolução:");

  }

}