class pattern1
{
	public static void main(String[] args)
	{	
		int num = 1;
		for(int i = 1 ;  i <= 4 ; i++)
		{
			for(int j = 0 ; j<i ; j++)
			{
				System.out.print(num);
			}
			
			num++;
			System.out.println("");
		}

	}
}



/*
1
22
333
4444
*/
