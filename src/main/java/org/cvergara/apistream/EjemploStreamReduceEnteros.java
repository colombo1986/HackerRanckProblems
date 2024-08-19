package org.cvergara.apistream;

import java.util.stream.Stream;

class EjemploStreamReduce {
    public static void main(String[] args) {
     Stream<String> nombres = Stream.of("Pato Guzman", "Carlos Perez", "Pato Natales", "Luisa Acevedo" ,"Pato Guzman")
                .distinct() ;
     
     String resultado = nombres.reduce("resultado concadenacion", (a , b) ->a+ "," + b) ;
        System.out.println("resultado = " + resultado);



    }
}
