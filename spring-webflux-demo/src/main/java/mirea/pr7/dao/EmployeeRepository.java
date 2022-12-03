package mirea.pr7.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import mirea.pr7.model.Employee;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, Integer> {
    @Query("{ 'name': ?0 }")
    Flux<Employee> findByName(final String name);
}