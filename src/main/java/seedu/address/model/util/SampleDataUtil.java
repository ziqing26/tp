package seedu.address.model.util;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.person.Address;
import seedu.address.model.person.Language;
import seedu.address.model.person.LastVisit;
import seedu.address.model.person.Name;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Visit;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {

    public static final Optional<Visit> EXAMPLE_VISIT = Optional.ofNullable(new Visit("2021-10-01"));

    public static Person[] getSamplePersons() {
        return new Person[] {
            new Person(new Name("Alex Yeoh"), new Phone("87438807"), new Language("English"),
                new Address("Blk 30 Geylang Street 29, #06-40"), Optional.of(new LastVisit("2021-03-25")),
                EXAMPLE_VISIT, Optional.empty(), Optional.empty(), getTagSet("friends")),
            new Person(new Name("Bernice Yu"), new Phone("99272758"), new Language("Chinese"),
                new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"), Optional.of(new LastVisit("2021-04-27")),
                EXAMPLE_VISIT, Optional.empty(), Optional.empty(), getTagSet("colleagues", "friends")),
            new Person(new Name("Charlotte Oliveiro"), new Phone("93210283"), new Language("English"),
                new Address("Blk 11 Ang Mo Kio Street 74, #11-04"), Optional.of(new LastVisit("2021-05-11")),
                    EXAMPLE_VISIT, Optional.empty(), Optional.empty(), getTagSet("neighbours")),
            new Person(new Name("David Li"), new Phone("91031282"), new Language("English"),
                new Address("Blk 436 Serangoon Gardens Street 26, #16-43"), Optional.of(new LastVisit("2021-08-23")),
                EXAMPLE_VISIT, Optional.empty(), Optional.empty(), getTagSet("family")),
            new Person(new Name("Irfan Ibrahim"), new Phone("92492021"), new Language("Malay"),
                new Address("Blk 47 Tampines Street 20, #17-35"), Optional.of(new LastVisit("2021-09-01")),
                EXAMPLE_VISIT, Optional.empty(), Optional.empty(), getTagSet("classmates")),
            new Person(new Name("Roy Balakrishnan"), new Phone("92624417"), new Language("Tamil"),
                new Address("Blk 45 Aljunied Street 85, #11-31"), Optional.of(new LastVisit("2021-09-28")),
                EXAMPLE_VISIT, Optional.empty(), Optional.empty(), getTagSet("colleagues"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
