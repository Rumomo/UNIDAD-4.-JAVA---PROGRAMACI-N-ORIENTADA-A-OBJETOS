
public class Main {

	public static void main(String[] args) {
		 Persona persona1 = new Persona();
	        
	        persona1.setDni("12345678A");
	        persona1.setNombre("Adan");
	        persona1.setApellidos("Castro");
	        persona1.setEdad(23);
	        
	        persona1.validarDni(persona1.getDni());
	        
	        System.out.println(persona1.toString());
	        
	        
	        Persona persona2 = new Persona("45864814P","Pepe","Parrilla",50);
	        
	        persona2.validarDni(persona2.getDni());
	        
	        System.out.println(persona2.toString());

	}

}
