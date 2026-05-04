import java.io.*;
import java.time.*;

public class App implements Serializable {
	private String type;
	private LocalDateTime dateTime;
	private String notes;
	
	public App(String type, LocalDateTime dateTime, String notes) {
		this.type = type;
		this.dateTime = dateTime;
		this.notes = notes;
	}
	
	public String getType() {return type;}
	public LocalDateTime dateTime() {return dateTime;}
	public String notes() {return notes;}
	
	@Override
	public String toString() {
        return "[" + dateTime + "] Type: " + type + (notes.isEmpty() ? "" : " | Notes: " + notes);
	}
	
	public static void main(String[] args) {
		String returnString = new String();
		System.out.println(returnString);
	}
}
