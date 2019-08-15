package week1.day6.assignment2;

public class Person {
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) throws NegativeAgeException {
		if (age < 0)
			throw new NegativeAgeException("People can't have a negative age");
		// else
		this.age = age;
	}
}
