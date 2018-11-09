package com.sexybeast.model;



import lombok.NonNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class TodoData {

    // == fields ==
    private static int idValue = 1;

    private final List<TodoItem> todoItems = new ArrayList<>();

    // == constructors ==
    public TodoData() {

        addItem(new TodoItem("firstTitle", "firstDetails", LocalDate.now()));
        addItem(new TodoItem("secondTitle", "secondDetails", LocalDate.now()));
        addItem(new TodoItem("thirdTitle", "thirdDetails", LocalDate.now()));
        addItem(new TodoItem("fourthTitle", "fourthDetails", LocalDate.MAX));


    }

    // == public methods ==
    public List<TodoItem> getItems() {
        return Collections.unmodifiableList(todoItems);
    }

    public void addItem(@NonNull TodoItem todoItem) {

        todoItem.setId(idValue);
        todoItems.add(todoItem);
        idValue++;
    }

    public void removeItem(int id) {
        ListIterator<TodoItem> listIterator = todoItems.listIterator();

        while (listIterator.hasNext()) {
            TodoItem item = listIterator.next();

            if (item.getId() == id) {
                listIterator.remove();
                break;
            }
        }
    }

    public TodoItem getItem(int id) {
        for (TodoItem todoItem : todoItems) {
            if (todoItem.getId() == id) {
                return todoItem;
            }
        }
        return null;
    }

    public void updateItem(@NonNull TodoItem todoItem) {
        ListIterator<TodoItem> listIterator = todoItems.listIterator();

        while (listIterator.hasNext()) {
            TodoItem item = listIterator.next();

            if (item.equals(todoItem)) {
                listIterator.set(todoItem);
                break;
            }
        }

    }
}