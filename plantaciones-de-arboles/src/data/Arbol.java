package data;

public class Arbol {
    private String nombre;
    private String tipo;
    private int etapaDeCrecimiento;
    private String desarrollo;
    private String requerimientosNutricionales;
    private String coordenadas;
    private String enfermedades;
    private String genero;
    private String especie;

    //Constructor
    public Arbol(String nombre, String tipo, String coordenadas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.coordenadas = coordenadas;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEtapaDeCrecimiento() {
        return etapaDeCrecimiento;
    }

    public void setEtapaDeCrecimiento(int etapaDeCrecimiento) {
        this.etapaDeCrecimiento = etapaDeCrecimiento;
    }

    public String getDesarrollo() {
        return desarrollo;
    }

    public void setDesarrollo(String desarrollo) {
        this.desarrollo = desarrollo;
    }

    public String getRequerimientosNutricionales() {
        return requerimientosNutricionales;
    }

    public void setRequerimientosNutricionales(String requerimientosNutricionales) {
        this.requerimientosNutricionales = requerimientosNutricionales;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Arbol{" +
                "nombre=" + nombre +
                ", tipo=" + tipo +
                ", etapaDeCrecimiento=" + etapaDeCrecimiento +
                ", desarrollo=" + desarrollo +
                ", requerimientosNutricionales=" + requerimientosNutricionales +
                ", coordenadas=" + coordenadas +
                ", enfermedades=" + enfermedades +
                ", genero=" + genero +
                ", especie=" + especie + '}';
    }
    
    
}
