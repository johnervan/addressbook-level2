/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Johnervan
 * Represent's a person's residential postal code in the address book
 */
public class PostalCode {
	
	private final String postalCode;
	
	public PostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	
	public String getPostalCode(){
		return postalCode;
	}

}
