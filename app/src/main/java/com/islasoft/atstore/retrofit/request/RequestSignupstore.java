
package com.islasoft.atstore.retrofit.request;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestSignupstore implements Serializable
{

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
    @SerializedName("nombre_store")
    @Expose
    private String nombreStore;
    @SerializedName("calle")
    @Expose
    private String calle;
    @SerializedName("numero")
    @Expose
    private String numero;
    @SerializedName("colonia")
    @Expose
    private String colonia;
    @SerializedName("descripcion")
    @Expose
    private String descripcion;
    private final static long serialVersionUID = -283037270335212500L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestSignupstore() {
    }

    /**
     * 
     * @param descripcion
     * @param nombreStore
     * @param numero
     * @param calle
     * @param nombre
     * @param rol
     * @param colonia
     * @param apePat
     * @param password
     * @param apeMat
     * @param id
     * @param telefono
     * @param email
     */
    public RequestSignupstore(Integer id, String nombre, String apePat, String apeMat, String telefono, String email, String password, Integer rol, String nombreStore, String calle, String numero, String colonia, String descripcion) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apePat = apePat;
        this.apeMat = apeMat;
        this.telefono = telefono;
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.nombreStore = nombreStore;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.descripcion = descripcion;
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

    public String getNombreStore() {
        return nombreStore;
    }

    public void setNombreStore(String nombreStore) {
        this.nombreStore = nombreStore;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
