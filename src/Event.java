import java.util.Date;

public class Event {
    private String  eventName;
    private Date eventDate;
    private String eventLocation;
    private String type;

    public Event(String eventName, Date eventDate, String eventLocation, String type) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.type = type;
    }

    public String getEventName() {
        return eventName;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public String getType() {
        return type;
    }
}
