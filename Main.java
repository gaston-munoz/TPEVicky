package TPE2;

public class Main {
	public static void main(String[] args) {
		
		GrafoNoDirigido<Integer> g = new GrafoNoDirigido<>();

		String path = "C:/Users/vicky/OneDrive/Escritorio/datasets/dataset2.txt";
		CSVReader reader = new CSVReader(path);
		reader.read(g);
		
		System.out.println(g);
		
		g.imprimirGrafo();
		g.imprimirEtiquetaArco();
		
	}

}
