package com.mipatito.clases;

import com.mipatito.dto.PasswordConfigDTO;
import com.mipatito.interfaces.PasswordGeneratorInterface;
import java.security.SecureRandom;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DefaultPasswordGenerator implements PasswordGeneratorInterface {

    public String generatePassword(int length) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()_+";

        String allChars = upper + lower + digits + specialChars;
        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder();

        password.append(upper.charAt(random.nextInt(upper.length())));
        password.append(lower.charAt(random.nextInt(lower.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialChars.charAt(random.nextInt(specialChars.length())));

        for (int i = 4; i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        return password.toString();
    }

    public String generatePassword(PasswordConfigDTO config) {
        return "Password generado configurable";
    }
}
