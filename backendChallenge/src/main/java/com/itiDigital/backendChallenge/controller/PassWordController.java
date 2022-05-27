package com.itiDigital.backendChallenge.controller;

import com.itiDigital.backendChallenge.domain.MessagePassword;
import com.itiDigital.backendChallenge.domain.PassWord;
import com.itiDigital.backendChallenge.service.PassWordService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/check-password")
@AllArgsConstructor
@CrossOrigin("*")
public class PassWordController {

    @Autowired
    private PassWordService service;

    @PostMapping()
    public ResponseEntity<MessagePassword> checkPassword(@RequestBody PassWord passWord) {
        var response = service.checkPassword(passWord);
        if (!response) {
            return ResponseEntity.badRequest().body(new MessagePassword("A senha está Inválida"));
        } else {
            return ResponseEntity.ok().body(new MessagePassword("Senha valida"));
        }
    }
}
