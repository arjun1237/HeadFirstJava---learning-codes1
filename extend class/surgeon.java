class surgeon extends famDoctor{
	void who(){
		System.out.println("Surgeon");
	}
	void call(){
		
		System.out.println("Surgeon calls Home..!");
		super.who();
	}
	public static void main(String args[]){
		surgeon d1=new surgeon();
		d1.who();
		d1.call();
		d1.treat();
		d1.bill(5);
	}
}