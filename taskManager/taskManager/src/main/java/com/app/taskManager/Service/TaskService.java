package com.app.taskManager.Service;

import com.app.taskManager.Entity.Task;

import java.util.List;

public interface TaskService {

    List<Task> showAllTodoRunningCompletedTask();

    Task createNewTask(Task task);

    Task updateTaskToRunning(Long TaskId);

    Task updateTaskToComplete(Long taskId);

    Task downTaskToRunning(Long taskId);

    Task downTaskToTodo(Long taskId);

    void deleteTask(Long taskId);
}
