package ru.vaseba.sarafun.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vaseba.sarafun.domain.User;

public interface UserDetailsRepo extends JpaRepository<User, String> {

}
