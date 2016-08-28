/**
 * 
 */
package seedu.addressbook.ui;

import static seedu.addressbook.common.Messages.*;

import java.util.ArrayList;
import java.util.List;

import seedu.addressbook.data.person.ReadOnlyPerson;

/**
 * @author Johnervan Formats the output text for display
 */
public class Formatter {
	/**
	 * A decorative prefix added to the beginning of lines printed by
	 * AddressBook
	 */
	private static final String LINE_PREFIX = "|| ";

	/** A platform independent line separator. */
	private static final String LS = System.lineSeparator();

	private static final String DIVIDER = "===================================================";

	/** Format of indexed list item */
	private static final String MESSAGE_INDEXED_LIST_ITEM = "\t%1$d. %2$s";

	/** Offset required to convert between 1-indexing and 0-indexing. */
	public static final int DISPLAYED_INDEX_OFFSET = 1;

	/**
	 * Format of a comment input line. Comment lines are silently consumed when
	 * reading user input.
	 */
	private static final String COMMENT_LINE_FORMAT_REGEX = "#.*";

	public String getLinePrefix() {
		return LINE_PREFIX;
	}

	public String getLineSeparator() {
		return LS;
	}

	public String getDivider() {
		return DIVIDER;
	}

	public String getIndexedListItem() {
		return MESSAGE_INDEXED_LIST_ITEM;
	}

	public String getCommentLineFormatRegex() {
		return COMMENT_LINE_FORMAT_REGEX;
	}

	public String showToUserFormat(String message) {
		return LINE_PREFIX + message.replace("\n", LS + LINE_PREFIX);
	}

	/** Formats the Welcome Message */
	public String[] welcomeMessageFormat(String version, String storageFilePath) {
		String storageFileInfo = String.format(MESSAGE_USING_STORAGE_FILE, storageFilePath);
		String[] arr = { DIVIDER, DIVIDER, MESSAGE_WELCOME, version, MESSAGE_PROGRAM_LAUNCH_ARGS_USAGE, storageFileInfo,
				DIVIDER };
		return arr;
	}

	/** Formats the Goodbye Message */
	public String[] goodbyeMessageFormat() {
		String[] arr = { MESSAGE_GOODBYE, DIVIDER, DIVIDER };
		return arr;
	}

	/** Formats the InitFailed Message */
	public String[] initFailedMessageFormat() {
		String[] arr = { MESSAGE_INIT_FAILED, DIVIDER, DIVIDER };
		return arr;
	}

	/** Formats a list of strings as a viewable indexed list. */
	public String getIndexedListForViewing(List<String> listItems) {
		final StringBuilder formatted = new StringBuilder();
		int displayIndex = 0 + DISPLAYED_INDEX_OFFSET;
		for (String listItem : listItems) {
			formatted.append(getIndexedListItem(displayIndex, listItem)).append("\n");
			displayIndex++;
		}
		return formatted.toString();
	}

	/**
	 * Formats a string as a viewable indexed list item.
	 *
	 * @param visibleIndex
	 *            visible index for this listing
	 */
	private static String getIndexedListItem(int visibleIndex, String listItem) {
		return String.format(MESSAGE_INDEXED_LIST_ITEM, visibleIndex, listItem);
	}

	/** Formats the Persons into a list */
	protected static List<String> formatPersons(List<? extends ReadOnlyPerson> persons) {
		final List<String> formattedPersons = new ArrayList<>();
		for (ReadOnlyPerson person : persons) {
			formattedPersons.add(person.getAsTextHidePrivate());
		}
		return formattedPersons;
	}
}
