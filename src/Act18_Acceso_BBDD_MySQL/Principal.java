package Act18_Acceso_BBDD_MySQL;


public class Principal {
	
	public static void main(String[] args) {
	
	Acceso conexion = new Acceso();
	conexion.conectar();
	
	Acceso listado=new Acceso();
	listado.listado();
	
	Alumno alumno1=new Alumno("00112233A", "María", "García Carballo", 42);
	Alumno alumno2=new Alumno("00221133B", "PEPE", "OHHHHHH", 55);
	Alumno alumno3=new Alumno("00332211C", "prueba", "conseguida!!!!", 100);
	
	Acceso nuevo=new Acceso();
	nuevo.nuevo(alumno1);
	nuevo.nuevo(alumno2);
	nuevo.nuevo(alumno3);
	
	 System.out.println("-------------------------------");
	 System.out.println("Volvemos a listar para comprobar que está insertado:");
	
	listado.listado();
	}
}
