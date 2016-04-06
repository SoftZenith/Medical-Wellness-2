public class TDAPaciente {
    
    private String nombre, apellido, nss, talla;
    private int edad, peso;    
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    

    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setNss(String nss){
        this.nss = nss;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getNss(){
        return nss;
    }
    
        public int getEdad() {
        return edad;
    }

    public String getTalla() {
        return talla;
    }
    
    public int getPeso() {
        return peso;
    }
}
