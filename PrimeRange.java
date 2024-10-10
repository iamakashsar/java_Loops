import java.util.Scanner;
class PrimeRange 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the starting range:");
		int start=sc.nextInt();
		System.out.println("Enter the ending range:");
		int end=sc.nextInt();
		
		
		for(int i=start;i<=end;i++){
			
			int n=i;
			int count=0;

			if(n<=1){
				count++;
			}
				for (int j=2;j<=n/2;j++)
				{
					if(n%j==0){
					
						count++;
						break;}
					
				}
				if(count==0)
					System.out.print(i+ " ");
			}
			
			
		}
	}

