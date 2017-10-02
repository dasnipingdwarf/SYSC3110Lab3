import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<BuddyInfo> buddies;
	
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
		if (toAdd != null) {
			buddies.add(toAdd);		
		}
	}
	
	public BuddyInfo removeBuddy(int index) {
		if (index >= 0 && index < buddies.size()) {
			return(buddies.remove(index));
		}
		return(null);
	}
	
	public BuddyInfo getBuddy(int index) {
		if (index >= 0 && index < buddies.size()) {
			return(buddies.get(index));
		}
		return(null);
	}
	
	public int getSizeOfBuddies(){
		return(buddies.size());	
	}
	
	public void clearBuddiesList() {
		buddies = new ArrayList<BuddyInfo>();
	}
	
	
}
