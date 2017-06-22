import java.io.*;


public class Game{
	public String getUserGuess(String prompt){
		String inputLine=null;
		System.out.print("\n"+prompt+":  ");
		try{
			BufferedReader is=new BufferedReader(new InputStreamReader(System.in));
			inputLine=is.readLine();
			if(inputLine.length()==0)
				return null;
		}
		catch(IOException e){
			System.out.println("IOEception: "+e);
		}
		return inputLine;
	}
}