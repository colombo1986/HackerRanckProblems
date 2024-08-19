package org.cvergara.apistream;

import org.cvergara.apistream.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamDisctinctUsuario {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Carlos Perez", "Luis Natales", "Luisa Acevedo" , "Pato Guzman" , "Pato Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct() ;

        nombres.forEach(System.out::println);


    }
}
