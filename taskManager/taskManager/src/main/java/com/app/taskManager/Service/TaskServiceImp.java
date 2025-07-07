package com.app.taskManager.Service;

import com.app.taskManager.Entity.Task;
import com.app.taskManager.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImp implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public List<Task> showAllTodoRunningCompletedTask() {
        return taskRepository.findAll();
    }

    @Override
    public Task createNewTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task updateTaskToRunning(Long taskId) {
        Task task=taskRepository.findById(taskId).get();
        task.setTaskState(1);
        return taskRepository.save(task);
    }

    @Override
    public Task updateTaskToComplete(Long taskId) {
        Task task=taskRepository.findById(taskId).get();
        task.setTaskState(2);
        return taskRepository.save(task);
    }

    @Override
    public Task downTaskToRunning(Long taskId) {
        Task task=taskRepository.findById(taskId).get();
        task.setTaskState(1);
        return taskRepository.save(task);
    }

    @Override
    public Task downTaskToTodo(Long taskId) {
        Task task=taskRepository.findById(taskId).get();
        task.setTaskState(0);
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }


}
