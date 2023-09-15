/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.tang.ui;

import java.util.Scanner;

/**
 * Inicia el programa.
 * 
 * @author Jose Manuel Leyva Munguía
 * @version v1.0
 */
public class Main {
    /**
     * Método que imprime la cantidad de números de teléfono que corresponden a los códigos o ladas de las áreas de
     * Tijuana, Hermosillo, Guaymas y de áreas desconocidas una vez se haya ingresado la lista por consola.
     * 
     * @param args Argumentos del programa
     */
    public static void main(String[] args) {
        
        System.out.println("ASIGNACION #3");
        System.out.println("Inserte la cadena de caracteres con los números a analizar: ");
        Scanner entrada = new Scanner(System.in);
        String numerosTelefonicos = entrada.nextLine();
        
        // Limpia los números quitando paréntesis, guiones y espacios.
        String numerosLimpios = numerosTelefonicos.replaceAll("[\\(\\)\\-\\s]", "");
        
        // Separa y divide la cadena de números telefónicos en base al carácter ",".
        String[] numeros = numerosLimpios.split(",");
        
        // Se inicializan las variables donde se guardaran la cantidad de números de teléfono de cada área en cero.
        int tijuana = 0;
        int hermosillo = 0;
        int guaymas = 0;
        int desconocido = 0;
        
            for (String numero : numeros) {
                                
                // Verifica códigos o ladas.
                if (numero.startsWith("664")) {
                    tijuana++;
                } else if (numero.startsWith("662")) {
                    hermosillo++;
                } else if (numero.startsWith("622")) {
                    guaymas++;
                } else {
                    desconocido++;
                }
            }
        
        //Imprime la cantidad de números de cada área encontrados en la cadena.
        System.out.println("Números de Tijuana: " + tijuana);
        System.out.println("Números de Hermosillo: " + hermosillo);
        System.out.println("Números de Guaymas: " + guaymas);
        System.out.println("Números de área desconocida: " + desconocido);        
    }
    
    
}
