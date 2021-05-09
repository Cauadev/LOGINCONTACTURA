package com.cauadev.logincontactura.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cauadev.logincontactura.model.UserAuth;
import com.cauadev.logincontactura.service.JwtService;
import com.cauadev.logincontactura.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin("*")
@RequiredArgsConstructor
public class UsuarioController {
	
	private final UserService usuarioService;
	private final JwtService jwtService;
	
	@PostMapping("/login")
	public ResponseEntity<?> autenticar(@RequestBody UserAuth user) {
		try {
			usuarioService.autenticar(user);
			String token = jwtService.generateToken(user);
			return ResponseEntity.ok("Login efetuado com sucesso \ntoken: "+token);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Usuario ou Senha invalido.");
		}

	}

}
