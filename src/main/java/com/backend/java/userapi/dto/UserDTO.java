package com.backend.java.userapi.dto;

import com.backend.java.userapi.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO	{
    @NotBlank(message = "Campo obrigatorio")
    private	String nome;
    @NotBlank(message = "Campo obrigatorio")
    private	String cpf;
    private	String endereco;
    @NotBlank(message = "Campo obrigatorio")
    private	String email;
    private	String telefone;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime dataCadastro;

    public	static	UserDTO	convert(User user) {
        UserDTO	userDTO	=	new	UserDTO();
        userDTO.setNome(user.getNome());
        userDTO.setEndereco(user.getEndereco());
        userDTO.setCpf(user.getCpf());
        userDTO.setEmail(user.getEmail());
        userDTO.setTelefone(user.getTelefone());
        userDTO.setDataCadastro(user.getDataCadastro());
        return	userDTO;
    }

}
