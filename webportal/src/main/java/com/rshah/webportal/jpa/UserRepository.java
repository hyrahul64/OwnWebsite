package com.rshah.webportal.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rshah.webportal.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
