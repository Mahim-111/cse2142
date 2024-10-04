public class Constants {

    // Name of the file containing the list of students.
    public static final String StudentList = "students.txt";

    // Command line argument to show all students.
    public static final String ShowAll = "a";

    // Command line argument to show a random student from the list.
    public static final String ShowRandom = "r";

    // Command line argument to display a count of the number of students in the list.
    public static final String ShowCount = "c";

    // Command line argument to find a student in the list.
    public static final String FindEntry = "?";

    // Command line argument to add an entry to the list.
    public static final String AddEntry = "+";

    // Message that shows proper usage of the command line arguments.
    public static final String Arguments = "Usage: (a | r | c | +word | ?word)";

    // Message indicating that a student was found at a particular index.
    public static final String Found = " found at index: ";

    // Message indicating that a student was not found in the list.
    public static final String NotFound = "Does not exist.";

    // Message displaying the count of words found in the list.
    public static final String WordFound = " word(s) found ";

    // Text to append when updating the list of students.
    public static final String UpdateContent = "\nList last updated on ";

    // Delimiter used to separate student entries in the list.
    public static final String StudentEntryDelimiter = ", ";

    // Character representing a space.
    public static final Character Space = ' ';

    // Message indicating that data loading has been completed.
    public static final String DataLoad = "Data Loaded.";

    // Message indicating that data is being loaded.
    public static final String Loading = "Loading data ...";

    // Date format used for the timestamp when the list is updated.
    public static final String DateStyle = "dd/mm/yyyy-hh:mm:ss a";

    // Message indicating that a search for a student was successful.
    public static final String FoundIt = "We found it!";

    // Constant representing the integer value 0.
    public static final int ZERO = 0;

    // Constant representing the integer value 1.
    public static final int ONE = 1;

    // Constant representing the integer value -1.
    public static final int NEGATIVE_ONE = -1;
}
