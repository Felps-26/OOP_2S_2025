package Sistema_radar;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(16, 512, 4, 1000.0f);
        SistemaOperacional os = new SistemaOperacional(pc);

        // Programa executado com sucesso
        Programa prog1 = new Programa(8, 100, 2, 4000);
        os.executarPrograma(prog1);

        // Erro na instalação do programa (SSDOcupado > SSD disponível)
        Programa prog2 = new Programa(8, 600, 2, 4000);
        os.executarPrograma(prog2);

        // Erro na execução do programa (memoriaRAMAlocada > memóriaRAM disponível)
        Programa prog3 = new Programa(32, 100, 2, 4000);
        os.executarPrograma(prog3);
    }
}

