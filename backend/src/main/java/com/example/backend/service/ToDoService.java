package com.example.backend.service;

import com.example.backend.model.ToDo;
import com.example.backend.repository.ToDoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ToDoService {

    private final ToDoRepository toDoRepository;
    private final IdService idService;


public List<ToDo> getToDoList() {return toDoRepository.getToDoList();
    }

    public ToDo addToDo(ToDo toDo){
        ToDo toDoToAdd=new ToDo(toDo.description(), toDo.status(),idService.generateId());
        toDoRepository.addToDo(toDoToAdd);
        return  toDoToAdd;
    }
    public ToDo changeToInProgress(String id){
        return toDoRepository.changeToInProgress(id);

    }

    public ToDo deleteToDo(String id){
        return toDoRepository.deleteToDo(id);
    }
}
