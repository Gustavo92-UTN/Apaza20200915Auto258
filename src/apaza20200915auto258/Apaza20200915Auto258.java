/*2 - Crear la clase Auto con los atributos marca , modelo y kilometraje , elegir el tipo de dato
    adecuado para ellos. Además se debe crear el método estadoAuto() que depende del
    kilometraje muestre un mensaje:
        0 km Esta nuevo
        <10000km Poco usado
        <100000km Usado
        >100000km Bastante usado
    Crear un objeto de esta clase y comprobar el funcionamiento
5 - Para la clase del ejercicio 2 crear el método constructor que solicite como parámetro los 3
    atributos de la clase.
8 - Encapsular la clase del ejercicio 2 y realizar los métodos getter y setter necesarios.*/
package apaza20200915auto258;
import java.util.Scanner;
public class Apaza20200915Auto258 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, opcion;
        String marca = "", modelo = "";
        
        System.out.print("Ingrese el kilometraje (en numeros enteros) del auto: ");
        km = input.nextInt();
        
        Auto car1, car2;
        car1 = new Auto();
        car2 = new Auto(marca, modelo, km);
        
        car2.setKilometraje(km);
        
        while(car2.getKilometraje() != km){
            System.out.println("Error de dato ingresado");
            System.out.print("Ingrese el kilometraje en numeros enteros positivos: ");
            km = input.nextInt();
            car2.setKilometraje(km);
        }
        
        System.out.print("Elija la marca del menu de opciones" + 
                "\n1. BMW" +
                "\n2. Chevrolet" + 
                "\n3. Ford" +
                "\n4. Peugeot" + 
                "\n5. Renault" + 
                "\n6. Toyota" + 
                "\n7. Volkswagen" + 
                "\nOpcion: ");
        opcion = input.nextInt();
        
        while(opcion < 1 || opcion > 7){
            System.out.print("Opcion INCORRECTA, elija algun numero del menu: ");
            opcion = input.nextInt();
        }
        
        switch (opcion){
            case 1:
                marca = "BMW";
                break;
            case 2:
                marca = "Chevrolet";
                break;
            case 3:
                marca = "Ford";
                break;
            case 4:
                marca = "Peugeot";
                break;
            case 5:
                marca = "Renault";
                break;
            case 6:
                marca = "Toyota";
                break;
            default:
                marca = "Volkswagen";
        }
        
        System.out.print("Escriba el modelo de su auto: ");
        modelo = input.next();
        
        System.out.println("\nDatos del auto" +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nCantidad de km recorrido: " + car2.getKilometraje() + " km");
        //car1.estadoAuto();    //como se hace para que no imprima nada?????
        System.out.print("Estado del auto: ");
        car2.estadoAuto();
    }
}

