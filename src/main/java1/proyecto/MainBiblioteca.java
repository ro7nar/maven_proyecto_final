package proyecto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);
		int i = 0;
		int opcion = 0;
		int opcion2;
		int codigoAutorizacion;
		int tiempoLectura;
		int salida = 0;
		String prestar = "Prestado";

		int codigoLibro;// primitivo
		Integer codigoLibroWrappers = 0;// Wrapper
		int cedula;
		Integer cedulaWrappers = 0;
		boolean disponibilidad = false;
		boolean resultados = false;
		boolean resultados2 = false;
		boolean resultados3 = false;
		String reservarLibro = "Disponible";
		String reservarLibro2 = "Reservado";
		Libros listaLibros[] = new Libros[7];
		LocalDate diaHoy = LocalDate.now();// Fecha actual

		Libros nuevoLibro1 = new Libros();
		Libros nuevoLibro2 = new Libros();
		Libros nuevoLibro3 = new Libros();
		Libros nuevoLibro4 = new Libros();
		Libros nuevoLibro5 = new Libros();
		Libros nuevoLibro6 = new Libros();
		Libros nuevoLibro7 = new Libros();
		listaLibros[0] = nuevoLibro1;
		listaLibros[1] = nuevoLibro2;
		listaLibros[2] = nuevoLibro3;
		listaLibros[3] = nuevoLibro4;
		listaLibros[4] = nuevoLibro5;
		listaLibros[5] = nuevoLibro6;
		listaLibros[6] = nuevoLibro7;
		nuevoLibro1.setReserva(reservarLibro);
		nuevoLibro2.setReserva(reservarLibro);
		nuevoLibro3.setReserva(reservarLibro);
		nuevoLibro4.setReserva(reservarLibro);
		nuevoLibro5.setReserva(reservarLibro);
		nuevoLibro6.setReserva(reservarLibro);
		nuevoLibro7.setReserva(reservarLibro);

		do {
			System.out.println("" + "**********Bienvenido en que le podemos ayudar?**********\n"

					+ "1. Estudiantes:\r\n" + "          a. Consultar libros\r\n" + "          b. Reservar libro\r\n"
					+ "2. Bibliotecario\r\n" + "          a. Ingresar un libro\r\n"
					+ "          b. Prestar un libro\r\n" + "          c. Aplazar fecha de entrega\r\n" + "3. SALIR");
			opcion = lector.nextInt();

			// Parte 1
			if (opcion == 1) {
				System.out.println("Elija la opcion:\n " + "	1)a. Consultar libros\n" + "	2)b. Reservar libro\n");
				opcion2 = lector.nextInt();

				switch (opcion2) {

				case 1:
					System.out.println("Ingrese el nombre del libro");
					String nombre = teclado.nextLine();
					System.out.println("Ingrese el autor del libro");
					String autor = teclado.nextLine();
					for (i = 0; i < listaLibros.length; i++) {
						Libros libroBuscar = listaLibros[i];
						resultados = nombre.equals(libroBuscar.getNombre());
						resultados2 = autor.equals(libroBuscar.getAutor());
						if (resultados == true || resultados2 == true) {
							System.out.println(listaLibros.toString());

						} else {
							System.out.println("-");
						}

					}

					break;
				case 2:
					System.out.println("Ingrese el código del libro a reservar");
					codigoLibroWrappers = lector.nextInt();
					System.out.println("Ingrese su cedula");
					cedulaWrappers = lector.nextInt();
					// busca el libro
					for (i = 0; i < listaLibros.length; i++) {
						Libros libroBuscar = listaLibros[i];
						resultados = codigoLibroWrappers.equals(libroBuscar.getCodigo());

						if (resultados == true) {

							disponibilidad = reservarLibro.contains(libroBuscar.getReserva());
							// reserva del libro
							if (disponibilidad == true) {

								System.out.println(libroBuscar.getReserva());
								System.out.println("Se procedera a reservar su libro " + libroBuscar.getNombre());
								libroBuscar.setReserva("Reservado");
								LocalDate diaFin = diaHoy.plusDays(5);
								libroBuscar.setDiasEspera(diaFin);
								libroBuscar.setCedualEstudianteR(cedulaWrappers);
								System.out.println("El libro ha sido correctamente reservado\n"
										+ "debe pasarlo a retirar de la biblioteca");
							} else if (disponibilidad == false) {
								System.out.println("EL libro no se encuentra disponible por el momento\n"
										+ "Disponible el: " + libroBuscar.getDiasEspera());
							}
						} else if (resultados == false) {
							System.out.println("No se encontro el libro");
						}

					}

				}

			}

			// Parte2

			else if (opcion == 2) {

				System.out.println("Elija la opcion:\n " + "	1)a.Ingresar Libro\n" + "	2)b. Prestar un libro\n"
						+ "       3)c. Aplazar fecha de entrega");
				int opcion3 = lector.nextInt();

				switch (opcion3) {

				case 1:
					System.out.println("Cuantos libros desea ingresar?");
					salida = lector.nextInt();
					for (i = 0; i < salida; i++) {
						Libros nuevoLibro = new Libros();

						System.out.println("Ingrese la siguiente información");
						System.out.println("Ingrese el codigo del libro");
						codigoLibroWrappers = lector.nextInt();
						System.out.println("Ingrese nombre");
						String nombre = teclado.nextLine();
						System.out.println("Ingrese el autor");
						String autor = teclado.nextLine();
						System.out.println("Ingrese el año de publicacion");
						int anoPublicacion = lector.nextInt();
						System.out.println("Ingrese la Editorial");
						String editorial = teclado.nextLine();
						System.out.println("Ingrese la cantidad de paginas");
						int cantidadPaginas = lector.nextInt();
						System.out.println("Ingrese el precio");
						int precio = lector.nextInt();

						System.out.println(" Elija que tipo de libro es");
						System.out.println("1. Libro de trabajo\n" + "2. Libro lectura");
						int opcion4 = lector.nextInt();
						if (opcion4 == 1) {
							System.out.println("Ingrese el codigo de autorizacion");
							codigoAutorizacion = lector.nextInt();
							nuevoLibro.setcAutomatizacion(codigoAutorizacion);
						} else if (opcion4 == 2) {
							System.out.println("Ingrese el tiempo aproximado de lectura");
							tiempoLectura = lector.nextInt();
							nuevoLibro.setTiempoLectura(tiempoLectura);
						} else {
							System.out.println("No existe esa opcion");

						}

						nuevoLibro.setCodigo(codigoLibroWrappers);
						nuevoLibro.setNombre(nombre);
						nuevoLibro.setAutor(autor);
						nuevoLibro.setAnoPublicacion(anoPublicacion);
						nuevoLibro.setEditorial(editorial);
						nuevoLibro.setCantidadPaginas(cantidadPaginas);
						nuevoLibro.setPrecio(precio);
						nuevoLibro.setDiasEspera(diaHoy);

						listaLibros[i] = nuevoLibro;

					}
//impresion del arrreglo
					for (i = 0; i < listaLibros.length; i++) {
						System.out.println(listaLibros[i]);
					}

					break;
				case 2:
					// prestar un lirbo
					System.out.println("Por favor ingrese el código del libro");
					int codigoL = lector.nextInt();
					for (i = 0; i < listaLibros.length; i++) {
						Libros libroBuscar = listaLibros[i];
						resultados = codigoLibroWrappers.equals(libroBuscar.getCodigo());
						if (resultados == true) {
							disponibilidad = reservarLibro2.contains(libroBuscar.getReserva());
							if (disponibilidad == true) {
								System.out.println("Libro\n" + "Codigo" + libroBuscar.getCodigo() + "-Nombre: "
										+ libroBuscar.getNombre() + "-Estado: " + libroBuscar.getReserva() + "-Fecha: "
										+ libroBuscar.getDiasEspera() + "-Reservado por: "
										+ libroBuscar.getCedualEstudianteR());

								System.out.println("Elija la opcion:\n" + " 1) Prestar  2)No prestar ");
								int opcion4 = lector.nextInt();
								if (opcion4 == 1) {
									libroBuscar.setPrestar(prestar);
									LocalDate diaFin = diaHoy.plusDays(10);
									System.out.println("Opcion Aprovada fecha de entrega: " + diaFin);
								} else {
									System.out.println("No se ha prestado el libro");

								}
							} else {
								System.out.println("No se ha encontrado el libro que busca");
							}

						}
					}

					break;
				case 3:

					System.out.println("Ingrese el codigo del libro");
					codigoLibroWrappers = lector.nextInt();
					System.out.println("Ingrese la cedula del estudiante a quien se le presto el libro");
					cedulaWrappers = lector.nextInt();
					for (i = 0; i < listaLibros.length; i++) {
						Libros libroBuscar = listaLibros[i];
						resultados = codigoLibroWrappers.equals(libroBuscar.getCodigo());
						resultados2 = cedulaWrappers.equals(libroBuscar.getCedualEstudianteR());
						resultados3 = prestar.equals(libroBuscar.getPrestar());
						if ((resultados == true || resultados2 == true) && resultados3 == true) {
							System.out.println("Libro\n" + "Codigo" + libroBuscar.getCodigo() + "-Nombre: "
									+ libroBuscar.getNombre() + "-Estado: " + libroBuscar.getReserva()
									+ "-Fecha Entrega: " + libroBuscar.getDiasEspera() + "-Prestado a: "
									+ libroBuscar.getCedualEstudianteR());
						} else {
							System.out.println("No se ha encontrado el libro");

							System.out.println("Desea aplazar:\n" + "1) Aplazar        2)No Aplazar");
							int opcion5 = lector.nextInt();
							if (opcion5 == 1) {
								LocalDate DiasAplazar = libroBuscar.getDiasEspera();
								DiasAplazar.plusDays(5);
								libroBuscar.setDiasEspera(DiasAplazar);

								System.out.println(
										"Se ha aplazado la fecha exitosamente: " + libroBuscar.getDiasEspera());
							} else if (opcion5 == 2) {
								System.out.println("continuando");

							}

						}

					}

					break;
				}

			}

			// Salida
			else if (opcion == 3) {
				break;

			}

			// Por defecto
			else {
				System.out.println("No se encuentra la opcion indicada");

			}

		} while (opcion != 3);

	}
}
