package com.dailycodebuffer.SpringBoot_MySQLDemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
