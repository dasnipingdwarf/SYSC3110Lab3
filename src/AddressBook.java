import java.util.ArrayList;
public class AddressBook {
	private ArrayList<BuddyInfo> buddies;
	
	public AddressBook() {
		buddies = new ArrayList<BuddyInfo>();
	}
	
	public static void main(String[] args) {
		AddressBook book = new AddressBook();
		
		System.out.println("Address Book");
		
		book.addBuddy(new BuddyInfo());
		book.removeBuddy(0);
		
	}
	
	public void addBuddy(BuddyInfo toAdd) {
		buddies.add(toAdd);		
	}
	
	public void removeBuddy(int index) {
		buddies.remove(index);
		
	}
	
	
}
