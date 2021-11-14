
package practica3;


public class Persona {
    String Paterno;
    String Materno;
    String Nombre;
    String Nrodoc;

    public Persona(String Paterno, String Materno, String Nombre, String Nrodoc) {
        this.Paterno = Paterno;
        this.Materno = Materno;
        this.Nombre = Nombre;
        this.Nrodoc = Nrodoc;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public String getMaterno() {
        return Materno;
    }

    public void setMaterno(String Materno) {
        this.Materno = Materno;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNrodoc() {
        return Nrodoc;
    }

    public void setNrodoc(String Nrodoc) {
        this.Nrodoc = Nrodoc;
    }
    
    
    
}
