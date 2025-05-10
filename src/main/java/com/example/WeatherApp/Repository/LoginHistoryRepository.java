package com.example.WeatherApp.Repository;

import com.example.WeatherApp.Model.LoginHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface LoginHistoryRepository extends JpaRepository<LoginHistory, Long> {
    List<LoginHistory> findByUserId(String userId);

    boolean existsByUserIdAndLoginTimeBetween(String userId, LocalDateTime startOfDay, LocalDateTime endOfDay);
}