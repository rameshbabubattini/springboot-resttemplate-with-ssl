package info.code2learn.springboot.sampleclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/sampleclient")
public class SampleClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${sampleserver.url}")
	private String sampleServerUrl;

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(sampleServerUrl + "/sampleserver/welcome", String.class);
		return new ResponseEntity<>(responseEntity.getBody(), HttpStatus.OK);
	}
	
}
