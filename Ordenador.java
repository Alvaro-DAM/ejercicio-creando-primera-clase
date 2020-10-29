public class Ordenador {
	// Atributos
	private String usuarioActual;
	private int numeroDeProcesos;
	private boolean conectadoAInternet;

	// Constructor
	public Ordenador (String usuarioInicial, int procesosIniciales) {
		usuarioActual = usuarioInicial;
		numeroDeProcesos = procesosIniciales;
		conectadoAInternet = false;
	}

	// Getters
	public String getUsuarioActual () {
		return usuarioActual;
	}

	public int getNumeroDeProcesos() {
		return numeroDeProcesos;
	}

	public boolean getConectadoAInternet() {
		return conectadoAInternet;
	}

	// Setters
	public void setUsuarioActual(String nuevoUsuario) {
		usuarioActual = nuevoUsuario;
	}

	// Modificar el numero de procesos
	public void modificarNumeroDeProcesos (int nuevosProcesos) {
		numeroDeProcesos = numeroDeProcesos + nuevosProcesos;
	}

	//  Modificar la conexion a internet
	public void estaConectadoAInternet() {
		if (conectadoAInternet == false) {
			conectadoAInternet = true;
		}
		else {
			conectadoAInternet = false;
		}
	}

	// Este es para devolver lo de arriba como string
	public String devolverEstadoOrdenador () {
		StringBuilder estadoPC = new StringBuilder();
		// Concatenamos los estados
		estadoPC.append("Usuario actual: " + usuarioActual + " | " + "Numero de procesos: " + numeroDeProcesos + " | ");

		if (conectadoAInternet == false) {
			estadoPC.append("Conectado a internet: No \n");
		}
		else {
			estadoPC.append("Conectado a internet: Si \n");
		}

		// Devolvemos el estado como string
		String estadoFinalPc = estadoPC.toString();
		return estadoFinalPc;
	}

	// Metodo para imprimir por pantalla la informacion del ordenador
	public void imprimirEstadoOrdenador() {
		System.out.print(devolverEstadoOrdenador() );
	}
}