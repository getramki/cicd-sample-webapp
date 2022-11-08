package dev.ramki.awsdevlabs.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "CICD Sample WebApp is successfuly Built by CodeBuild and Deployed by CodeDeploy!";
	}

}