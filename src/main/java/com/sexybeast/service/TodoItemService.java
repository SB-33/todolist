package com.sexybeast.service;

import com.sexybeast.model.TodoData;
import com.sexybeast.model.TodoItem;

public interface TodoItemService{

    void addItem(TodoItem item);

    void removeItem(int id);

   TodoItem getItem(int id);

   void updateItem(TodoItem todoItem);

   TodoData getData();
}
