package com.lazyannotation.lazy1;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private Example1 example1;

    //Configuration sınıfındaki Example1 metodu çalışacak Lazy anotasyonu devre dışı kalacak.
    //Ioc Container içerisine eklenmiş olur.
    public MyController(Example1 example1) {
        this.example1 = example1;
    }
}
