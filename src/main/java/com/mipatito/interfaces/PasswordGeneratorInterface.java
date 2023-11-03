package com.mipatito.interfaces;

import com.mipatito.dto.PasswordConfigDTO;


public interface PasswordGeneratorInterface {
    String generatePassword(int length);
    String generatePassword(PasswordConfigDTO config);
}
