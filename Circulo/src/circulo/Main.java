package circulo;

import java.text.DecimalFormat;

/**
 * Dadas unas coordenadas X e Y y el radio, el programa devuelve el diametro 
 * la circunferencia y el area de un circulo.
 *  
 * @author profesor
 * @version 1.0
 * 
 */
public class Main {
    
    /** 
     * Metodo main 
     * @param args
     */
    public static void main(String[] args) {
        Circulito circulo = new Circulito(37,43,2.5);
        String salida =
                "La coordenada X es "+circulo.getCoordenadaX()+
                "\nLa coordenada Y es "+circulo.getCoordenadaY()+
                "\nEl radio es "+circulo.getRadio();
        circulo.setCoordenadaX(35);
        circulo.setCoordenadaY(20);
        circulo.setRadio(4.2);
        DecimalFormat dosDigitos = new DecimalFormat("0.00");
        salida+="\nEl diámetro es "+dosDigitos.format(circulo.obtenerDiametro());
        salida+="\nLa circunferencia es "+dosDigitos.format(circulo.obtenerCircunferencia());
        salida+="\nEl área es "+dosDigitos.format(circulo.obtenerAreaCirculo());
        
        System.out.println(salida);
        System.exit(0);
    }

}
