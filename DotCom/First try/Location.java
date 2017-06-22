class Location{
	int loc[]=new int[3];
	//public static void main(String args[]){
	void local(){
		int i= (int) (Math.random()*8);
		for(int j=0;j<loc.length;j++){
			loc[j]=i;
			i++;
		}		
	}
}