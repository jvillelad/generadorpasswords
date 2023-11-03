package com.mipatito.dto;

import lombok.Data;

@Data
public class PasswordConfigDTO {
    private boolean restrictMinDigits;
    private int minDigits;
    private boolean restrictMinUpperCaseLetters;
    private int minUpperCaseLetters;
    private boolean restrictMinLowerCaseLetters;
    private int minLowerCaseLetters;
    private boolean restrictMinNonAlphanumericCharacters;
    private int minNonAlphanumericCharacters;
    private int minLength;
}
