/**
 * 
 */
package seedu.addressbook.data.exception;

/**
 * @author Johnervan
 * @description Signals an error if the storage file cannot be found while the address book is running
 */
public class StorageFileNotFoundException extends IllegalValueException {
	
	public StorageFileNotFoundException(String message){
		super(message);
	}
}
