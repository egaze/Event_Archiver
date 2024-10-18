import java.util.Date;

public class Magazine implements IDInterface, MediaInterface{
    private int id;
    private String title;
    private String eventName;
    private Date eventDate;
    private String eventLocation;
    private Date publishedDate;

    public Magazine(int id, String title, String eventName, Date eventDate, String eventLocation, Date publishedDate) {
        this.id = id;
        this.title = title;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.publishedDate = publishedDate;
    }

    public int getID() {
        return id;
    }

    public String getTitle() {
        return title;
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
}
