class test{
	public static void main(String args[]){
		Location l=new Location();
		l.local();
		for(int i=0;i<l.loc.length;i++){
			System.out.print(+l.loc[i]+" ");
		}
		random r=new random();
		r.getIt();
		System.out.println("\nguess: "+r.guess);
	}
}