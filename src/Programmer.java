
public class Programmer extends Employee{
  
	private String language;
	
	public Programmer(int id, String firstName, String lastName,String language) {
		super(id, firstName, lastName);
	    this.language=language;
	}
	
	public void format(String operationSystem) {
		
		System.out.println(getFirstName()+" "+getLastName()+" "+operationSystem+" yüklüyor.");
	}

	@Override
	public void showInformation() {
		
		super.showInformation();
		System.out.println(" Yazilimcinin Bildigi diller:"+ language);
	}
 
	
}
