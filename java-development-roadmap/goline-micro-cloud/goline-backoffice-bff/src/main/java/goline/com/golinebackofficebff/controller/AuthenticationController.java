package goline.com.golinebackofficebff.controller;

import goline.com.golinebackofficebff.viewmodel.AuthenticatedUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @GetMapping("/authentication/user")
    public ResponseEntity<AuthenticatedUser> user() {
        AuthenticatedUser authenticatedUser = new AuthenticatedUser("HUNG");
        return ResponseEntity.ok(authenticatedUser);
    }
}
