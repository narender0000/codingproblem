// Write your code here
package com.example.todo.repository;

import com.example.todo.model.*;
import java.util.*;

public interface TodoRepository {
    ArrayList<Todo> getTodos();

    Todo getTodoById(int id);
}