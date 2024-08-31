package com.jobportal.utility;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfo {
	private String errorMessage;
	private Integer errorCode;
	private LocalDateTime timeStamp;
	
	public ErrorInfo(String errorMessage, Integer errorCode, LocalDateTime timeStamp) {
		super();
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
		this.timeStamp = timeStamp;
	}

	public ErrorInfo() {
		super();
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "ErrorInfo [errorMessage=" + errorMessage + ", errorCode=" + errorCode + ", timeStamp=" + timeStamp
				+ "]";
	}
	
}
