package Act18_Acceso_BBDD_MySQL;

import java.sql.*;


import com.mysql.jdbc.Connection;

public class Acceso implements IntAlumnoDAO {

	private Connection conexion;
	private PreparedStatement preparedStatement;
	private ResultSet rs;
	private String url="jdbc:mysql://82.98.139.78:3306/telefonica";
	private String user="ted";
	private String password="ted2ted";
	
	public void conectar()
	{
		try 	
		{
		Class.forName("com.mysql.jdbc.Driver"); 
		conexion=(Connection) DriverManager.getConnection(url,user, password);
		System.out.println("------------------------------");
		System.out.println("Conexión realizada con éxito");
		System.out.println("Driver cargado con éxito"); 
		System.out.println("------------------------------");
		}
		catch (SQLException exc)
		{
			System.out.println("Error de conexión");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	@Override
	public  void listado() {
		
		try		
		 {    			
			Class.forName("com.mysql.jdbc.Driver"); 
			conexion=(Connection) DriverManager.getConnection(url,user, password);
			
		    // Sentencia sql para obtener todos los alumnos
		    String Sql="select * FROM alumnos";
		    // Se crea un objeto de tipo PreparedStatement, para realizar la consulta
		    preparedStatement=conexion.prepareStatement(Sql);
		    // Se realiza la consulta. Los resultados se guardan en el ResultSet rs           
		    rs = preparedStatement.executeQuery();
   		    // Se recuperan los datos recorriendo el ResultSet, mostrando por pantalla los resultados.  
		    
		    System.out.println("Columnas de la BBDD:");
		    //System.out.println();
		    for (int x=1;x<=rs.getMetaData().getColumnCount();x++) 
		        System.out.println(rs.getMetaData().getColumnName(x)+ "\t");
		    	System.out.println("------------------------------");
		   while (rs.next())
		    {
		     		System.out.println("DNI: "+ rs.getString(1)+" / Nombre: "+ rs.getString(2)+
		     				" / Apellidos: "+ rs.getString(3)+" / Edad: "+ rs.getInt(4)); 
		    }
		    rs.close();
		    preparedStatement.close();
		 }
		 catch (Exception e )
		      {
		            e.printStackTrace();
		      }		
	}
	
	//@Override
	public void nuevo(Alumno alumno) 
		{
		String insertSql="insert into alumnos(dni,nombre,apellidos,edad) values(?,?,?,?)";
	    try
        {  
	    Class.forName("com.mysql.jdbc.Driver"); 
		conexion=(Connection) DriverManager.getConnection(url,user, password);
	    	
        preparedStatement=conexion.prepareStatement(insertSql);
        preparedStatement.setString(1, alumno.getDni());
        preparedStatement.setString(2, alumno.getNombre());
        preparedStatement.setString(3, alumno.getApellidos());
        preparedStatement.setInt(4, alumno.getEdad());      
        preparedStatement.executeUpdate();
        
        //Se cierra el preparedStatement
        preparedStatement.close();
        System.out.println("-------------------------------");
        System.out.println("Inserción realizada con éxito!!!!!");
		}     
       catch (Exception e )
       {
            e.printStackTrace();
            System.out.println("Fallo en inserción");
       }
	}	

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}	
}
