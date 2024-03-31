package seedu.address.model.house;

import seedu.address.commons.util.ToStringBuilder;


/**
 * Represents a Condominium
 */
public class Condominium implements House {

    public final PostalCode postalCode;
    public final Street street;
    public final UnitNumber unitNumber;
    public final Block block;
    public final Level level;

    /**
     * Constructs a Condominium.
     *
     * @param unitNumber The unit number of the house.
     * @param postalCode The postal code of the house.
     * @param street     The street of the house.
     * @param block      The block of the house.
     * @param level      The level of the house.
     */
    public Condominium(Level level, PostalCode postalCode, Street street, UnitNumber unitNumber, Block block) {
        this.postalCode = postalCode;
        this.street = street;
        this.unitNumber = unitNumber;
        this.block = block;
        this.level = level;
    }

    /**
     * Constructs a Condominium with no block
     *
     * @param unitNumber The unit number of the house.
     * @param postalCode The postal code of the house.
     * @param street     The street of the house.
     * @param level      The level of the house.
     */
    public Condominium(Level level, PostalCode postalCode, Street street, UnitNumber unitNumber) {
        this.postalCode = postalCode;
        this.street = street;
        this.unitNumber = unitNumber;
        this.block = new Block("N/A");
        this.level = level;
    }

    /**
     * Retrieves the unit number of the Condominium.
     *
     * @return The unit number of the Condominium.
     */
    @Override
    public UnitNumber getUnitNumber() {
        return this.unitNumber;
    }

    /**
     * Retrieves the postal code of the Condominium.
     *
     * @return The postal code of the Condominium.
     */
    @Override
    public PostalCode getPostalCode() {
        return this.postalCode;
    }

    /**
     * Retrieves the street of the Condominium.
     *
     * @return The street of the Condominium.
     */
    @Override
    public Street getStreet() {
        return this.street;
    }

    /**
     * Retrieves the block of the Condominium.
     *
     * @return The block of the Condominium.
     */
    public Block getBlock() {
        return this.block;
    }

    /**
     * Retrieves the level of the Condominium.
     *
     * @return The level of the Condominium.
     */
    public Level getLevel() {
        return this.level;
    }

    /**
     * Checks if this house is equal to another object.
     *
     * @param other The object to compare to.
     * @return True if the objects are equal, false otherwise.
     */

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Condominium)) {
            return false;
        }

        House otherCondominium = (House) other;
        return this.toString().equals(otherCondominium.toString());
    }

    /**
     * Returns a string representation of the hdb.
     *
     * @return A string representation of the hdb.
     */
    @Override
    public String toString() {
        ToStringBuilder builder = new ToStringBuilder(this);
        // For now, it just appends the super class's toString method.
        return "HDB: " + builder.toString() + ", " + new ToStringBuilder(this)
                .add("Street", street)
                .add("Block", block)
                .add("Level", level)
                .add("Unit Number", unitNumber)
                .add("Postal Code", postalCode)
                .toString();
    }
}

