package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @Post
    public HttpResponse<Task> create(@Body Task task) {
        return HttpResponse.created(taskService.createTask(task));
    }

    @Get
    public List<Task> list() {
        return taskService.getAllTasks();
    }

    @Put("/{id}")
    public Task update(Long id, @Body Task task) {
        return taskService.updateTask(id, task);
    }

    @Delete("/{id}")
    public HttpResponse<?> delete(Long id) {
        taskService.deleteTask(id);
        return HttpResponse.noContent();
    }
}