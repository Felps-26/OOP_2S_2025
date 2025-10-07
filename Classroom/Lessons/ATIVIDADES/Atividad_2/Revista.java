package ATIVIDADES.Atividad_2;

public class Revista extends Material {
    private int edicao;

    public Revista(String titulo, int anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public void descricao() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + edicao);
    }
}
