package br.com.cmdev.sboot.app.docker.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppDockerController {

    @Value("${system.enveroment.name}")
    private String variable;

    @GetMapping("app")
    public ResponseEntity getMessage() {
        return ResponseEntity.ok("It a message by app sboot-app-docker");
    }

    @GetMapping("path")
    public ResponseEntity getPathEnviromentValue() {
        return ResponseEntity.ok(variable);
    }
}
