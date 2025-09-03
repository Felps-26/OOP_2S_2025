package ATIVIDADES.Atividade_1;

public class OS{
    private PC computador;

    public OS(PC computador){
        this.computador = computador;
    }

    public boolean executarPrograma(Program p){
        if(p.getSSDOcupado() > computador.getSSD()){
            System.out.println("Erro na instalação do programa: SSD ocupado maior que o disponível.");
            return false;
        }
        if(p.getMemoriaRAMAlocada() > computador.getMemoriaRAM()){
            System.out.println("Erro na execução do programa: memória RAM alocada maior que a disponível.");
            return false;
        }
        System.out.println("Programa executado com sucesso!");
        float tempoExecucao = (float) p.getQuantidadeOperacoes() / (computador.getOperacoesPorSegundo() * computador.getNucleos());
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos.");
        return true;
    }

    // Getter e Setter
    public PC getComputador() { return computador; }
    public void setComputador(PC computador) { this.computador = computador; }
}

