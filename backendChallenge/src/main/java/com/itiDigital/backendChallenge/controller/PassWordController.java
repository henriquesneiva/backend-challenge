package com.itiDigital.backendChallenge.controller;

import com.itiDigital.backendChallenge.domain.MessagePassword;
import com.itiDigital.backendChallenge.domain.Password;
import com.itiDigital.backendChallenge.service.PasswordService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/check-password")
@AllArgsConstructor
@CrossOrigin("*")
public class PasswordController {

    @Autowired
    private PasswordService service;

    @PostMapping()
    public ResponseEntity<MessagePassword> checkPassword(@RequestBody Password password) {
        boolean response = service.checkPasswordIsValid(password);
        if (!response) {
            return ResponseEntity.badRequest().body(new MessagePassword("A senha está Inválida"));
        } else {
            return ResponseEntity.ok().body(new MessagePassword("Senha valida"));
        }
    }
}
