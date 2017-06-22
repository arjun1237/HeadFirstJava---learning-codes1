class famDoctor extends doctor{
	void who(){	
		System.out.println("Family Doctor");
		
	}
	void call(){
		
		System.out.println("Doctor calls Home..!");
		super.who();
	}
	public static void main(String args[]){
		famDoctor d2=new famDoctor();
		d2.who();
		d2.call();
		d2.treat();
		d2.bill(5);
	}
}