package Model;
// Generated 13/08/2017 06:13:12 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Sucursal generated by hbm2java
 */
public class Sucursal  implements java.io.Serializable {


     private Integer idSucursal;
     private Empresa empresa;
     private String codigoSucursal;
     private String sucursal;
     private String tipo;
     private String idPais;
     private String estado;
     private String ciudad;
     private String municipio;
     private String colonia;
     private String codigoPostal;
     private String calle;
     private String numeroExterior;
     private String numeroInterior;
     private long telefono1;
     private Long telefono2;
     private byte[] logotipo;
     private Set<Empleado> empleados = new HashSet<Empleado>(0);

    public Sucursal() {
    }

	
    public Sucursal(Empresa empresa, String codigoSucursal, String sucursal, String tipo, String idPais, String estado, String ciudad, String municipio, String colonia, String codigoPostal, String calle, String numeroExterior, long telefono1) {
        this.empresa = empresa;
        this.codigoSucursal = codigoSucursal;
        this.sucursal = sucursal;
        this.tipo = tipo;
        this.idPais = idPais;
        this.estado = estado;
        this.ciudad = ciudad;
        this.municipio = municipio;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.calle = calle;
        this.numeroExterior = numeroExterior;
        this.telefono1 = telefono1;
    }
    public Sucursal(Empresa empresa, String codigoSucursal, String sucursal, String tipo, String idPais, String estado, String ciudad, String municipio, String colonia, String codigoPostal, String calle, String numeroExterior, String numeroInterior, long telefono1, Long telefono2, byte[] logotipo, Set<Empleado> empleados) {
       this.empresa = empresa;
       this.codigoSucursal = codigoSucursal;
       this.sucursal = sucursal;
       this.tipo = tipo;
       this.idPais = idPais;
       this.estado = estado;
       this.ciudad = ciudad;
       this.municipio = municipio;
       this.colonia = colonia;
       this.codigoPostal = codigoPostal;
       this.calle = calle;
       this.numeroExterior = numeroExterior;
       this.numeroInterior = numeroInterior;
       this.telefono1 = telefono1;
       this.telefono2 = telefono2;
       this.logotipo = logotipo;
       this.empleados = empleados;
    }
   
    public Integer getIdSucursal() {
        return this.idSucursal;
    }
    
    public void setIdSucursal(Integer idSucursal) {
        this.idSucursal = idSucursal;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getCodigoSucursal() {
        return this.codigoSucursal;
    }
    
    public void setCodigoSucursal(String codigoSucursal) {
        this.codigoSucursal = codigoSucursal;
    }
    public String getSucursal() {
        return this.sucursal;
    }
    
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getIdPais() {
        return this.idPais;
    }
    
    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getCodigoPostal() {
        return this.codigoPostal;
    }
    
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public String getNumeroExterior() {
        return this.numeroExterior;
    }
    
    public void setNumeroExterior(String numeroExterior) {
        this.numeroExterior = numeroExterior;
    }
    public String getNumeroInterior() {
        return this.numeroInterior;
    }
    
    public void setNumeroInterior(String numeroInterior) {
        this.numeroInterior = numeroInterior;
    }
    public long getTelefono1() {
        return this.telefono1;
    }
    
    public void setTelefono1(long telefono1) {
        this.telefono1 = telefono1;
    }
    public Long getTelefono2() {
        return this.telefono2;
    }
    
    public void setTelefono2(Long telefono2) {
        this.telefono2 = telefono2;
    }
    public byte[] getLogotipo() {
        return this.logotipo;
    }
    
    public void setLogotipo(byte[] logotipo) {
        this.logotipo = logotipo;
    }
    public Set<Empleado> getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }




}


