public class Vehiculo {

    private String marca;

    private String patente;

    private String color;

    private int litrosBencina;

    public Vehiculo(){

    }

    public Vehiculo(String marca,String patente,String color ,int litrosBEncina){
        this.marca = marca;
        this.patente = patente;
        this.color = color;
        this.litrosBencina = litrosBEncina;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setPatente(String patente){
        this.patente = patente;
    }

    public String getPatente(){
        return this.patente;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setBencina(int bencina){
        this.litrosBencina = bencina;
    }

    public int getBencian(){
        return this.litrosBencina;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", patente='" + patente + '\'' +
                ", color='" + color + '\'' +
                ", litrosBencina=" + litrosBencina +
                '}';
    }
}
