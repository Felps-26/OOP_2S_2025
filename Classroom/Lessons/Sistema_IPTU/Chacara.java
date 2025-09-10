package Sistema_IPTU;

public class Chacara extends Imovel{
    private Boolean HaPocoAR;
    public Chacara (Municipio municipio, Double areaM2, Integer vagas, Boolean HaPocoAR) {
        super(municipio, areaM2, vagas);
        this.HaPocoAR = HaPocoAR;
    }

    public Boolean getHaPocoAR() { return HaPocoAR; }
    public void setHaPocoAR(Boolean HaPocoAR) { this.HaPocoAR = HaPocoAR; }
}

