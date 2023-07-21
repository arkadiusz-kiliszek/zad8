package com.example.zad8.endpoint;

import com.example.zad8.service.RandomBooleanProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RandomNumberController {

    private final RandomBooleanProvider booleanProvider;

    @GetMapping("/api/random-boolean")
    public boolean getRandomValue() {
        return booleanProvider.getValue();
    }
}
