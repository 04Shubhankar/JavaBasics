class pattern2
{
	public static void main(String[] args)
	{	
		char alph = 'A';
		for(int i = 4 ;  i >= 1 ; i--)
		{
			for(int j = 0 ; j<i ; j++)
			{
				System.out.print(alph);
				alph++;
			}
			
			System.out.println();
			alph = 'A';
		}

	}
}


/*
ABCD
ABC
AB
A

*/
