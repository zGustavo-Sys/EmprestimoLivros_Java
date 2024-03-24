package model;

import java.util.Date;
import java.util.List;

public class Emprestimo {

  private List<Livro> livros;
  private Funcionario funcionario;
  private Aluno aluno;
  private Date data;
  private Date dataDevolucao;

  public Emprestimo() {
  }

  public Emprestimo(List<Livro> livros, Funcionario funcionario, Aluno aluno, Date data, Date dataDevolucao) {
    this.livros = livros;
    this.funcionario = funcionario;
    this.aluno = aluno;
    this.data = data;
    this.dataDevolucao = dataDevolucao;
  }

  public List<Livro> getLivros() {
    return livros;
  }

  public void setLivros(List<Livro> livros) {
    this.livros = livros;
  }

  public Funcionario getFuncionario() {
    return funcionario;
  }

  public void setFuncionario(Funcionario funcionario) {
    this.funcionario = funcionario;
  }

  public Aluno getAluno() {
    return aluno;
  }

  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public Date getDataDevolucao() {
    return dataDevolucao;
  }

  public void setDataDevolucao(Date dataDevolucao) {
    this.dataDevolucao = dataDevolucao;
  }

}
