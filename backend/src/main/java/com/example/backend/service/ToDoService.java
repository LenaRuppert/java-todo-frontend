package com.example.backend.service;

import com.example.backend.repository.ToDoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ToDoService {

    private final ToDoRepository toDoRepository;
}
