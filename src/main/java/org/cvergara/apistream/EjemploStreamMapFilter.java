package org.cvergara.apistream;

import org.cvergara.apistream.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMapFilter {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Carlos Perez", "Pato Natales", "Luisa Acevedo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(usuario -> usuario.getNombre().equals("Pato"))
                .peek(System.out::println) ;

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(usuario -> System.out.println(usuario));
    }
}
