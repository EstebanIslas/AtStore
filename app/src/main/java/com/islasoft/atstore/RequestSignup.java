
package com.islasoft.atstore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestSignup {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("ape_pat")
    @Expose
    private String apePat;
    @SerializedName("ape_mat")
    @Expose
    private String apeMat;
    @SerializedName("telefono")
    @Expose
    private String telefono;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("rol")
    @Expose
    private Integer rol;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestSignup() {
    }

    /**
     * 
     * @param apePat
     * @param password
     * @param apeMat
     * @param id
     * @param telefono
     * @param nombre
     * @param email
     * @param rol
     */
    public RequestSignup(Integer id, String nombre, String apePat, String apeMat, String telefono, String email, String password, Integer rol) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRol() {
        return rol;
    }

    public void setRol(Integer rol) {
        this.rol = rol;
    }

}
