
package areatriangulo;

import java.util.Scanner;

public class AreaTriangulo {


    public static void main(String[] args) {
       
        Scanner dato = new Scanner (System.in);
        
        System.out.println("Por favor digite la base del triangulo: ");
        float base = dato.nextFloat();
        
        System.out.println("Por favor digite la altura del triangulo: ");
        float altura = dato.nextFloat();
        
        float area = (base * altura)/2;
        
        System.out.println("El area del triangulo es: " + area);
    }
    
}
