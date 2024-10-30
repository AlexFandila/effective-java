package org.alex.builderpattern;

/**
 * @author alex
 */
public class Main {
	public static void main(String[] args) {
		User u = new User.UserBuilder("John", "Doe")
				.age(30)
				.email("johndoe@doe.com")
				.phoneNumber("123-456-7890")
				.build();
		Car c = new Car.CarBuilder("Picasso", "Citroen")
				.year(2005)
				.color("grey")
				.isElectric(false)
				.build();

		// Builder test
		System.out.println(u.getAge());
		System.out.println(u.getEmail());
		System.out.println(u.getFirstName());

		System.out.println(c.getMake());
		System.out.println(c.getYear());
		System.out.println(c.getColor());
		System.out.println(c.getModel());
	}
}
