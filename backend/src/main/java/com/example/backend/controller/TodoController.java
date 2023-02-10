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
       return toDoService.getToDoList();
   }


    @PostMapping("/todo")
    public String addToDo(@RequestBody String todo){
        System.out.println(todo);
        return todo;
    }

    @PutMapping("/todo/{id}")
    public ToDo changeStatus(@RequestBody ToDo toDoToChange,@PathVariable String id ){
        //toDoService.deleteToDo(id);
        //toDoService.changeToInProgress(id);
        //toDoService.addToDo(toDoToChange);
        return toDoToChange;
    }


    @DeleteMapping("/todo/{id}")
    public void deleteToDo(@PathVariable String id){


    }


}
