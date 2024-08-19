package org.cvergara.apistream;

import org.cvergara.apistream.models.Usuario;
import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamMapFilterSingle {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Carlos Perez", "Pato Natales", "Luisa Acevedo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(usuario -> usuario.getNombre().equals("Pato"))
                .peek(System.out::println) ;

        Optional<Usuario> usuario = nombres.findFirst() ;
        System.out.println(usuario.get());
    }
}
