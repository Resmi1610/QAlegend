package utilities;

import java.util.Random;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;

public class Fakerutilitiy {
	public static String getFakeFirstName()//to get unique test data
	{
		Faker faker=new Faker();
		Address address= faker.address();
		String text=address.firstName();
		return text;
	}
	
	public static String getFakerLastName()
	{
		Faker faker=new Faker();
		Address address= faker.address();
		String text=address.lastName();
		return text;
	}
	

	public static String getFakeCityName()
	{
		Faker faker=new Faker();
		Address address= faker.address();
		String text=address.cityName();
		return text;
	}
	

	public static int getRandomNumber()
	{
		Random random=new Random();
		int randomnumber=random.nextInt(100000);// generate random numbers below 1lakh
		return randomnumber;
	}
	

	
	

}
