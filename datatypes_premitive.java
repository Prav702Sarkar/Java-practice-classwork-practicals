// practical 4

public class datatypes_premitive {
	public static void main(String[] args) {
		String studentName = "Aarav Sharma";
		char section = 'A';
		byte age = 20;
		short rollNumber = 101;
		int attendance = 92;
		long phoneNumber = 9876543210L;
		float percentage = 87.5f;
		double feesPaid = 45000.75;
		boolean isHosteller = true;

		System.out.println("Character byte value: " + (byte) section);
		System.out.println("Student Record");
		System.out.println("Name: " + studentName);
		System.out.println("Section: " + section);
		System.out.println("Age: " + age);
		System.out.println("Roll Number: " + rollNumber);
		System.out.println("Attendance: " + attendance + "%");
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Percentage: " + percentage);
		System.out.println("Fees Paid: " + feesPaid);
		System.out.println("Hosteller: " + isHosteller);
	}
}
