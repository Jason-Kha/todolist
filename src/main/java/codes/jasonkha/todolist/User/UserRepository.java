package codes.jasonkha.todolist.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // @Query("SELECT s FROM User WHERE s.email = ?1")
    Optional<User> findUserByEmail(String email);
}
