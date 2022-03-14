package mypack;

public class Launcher {
	public static void main(String[] args) {
		Graph g=new Graph(5);
		g.addEdge(0,1);
		g.addEdge(0,3);
		
		g.addEdge(1, 2);
		g.addEdge(1,3);
		g.addEdge(2,3);
		
		for(int i=0;i<g.novert;i++) {
			System.out.println(" vertex "+i);
			//g.disp(i);
			//g.BFT(i);
			g.DFT(i);
			System.out.println();
		}
	}

}
