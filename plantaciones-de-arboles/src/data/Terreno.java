package data;

public class Terreno {
    private String nombre;
    private String tierra;
    private String clima;
    private String ubicacion;  
    private int numeroFilas;
    private int numeroColumnas;
    private int areaCasilla;


    //Constructor
    public Terreno(String nombre, String tierra, String clima) {
        this.nombre = nombre;
        this.tierra = tierra;
        this.clima = clima;
    }
    
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTierra() {
        return tierra;
    }

    public void setTierra(String tierra) {
        this.tierra = tierra;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumeroFilas() {
        return numeroFilas;
    }

    public void setNumeroFilas(int numeroFilas) {
        this.numeroFilas = numeroFilas;
    }

    public int getNumeroColumnas() {
        return numeroColumnas;
    }

    public void setNumeroColumnas(int NumeroColumnas) {
        this.numeroColumnas = numeroColumnas;
    }


    public int getAreaCasilla() {
        return areaCasilla;
    }

    public void setAreaCasilla(int areaCasilla) {
        this.areaCasilla = areaCasilla;
    } 

    @Override
    public String toString() {
        return "Terreno{" +
                "nombre=" + nombre +
                ", tipo de tierra =" + tierra +
                ", tipo de clima =" + clima +
                ", ubicacion geografica =" + ubicacion +
                ", numero de filas y columnas=" + numeroFilas + "x" + numeroColumnas +
                ", area de definida para cada arbol =" + areaCasilla + "}";

    }
    
    
}