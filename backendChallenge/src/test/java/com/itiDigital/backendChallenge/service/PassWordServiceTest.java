package com.itiDigital.backendChallenge.service;

import com.itiDigital.backendChallenge.domain.Password;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Service - PassWord")
class PasswordServiceTest {

    private PasswordService service;

    @BeforeEach
    void setup() {
        service = new PasswordService();
    }

    @Test
    void TestPassWordValid() {
        Password passWord = new Password("AbTp9!fok");
        assertTrue(service.checkPassword(passWord));
    }

    @Test
    void TestPassWordValidCase2() {
        Password password = new Password("AbTp9!fokl");
        assertTrue(service.checkPassword(password));
    }

    @Test
    void TestPassWordWithoutNumber() {
        Password password = new Password("AbTpz!fok");
        assertFalse(service.checkPassword(password));
    }

    @Test
    void TestPassWordWithoutUppercase() {
        Password password = new Password("abtpz!fok");
        assertFalse(service.checkPassword(password));
    }

    @Test
    void TestPassWordWithoutlowercase() {
        Password password = new Password("ABTP9!FOK");
        assertFalse(service.checkPassword(password));
    }

    @Test
    void TestPassWordWithEmptyApace() {
        Password password = new Password("AbTp9!fo k");
        assertFalse(service.checkPassword(password));
    }

}