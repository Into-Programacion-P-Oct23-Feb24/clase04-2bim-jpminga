/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        String miCiudad = obtenerCiudadMayuscula("Loja");
//        System.out.printf("%s\n", miCiudad);
         obtenerMultiplicacion(7,50);
        //aqui no retornamos la información debido a que es un procedimiento

        String miMensaje = obtenerMultiplicacion(7, 50);
        // Aqui obtenerMultiplicacion es una funcion y luego
        // retorna a un valor en este caso de tipo cadena 
        System.out.printf("%s\n", miMensaje);

    }

    public static String obtenerMultiplicacion(int tabla, int limite) {
        int m = 0;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            m = tabla * i;
            cadena = String.format("%s%d + %d = %d\n", cadena,
                    tabla, i, m);

        }
        return cadena;
    }

    public static String obtenerCiudadMayuscula(String m) {
        String m2 = m.toUpperCase();
        return m2;
    }

//    public static void obtenerMultiplicacion(int tabla, int limite){
//        String cadenaFinal = "";
//        int resultado = 0;
//        for (int i = 1; i <= limite; i++) {
//            resultado = tabla * i;
//            cadenaFinal = String.format("%s%d * %d = %d\n"
//                    ,cadenaFinal,tabla,i,resultado);
//        }
//        System.out.printf("%s\n",cadenaFinal);  
//    }
    public static String obtenerNombre() {
        return "Luis";
    }

}
