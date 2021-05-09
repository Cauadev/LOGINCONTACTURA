package com.cauadev.logincontactura.model;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAuth {
	
	@NotEmpty(message = "Campo usuario não pode ser vazio")
	private String usuario;
	
	@NotEmpty(message =  "Campo senha não pode ser vazio")
	private String senha;
	
}
