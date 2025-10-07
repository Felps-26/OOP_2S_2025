package Atividad_2;

public class Usuario extends Pessoa {
    private int matricula;

    public Usuario(String nome, String email, int matricula) {
        super(nome, email);
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + matricula);
    }
}