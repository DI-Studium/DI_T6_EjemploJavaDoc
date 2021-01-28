/**
 * 
 */
package es.studium.InstitutoSuperior;

/**
 * Clase para trabajar con la entidad Aula
 * @author Alvca
 * @since 2020
 * @version 1.0
 */
public class Aula {

	private String nombre;
	private int capacidad;
	/**
	 * Constructor sin parametos
	 */
	public Aula()
	{
		nombre = "";
		capacidad = 0;
	}
	/**
	 * Constructor con parametros
	 * @param n Cadena, Nombre del Aula
	 * @param c Entero, Capacidad del Aula
	 */
	public Aula(String n, int c)
	{
		nombre = n;
		capacidad = c;
	}
	/**
	 * Optiene el nombre del Aula
	 * @return Cadena, nombre del aula
	 */
	public String getNombre()
	{
		return nombre;
	}
	/**
	 * Establece un nombre al aula
	 * @param n Cadena, nombre del aula
	 */
	public void setNombre(String n)
	{
		nombre = n;
	}
	/**
	 * Optiene la capacidad del Aula
	 * @return Entero, Capacidad del Aula
	 */
	public int getCapacidad()
	{
		return capacidad;
	}
	/**
	 * Establece la capacidad del aula
	 * @param c Entero, Capacidad del Aula
	 */
	public void setCapacidad(int c)
	{
		capacidad = c;
	}
}
