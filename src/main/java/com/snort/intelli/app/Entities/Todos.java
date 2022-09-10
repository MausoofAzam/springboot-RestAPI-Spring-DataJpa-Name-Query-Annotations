package com.snort.intelli.app.Entities;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name ="tbl_todos")
@NamedQueries(value = {
		@NamedQuery(name= "Todos.findByTitleTodosInfo", query = "select t from Todos t where t.title=?1"),
		@NamedQuery(name= "Todos.findAssignedByTodosInfo", query = "select t from Todos t where t.assignedBy=?1"),
		@NamedQuery(name= "Todos.findByDifficultyLevelAndCompletedTodosInfo", query = "select t from Todos t where t.difficultyLevel=?1 AND completed=?2")
})
public class Todos {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long taskId;
	private String title;
	private String description;
	private String completed; //[completed,in-progress, new]
	public  String assignedBy;
	public String difficultyLevel; //[1-5]
	private Date assignedDate;
	private Date updatedDate;

	public Todos() {
		super(); 
	}

	public Todos(Long taskId, String title, String description, String completed, String assignedBy, String difficultyLevel, Date assignedDate, Date updatedDate) {
		this.taskId = taskId;
		this.title = title;
		this.description = description;
		this.completed = completed;
		this.assignedBy = assignedBy;
		this.difficultyLevel = difficultyLevel;
		this.assignedDate = assignedDate;
		this.updatedDate = updatedDate;
	}

	public Todos(String title, String description, String completed, String assignedBy, String difficultyLevel, Date assignedDate, Date updatedDate) {
		this.title = title;
		this.description = description;
		this.completed = completed;
		this.assignedBy = assignedBy;
		this.difficultyLevel = difficultyLevel;
		this.assignedDate = assignedDate;
		this.updatedDate = updatedDate;
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCompleted() {
		return completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
	}

	public String getAssignedBy() {
		return assignedBy;
	}

	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}

	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	public Date getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Todos{" +
				"taskId=" + taskId +
				", title='" + title + '\'' +
				", description='" + description + '\'' +
				", completed='" + completed + '\'' +
				", assignedBy='" + assignedBy + '\'' +
				", difficultyLevel='" + difficultyLevel + '\'' +
				", assignedDate=" + assignedDate +
				", updatedDate=" + updatedDate +
				'}';
	}
}