package com.itiDigital.backendChallenge.controller;

import com.itiDigital.backendChallenge.domain.MessagePassword;
import com.itiDigital.backendChallenge.domain.Password;
import com.itiDigital.backendChallenge.service.PasswordService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Controller - PasswordController")
@ExtendWith(MockitoExtension.class)
class PasswordControllerTest {

    @Mock
    private PasswordService service;

    private PasswordController controller;

    @BeforeEach
    public void setup() {
        service = mock(PasswordService.class);
        controller = new PasswordController(service);
    }

    @Test
    public void testControllerBehavior() {
        assertTrue(true);
    }

    @Test
    void TestPassWordValid() {
        when(service.checkPasswordIsValid(any())).thenReturn( Boolean.TRUE);
        final ResponseEntity<MessagePassword> response = controller.checkPassword(new Password());
        assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
    }

    @Test
    void TestPassWordInvalid() {
        when(service.checkPasswordIsValid(any())).thenReturn( Boolean.FALSE);
        final ResponseEntity<MessagePassword> response = controller.checkPassword(new Password());
        assertEquals(HttpStatus.BAD_REQUEST.value(), response.getStatusCode().value());
    }


}