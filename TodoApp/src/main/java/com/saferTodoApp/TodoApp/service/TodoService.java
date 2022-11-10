package com.saferTodoApp.TodoApp.service;

import com.saferTodoApp.TodoApp.model.Todo;

import java.util.List;

public interface TodoService {

    public Todo addItemToList(Todo item);

    public List<Todo> showList();

    public void removeFromList(Todo item);
}
