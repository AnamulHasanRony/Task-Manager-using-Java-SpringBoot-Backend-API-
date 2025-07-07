package com.app.taskManager.Service;

import com.app.taskManager.Entity.Task;
import com.app.taskManager.Repository.TaskRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskServiceTest {

    @MockitoBean
    private TaskRepository taskRepository;

    @Autowired
    private TaskService taskService;

   @BeforeEach
   void setup(){
       Task task=Task.builder()
               .taskName("Reading")
               .taskState(0)
               .build();

       Mockito.when(taskRepository.save(task)).thenReturn(task);


   }

    @Test
    void whenCreateTaskIsCalled_ThenThatTaskWillBeBack() {
       Task taskGive=new Task();
        taskGive.setTaskName("Reading");
        taskGive.setTaskState(0);
        taskGive.setTaskId(1L);
       Task taskSave=taskService.createNewTask(taskGive);
       assertEquals(taskGive,taskGive);

    }



}