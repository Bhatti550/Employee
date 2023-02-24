package com.example.Employee.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Employee.Model.Job;
public interface jobRepository extends JpaRepository<Job,Long> {


}
