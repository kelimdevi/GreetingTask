package com.example.task1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GreetingController {


    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hi " + name;
    }

    @GetMapping("/palindrome")
    public String checkPalindrome(@RequestParam String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed) ? "Yes" : "No";
    }
}
