package model;

public class Aluno extends Pessoa {

  private String matricula;

  public Aluno() {

  }

  public Aluno(String nome, String rg, String cpf, String sexo, String matricula) {
    super(nome, rg, cpf, sexo);
    this.matricula = matricula;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

}
