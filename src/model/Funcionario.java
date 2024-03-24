package model;

import java.util.Date;

public class Funcionario extends Pessoa {

  private String funcao;
  private double salario;
  private Date dataAdmissao;

  public Funcionario() {
  }

  public Funcionario(String nome, String rg, String cpf, String sexo, String funcao, double salario,
      Date dataAdmissao) {
    super(nome, rg, cpf, sexo);
    this.funcao = funcao;
    this.salario = salario;
    this.dataAdmissao = dataAdmissao;
  }

  public String getFuncao() {
    return funcao;
  }

  public void setFuncao(String funcao) {
    this.funcao = funcao;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public Date getDataAdmissao() {
    return dataAdmissao;
  }

  public void setDataAdmissao(Date dataAdmissao) {
    this.dataAdmissao = dataAdmissao;
  }

}
