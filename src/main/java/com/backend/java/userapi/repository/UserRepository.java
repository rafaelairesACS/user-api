package com.backend.java.userapi.repository;

import com.backend.java.userapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByCpf(String cpf);
    List<User> queryByNomeLike(String name);
}
