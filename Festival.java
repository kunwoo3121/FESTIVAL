import java.util.Scanner;

public class Festival {
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			int day, team;
			int[] cost = new int[1000];
			double hap, min = Double.MAX_VALUE;
			
			day = sc.nextInt();
			team = sc.nextInt();
			
			for(int j = 0; j < day; j++)
			{
				cost[j] = sc.nextInt();
			}
			
			for(int k1 = team; k1 <= day; k1++)
			{
				for(int k2 = 0; k2 <= day - k1; k2++)
				{
					hap = 0;
					for(int k3 = k2; k3 < k2 + k1; k3++)
					{
						hap += cost[k3];
					}
					
					if(min>hap/k1) min = hap/k1;
				}
			}
			
			System.out.format("%.8f%n", min);
		}
		
		sc.close();
	}
}