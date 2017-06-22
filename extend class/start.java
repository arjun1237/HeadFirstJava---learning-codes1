class start{
	public static void main(String args[]){
		doctor d1=new doctor();
		famDoctor d2=new famDoctor();
		
		d1.who();
		d1.treat();
		d1.bill(4);
		
		d2.who();
		d2.call();
		d2.treat();
		d2.bill(5);
	}
}