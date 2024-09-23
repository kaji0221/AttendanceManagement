package model.entity;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Date;

public class AttendanceBean implements Serializable {
	private int id;
	private int userId;
	private Date date;
	private Time startTime;
	private Time endTime;
	private String status;

	public AttendanceBean() {
	}

	public AttendanceBean(int id, int userId, Date date, Time startTime, Time endTime, String status) {
		this.id = id;
		this.userId = userId;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
