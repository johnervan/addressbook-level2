/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Johnervan
 * Represents a person's block number in the address book
 */
public class Block {
	
	private final String block;
	
	public Block (String block){
		this.block = block;
	}
	
	public String getBlock(){
		return block;
	}

}
