class justTry{
	public static void main(String args[]){
		justTry d=new justTry();
		int x=0;
		int z=x++;
		for(int k=0;k<3;k++){
			System.out.println("k: "+k);
		}
		System.out.println();
		String list[]={"neha","saloni","navya"};
		for(String name: list){
			System.out.println(name);
		}
		System.out.println("\nx: "+x);
		System.out.println("z: "+z);
		d.doIt();
		
		int hu=Integer.parseInt("3");
		System.out.println("\n"+hu);
	}
	void doIt(){
		System.out.println("what the hell");
	}
}