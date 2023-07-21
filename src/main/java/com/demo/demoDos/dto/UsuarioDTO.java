package com.demo.demoDos.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable {
    private Integer id;
    private String username;
    private String token;
    private RolDTO rol;
    private String subtipo;
    private Integer tenantId;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Integer id, String username) {
        this.id = id;
        this.username = username;
    }

    public UsuarioDTO(Integer id, String username, Integer tenantId) {
        this.id = id;
        this.username = username;
        this.tenantId = tenantId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public RolDTO getRol() {
        return rol;
    }

    public void setRol(RolDTO rol) {
        this.rol = rol;
    }

    public String getSubtipo() {
        return subtipo;
    }

    public void setSubtipo(String subtipo) {
        this.subtipo = subtipo;
    }

    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "id=" + id + ", username=" + username + ", token=" + token + ", rol=" + rol + ", subtipo=" + subtipo + ", tenantId=" + tenantId + '}';
    }
}
