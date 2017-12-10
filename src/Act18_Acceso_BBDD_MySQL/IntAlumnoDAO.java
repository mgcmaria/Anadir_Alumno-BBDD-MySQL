package Act18_Acceso_BBDD_MySQL;

public interface IntAlumnoDAO {
	
	public void listado(); //lista todos los registros de la tabla alumnos.
	public void nuevo(Alumno alumno); // Inserta un alumno nuevo en la tabla. 

}
