package mypack;

import java.util.*;

public class Graph {
	int novert;
	LinkedList<Integer> va[];
	
	public Graph(int novert) {
		this.novert=novert;
		
		
		va=new LinkedList[novert];
		for(int i=0;i<novert;i++) {
			va[i]=new LinkedList<Integer>();
			
		}
		
	}
	void addEdge(int o,int d) {
		va[o].add(d);
	}
	void BFT(int v) {
		boolean[] visited=new boolean[novert];
		LinkedList<Integer> tl=new LinkedList <Integer>();
		tl.add(v);
		visited[v]=true;
		
		while(!tl.isEmpty()) {
			int n=tl.poll();
			System.out.print(n+" ");
			
			Iterator<Integer> i=va[n].iterator();
			while (i.hasNext()) {
				int c=i.next();
				if(!visited[c]) {
					visited[c]=true;
					tl.add(c);
				}
			}
		}
	}
	void DFTUtil(int v,boolean visited[]) {
		visited[v]=true;
		System.out.print(v+" ");
		Iterator<Integer>i=va[v].listIterator();
		while(i.hasNext()) {
			int n=i.next();
			if(!visited[n])
				DFTUtil(n,visited);
			
		}
	}
	void DFT(int v) {
		boolean visited[]=new boolean[novert];
		DFTUtil(v,visited);
	}
	
void disp(int v) {
	Iterator<Integer> i=va[v].iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
}
}
