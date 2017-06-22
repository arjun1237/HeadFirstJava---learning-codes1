class DotComTest{
	public static void main(String args[]){
		int score=0;
		int l[]=new int[3];
		
		DotCom d=new DotCom();
		random r=new random();
		Game helper=new Game();
		
        r.locGuess();
		l[0]=r.Locator;
		for(int a=1;a<l.length;a++){
			l[a]=l[a-1]+1;
		}
		
		d.setLocation(l);
		
		System.out.println("\nThe DotCom could be in any 3 consecutive numbers between 0 to 9");
		while(true){
			String input=helper.getUserGuess("enter your Guess");
			String result=d.CheckYurself(input);
			score++;
			if (result.equals("kill"))
				break;			
		}
		System.out.println("No. of guess your have made: "+score);
	}
}