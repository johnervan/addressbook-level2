/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Johnervan
 * Represents a person's house street name in the address book
 */
public class Street {
	
	private final String street;
	
	public Street (String street){
		this.street = street;
	}
	
	public String getStreet(){
		return street;
	}

}
