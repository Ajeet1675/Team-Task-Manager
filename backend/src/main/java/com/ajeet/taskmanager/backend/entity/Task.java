package com.ajeet.taskmanager.backend.entity;

import jakarta.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String status; // PENDING / IN_PROGRESS / DONE
    private Long assignedTo;
    private Long projectId;
    private String deadline;

    public Task() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Long getAssignedTo() { return assignedTo; }
    public void setAssignedTo(Long assignedTo) { this.assignedTo = assignedTo; }

    public Long getProjectId() { return projectId; }
    public void setProjectId(Long projectId) { this.projectId = projectId; }

    public String getDeadline() { return deadline; }
    public void setDeadline(String deadline) { this.deadline = deadline; }
}