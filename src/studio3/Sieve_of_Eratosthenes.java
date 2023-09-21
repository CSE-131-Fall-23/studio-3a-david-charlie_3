package studio3;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
        boolean[] prime = new boolean[110];
        for(int i=1;i<100;i++)
        	prime[i]=true;
		for(int m = 2; m*m<100;m++)
			for(int i=m*m;i<100;i+=m)
		       prime[i]=false;
		System.out.println("prime number is:");
		for(int i=2;i<100;i++)
			if(prime[i])
				System.out.println(i);	
			
		
		
	}

}
