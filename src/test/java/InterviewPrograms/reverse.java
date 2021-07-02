package InterviewPrograms;
public class reverse {
	public static void main(String[] args) {
	    System.out.println("===================");
	    int x=3456789;
	    int y=0;
	    while(x!=0)
	    {
	    	y=(y*10)+(x%10);
	    	x=x/10;
	    }
	    System.out.println("The Reverse Number: "+y);
	    System.out.println("Mrinmoy Biswas");
	}
}
