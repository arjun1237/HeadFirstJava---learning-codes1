class doctor{
	int h;
	void who(){
		System.out.println("Just Doctor");
	}
	void treat(){
		System.out.println("Doctor treating..!");
	}
	void bill(int surgery){
		h=surgery*100;
		System.out.println("Bill: "+h+"\n");
	}
}

