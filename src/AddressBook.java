import java.util.ArrayList;
public class AddressBook {
	private static ArrayList<BuddyInfo> buddies;
	
	public AddressBook() {
		buddies = new ArrayList<>();
	}
	
	public static void main(String[] args) {
		System.out.println("Address Book");
		addBuddy(new BuddyInfo());
		removeBuddy(0);
		
	}
	
	public static void addBuddy(BuddyInfo toAdd) {
		buddies.add(toAdd);		
	}
	
	public static void removeBuddy(int index) {
		buddies.remove(index);
		
	}
	
	
}
