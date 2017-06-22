import java.util.ArrayList;
class arre2{
	public static void main(String args[]){
		int a=5;
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (int i=1;i<=10;i++){
			list.add(a);
		}
		list.set(4,8);
		System.out.println("Array size: "+list.size());
		System.out.println("in 5th index: "+list.get(4));
		System.out.println("first index of 5: "+list.indexOf(5));
		System.out.println("last index of 5: "+list.lastIndexOf(5));
		list.remove(3);
		System.out.println("in 4th index after deletion: "+list.get(3));
		System.out.println("Array size deletion: "+list.size());
		for (int i=0;i<=8;i++){
			System.out.print(list.get(i)+" ");
		}
	}
}