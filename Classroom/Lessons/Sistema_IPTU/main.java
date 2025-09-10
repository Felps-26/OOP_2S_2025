package Sistema_IPTU;

public class main {


    public Double calcularIPTU(Imovel imovel) {
        Double valorIPTU = imovel.getAreaM2() * imovel.getMunicipio().getPrecoM2();
        if (imovel instanceof Casa) {
            if (imovel.getVagas() > 2) {
                valorIPTU += 100.0 * (imovel.getVagas() - 2);
            }
        } else if (imovel instanceof Apartamento) {
            if (((Apartamento) imovel).getHaElevador()) {
                valorIPTU += 200.0;
            }
            if (imovel.getVagas() > 1) {
                valorIPTU += 150.0 * (imovel.getVagas() - 1);
            }
        } else if (imovel instanceof Chacara) {
            if (((Chacara) imovel).getHaPocoAR()) {
                valorIPTU -= 50.0;
            }
            if (imovel.getVagas() > 3) {
                valorIPTU += 80.0 * (imovel.getVagas() - 3);
            }
        }
        return valorIPTU;
    }

    public static void main(String[] args) {
        Municipio municipio = new Municipio();
        municipio.setNome("Cidade Exemplo");
        municipio.setEstado("Estado Exemplo");
        municipio.setPrecoM2(10.0);

        Imovel casa = new Casa(municipio, 100.0, 3);
        Imovel apartamento = new Apartamento(municipio, 80.0, 2, true);
        Imovel chacara = new Chacara(municipio, 150.0, 4, true);

        main sistemaIPTU = new main();

        System.out.println("IPTU Casa: " + sistemaIPTU.calcularIPTU(casa));
        System.out.println("IPTU Apartamento: " + sistemaIPTU.calcularIPTU(apartamento));
        System.out.println("IPTU Chacara: " + sistemaIPTU.calcularIPTU(chacara));
    }
}