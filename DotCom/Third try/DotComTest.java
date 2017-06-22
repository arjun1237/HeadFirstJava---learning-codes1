import java.util.ArrayList;


class DotComTest{
	public static void main(String args[]){
		int score=0;
		int l=0;
		ArrayList<Integer> takeIn=new ArrayList<Integer>();
		
		DotCom d=new DotCom();
		random r=new random();
		Game helper=new Game();
		
        r.locGuess();
		l=r.Locator;
		takeIn.add(l);
		for(int a=1;a<3;a++){
			takeIn.add(l+a);
		}
		
		d.setLocation(takeIn);
		
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