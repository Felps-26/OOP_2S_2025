package Sistema_IPTU;

public class Apartamento extends Imovel{
    private Boolean HaElevador;
    public Apartamento (Municipio municipio, Double areaM2, Integer vagas, Boolean HaElevador) {
        super(municipio, areaM2, vagas);
        this.HaElevador = HaElevador;
    }

    public Boolean getHaElevador() { return HaElevador; }
    public void setHaElevador(Boolean HaElevador) { this.HaElevador = HaElevador; }

}
