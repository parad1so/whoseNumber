package ru.seoweblab.whoseNumber.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.seoweblab.whoseNumber.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
