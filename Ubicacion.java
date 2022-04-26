import java.util.ArrayList;
public class Ubicacion
{
    private String nombreU;
    private float distancia;
    private int cantidadZ;
    public static ArrayList<Ubicacion>ubicaciones = new ArrayList<Ubicacion>();
    
    
    public Ubicacion(String n, float d, int c){
    this.nombreU = n;
    this.distancia = d;
    this.cantidadZ = c;
    }
    public void setNombreU(String n){
        this.nombreU = n;
    }
    public void setDistancia(float d){
        this.distancia = d;
    }
    public void setCantidadZ(int c){
        this.cantidadZ = c;
    }
    public String getNombreU(){
        return this.nombreU;
    }
    public float getDistancia(){
        return this.distancia;
    }
    public int getCantidadZ(){
        return this.cantidadZ;
    }
    public static void ubicacionesOrdenadas(){ // punto 9 y 10, ubicaciones ordenadas por menor número de zombies
        Ubicacion temp;
        for(int i = 0; i < ubicaciones.size()-1; i++) {
            for(int j = 0; j<ubicaciones.size()-1; j++) {
                if(ubicaciones.get(j).getCantidadZ() > ubicaciones.get(j+1).getCantidadZ()) {
                    temp = ubicaciones.get(j);
                    ubicaciones.set(j, ubicaciones.get(j+1));
                    ubicaciones.set(j+1, temp);                    
                }
            }
        }
    }
}