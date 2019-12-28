package com.iiht.fsd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iiht.fsd.model.dao.ParentTask;

/**
 * Repository for PARENT_TASK table
 * 
 * @author Giri Babu
 * @version 1.0
 */
@Repository
public interface ParentTaskRepository extends CrudRepository<ParentTask, Long> {

}
