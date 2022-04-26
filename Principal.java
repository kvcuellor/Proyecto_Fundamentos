import java.util.Scanner;
public class Principal
{
    //Integrantes del equipo:   Karol Vanessa Cuello Ribón    -   Diego Daniel Vargas Puerta    -   Juan Jose Mosquera Mayo     :)
    public static void main(String [] args) {
        Principal.mostrarMenu();
        
    } 
    public static void mostrarMenu() {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        while(run) {
            System.out.println(" ");
            System.out.println("FUNCIONES DEL PROGRAMA:");
            System.out.println("Si ingresa el número 0, se finaliza la ejecución del programa");
            System.out.println("Si ingresa el número 1, debe ingresar nombre, salud, fecha de nacimiento, y tipo de sangre de un Zombie");
            System.out.println("Si ingresa el número 2, se mostrará la información de todos los zombies");
            System.out.println("Si ingresa el número 3, se mostrará la cantidad de zombies creados");
            System.out.println("Si ingresa el número 4, se mostrará la información de todos los zombies que tengan tipo de sangre “O+” o “AB+”");
            System.out.println("Si ingresa el número 5, se mostrará la información de todos los zombies que nacieron después del 2000.");
            System.out.println("Si ingresa el número 6, disminuya a la mitad la salud de todos los zombies");
            System.out.println("Si ingresa el número 7, debe ingresar nombre, distancia a Alexandria y cantidad de Zombies de una ubicación.");
            System.out.println("Si ingresa el número 8, se mostrará la información de todas las ubicaciones");
            System.out.println("Si ingresa el número 9, se mostrará la información de la ubicación más segura de la ciudad");
            System.out.println("Si ingresa el número 10, se mostrara la información de todas las ubicaciones de la ciudad ordenadas por distancia a Alexandria.");
            System.out.println("Si ingresa el número 11, se mostrara una frase aleatoria sobre Zombies");
            System.out.println("Si ingresa el número 12, se mostrará el número de zombies que se reduce por mes");
            System.out.println(" ");
            System.out.println("Por favor ingrese un número");
            
            int num = scan.nextInt();
            String x;
            switch (num) {
                case 0:
                    run = false;
                    System.out.println("Fin del programa");
                    break;
                    
                case 1:
                    System.out.println("Ingrese el nombre de un Zombie:");
                    String nombre = scan.next();
                    System.out.println("ingrese la salud del Zombie");
                    double salud = scan.nextDouble();
                    System.out.println("Ingrese la fecha de nacimiento del Zombie");
                    int fecha = scan.nextInt();
                    System.out.println("Ingrese el tipo de sangre del Zombie");
                    String tiposangre = scan.next();                    
                    Zombie z1 = new Zombie(nombre, salud, fecha, tiposangre);
                    Zombie.zombies.add(z1);
                    break;
                    
                case 2:
                    if(Zombie.zombies.size() == 0){
                        System.out.println("No posee informacion de ningun zombie");
                    }
                    else{
                        for(int i = 0;i < Zombie.zombies.size();i++){
                            System.out.println("Zombie " + (i+1) + "!");
                            System.out.println("Nombre: " + Zombie.zombies.get(i).getNombreZ());
                            System.out.println("Salud: " + Zombie.zombies.get(i).getSalud());
                            System.out.println("Fecha de nacimento: " + (Zombie.zombies).get(i).getFechaNacimiento());
                            System.out.println("Tipo de sangre: " + Zombie.zombies.get(i).getTipoSangre());
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("La cantidad de Zombies creados son: " + Zombie.zombies.size());
                    break;
                    
                case 4:
                    int contador = 0;
                    if(Zombie.zombies.size() <= 0){
                        System.out.println("No posees informacion de ningun Zombie");
                        contador++;
                    }else{
                        for(int i = 0;i < Zombie.zombies.size();i++){
                            if(Zombie.zombies.get(i).getTipoSangre().equals("O+") ||  Zombie.zombies.get(i).getTipoSangre().equals("AB+")){
                                System.out.println("\nZombie# " + (i+1) + ":");
                                System.out.println("Nombre: " + Zombie.zombies.get(i).getNombreZ());
                                System.out.println("Salud: " + Zombie.zombies.get(i).getSalud());
                                System.out.println("Fecha de nacimiento: " +Zombie.zombies.get(i).getFechaNacimiento());
                                System.out.println("Tipo de sangre: " + Zombie.zombies.get(i).getTipoSangre());
                                contador++;
                            }
                        }
                        if(contador == 0){
                            System.out.println("No hay Zombies con tipo de sangre O+ o AB+");
                        }
                    }
                    break;
                    
                case 5:
                    int contador2 = 0;
                    if(Zombie.zombies.size() == 0){
                        System.out.println("No posee infrmacion de ningun zombie");
                    }else{
                        for(int i = 0;i < Zombie.zombies.size();i++){
                            if(Zombie.zombies.get(i).getFechaNacimiento() > 2000){
                                System.out.println("\nZombie# " + (i+1) + "!");
                                System.out.println("Nombre: " + Zombie.zombies.get(i).getNombreZ());
                                System.out.println("Salud: " + Zombie.zombies.get(i).getSalud());
                                System.out.println("Fecha de nacimiento: " +Zombie.zombies.get(i).getFechaNacimiento());
                                System.out.println("Tipo de sangre: " + Zombie.zombies.get(i).getTipoSangre());
                                contador2++;
                            }
                        }
                        if(contador2 == 0){
                            System.out.println("No hay Zombies nacidos después del 2000");
                        }
                    }
                    break;
            
                case 6:
                    if(Zombie.zombies.size() == 0){
                        System.out.println("No hay ningun zombie, así que no se puede reducir la salud");
                    }else{
                        for(int i = 0;i < Zombie.zombies.size();i++){
                            Zombie.zombies.get(i).setSalud(Zombie.zombies.get(i).getSalud()/2);
                            }
                        }                    
                    break;
                
                case 7:
                    System.out.println("Ingrese el nombre de una Ubicación:");
                    String nombreU = scan.next();
                    System.out.println("Ingrese la distancia de Alexandria");
                    float distancia = scan.nextFloat();
                    System.out.println("Ingrese la cantidad de zombies que hay");
                    int CZU = scan.nextInt();
                    Ubicacion u1 = new Ubicacion(nombreU, distancia, CZU);
                    Ubicacion.ubicaciones.add(u1);
                    break;
                    
                case 8:
                    if(Ubicacion.ubicaciones.size() == 0){
                        System.out.println("No posee información de ninguna ubicación");
                    }
                    else{
                        for(int i = 0;i < Ubicacion.ubicaciones.size();i++){
                            System.out.println("Ubicación " + (i+1) + "!");
                            System.out.println("Nombre: " + Ubicacion.ubicaciones.get(i).getNombreU());
                            System.out.println("Distancia de Alexandria: " + Ubicacion.ubicaciones.get(i).getDistancia());
                            System.out.println("Cantidad de Zombies: " + Ubicacion.ubicaciones.get(i).getCantidadZ());
                        }
                    }
                    break;
                    
                case 9:
                    if(Ubicacion.ubicaciones.size() == 0){
                        System.out.println("No posee informacion de ninguna ubicación");
                    }else{
                        Ubicacion.ubicacionesOrdenadas();
                        System.out.println("Ubicación más segura de la ciudad!");
                        System.out.println("Nombre: " + Ubicacion.ubicaciones.get(0).getNombreU());
                        System.out.println("Distancia de Alexandria: " + Ubicacion.ubicaciones.get(0).getDistancia());
                        System.out.println("Cantidad de Zombies: " + Ubicacion.ubicaciones.get(0).getCantidadZ());
                    }
                    break;
            
                case 10:                    
                    if(Ubicacion.ubicaciones.size() == 0){
                        System.out.println("No posee informacion de ninguna ubicación");
                    }
                    else{
                        Ubicacion.ubicacionesOrdenadas();
                        for(int i = 0;i < Ubicacion.ubicaciones.size();i++){
                            System.out.println("Ubicaciones ordenadas por nivel de seguridad:");
                            System.out.println("Ubicación " + (i+1) + "!");
                            System.out.println("Nombre: " + Ubicacion.ubicaciones.get(i).getNombreU());
                            System.out.println("Distancia de Alexandria: " + Ubicacion.ubicaciones.get(i).getDistancia());
                            System.out.println("Cantidad de Zombies: " + Ubicacion.ubicaciones.get(i).getCantidadZ());
                        }
                    }
                    break;
            
                case 11:            
                    System.out.println("Frase Aleatoria: " + Zombie.fraseAleatoria());
                    break;
            
                case 12:
                    if(Zombie.zombies.size() == 0){
                        System.out.println("Actualmente no hay zombies, así que no se elimina ningún zombie por mes");
                    }
                    else{
                        System.out.println("La cantidad de Zombies eliminados por mes es: " + Zombie.reduccionPorMes());
                    }
                    break;
            
            }
        }                   
    }
}
