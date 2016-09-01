/**
 * 
 */
package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * @author Johnervan
 * Parent class of Phone, Email and Address
 */
public class Contact {
	
	protected boolean isPrivate;
	public final String value;
	
	public Contact(String contactDetail, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        contactDetail = contactDetail.trim();
        this.value = contactDetail;
    }
	
	@Override
    public String toString() {
        return value;
    }
	
	@Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }
	
	@Override
    public int hashCode() {
        return value.hashCode();
    }
	
	public boolean isPrivate() {
        return isPrivate;
    }

}
