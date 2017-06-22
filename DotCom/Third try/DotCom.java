import java.util.ArrayList;


class DotCom{
	private ArrayList<Integer> location;
	private ArrayList<Integer> repeat=new ArrayList<Integer>();
	
	public void setLocation(ArrayList<Integer> loc){
		location=loc;
	}
	
	public String CheckYurself(String g){
		int ch=Integer.parseInt(g);
		String result="miss";		
		int check=location.indexOf(ch);		
		if (check>=0){
			location.remove(check);			
			result="hit";
			if(location.isEmpty())
				result="kill";			
		}
		int check2=repeat.indexOf(ch);
		if(check2>=0)
			result="repeat";
		if (result.equals("repeat"))
			System.out.println("Bitch Please....! Dont repeat :P");
		if (!result.equals("repeat"))
			System.out.println(result);
		if(check>=0)
			repeat.add(ch);
		return result;
	}
}