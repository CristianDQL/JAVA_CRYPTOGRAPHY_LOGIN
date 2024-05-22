package es.cristian.modelo.entidad;

/*
 * Class User
 * 
 * Clase necesario para contener los atributos de los objetos usuario, necesarios
 * para verificar el acceso del usuario.
 */
public class User {
	
	private String name,password;
	
	
	public User(String name, String  password) {
		super();
		this.name = name;
		this.password = password;
	}
	
	public User()	{
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String  getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	
	

}
