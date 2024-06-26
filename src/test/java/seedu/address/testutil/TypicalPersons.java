package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_BUDGET_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_BUDGET_BEN;
import static seedu.address.logic.commands.CommandTestUtil.VALID_BUDGET_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BEN;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_KHOONSUN;
import static seedu.address.logic.commands.CommandTestUtil.VALID_HOUSING_TYPE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_HOUSING_TYPE_BEN;
import static seedu.address.logic.commands.CommandTestUtil.VALID_HOUSING_TYPE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BEN;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_KHOONSUN;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BEN;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_KHOONSUN;
import static seedu.address.testutil.TypicalHouses.HOUSE1;
import static seedu.address.testutil.TypicalHouses.HOUSE2;
import static seedu.address.testutil.TypicalHouses.HOUSE3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.house.Block;
import seedu.address.model.house.Hdb;
import seedu.address.model.house.Landed;
import seedu.address.model.house.Level;
import seedu.address.model.house.PostalCode;
import seedu.address.model.house.Price;
import seedu.address.model.house.Street;
import seedu.address.model.house.UnitNumber;
import seedu.address.model.person.Buyer;
import seedu.address.model.person.Person;
import seedu.address.model.person.Seller;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Seller ALICE_SELLER = new SellerBuilder().withName("Alice Pauline")
            .withEmail("alice@example.com")
            .withPhone("94351253").withHouses(new Hdb(new Level("15"),
                    new PostalCode("654321"), new Street("Orchard Street"), new UnitNumber("150"), new Block("10A"),
                    new Price("123456")))
            .build();
    public static final Seller BENSON_SELLER = new SellerBuilder().withName("Benson Meier")
            .withEmail("johnd@example.com")
            .withPhone("94351253").withHouses(new Hdb(new Level("16"), new PostalCode("654321"),
                    new Street("Orchard Street"), new UnitNumber("150"), new Block("9A"), new Price("789101112")))
            .build();
    public static final Seller CARL_SELLER = new SellerBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withHouses(new Hdb(new Level("17"),
                    new PostalCode("654322"), new Street("Orchard Street 1"), new UnitNumber("150"), new Block("10B"),
                    new Price("43146141")))
            .build();
    public static final Seller DANIEL_SELLER = new SellerBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withHouses(new Hdb(new Level("18"),
                    new PostalCode("654323"), new Street("Orchard Street 2"),
                    new UnitNumber("150"), new Block("10C"), new Price("3123123")))
            .build();
    public static final Seller ELLE_SELLER = new SellerBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("heinz@example.com").withHouses(new Hdb(new Level("19"), new PostalCode("654324"),
                    new Street("Orchard Street 3"), new UnitNumber("150"), new Block("10D"),
                    new Price("3453465")))
            .build();
    public static final Seller FIONA_SELLER = new SellerBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("heinz@example.com").withHouses(new Hdb(new Level("20"), new PostalCode("654325"),
                    new Street("Orchard Street 4"), new UnitNumber("150"), new Block("10E"),
                    new Price("55555555")))
            .build();
    public static final Seller GEORGE_SELLER = new SellerBuilder().withName("George Best").withPhone("9482442")
            .withEmail("heinz@example.com").withHouses(new Landed(new UnitNumber("150"), new PostalCode("654326"),
                    new Street("Orchard Street 5"), new Price("8945939")))
            .build();
    public static final Buyer ALICE_BUYER = new BuyerBuilder().withName("George Best").withPhone("9482442")
            .withEmail("heinz@example.com").withBudget("333000").withHousingType("Hdb")
            .build();

    // Manually added
    public static final Seller HOON_SELLER = new SellerBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withEmail("heinz@example.com").withHouses(new Hdb(new Level("22"),
                    new PostalCode("654327"), new Street("Orchard Street 6"),
                    new UnitNumber("150"), new Block("3"), new Price("7777777")))
            .build();
    public static final Seller IDA_SELLER = new SellerBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withEmail("heinz@example.com").withHouses(new Hdb(new Level("23"),
                    new PostalCode("654328"), new Street("Orchard Street 7"), new UnitNumber("150"),
                    new Block("4"), new Price("9876372")))
            .build();

    // Manually added - Seller's details found in {@code CommandTestUtil}
    public static final Seller AMY_SELLER = new SellerBuilder().withName(VALID_NAME_AMY)
            .withEmail(VALID_EMAIL_AMY)
            .withPhone(VALID_PHONE_AMY)
            .withHouses(HOUSE2)
            .build();

    public static final Seller KHOONSUN_SELLER = new SellerBuilder().withName(VALID_NAME_KHOONSUN)
            .withEmail(VALID_EMAIL_KHOONSUN)
            .withPhone(VALID_PHONE_KHOONSUN)
            .withHouses(HOUSE1)
            .build();
    public static final Seller BOB_SELLER = new SellerBuilder().withName(VALID_NAME_BOB)
            .withEmail(VALID_EMAIL_BOB)
            .withPhone(VALID_PHONE_BOB)
            .withHouses(HOUSE3)
            .build();

    // Manually added - Buyer's details found in {@code CommandTestUtil}
    public static final Buyer ALI_BUYER = new BuyerBuilder().withName("Ali York")
            .withPhone("82937163").withEmail("ali@gmail.com").withBudget("400000")
            .withHousingType("Hdb")
            .build();
    public static final Buyer BEN_BUYER = new BuyerBuilder().withName(VALID_NAME_BEN).withPhone(VALID_PHONE_BEN)
            .withEmail(VALID_EMAIL_BEN).withBudget(VALID_BUDGET_BEN).withHousingType(VALID_HOUSING_TYPE_BEN)
            .build();

    public static final Buyer AMY_BUYER = new BuyerBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withBudget(VALID_BUDGET_AMY).withHousingType(VALID_HOUSING_TYPE_AMY)
            .build();

    public static final Buyer BOB_BUYER = new BuyerBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withBudget(VALID_BUDGET_BOB).withHousingType(VALID_HOUSING_TYPE_BOB)
            .build();
    public static final Buyer ZACK_BUYER = new BuyerBuilder().withName("Zack York")
            .withPhone("82937163").withEmail("zack@gmail.com").withBudget("400000")
            .withHousingType("Hdb")
            .build();
    public static final Buyer ZANE_BUYER = new BuyerBuilder().withName("Zane York")
            .withPhone("82937163").withEmail("zack@gmail.com").withBudget("500000")
            .withHousingType("Hdb")
            .build();
    public static final Buyer ZURI_BUYER = new BuyerBuilder().withName("Zuri")
            .withPhone("63936234").withEmail("Zuri@gmail.com").withBudget("600000")
            .withHousingType("Hdb")
            .build();
    public static final Buyer ZYRA_BUYER = new BuyerBuilder().withName("Zyra Moore")
            .withPhone("82936234").withEmail("zyra@gmail.com").withBudget("700000")
            .withHousingType("Hdb")
            .build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withEmail("alice@example.com")
            .withPhone("94351253").withHousingType("Hdb")
            .build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withHousingType(VALID_HOUSING_TYPE_BOB)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }

        return ab;
    }

    public static List<Person> getTypicalPersons() {
        List<Person> typicalPersons = Arrays.asList(ALICE_SELLER, BEN_BUYER, BENSON_SELLER,
                CARL_SELLER, DANIEL_SELLER, ELLE_SELLER, FIONA_SELLER, GEORGE_SELLER, ZACK_BUYER, ZANE_BUYER);
        List<Person> sortedTypicalPersons = typicalPersons.stream()
                .sorted(Comparator.comparing(person -> person.getName().toString()))
                .collect(Collectors.toList());

        return new ArrayList<>(sortedTypicalPersons);
    }
}
