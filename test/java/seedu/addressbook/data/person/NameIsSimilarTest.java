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
	

	public void initialiseThisName() throws IllegalValueException{
		
	}
	
	@Test
	public void isSimilar_nullInputReturnsFalse() throws IllegalValueException {	
		Name thisName = new Name("John K Smith");
		Name otherName = null;
		assertFalse(thisName.isSimilar(otherName));
	}
	
	@Test
	public void isSimilar_equalNamesReturnsTrue() throws IllegalValueException {
	    Name thisName = new Name("John K Smith");
		Name otherName = new Name("John K Smith");
		assertTrue(thisName.isSimilar(otherName));
	}
	
	@Test
	public void isSimilar_diffCaseReturnsTrue() throws IllegalValueException {
		Name thisName = new Name("John K Smith");
		Name otherName = new Name("john k SMITH");
		assertTrue(thisName.isSimilar(otherName));
	}
	
}
