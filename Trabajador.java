//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Trabajador {

    //Inserte acá los atributos
    
    private String nombre;
    private String CC;
    private double salarioPorHora;
    private int horasTrabajadas;
    private int diaNacimiento;
    private int mesNacimiento;
    private int yearNacimiento;
    private String apodo;

    //Inserte acá el método constructor
    
    public Trabajador(String nombre, String CC, double salarioPorHora,
        int horasTrabajadas,int diaNacimiento, int mesNacimiento,
        int yearNacimiento){
    
    this.nombre = nombre;
    this.CC = CC;
    this.salarioPorHora = salarioPorHora;
    this.horasTrabajadas = horasTrabajadas;
    this.diaNacimiento = diaNacimiento;
    this.mesNacimiento = mesNacimiento;
    this.yearNacimiento = yearNacimiento;
    
    }
    
    public Trabajador(){
        
    }

    //Inserte acá los SETTERS Y GETTERS
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public double salarioQuincenal(){
        
    return salarioPorHora * horasTrabajadas;
    
    }   
    
    
    //*************************************N O  E L I M I N A R  E S T E  M É T O D O*************************************
    public int calcularEdad(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd");
        int diaActual = Integer.valueOf(myDateObj.format(myFormatObj));
        
        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("MM");
        int mesActual = Integer.valueOf(myDateObj.format(myFormatObj2));
        
        DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("yyyy");
        int yearActual = Integer.valueOf(myDateObj.format(myFormatObj3));
        
        if(mesActual > mesNacimiento || mesActual == mesNacimiento && diaActual >= diaNacimiento)
            return yearActual - yearNacimiento;
        
        return yearActual - yearNacimiento - 1;     
    }
    
}