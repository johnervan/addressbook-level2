/**
 * 
 */
package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

/**
 * @author Johnervan
 * Tests the isSimilar method in the Name class
 */
public class NameIsSimilarTest {	
	
	@Test
	public void nullInput_returnsFalse() throws IllegalValueException {	
		Name thisName = new Name("John K Smith");
		Name otherName = null;
		assertFalse(thisName.isSimilar(otherName));
	}

}
