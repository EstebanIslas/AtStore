
package com.islasoft.atstore.retrofit.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseLogin {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("image")
    @Expose
    private Object image;
    @SerializedName("rol")
    @Expose
    private String rol;
    @SerializedName("id_person")
    @Expose
    private Integer idPerson;
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

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseLogin() {
    }

    /**
     * 
     * @param image
     * @param password
     * @param apePat
     * @param idPerson
     * @param apeMat
     * @param id
     * @param telefono
     * @param nombre
     * @param email
     * @param rol
     */
    public ResponseLogin(Integer id, String email, String password, Object image, String rol, Integer idPerson, String nombre, String apePat, String apeMat, String telefono) {
        super();
        this.id = id;
        this.email = email;
        this.password = password;
        this.image = image;
        this.rol = rol;
        this.idPerson = idPerson;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Object getImage() {
        return image;
    }

    public void setImage(Object image) {
        this.image = image;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Integer getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Integer idPerson) {
        this.idPerson = idPerson;
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

}
