package com.example.backend.controller;

import com.example.backend.model.ToDo;
import com.example.backend.service.ToDoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.TooManyListenersException;

@RequiredArgsConstructor
@RestController
@RequestMapping("api")
public class TodoController {

    private final ToDoService toDoService;

    @GetMapping("/todo")
    public List<ToDo> getToDoList(){
        return toDoService.
    }


    @PostMapping("/todo")
    public String addToDo(@RequestBody String todo){
        System.out.println(todo);
        return todo;
    }




}
