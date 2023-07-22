package week1.day1;

public class Isprime {
public static void main(String[] args) {
	int n=9,i;
	for(i=2;i<n-1;i++)
	{
		if(n%i==0)
		{
			System.out.println(i+"is not a primenumber");
		}
		else
		{
			System.out.println(n+"is a primenumber");
		}
		break;
	}
	}
	
}

