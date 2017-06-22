class start{
	public static void main(String args[]){
		encap en=new encap();
		chill ch=new chill();
		
		en.setName("Get");
		String fin=en.getName();
		
		ch.setName("Like");
		String fine=ch.getName();
		
		System.out.println(fin);
		System.out.println(fine);
	}
}