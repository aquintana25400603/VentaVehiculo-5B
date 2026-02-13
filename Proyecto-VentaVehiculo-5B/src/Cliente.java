public class Cliente {
    
    private String rs;
    private String rfc;
    private String email;
    
    public Cliente(String rs, String rfc, String email){
        this.rs=rs;
        this.rfc=rfc;
        this.email=email;
    }
    
    @Override 
    public String toString(){
        String cadena;
        cadena="Razon social: "+this.rs+"\n"+
                "RFC: "+this.rfc+"\n"+
                "E-mail"+this.email+"\n";
        
        return cadena;
    }
}
