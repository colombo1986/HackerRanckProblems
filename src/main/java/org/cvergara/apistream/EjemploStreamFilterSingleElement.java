package org.cvergara.apistream;

import org.cvergara.apistream.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingleElement {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Carlos Perez", "Pato Natales", "Luisa Acevedo")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(usuario -> usuario.getNombre().equals("Pato"))
                .peek(System.out::println) ;

        Optional<Usuario> usuario = nombres.findFirst() ;
           //System.out.println(usuario.orElseThrow());
          // System.out.println(usuario.orElseGet(() -> new Usuario("Jhon" , "Doe")));
         // System.out.println(usuario.orElse(new Usuario("Jhon" , "Doe")));
        //System.out.println(usuario.orElse(null)); no recomendable

        if(usuario.isPresent()){
            System.out.println(usuario.get().getNombre());
        }else {
            System.out.println("No existe usuario");
        }
    }
}
