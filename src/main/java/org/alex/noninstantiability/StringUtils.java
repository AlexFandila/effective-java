package org.alex.noninstantiability;

/**
 * @author alex
 *
 *         Only use when:
 *         - Class with only static methods
 *         - Utility classes
 *         - Classes with constants
 *         - Factory classes
 */
public class StringUtils {
	// Private constructor to prevent instantiation
	private StringUtils() {
		throw new AssertionError("This class should not be instantiated.");
	}

	public static String capitalize(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}

		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}
