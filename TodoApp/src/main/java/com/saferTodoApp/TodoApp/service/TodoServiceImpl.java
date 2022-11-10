package com.saferTodoApp.TodoApp.service;

import com.saferTodoApp.TodoApp.model.Todo;
import com.saferTodoApp.TodoApp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService{

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Todo addItemToList(Todo item) {
        return todoRepository.save(item);
    }

    @Override
    public List<Todo> showList() {
        return todoRepository.findAll();
    }

    @Override
    public void removeFromList(Todo item) {
        todoRepository.delete(item);
    }
}
