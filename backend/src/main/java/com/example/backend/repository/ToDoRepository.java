package com.example.backend.repository;

import com.example.backend.model.Status;
import com.example.backend.model.ToDo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class ToDoRepository {

    private final List<ToDo> toDoList;
}
