package Sistema_radar;

public class Carro {
    private Integer getVelocidade;
    private String placa;
    private Integer velocidade;
    private Integer ano;
    private String modelo;

    public Carro(String placa, Integer velocidade, Integer ano, String modelo){
        this.placa = placa;
        this.velocidade = velocidade;
        this.ano = ano;
        this.modelo = modelo;
    }

    public Integer getVelocidade(){
        return this.velocidade;
    }
    public void setVelocidade(Integer velocidade){
        if(velocidade != null && velocidade >= 0){
            this.velocidade = velocidade;
        }
    }

    public String getPlaca(){
        return this.placa;
    }
    public void setPlaca(String placa){
        if(placa != null && placa.length() == 7){
            this.placa = placa;
        }
    }

    public Integer getAno(){
        return this.ano;
    }
    public void setAno(Integer ano){
        if(ano != null && ano > 1900){
            this.ano = ano;
        }
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        if(modelo != null && modelo.length() > 2){
            this.modelo = modelo;
        }
    }


    public void acelerar(){
        this.velocidade += 10;
    }

    public void frear(){
        if(this.velocidade > 0){
            this.velocidade -= 10;
        }
    }
}