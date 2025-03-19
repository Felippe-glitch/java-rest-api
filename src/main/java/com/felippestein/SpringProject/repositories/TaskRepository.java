package com.felippestein.SpringProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felippestein.SpringProject.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
    List<Task> findByUser_Id(Long id);
}
