/**
 * 
 */
package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

/**
 * @author Johnervan
 * Tests the isSimilar method in the Name class
 */
public class NameIsSimilarTest {	
	
	private Name thisName;
	
	@Before
	public void initialiseThisName() throws IllegalValueException{
		thisName = new Name("John K Smith");
	}
	
	@Test
	public void isSimilar_nullInputReturnsFalse() throws IllegalValueException {	
		Name otherName = null;
		assertFalse(thisName.isSimilar(otherName));
	}
	
	@Test
	public void isSimilar_equalNamesReturnsTrue() throws IllegalValueException {
		Name otherName = new Name("John K Smith");
		assertTrue(thisName.isSimilar(otherName));
	}
	
	@Test
	public void isSimilar_diffCaseReturnsTrue() throws IllegalValueException {
		Name otherName = new Name("john k SMITH");
		assertTrue(thisName.isSimilar(otherName));
	}
	
	@Test
	public void isSimilar_diffOrderReturnsTrue() throws IllegalValueException {
		Name otherName = new Name("Smith John K");
		assertTrue(thisName.isSimilar(otherName));
	}
	
	@Test
	public void isSimilar_subSetReturnsTrue() throws IllegalValueException {
		Name otherName = new Name("John Smith");
		assertTrue(thisName.isSimilar(otherName));
	}
	
	@Test
	public void isSimilar_superSetReturnsFalse() throws IllegalValueException {
		Name testName = new Name("JOHN");
		Name otherName = new Name("JOHNathan");
		assertFalse(testName.isSimilar(otherName));
	}
	
	@Test
	public void isSimilar_diffNameReturnsFalse() throws IllegalValueException {
		Name otherName = new Name("VERY DIFFERENT NAME");
		assertFalse(thisName.isSimilar(otherName));
	}
	
	@Test
	public void isSimilar_nameContainingSubSetReturnsTrue() throws IllegalValueException {
		Name otherName = new Name("Alan M Smith");
		assertTrue(thisName.isSimilar(otherName));
	}
	
}
