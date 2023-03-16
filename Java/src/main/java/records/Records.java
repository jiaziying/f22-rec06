package records;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Exercise 1: Extract Parameter Object
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    // private final List<String[]> records;
    private final List<Person> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a person's record.
     *
     * @param firstName   first name of the person
     * @param lastName    last name of the person
     * @param phoneNumber phone number of the person
     * @param zipCode     zip code of the person
     * @param state       state of the person
     * @param gender      gender of the person
     * @return Return false if the record has existed. Else, return true.
     */
    /*
    public boolean addRecord(String firstName, String lastName, String phoneNumber,
                             String zipCode, String state, String gender) {
        for (String[] row : this.records) {
            if (row[0].equals(firstName)
                    && row[1].equals(lastName)
                    && row[2].equals(phoneNumber)
                    && row[3].equals(zipCode)
                    && row[4].equals(state)
                    && row[5].equals(gender)) {
                return false;
            }
        }
        this.records.add(
                new String[]{firstName, lastName, phoneNumber, zipCode, state, gender});
        return true;
    }
     */

    /**
     * Add a person's record.
     */
    public boolean addRecord(Person person) {
        for (Person row : this.records) {
            if (row.equals(person)) {
                return false;
            }
        }
        this.records.add(person);
        return true;
    }
}