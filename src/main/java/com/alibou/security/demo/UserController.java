package com.alibou.security.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@PreAuthorize("hasRole('ADMIN', 'USER')")
public class UserController {

  @GetMapping("/hola")
  public ResponseEntity<String> sayHello() {
    return ResponseEntity.ok("Hello! You have user access");
  }

}
