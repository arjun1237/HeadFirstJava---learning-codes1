class encap{
	int num;
	private int age;
	String name;
	
	public void setName(String n){
		name=n;
	}
	public String getName(){
		name=name.concat(" that !");
		return name;
	}
}