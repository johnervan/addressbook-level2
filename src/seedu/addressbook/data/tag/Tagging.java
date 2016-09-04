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
	private Boolean isAdded;
	
	public Tagging(Boolean isAdded, Person person, Tag tag){
		this.isAdded = isAdded;
		this.person = person;
		this.tag = tag;
	}
	
	private String getChange(){
		if(isAdded){
			return ADDED;
		} else {
			return DELETED;
		}
	}
	
	@Override
	public String toString() {
        return getChange() + " " + person.getName() + " " + tag.toString();
    }
	

}
