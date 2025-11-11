package theater;

import java.util.List;

/**
 * Represents a customer invoice containing a list of performances.
 */
public class Invoice {

    private final String customer;
    private final List<Performance> performances;

    public Invoice(final String customer, final List<Performance> performances) {
        this.customer = customer;
        this.performances = performances;
    }

    public String getCustomer() {
        return customer;
    }

    public List<Performance> getPerformances() {
        return performances;
    }
}