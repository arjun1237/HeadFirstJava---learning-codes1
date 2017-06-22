import java.util.ArrayList;
class arre{
	public static void main(String args[]){
		ArrayList<Integer> list=new ArrayList<Integer>();
		int a=5;
		list.add(a);
		int b=6;
		list.add(b);
		int c=8;
		list.add(c);
		int d=list.size();
		boolean ch=list.contains(6);
		boolean dh=list.contains(4);
		int x=list.indexOf(8);
		int y=list.indexOf(4);
		boolean q=list.isEmpty();
		int v=list.get(0);
		
		
		System.out.println("array size: "+d);
		System.out.println("does array contain 6?: "+ch);
		System.out.println("does array contain 4?: "+dh);
		System.out.println("index of 8: "+x);
		System.out.println("index of 4: "+y);
		System.out.println("is array empty: "+q);
		System.out.println("the value in index 0: "+v);
		
		list.remove(1);
		
		System.out.println("array size after removing an object: "+list.size());
		System.out.println("the value in index 2: "+list.get(1));
		System.out.println("the value in index 1: "+list.get(0));
	}
}