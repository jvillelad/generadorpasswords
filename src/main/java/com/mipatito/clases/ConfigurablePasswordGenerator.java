package com.mipatito.clases;

import com.mipatito.interfaces.PasswordGeneratorInterface;
import com.mipatito.dto.PasswordConfigDTO;

public class ConfigurablePasswordGenerator implements PasswordGeneratorInterface {

    public String generatePassword(int length) {
        return "Password generado configurable";
    }

    public String generatePassword(PasswordConfigDTO config) {
        return "Password generado configurable";
    }
}
