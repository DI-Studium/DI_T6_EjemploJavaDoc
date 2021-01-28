/**
 * 
 */
package es.studium.InstitutoSuperior;

/**
 * Clase para trabajar con la entidad Alumno
 * @author Alvca
 * @since 2020
 * @version 1.0
 */
public class Alumno {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean haPagado;
	private Aula aula;
	/**
	 * Constructor sin parametos
	 */
	public Alumno()
	{
		nombre = "";
		apellido = "";
		edad = 0;
		haPagado = false;
		aula = new Aula();
	}
	/**
	 * Constructor con parametos
	 * @param n Cadena, Nombre del Alumno
	 * @param a Cadena, Apellido del Alumno
	 * @param e Entero, Edad del Alumno
	 * @param h Boleano, haPagado del Alumno
	 * @param au Aula, Aula del alumno
	 */
	public Alumno(String n, String a, int e, boolean h, Aula au)
	{
		nombre = n;
		apellido = a;
		edad = e;
		haPagado = h;
		aula = au;
	}
	/**
	 * Optiene el nombre del Alumno
	 * @return Cadena, Nombre del Alumno
	 */
	public String getNombre()
	{
		return nombre;
	}
	/**
	 * Establece el nombre del Alumno
	 * @param n Cadena, Nombre del Alumno
	 */
	public void setNombre(String n)
	{
		nombre = n;
	}
	/**
	 * Optiene el apellido del Alumno
	 * @return Cadena, apellido del Alumno
	 */
	public String getApellido()
	{
		return apellido;
	}
	/**
	 * Establece el apellido del Alumno
	 * @param a Cadena, apellido del Alumno
	 */
	public void setApellido(String a)
	{
		apellido = a;
	}
	/**
	 * Optiene la edad del Alumno
	 * @return Entero, Edad del Alumno
	 */
	public int getEdad()
	{
		return edad;
	}
	/**
	 * Establece la edad del Alumno
	 * @param e Entero, Edad del Alumno
	 */
	public void setEdad(int e)
	{
		edad = e;
	}
	/**
	 * Optiene hePagado del Alumno
	 * @return Boleano, haPagado del Alumno
	 */
	public boolean isHaPagado()
	{
		return haPagado;
	}
	/**
	 * Establece hePagado del Alumno
	 * @param h Boleano, haPagado del Alumno
	 */
	public void setHaPagado(boolean h)
	{
		haPagado = h;
	}
	/**
	 * Optiene Aula del Alumno
	 * @return Aula, Aula del alumno
	 */
	public Aula getAula()
	{
		return aula;
	}
	/**
	 * Establece Aula del Alumno
	 * @param a Aula, Aula del alumno
	 */
	public void setAula(Aula a)
	{
		aula = a;
	}
}
