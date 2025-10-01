package com.example.taskmanager.repository;

import com.example.taskmanager.model.Task;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface TaskRepository extends CrudRepository<Task, Long> {
}