/**
 * 
 */
package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

/**
 * @author Johnervan
 * Association Class for the Tag class and Person class
 * Each Tagging Object represents an adding or deleting of a tag for a specific person
 * that happened during that session
 */ 
public class Tagging {
	public static final String ADDED = "+";
	public static final String DELETED = "-";
	
	private Person person;
	private Tag tag;
	private String change;
	
	public Tagging(String change, Person person, Tag tag){
		this.change = change;
		this.person = person;
		this.tag = tag;
	}
	
	@Override
	public String toString() {
        return change + " " + person.getName() + " " + tag.toString();
    }
	

}
