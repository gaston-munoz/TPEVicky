package TPE2;

public class Main {
	public static void main(String[] args) {
		
		GrafoNoDirigido<Estacion> g = new Grafo<>();

		String path = "PATH/AL/ARCHIVO";
		CSVReader reader = new CSVReader(path);
		reader.read();
		
	}

}
