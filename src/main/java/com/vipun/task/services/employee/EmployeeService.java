package com.vipun.task.services.employee;

import com.vipun.task.dto.CommentDTO;
import com.vipun.task.dto.TaskDTO;

import java.util.List;

public interface EmployeeService {


    List<TaskDTO> getTaskByUserId();

    TaskDTO updateTask(Long id, String status);



    TaskDTO getTaskById(Long id);

    CommentDTO createComment(Long taskId, String content);

    List<CommentDTO> getCommentByTaskId(Long taskId);
}
