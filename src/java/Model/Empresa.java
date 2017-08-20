package Model;
// Generated 17/08/2017 09:01:23 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private Integer idEmpresa;
     private Cliente cliente;
     private Persona persona;
     private String nombreCormercial;
     private String razonSocial;
     private String rfc;
     private String calle;
     private String numeroExterior;
     private String numeroInterior;
     private String colonia;
     private String ciudad;
     private int codigoPostal;
     private String municipio;
     private String idPais;
     private String estado;
     private String correoElectronico;
     private byte[] logotipo;
     private int empleadoIdEmpleado;
     private Date fechaRegistro;
     private Set<Rol> rols = new HashSet<Rol>(0);
     private Set<Empleado> empleados = new HashSet<Empleado>(0);
     private Set<Sucursal> sucursals = new HashSet<Sucursal>(0);

    public Empresa() {
    }

	
    public Empresa(Persona persona, String nombreCormercial, String razonSocial, String rfc, String calle, String numeroExterior, String colonia, String ciudad, int codigoPostal, String municipio, String idPais, String estado, int empleadoIdEmpleado) {
        this.persona = persona;
        this.nombreCormercial = nombreCormercial;
        this.razonSocial = razonSocial;
        this.rfc = rfc;
        this.calle = calle;
        this.numeroExterior = numeroExterior;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.municipio = municipio;
        this.idPais = idPais;
        this.estado = estado;
        this.empleadoIdEmpleado = empleadoIdEmpleado;
    }
    public Empresa(Cliente cliente, Persona persona, String nombreCormercial, String razonSocial, String rfc, String calle, String numeroExterior, String numeroInterior, String colonia, String ciudad, int codigoPostal, String municipio, String idPais, String estado, String correoElectronico, byte[] logotipo, int empleadoIdEmpleado, Date fechaRegistro, Set<Rol> rols, Set<Empleado> empleados, Set<Sucursal> sucursals) {
       this.cliente = cliente;
       this.persona = persona;
       this.nombreCormercial = nombreCormercial;
       this.razonSocial = razonSocial;
       this.rfc = rfc;
       this.calle = calle;
       this.numeroExterior = numeroExterior;
       this.numeroInterior = numeroInterior;
       this.colonia = colonia;
       this.ciudad = ciudad;
       this.codigoPostal = codigoPostal;
       this.municipio = municipio;
       this.idPais = idPais;
       this.estado = estado;
       this.correoElectronico = correoElectronico;
       this.logotipo = logotipo;
       this.empleadoIdEmpleado = empleadoIdEmpleado;
       this.fechaRegistro = fechaRegistro;
       this.rols = rols;
       this.empleados = empleados;
       this.sucursals = sucursals;
    }
   
    public Integer getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public String getNombreCormercial() {
        return this.nombreCormercial;
    }
    
    public void setNombreCormercial(String nombreCormercial) {
        this.nombreCormercial = nombreCormercial;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getRfc() {
        return this.rfc;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
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
    public String getColonia() {
        return this.colonia;
    }
    
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }
    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public int getCodigoPostal() {
        return this.codigoPostal;
    }
    
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    public String getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
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
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public byte[] getLogotipo() {
        return this.logotipo;
    }
    
    public void setLogotipo(byte[] logotipo) {
        this.logotipo = logotipo;
    }
    public int getEmpleadoIdEmpleado() {
        return this.empleadoIdEmpleado;
    }
    
    public void setEmpleadoIdEmpleado(int empleadoIdEmpleado) {
        this.empleadoIdEmpleado = empleadoIdEmpleado;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Set<Rol> getRols() {
        return this.rols;
    }
    
    public void setRols(Set<Rol> rols) {
        this.rols = rols;
    }
    public Set<Empleado> getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }
    public Set<Sucursal> getSucursals() {
        return this.sucursals;
    }
    
    public void setSucursals(Set<Sucursal> sucursals) {
        this.sucursals = sucursals;
    }




}


