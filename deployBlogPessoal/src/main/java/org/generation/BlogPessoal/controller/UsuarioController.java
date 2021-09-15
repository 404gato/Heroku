package org.generation.BlogPessoal.controller;

import java.util.Optional;

import org.generation.BlogPessoal.model.Usuario;
import org.generation.BlogPessoal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/u")
@CrossOrigin("*")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping("/usuario/{usuario}")
    public ResponseEntity<Optional<Usuario>> getByUsuario (@PathVariable(value = "usuario") String usuario){
        Optional<Usuario> objetoUsuarios = repository.findByUsuarioContainingIgnoreCase(usuario);
        if(objetoUsuarios.isEmpty()) {
            return ResponseEntity.status(204).build();
        }else {
            return ResponseEntity.status(200).body(objetoUsuarios);
        }
    }

}
