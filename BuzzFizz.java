
public class BuzzFizz
{
	public static void main(String[] args)
	{
		for(int i = 1; i < 101; i++)
		{
			int Fizz = i % 3;
			int Buzz = i % 5;
			
			if(Fizz == 0 && Buzz == 0)
			{
				System.out.println("FizzBuzz");
			}
			else
			{
				if(Fizz == 0 || Buzz == 0)
				{
					if(Fizz == 0)
					{
						System.out.println("Fizz");
					}
					else
					{
						System.out.println("Buzz");
					}
				}
				else
				{
					System.out.println(i);
				}
			}
		}
	}
}
