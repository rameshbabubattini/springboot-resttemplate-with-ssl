package info.code2learn.springboot.sampleserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sampleserver")
public class SampleServerController {

    @GetMapping("/message")
    public ResponseEntity<String> message() {
        return new ResponseEntity<>("Message from https server.", HttpStatus.OK);
    }
}
