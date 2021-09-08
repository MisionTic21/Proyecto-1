//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
import java.util.ArrayList;
public class Nomina{
    
   
    //Inserte acá los atributos
    private ArrayList<Trabajador> trabajadores = new ArrayList<>();

    //Inserte acá el método constructor
    public Nomina(){
        this.trabajadores = new ArrayList();      
    }

    //Inserte acá los SETTERS Y GETTERS
    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void agregarTrabajador(Trabajador t){
    trabajadores.add(t);
    }


    public void eliminarTrabajador(String ID){ 
        
        for(int i=0;i<trabajadores.size();i++){
        
            if (trabajadores.get(i).getCC().equals(ID)){
            trabajadores.remove(i); 
            }
        }    
    
    }
    
    public double calcularSalarioQuincenalNomina(){
        double quincenafull = 0;
        for(int i=0;i<trabajadores.size();i++){
            quincenafull += trabajadores.get(i).salarioQuincenal();        
        }
    
         return quincenafull;
    }


    public double promedioEdadNomina(){
        double acumedad = 0;    
        for(int i=0;i<trabajadores.size();i++){
             acumedad += trabajadores.get(i).calcularEdad();        
        }
    
        return acumedad/trabajadores.size();
    
    }

    public double desviacionEstandarEdadNomina(){
    
    double desviacion;
    double datoacum = 0;    
    for(int i=0;i<trabajadores.size();i++){
          datoacum += Math.pow(trabajadores.get(i).calcularEdad() - promedioEdadNomina(),2);  
    }
    desviacion = Math.sqrt((1/(trabajadores.size()*1.0)) * datoacum);
    
    return desviacion;    
    }


    public double salarioQuincenalTrabajador(String ID){
        double salario = 0;
        for(int i=0;i<trabajadores.size();i++){
           
            if (trabajadores.get(i).getCC().equals(ID)){
             salario = trabajadores.get(i).salarioQuincenal();
             break;
             
            }else{
            salario = -1;
            }        
        }
        return salario;
    }

}