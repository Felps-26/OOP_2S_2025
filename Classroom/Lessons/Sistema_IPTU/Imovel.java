package Sistema_IPTU;

public class Imovel {
    private Municipio municipio;
    private Double areaM2;
    private Integer vagas;

    public Double calcularIPTU() {
        return (this.areaM2 * this.municipio.getPrecoM2()) * 1.005;
    }

    public Imovel (Municipio municipio, Double areaM2, Integer vagas) {
        this.municipio = municipio;
        this.areaM2 = areaM2;
        this.vagas = vagas;
    }

    public Municipio getMunicipio() { return municipio; }
    public void setMunicipio(Municipio municipio) { this.municipio = municipio; }

    public Double getAreaM2() { return areaM2; }
    public void setAreaM2(Double areaM2) { this.areaM2 = areaM2; }

    public Integer getVagas() { return vagas; }
    public void setVagas(Integer vagas) { this.vagas = vagas; }
}
