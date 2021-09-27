package proyecto;

import java.time.LocalDate;

public class Libros extends MainBiblioteca  {

	private int codigo;
	private String nombre;
	private String Autor;
	private int anoPublicacion;
	private String Editorial;
	private int cantidadPaginas;
	private int precio;
    private int cAutomatizacion;
    private int tiempoLectura;
    private String reserva;
    private int cedualEstudianteR;
    private LocalDate diasEspera;
   private String Prestar;
   
    //Metodos SET y GET
    
    
	public int getCodigo() {
		return codigo;
	}

	public String getPrestar() {
		return Prestar;
	}

	public void setPrestar(String prestar) {
		Prestar = prestar;
	}

	public LocalDate getDiasEspera() {
		return diasEspera;
	}

	public void setDiasEspera(LocalDate diasEspera) {
		this.diasEspera = diasEspera;
	}

	public int getCedualEstudianteR() {
		return cedualEstudianteR;
	}
	public void setCedualEstudianteR(int cedualEstudianteR) {
		this.cedualEstudianteR = cedualEstudianteR;
	}
	public String getReserva() {
		return reserva;
	}
	public void setReserva(String reserva) {
		this.reserva = reserva;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public int getAnoPublicacion() {
		return anoPublicacion;
	}
	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}
	public String getEditorial() {
		return Editorial;
	}
	public void setEditorial(String editorial) {
		Editorial = editorial;
	}
	public int getCantidadPaginas() {
		return cantidadPaginas;
	}
	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}
	public int getPrecio() {
		return precio;
		
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getcAutomatizacion() {
		return cAutomatizacion;
	}
	public void setcAutomatizacion(int cAutomatizacion) {
		this.cAutomatizacion = cAutomatizacion;
	}
	public int getTiempoLectura() {
		return tiempoLectura;
	}
	public void setTiempoLectura(int tiempoLectura) {
		this.tiempoLectura = tiempoLectura;
	}

	@Override
	public String toString() {
		return "Libros:\n"+" Codigo: " + codigo + ",- Nombre: " + nombre + ", -Autor: " + Autor + ", -Año: "
				+ anoPublicacion + ", -Estado: " + reserva + ", -Fecha de Entrega: " + diasEspera ;
	}
	
	
    

	
	
	
}
