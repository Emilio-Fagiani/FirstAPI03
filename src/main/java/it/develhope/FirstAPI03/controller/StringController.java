package it.develhope.FirstAPI03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/string")
public class StringController {

    @GetMapping
    public String concatString(@RequestParam (required = true) String s1,@RequestParam (required = false) String s2){
        if (s2 == null){
            return s1;
        }else
            return s1+" "+ s2;
    }
}
