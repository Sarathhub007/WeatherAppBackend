package com.example.WeatherApp.Service;

import com.example.WeatherApp.Model.LoginHistory;
import com.example.WeatherApp.Repository.LoginHistoryRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {

    private final LoginHistoryRepository loginHistoryRepository;

    public UserService(LoginHistoryRepository loginHistoryRepository) {
        this.loginHistoryRepository = loginHistoryRepository;
    }

    public void saveLoginHistory(String userId) {
        LoginHistory loginHistory = new LoginHistory(userId, LocalDateTime.now());
        loginHistoryRepository.save(loginHistory);
    }

    public List<LoginHistory> getLoginHistory(String userId) {
        return loginHistoryRepository.findByUserId(userId);
    }
}