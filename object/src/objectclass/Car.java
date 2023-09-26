package objectclass;

public class Car 
{
//instance variable
	int carId;
	String brand;
	float price;
	String carName;
	
	void displayCarDetails()
	{
		System.out.println("carId" +carName);
		System.out.println("brand" +brand);
		System.out.println("price" +price);
	}
	
	public static void main(String[] args) 
	{
		Car c1=new Car();// create object
		c1.carId=101;
		c1.carName="Ferrari roma";
		c1.brand="Ferrari";
		c1.price=9000000f;
		
		Car c2=new Car();// create object
		c2.carId=101;
		c2.carName="Fortuner";
		c2.brand="toyota";
		c2.price=700000f;
		
		c1.displayCarDetails();
		c2.displayCarDetails();

	}

}
