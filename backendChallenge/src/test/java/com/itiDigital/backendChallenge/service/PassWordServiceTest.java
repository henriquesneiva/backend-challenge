package com.itiDigital.backendChallenge.service;

import com.itiDigital.backendChallenge.domain.PassWord;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Service - PassWord")
class PassWordServiceTest {

    private PassWordService service;

    @BeforeEach
    void setup() {
        service = new PassWordService();
    }

    @Test
    void TestPassWordValid() {
        PassWord passWord = new PassWord("AbTp9!fok");
        assertTrue(service.checkPassword(passWord));
    }

    @Test
    void TestPassWordValidCase2() {
        PassWord passWord = new PassWord("AbTp9!fokl");
        assertTrue(service.checkPassword(passWord));
    }

    @Test
    void TestPassWordWithoutNumber() {
        PassWord passWord = new PassWord("AbTpz!fok");
        assertFalse(service.checkPassword(passWord));
    }

    @Test
    void TestPassWordWithoutUppercase() {
        PassWord passWord = new PassWord("abtpz!fok");
        assertFalse(service.checkPassword(passWord));
    }

    @Test
    void TestPassWordWithoutlowercase() {
        PassWord passWord = new PassWord("ABTP9!FOK");
        assertFalse(service.checkPassword(passWord));
    }

    @Test
    void TestPassWordWithEmptyApace() {
        PassWord passWord = new PassWord("AbTp9!fo k");
        assertFalse(service.checkPassword(passWord));
    }

}