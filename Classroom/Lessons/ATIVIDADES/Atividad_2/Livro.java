package ATIVIDADES.Atividad_2;

public class Livro extends Material {
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public void descricao() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de publicação: " + getAnoPublicacao());
        System.out.println("Autor: " + autor);
    }
}