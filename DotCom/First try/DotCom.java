class DotCom{
	private static int hits;
	private static int score;
	
	public static void main(String args[]){
		
		int score=1;
		int count=0;
		int dupe[]=new int[3];
		
		Location l=new Location();
		l.local();
		for(int k=0;k<dupe.length;k++)
			dupe[k]=l.loc[k];
		
		random r=new random();
		
		boolean check=true;
		boolean find=false;
		
		while (check){
			r.getIt();
			count++;
			System.out.println("The current guess is : "+r.guess);
			for(int i=0;i<l.loc.length;i++){
				if(r.guess==l.loc[i]){
					hits++;
					find=true;
					l.loc[i]=-1;
					break;
				}
			}
			if(hits==3){
				check=false;
				System.out.println("its is KILL... Congrats!");
				System.out.println("\nNo. of attempts made: "+count);
			}
			else{
				if(find)
					System.out.println("HIT...!\n");
				else
					System.out.println("MISS...!\n");
			}
			find=false;
		}
		
		if(count==3){
			score=10;
			System.out.println("\nYour score: "+score+" on 10");
		}
		else if(count<7){
			score=9;
			System.out.println("\nYour score: "+score+" on 10");
		}
		else if(count<10){
			score=8;
			System.out.println("\nYour score: "+score+" on 10");
		}
		else if(count<13){
			score=7;
			System.out.println("\nYour score: "+score+" on 10");
		}
		else if(count<16){
			score=6;
			System.out.println("\nYour score: "+score+" on 10");
		}
		else if(count<20){
			score=5;
			System.out.println("\nYour score: "+score+" on 10");
		}
		else if(count<23){
			score=4;
			System.out.println("\nYour score: "+score+" on 10");
		}
		else if(count<26){
			score=3;
			System.out.println("\nYour score: "+score+" on 10");
		}
		else if(count<30){
			score=2;
			System.out.println("\nYour score: "+score+" on 10");
		}
		else{
			score=1;
			System.out.println("\nYour score: "+score+" on 10");
		}
		
		System.out.print("\nThe DotCom was in location: ");
		for(int j=0; j<dupe.length;j++)
			System.out.print(dupe[j]+" ");
	}
}

