package com.byapi.vn.admin.controller.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminProductController {

    @GetMapping("/hello/admin")
    public String index() {
        return "Tôi là admin";
    }
}
