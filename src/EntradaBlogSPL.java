/**
 * Clase para manejar las entradas de un blog.
 * @since clase se cre� el 21/3/1999
 * @author Ana L�pez
 * @version Esta es la versi�n 2.3
 */

public class EntradaBlogSPL{
	/**separador es el car�cter que separa ENTRADA DE del
	nombre del autor
	*/
	
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**Constructor de la clase. 
	 * @param id es el n�mero de entrada
	 * @param autor es el nombre del autor de la entrada
	 * @param texto  es el texto que contiene la entrada
	 * @throws IllegalArgumentException IOException si el ID es negativo, lanza excepci�n
	*/
	public EntradaBlogSPL (int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**M�todo getiD
	* @return Devuelve el n�mero de la entrada
	*/
	public int getId(){
		return this.id;
	}
	
	/**M�todo getTexto
	* @return Devuelve el texto contenido en la entrada
	*/
	public String getTexto(){
		return this.texto;
	}
	/**M�todo getAutor
	* @return el nombre del autor de la entrada en may�sculas
	*/
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**M�todo getAutor
	* @return el nombre del autor de la entrada.
	* @deprecated Ya no se usa
	* @see getAutor
	*/
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**M�todo main
	*@param args no tiene por qu� tener argumentos
	*/
	public static void main(String[] args) {
                //Modificar.
		EntradaBlogSPL e1= new EntradaBlogSPL (1,"ana","�ltimas noticias, est� disponible BixBy 2.0");
		System.out.println(e1);
	}
}