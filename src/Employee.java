
public class Employee {
	
	int id;
	private String firstName;
	private String lastName;
	
	
	public Employee(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void showInformation() {
		
		System.out.println("Calisan Bilgileri....");
		System.out.print("Ad:" + firstName);
		System.out.print(" Soyad:"+ lastName);
		System.out.print(" Id :"+ id);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
  
	
}
