package Model;
// Generated 17/08/2017 09:01:23 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ClienteView generated by hbm2java
 */
public class ClienteView  implements java.io.Serializable {


     private Integer idCliente;
     private String tipo;
     private String correoElectronico;
     private String nombreUsuario;
     private String contrasena;
     private Date fechaNacimiento;
     private String genero;
     private Date fechaRegistro;
     private String pais;
     private int codigoPostal;
     private String status;
     private Date fechaBaja;

    public ClienteView() {
    }

    public ClienteView(String tipo, String correoElectronico, String nombreUsuario, String contrasena, Date fechaNacimiento, String genero, Date fechaRegistro, String pais, int codigoPostal, String status, Date fechaBaja) {
       this.tipo = tipo;
       this.correoElectronico = correoElectronico;
       this.nombreUsuario = nombreUsuario;
       this.contrasena = contrasena;
       this.fechaNacimiento = fechaNacimiento;
       this.genero = genero;
       this.fechaRegistro = fechaRegistro;
       this.pais = pais;
       this.codigoPostal = codigoPostal;
       this.status = status;
       this.fechaBaja = fechaBaja;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getGenero() {
        return this.genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getCodigoPostal() {
        return this.codigoPostal;
    }
    
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getFechaBaja() {
        return this.fechaBaja;
    }
    
    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }




}


