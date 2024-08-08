public class typecast{
	public static void main(String[] args){
		int num = 50;
		System.out.println("The Intiger Value --> "+ num);
		
		double data = num;
		
		System.out.println("The Double Value --> "+ data);
		
		int data1 = (int) num;
		System.out.println("The Intigger Value --> "+ data1);
		
		String data2 = String.valueOf(num);

		System.out.println("The String Value --> "+ data2);
		
		String data3 = "50";
		System.out.println("The String Value --> "+ data3);
		
		int num1 = Integer.parseInt(data3);

		System.out.println("The String Value --> "+ num1);
	}
}

/*
computer@computer-ThinkCentre:~/Desktop/CEB47$ javac typecast.java
computer@computer-ThinkCentre:~/Desktop/CEB47$ java typecast
The Intiger Value --> 50
The Double Value --> 50.0
The Intigger Value --> 50
The String Value --> 50
The String Value --> 50
The String Value --> 50

*/
