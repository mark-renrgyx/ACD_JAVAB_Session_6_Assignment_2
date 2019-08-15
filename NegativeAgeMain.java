package week1.day6.assignment2;

public class NegativeAgeMain {

	public static void main(String[] args) {
		Person p = new Person ();
		try {
			p.setAge(15);
		} catch (NegativeAgeException e) {
			e.printStackTrace();
		}
		
		System.out.println("Yay a " + p.getAge() + "year old");
		
		try {
			p.setAge(-15);
		} catch (NegativeAgeException e) {
			System.out.println("Successfully failed!");
		}
	}
}
