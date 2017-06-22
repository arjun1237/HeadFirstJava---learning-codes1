class DotCom{
	private int location[];
	private int hits;
	private boolean zero=true;
	private int z;
	private int repeat[]=new int[3];
	
	public void setLocation(int loc[]){
		location=loc;
	}
	
	public String CheckYurself(String g){
	    int a= Integer.parseInt(g);
		String result="miss";
		if (a==0){
			if(zero){
				zero=false;
				for(int k=0;k<location.length;k++){
					if(location[k]==0){
						z++;
						hits++;
						result="hit";
						break;
					}
				}
			}
			else if(z==1){
				result="repeat";
			}
		}
		else{
			for(int j=0;j<repeat.length;j++){
				if(repeat[j]==a){
					result="repeat";
				}
			}
			if(result.equals("miss")){
				for(int i=0;i<location.length;i++){
					if (location[i]==a){
						hits++;
						result = "hit";	
						repeat[hits-1]=a;
						break;
					}
				}
			}
		}	
		if (hits==location.length){
			result="kill";
		}	
		if (result.equals("repeat"))
			System.out.println("Bitch Please....! Dont repeat :P");
		if (!result.equals("repeat"))
			System.out.println(result);
		return result;	
	}
}