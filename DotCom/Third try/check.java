import java.util.ArrayList;


class check{
	ArrayList<Integer> location;
	public static void main(String args[]){
		ArrayList<Integer> takeIn=new ArrayList<Integer>();
		check c=new check();
		random r=new random();
		r.locGuess();
		int l=r.Locator;
		System.out.println(l);
		takeIn.add(l);
		
		for(int a=1;a<3;a++)
			takeIn.add(l+a);
		for(int i=0;i<3;i++)
			System.out.print(takeIn.get(i));
		c.chill(takeIn);
		
		Game help=new Game();
		String res=help.getUserGuess("Just enter something");
		String keep=c.run(res);
		System.out.println(keep);
	}	
	
	public void chill(ArrayList<Integer> loc){
		location=loc;
	}
		
		
	public String run(String g){
		int ch=Integer.parseInt(g);
		String result="miss";		
		int check=location.indexOf(ch);
		if (check>=0){
			location.remove(check);
			result="hit";
			if(location.isEmpty())
				result="kill";
		}
		return result;
	}
}