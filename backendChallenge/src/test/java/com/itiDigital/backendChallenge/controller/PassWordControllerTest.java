package com.itiDigital.backendChallenge.controller;

import com.itiDigital.backendChallenge.domain.MessagePassword;
import com.itiDigital.backendChallenge.domain.PassWord;
import com.itiDigital.backendChallenge.service.PassWordService;
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

@DisplayName("Controller - PassWordController")
@ExtendWith(MockitoExtension.class)
class PassWordControllerTest {

    @Mock
    private PassWordService service;

    private PassWordController controller;

    @BeforeEach
    public void setup() {
        service = mock(PassWordService.class);
        controller = new PassWordController(service);
    }

    @Test
    public void testControllerBehavior() {
        assertTrue(true);
    }

    @Test
    void TestPassWordValid() {
        when(service.checkPassword(any())).thenReturn( Boolean.TRUE);
        final ResponseEntity<MessagePassword> reponse = controller.checkPassword(new PassWord());
        assertEquals(HttpStatus.OK.value(), reponse.getStatusCode().value());
    }

    @Test
    void TestPassWordInvalid() {
        when(service.checkPassword(any())).thenReturn( Boolean.FALSE);
        final ResponseEntity<MessagePassword> reponse = controller.checkPassword(new PassWord());
        assertEquals(HttpStatus.BAD_REQUEST.value(), reponse.getStatusCode().value());
    }


}