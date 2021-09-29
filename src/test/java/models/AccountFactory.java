package models;

import com.github.javafaker.Faker;

public class AccountFactory {
    static Faker faker;

    public static Account get() {
        faker = new Faker();
        return new Account(faker.name().fullName(),
                faker.internet().domainName(),
                faker.phoneNumber().phoneNumber(),
                "24");
    }
}
