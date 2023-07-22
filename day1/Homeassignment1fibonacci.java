package week1.day1;

public class Homeassignment1fibonacci {
public static void main(String[] args) {
	int firstnum=0,secnum=1,nextnum,a,sum=11;
	System.out.print(firstnum + " " +secnum);
	for(a=2;a<sum;++a)
	{
		nextnum=firstnum+secnum;
		System.out.print(" " +nextnum);
		firstnum=secnum;
		secnum=nextnum;
		
		
	}
	
}
	
}
