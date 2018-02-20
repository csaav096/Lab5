import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     * new javadoc comment
     */

    public enum BankAccountType {

        /**
         *
         */

        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    private BankAccountType accountType;
    /**
     *
     */
    private double accountBalance;
    /**
     *
     */
    private String ownerName;
    /**
     *
     */
    private double interestRate;
    /**
     *
     */
    private double interestEarned;

    /**
     *
     * @param name name of bank
     * @param accountCategory type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
