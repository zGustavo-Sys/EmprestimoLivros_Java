package model;

public class Livro {

  private String nome;
  private String autor;
  private String editora;
  private String edicao;
  private String volume;

  public Livro() {
  }

  public Livro(String nome, String autor, String editora, String edicao, String volume) {
    this.nome = nome;
    this.autor = autor;
    this.editora = editora;
    this.edicao = edicao;
    this.volume = volume;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getEditora() {
    return editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public String getEdicao() {
    return edicao;
  }

  public void setEdicao(String edicao) {
    this.edicao = edicao;
  }

  public String getVolume() {
    return volume;
  }

  public void setVolume(String volume) {
    this.volume = volume;
  }

}
