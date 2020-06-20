/*
Implemente un algoritmo que le desplegue en pantalla el objeto accidente_transito
y le permita ingresar numero de fallecidos, multa por daños y direccion del accidente
e identifique de que tipo de variable se trata cada una de las anterioemente mencionadas.
 */
package ejercicio20_díazveragabrielalexander_automotriz.pkg7450;
/**
 *
 * @author Díaz Vera Gabriel Alexander
 */
import java.util.Scanner;
public class Ejercicio20_DíazVeraGabrielAlexander_Automotriz7450 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner objeto=new Scanner (System.in);
    System.out.println("\t\t\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
    System.out.println("Nombre: Díaz Vera Gabriel Alexander");
    System.out.println("Asignatura: Programación");
    System.out.println("Nrc: 7450");
    System.out.println("Tema del Paper:");
    System.out.println("Transferencia de Aprendizaje Mediante Redes Neuronales Convolucionales para el Reconocimiento de Conductores Distraídos\n");
    System.out.println("\t\t\tTipo de datos .\n");
    System.out.println("Objeto: Accidente_transito \n");

    System.out.println("Ingrese numero de fallecidos: ");
    String fallecidos=objeto.nextLine();
    System.out.println("Que tipo de variable es " +fallecidos);
    String entero=objeto.nextLine();
    System.out.println("Ingrese la multa por daños: ");
    String multa=objeto.nextLine();
    System.out.println("Que tipo de variable es " +multa);
    String flotante=objeto.nextLine();
    System.out.println("Ingrese la direccion del accidente: ");
    String direccion=objeto.nextLine();
    System.out.println("Que tipo de variable es" +direccion);
    String caracter=objeto.nextLine();
    }
}
