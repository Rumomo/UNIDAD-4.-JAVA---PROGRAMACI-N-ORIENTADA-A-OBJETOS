
public class Persona {
	 private String dni, nombre, apellidos;
	    private int edad;

	    public Persona(String dni, String nombre, String apellidos, int edad) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.edad = edad;
	    }
	    public Persona() {
	        
	    }

	    public String getDni() {
	        return dni;
	    }

	    public void setDni(String dni) {
	        this.dni = dni;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellidos() {
	        return apellidos;
	    }

	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
	    
	    public void validarDni(String dni){
	         char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'}; 
	         
	         String aux = dni.substring(0, 8);
	         
	         int numDni = Integer.parseInt(aux);
	         char letra = letras[numDni % 23];
	         
	         char letraDni = Character.toUpperCase(dni.charAt(8));
	         
	         
	         if(letra == letraDni){
	             System.out.println("El DNI esta correcto");
	         }else{
	             System.out.println("El DNI esta incorrecto");
	         }
	    }

	    @Override
	    public String toString() {
	        return "Persona" +
	                "dni='" + dni + '\'' +
	                ", nombre='" + nombre + '\'' +
	                ", apellidos='" + apellidos + '\'' +
	                ", edad=" + edad + '\'';
	    }   

}
