package Model;
// Generated 13/08/2017 06:13:12 PM by Hibernate Tools 4.3.1



/**
 * RolId generated by hbm2java
 */
public class RolId  implements java.io.Serializable {


     private int idRol;
     private int idEmpresa;

    public RolId() {
    }

    public RolId(int idRol, int idEmpresa) {
       this.idRol = idRol;
       this.idEmpresa = idEmpresa;
    }
   
    public int getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    public int getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RolId) ) return false;
		 RolId castOther = ( RolId ) other; 
         
		 return (this.getIdRol()==castOther.getIdRol())
 && (this.getIdEmpresa()==castOther.getIdEmpresa());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdRol();
         result = 37 * result + this.getIdEmpresa();
         return result;
   }   


}


