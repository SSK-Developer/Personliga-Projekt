package com.saferTodoApp.TodoApp.controller;


import com.saferTodoApp.TodoApp.model.Todo;
import com.saferTodoApp.TodoApp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo")
public class TodoListController {

    @Autowired
    TodoService todoService;

    //lägg till genom att mata in ett namn
    @PostMapping("/add")
    public String add(@RequestBody Todo todo){
        todoService.addItemToList(todo);
        return "Added to list";
    }

    //ta bort genom namnet och id
    @PostMapping("/delete")
    public String delete(@RequestBody Todo item){
        todoService.removeFromList(item);
        return "removed to list";
    }

    @GetMapping("/showList")
    public List<Todo> showList(){
        return todoService.showList();
    }

}
