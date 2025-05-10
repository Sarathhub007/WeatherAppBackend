package com.example.WeatherApp.Controller;

import com.example.WeatherApp.Model.LoginHistory;
import com.example.WeatherApp.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/{id}/login")
    public ResponseEntity<Void> logUserLogin(@PathVariable String id) {
        userService.saveLoginHistory(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/login-history")
    public ResponseEntity<List<LoginHistory>> getLoginHistory(@RequestParam String userId) {
        List<LoginHistory> loginHistory = userService.getLoginHistory(userId);
        return ResponseEntity.ok(loginHistory);
    }
}