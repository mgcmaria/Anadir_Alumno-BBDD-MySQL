package Act18_Acceso_BBDD_MySQL;

public class Alumno {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Alumno (String dni, String nombre, String apellidos, int edad)
	{
		this.dni=dni;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ("Alumno [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad+"]");
				
	}
	
}
