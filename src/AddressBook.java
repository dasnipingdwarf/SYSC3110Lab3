import java.util.ArrayList;
public class AddressBook {
	private ArrayList<BuddyInfo> buddies;
	
	public AddressBook() {
		buddies = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		System.out.println("Address Book");
		
	}
	
	public void addBuddy(BuddyInfo toAdd) {
		buddies.add(toAdd);		
	}
	
	public void removeBuddy(int index) {
		buddies.remove(index);
		
	}
	
	
}
