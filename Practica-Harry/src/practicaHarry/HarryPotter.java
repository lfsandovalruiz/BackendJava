package practicaHarry;

public class HarryPotter {

    HarryPotter(String casa, String genero, String nombre, String boggart){
        this.casa = casa;
        this.genero = genero;
        this.nombre = nombre;
        this.boggart = boggart;
    }

    private String casa;
    private String genero;
    private String nombre;
    private String boggart;


    public String getCasa() {
        return casa;
    }

    public boolean setCasa(String casa) {
        if(casa.isEmpty()) return false;
        this.casa = casa;
        return true;
    }

    public String getGenero() {
        return genero;
    }

    public boolean setGenero(String genero) {
        if(genero.isEmpty()) return false;
        this.genero = genero;
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean setNombre(String nombre) {
        if(nombre.isEmpty()) return false;
        this.nombre = nombre;
        return true;
    }

    public String getBoggart() {
        return boggart;
    }

    public boolean setBoggart(String boggart) {
        if(boggart.isEmpty()) return false;
        this.boggart = boggart;
        return true;
    }

    public String printState() {
        return "Casa: " + casa + "\n" +
                "Genero: " + genero + "\n" +
                "Nombre: " + nombre + "\n" +
                "Boggart: " + boggart + "\n";
    }

}
