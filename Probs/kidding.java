class kidding{
	public static void main(String args[]){
		int a[][]=new int[4][4];
		int b[][]=new int[4][4];
		random gen=new random();
		gen.go();
		int x=gen.rand;
		System.out.println("\nOriginal");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				gen.go();
				if(i>j)
					a[i][j]=gen.rand;
				else if(i==j)
					a[i][j]=x;
			}
		}
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++)
					b[i][j]=a[j][i];
		}
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j]!=0)
					System.out.print(a[i][j]+" ");
				else
					System.out.print("00 ");
			}
			System.out.println();			
		}
		
		System.out.println("\nFlipped");
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){
				if(b[i][j]!=0)
					System.out.print(b[i][j]+" ");
				else
					System.out.print("00 ");
			}
			System.out.println();			
		}
	}
}