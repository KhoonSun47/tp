package seedu.address.testutil;

import seedu.address.model.house.HousingType;
import seedu.address.model.person.Budget;
import seedu.address.model.person.Buyer;
import seedu.address.model.person.Email;
import seedu.address.model.person.Name;
import seedu.address.model.person.Phone;


/**
 * A Utility class to help with building Buyer objects.
 */
public class BuyerBuilder {
    public static final String DEFAULT_NAME = "James Lim";
    public static final String DEFAULT_PHONE = "93840172";
    public static final String DEFAULT_EMAIL = "james@gmail.com";
    public static final String DEFAULT_BUDGET = "666000";
    public static final String DEFAULT_HOUSING_TYPE = "Hdb";

    private Name name;
    private Phone phone;
    private Email email;
    private HousingType preferredHousingType;
    private Budget budget;

    /**
     * Creates a {@code BuyerBuilder} with the default information.
     */
    public BuyerBuilder() {
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        email = new Email(DEFAULT_EMAIL);
        preferredHousingType = new HousingType(DEFAULT_HOUSING_TYPE);
        budget = new Budget(DEFAULT_BUDGET);
    }

    /**
     * Initializes the BuyerBuilder with the data of {@code personToCopy}
     */
    public BuyerBuilder(Buyer personToCopy) {
        name = personToCopy.getName();
        phone = personToCopy.getPhone();
        email = personToCopy.getEmail();
        preferredHousingType = personToCopy.getPreferredHousingType();
        budget = personToCopy.getBudget();
    }

    /**
     * Sets the {@code Name} of the {@code Buyer} that we are building.
     */
    public BuyerBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Buyer} that we are building.
     */
    public BuyerBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Buyer} that we are building.
     */
    public BuyerBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Buyer} that we are building.
     */
    public BuyerBuilder withHousingType(String housingType) {
        this.preferredHousingType = new HousingType(housingType);
        return this;
    }

    /**
     * Sets the {@code Budget} of the {@code Buyer} that we are building.
     */
    public BuyerBuilder withBudget(String budget) {
        this.budget = new Budget(budget.trim());
        return this;
    }

    public Buyer build() {
        return new Buyer(name, phone, email, budget, preferredHousingType);
    }
}
