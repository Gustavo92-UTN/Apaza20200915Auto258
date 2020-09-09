package apaza20200915auto258;
public class Auto {
    String marca;
    String modelo;
    int kilometraje;
//Constructor por defecto
    public Auto(){
    }
//Constructor con tres parametros
    public Auto(String marca, String modelo, int kilometraje){
        //this.marca = marca;
        //this.modelo = modelo;
    }
//Metodos setter y getter  
    public void setKilometraje(int kilometraje){
        if(kilometraje >= 0){
            this.kilometraje = kilometraje;
        }
    }
    
    public int getKilometraje(){
        return kilometraje;
    }
//Metodo del punto 2
    public void estadoAuto(){
        if(kilometraje == 0){
            System.out.println("Esta nuevo");
        }
        else if(kilometraje < 10000){
            System.out.println("Poco usado");
        }
        else if(kilometraje < 100000){
            System.out.println("Usado");
        }
        else{
            System.out.println("Bastante usado");
        }
    }
}
