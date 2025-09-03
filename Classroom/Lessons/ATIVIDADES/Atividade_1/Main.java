package ATIVIDADES.Atividade_1;

public class Main {
    public static void main(String[] args) {
        PC pc = new PC(16, 512, 4, 1000.0f);
        OS os = new OS(pc);

        Program prog1 = new Program(8, 100, 2, 64000);
        os.executarPrograma(prog1);

        Program prog2 = new Program(18, 100, 2, 4000);
        os.executarPrograma(prog2);

        Program Prog3 = new Program(8, 600, 2, 40000);
        os.executarPrograma(Prog3);
    }
}