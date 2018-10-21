package de.tub.av.repos;

import org.springframework.data.repository.CrudRepository;

import de.tub.av.models.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByName(String name);
}
