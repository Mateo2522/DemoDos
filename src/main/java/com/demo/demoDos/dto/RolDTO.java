package com.demo.demoDos.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RolDTO {
    private Integer id;
    private String denominacion;
    private Boolean admin;

    public RolDTO() {
    }

    public RolDTO(Integer id) {
        this.id = id;
    }

    public RolDTO(Integer id, String denominacion, Boolean admin) {
        this.id = id;
        this.denominacion = denominacion;
        this.admin = admin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "RolDTO{" + "id=" + id + ", denominacion=" + denominacion + ", admin=" + admin + '}';
    }
}
