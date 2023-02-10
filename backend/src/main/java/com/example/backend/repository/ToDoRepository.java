package com.example.backend.repository;

import com.example.backend.model.Status;
import com.example.backend.model.ToDo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Repository
@AllArgsConstructor
public class ToDoRepository {

    private final List<ToDo> toDoList;


    public ToDo getToDo(String id){
        for(ToDo todo: toDoList){
            if(todo.id() == id){
                return todo;
            }
        }
        throw new NoSuchElementException("id not found");

    }

    public List<ToDo> getToDoList() {return toDoList;
    }

    public ToDo addToDo(ToDo toDo){
        toDoList.add(toDo);
        return toDo;
    }


    public ToDo changeToInProgress(String id) {
        Status status =getToDo(id).status().IN_PROGRESS;
        ToDo toChange= new ToDo(getToDo(id).description(), status, id);
        return toChange;
    }

    public ToDo deleteToDo(String id) {
        toDoList.remove(getToDo(id));
        return getToDo(id);
    }

}
