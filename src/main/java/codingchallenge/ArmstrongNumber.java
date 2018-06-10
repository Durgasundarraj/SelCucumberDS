package codingchallenge;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int num;
		int mod, armNo = 0;
		for(int i = 100; i<1000; i++)
		{
			num = i;
			while(num > 0)
			{
				mod = num%10;
				armNo = armNo + (mod * mod * mod);
				num = num/10;
			}

			if (armNo == i)
			{
				System.out.println("Armstrong Number: " +armNo);
			}
			armNo = 0;
		}
	}
}


