import java.util.ArrayList;
public class Zombie
{
    private String nombreZ;
    private double salud;
    private int fechaNacimiento;
    private String tipoSangre;
    public static ArrayList<Zombie>zombies = new ArrayList<>();
    
    public Zombie(String n, double s, int f, String t){
    this.nombreZ = n;
    this.salud = s;
    this.fechaNacimiento = f;
    this.tipoSangre = t.toUpperCase();;
    }
    public void setNombreZ(String n){
        this.nombreZ = n;
    }
    public void setSalud(double s){
        this.salud = s;
    }
    public void setFechaNacimiento(int f){
        this.fechaNacimiento = f;
    }
    public void setTipoSangre(String t){
        this.tipoSangre = t.toUpperCase();
    }
    public String getNombreZ(){
        return this.nombreZ;
    }
    public double getSalud(){
        return this.salud;
    }
    public int getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    public String getTipoSangre(){
        return this.tipoSangre;
    }

    public static String fraseAleatoria() { //punto 11, frases aleatorias
        String[] arregloFrases = new String[5];
        arregloFrases[0] = "Los zombies que tienen el pelo blanco tienen más de 50 años";
        arregloFrases[1] = "5 de cada 15 zombies no son agresivos";
        arregloFrases[2] = "Los zombies le tienen miedo al fuego";
        arregloFrases[3] = "Si la salud de un zombie es menor o igual a 5, entonces morirá en los próximos 10 días";
        arregloFrases[4] = "Los zombies solo atacan si es de noche o si invades su territorio";
        
        int a = (int) (Math.random() * 5);
        return arregloFrases[a];
    }
    public static int reduccionPorMes() { //punto 12, inventado
        int i = Zombie.zombies.size();
        int j;
        if(i <= 10) {
            j = 1;      
        }
        else if(i <= 20) {
            j = 2;         
        }
        else {
            j = 3;          
        }
        return j;
    }
}