package com.coti.proyecto.expose.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(value = "com.proyecto", lazyInit = true)
public class HiperController {

  @GetMapping("/obtener/{id}")
  public String getBook(@PathVariable String id) {
    return id;
  }

}
