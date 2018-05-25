package practice;

import java.time.*;

public class SimpleTimeClient implements TimeClient {
	
	private LocalDateTime dateAndTime;
	
	public SimpleTimeClient() {
		dateAndTime = LocalDateTime.now(); // dateAndTime variable is set to current date and time when new object is instantiated
	}
	
	public void setTime(int hour, int minute, int  second) {
		LocalDate currentDate = LocalDate.from(dateAndTime);
		LocalTime timeToSet = LocalTime.of(hour, minute, second);
		dateAndTime = LocalDateTime.of(currentDate, timeToSet);
	}
	
	public void setDate(int day, int month, int year) {
		LocalDate dateToSet = LocalDate.of(year, month, day);
		LocalTime currentTime = LocalTime.from(dateAndTime);
		dateAndTime = LocalDateTime.of(dateToSet, currentTime);
	}
	
	public void setDateAndTime(int day, int month, int year, 
								int hour, int minute, int second) {
		LocalDate dateToSet = LocalDate.of(year, month, day);
		LocalTime timeToSet = LocalTime.of(hour, minute, second);
		dateAndTime = LocalDateTime.of(dateToSet, timeToSet);
	}
	
	public LocalDateTime getLocalDateTime() {
		return dateAndTime;
	}
	
	public String toString() {
		return dateAndTime.toString();
	}
	
	public void showTime() {
		System.out.println(dateAndTime);
	}
}
