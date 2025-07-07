package com.app.taskManager.Controller;

import com.app.taskManager.Entity.Task;
import com.app.taskManager.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;


    @GetMapping("/task")
    public List<Task> showAllTodoRunningCompletedTask(){
        return taskService.showAllTodoRunningCompletedTask();

    }

    @PostMapping("/task/createTask")
    public Task createNewTask(@RequestBody Task task){
        return taskService.createNewTask(task);

    }

    @PutMapping("/task/updateToRunning/{id}")
    public Task updateTaskToRunning(@PathVariable("id") Long taskId){
        return taskService.updateTaskToRunning(taskId);

    }

    @PutMapping("/task/updateToComplete/{id}")
    public Task updateTaskToComplete(@PathVariable("id") Long taskId){
        return taskService.updateTaskToComplete(taskId);

    }

    @PutMapping("/task/downToRunning/{id}")
    public Task downTaskToRunning(@PathVariable("id") Long taskId){
        return taskService.downTaskToRunning(taskId);

    }

    @PutMapping("/task/downToTodo/{id}")
    public Task downTaskToTodo(@PathVariable("id") Long taskId){
        return taskService.downTaskToTodo(taskId);

    }

    @DeleteMapping("/task/deleteTask/{id}")
    public void deleteTask(@PathVariable("id") Long taskId){
         taskService.deleteTask(taskId);

    }


}
