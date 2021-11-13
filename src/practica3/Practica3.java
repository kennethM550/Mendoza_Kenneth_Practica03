
package practica3;

import java.util.HashSet;
import java.util.Set;


public class Practica3 {
    private static frmformulario formulario;
    private static Persona persona[];
    private static int contador;
    
    public static void main(String[] args) {
        // TODO code application logic here
        formulario=new frmformulario();
        persona=new Persona[100];
        
        for (int i = 0; i < 100; i++) {
            persona[i]=new Persona();
        }
        contador=0;
        
        formulario.setVisible(true);
    }
    public static void guardar(String n, String p, String m, String num){
        persona[contador].setNombre(n);
        persona[contador].setPaterno(p);
        persona[contador].setMaterno(m);
        persona[contador].setNrodoc(num);
        
        contador++;
    }
    
    public static void buscar(String bus) {
        
    }
}
