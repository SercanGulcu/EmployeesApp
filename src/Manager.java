
public class Manager extends Employee {

	private int numberOfPeople;
	
	public Manager(int id, String firstName, String lastName,int numberOfPeople) {
		super(id, firstName, lastName);
        this.numberOfPeople=numberOfPeople;
	}

	@Override
	public void showInformation() {
		super.showInformation();
		System.out.println(" Yoneticinin yonettigi kisi sayisi:" + numberOfPeople);
	}
	
	public void makeRaise(int amount) {
		System.out.println(getFirstName()+" "+getLastName()+" calisanlara "+amount +" tl kadar zam yapiyor.");
	}
	
	

}
