package TPE2;

import java.util.ArrayList;

public class Sets {
	 private ArrayList<Integer> vertices = new ArrayList<>();
	 private int count;
	 public Sets(int cantVertices) {//inicializo todos los vertices en -1, cada uno es un conjunto
		 for(int i = 0; i <= cantVertices; i++) {
			 vertices.add(-1);
		 }
		 System.out.println(vertices);
		 this.count = cantVertices;
	 }

	 public int count() {
		 return this.count;
	 }
	 
	 public boolean connected (int i, int j) {
		 return this.find(i) == this.find(j);
	 }
	 
	 public void union(int i, int j) {
		 if(this.isRoot(i) && this.isRoot(j)) { //i y j deben ser raiz de conjuntos
			 int temp = vertices.get(i) + vertices.get(j);
			 if(vertices.get(i) > vertices.get(j)) { //cant de nodos de i > al de j
				 vertices.set(i, j);
				 vertices.set(j, temp);
			 } else {//j tiene menos nodos que i
				 vertices.set(j, i);
				 vertices.set(i, temp);
			 }
		 }
		 this.count --;
		 System.out.println("union"+vertices);
	 }
	 
	 public int find(int i) {
		 int r = i;
		 int temp;
		 while(vertices.get(r) >= 0) {
			 r = vertices.get(r);
		 }
		 while(i != r) {
			 temp = vertices.get(i);
			 vertices.set(i, r);
			  i = temp;
			 
		 }
		 return r;
	 }
	 
	 public boolean isRoot(int i) {
		 return vertices.get(i) < 0;
	 }
	 
}
