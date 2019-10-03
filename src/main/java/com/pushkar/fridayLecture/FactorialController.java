package com.pushkar.fridayLecture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class FactorialController {

    @GetMapping("/factorial")
    public String isNumberPrime(@RequestParam("number") Integer number) {
        BigInteger bigInteger = new BigInteger("1");

        for(int i=2; i<=number; i++) {
            bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(i)));
        }
        return bigInteger.toString();
    }
}
