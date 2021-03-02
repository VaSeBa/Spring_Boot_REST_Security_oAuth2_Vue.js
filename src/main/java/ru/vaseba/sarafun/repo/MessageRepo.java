package ru.vaseba.sarafun.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vaseba.sarafun.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {

}
