package com.iiht.fsd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iiht.fsd.model.dao.User;

/**
 * Repository for USER table
 * 
 * @author Giri Babu
 * @version 1.0
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
