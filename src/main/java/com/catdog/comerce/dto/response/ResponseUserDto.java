package com.catdog.comerce.dto.response;


import com.catdog.comerce.entity.Role;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseUserDto {
    @JsonProperty("id")
    private Long idUser;
    private String address;
    private String name;
    @JsonProperty("last_name")
    private String lastName;
    private String dni;
    private String email;
    private String username;
    private ResponseRoleDto role;
}
