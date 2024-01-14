
public class Articulo {

	private String nombre;
	private int  unidadesDisponibles, igic;
	private double precio;
	
//contructor definido
	public Articulo(String nombre, int unidadesDisponibles, int igic, double precio) {
		this.nombre = nombre;
		this. unidadesDisponibles = unidadesDisponibles;
		this.igic = igic;
		this.precio = precio;
	}
	
//constructor vacio	
	public Articulo() {
	
	}
	
//Getters
	public String getNombre() {
		return  nombre;
	}
	
    public int getUnidad() {
		return  unidadesDisponibles;
	}
    
	public int getIgic() {
		return igic;
	}
	
	public double getPrecio() {
		return precio;
	}

//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setUnidadesDisponibles(int unidadesDisponibles) {
		this. unidadesDisponibles = unidadesDisponibles;
	}
	
	public void setIgic(int igic) {
		this.igic = igic;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}

//comprobar si existen unidades
	public boolean existenUnidadesDisponibles() {
		
		if ( unidadesDisponibles < 0) {
			return false;
		}
		return true;
	}

//Comprobando el igic	
	public double precioConIGIC() {
		
		return (getPrecio() * getIgic())/100;
		
	}
	
//Imprimir datos
	public void imprimirDatosArticulo() {
		double precioFinal = precio + precioConIGIC();
		
		System.out.println("El nombre del producto es " + nombre 
				+ " .Unidades disponibles " + unidadesDisponibles 
				+ ". El precio sin IGIC es " + precio+ " y con IGIC es " 
				+ precioFinal);
	}
	
}
