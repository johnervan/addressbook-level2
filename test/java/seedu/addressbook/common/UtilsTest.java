package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void isAnyNull_returnsTrueIfNullObject() {
		// Chain of null elements
		assertTrue("Return true if all elements are null", Utils.isAnyNull(null, null, null));

		// One null element in chain
		assertTrue("Return true if at least one element is null", Utils.isAnyNull(1, 2, null, 3));
	}

	@Test
	public void isAnyNull_returnsFalseIfValidObject() {
		// All elements are not null
		assertFalse("Return true if all elements are not null", Utils.isAnyNull(1, "TEST", 5));

		// One non-null object
		assertFalse("Return true if object is valid", Utils.isAnyNull("TEST"));
	}

	@Test
	public void elementsAreUnique_returnsTrueIfUnique() {
		ArrayList<String> testElements = new ArrayList<String>();
		testElements.add("FIRST ELEMENT");
		testElements.add("SECOND ELEMENT");
		testElements.add("THIRD ELEMENT");

		assertTrue("Return true if all elements in ArrayList is unique", Utils.elementsAreUnique(testElements));
	}

	@Test
	public void elementsAreUnique_returnsFalseIfNotUnique() {
		ArrayList<String> testElements = new ArrayList<String>();
		testElements.add("SAME ELEMENT");
		testElements.add("SAME ELEMENT");
		testElements.add("DIFFERENT ELEMENT");

		assertFalse("Return true if at least two elements in ArrayList are the same",
				Utils.elementsAreUnique(testElements));

		testElements.remove(2); // Removes the last element
		assertFalse("Return true if all elements in ArrayList are the same", Utils.elementsAreUnique(testElements));
	}

}
