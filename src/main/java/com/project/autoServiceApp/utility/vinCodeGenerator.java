package com.project.autoServiceApp.utility;

import java.util.Locale;
import java.util.Random;

public class vinCodeGenerator {
    public vinCodeGenerator() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 21;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new,StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString.toUpperCase(Locale.ROOT));
    }
}
