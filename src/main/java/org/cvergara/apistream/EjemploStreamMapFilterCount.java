package org.cvergara.apistream;

import org.cvergara.apistream.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamMapFilterCount {
    public static void main(String[] args) {
        Long count  = Stream.of("Pato Guzman", "Carlos Perez", "Pato Natales", "Luisa Acevedo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                //.peek(System.out::println)
                .count() ;

        System.out.println(count);



    }
}
