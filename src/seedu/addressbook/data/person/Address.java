package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses needs to "
    		+ "be entered in the following order: BLOCK, STREET, UNIT, POSTAL_CODE";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    private boolean isPrivate;
    
    private final Block block;
    private final Street street;
    private final Unit unit;
    private final PostalCode postalCode;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        
        String[] addressComponents = address.split(", ");
        this.block = new Block(addressComponents[0]);
        this.street = new Street(addressComponents[1]);
        this.unit = new Unit(addressComponents[2]);
        this.postalCode = new PostalCode(addressComponents[3]);
        
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }
    
    public String getFullAddress(){
    	 return block.getBlock() + ", " + street.getStreet() + ", " + unit.getUnit() + ", "
         		+ postalCode.getPostalCode();
    }

    @Override
    public String toString() {
        return getFullAddress();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.getFullAddress().equals(((Address) other).getFullAddress())); // state check
    }

    @Override
    public int hashCode() {
        return getFullAddress().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}