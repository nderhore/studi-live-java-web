package fr.studi.live.security.repository;

import fr.studi.live.security.model.ERole;
import fr.studi.live.security.model.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT u.* FROM user u " +
            "JOIN user_role ur ON ur.user_id = u.id " +
            "JOIN role r ON r.id = ur.role_id " +
            "WHERE r.name = ?1",
            nativeQuery = true)
    List<User> findUserByRoles(ERole role);

    boolean existsByUsername(@NotBlank @Email String username);

    Optional<User> findByUsername(String username);
}
