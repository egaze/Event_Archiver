import java.util.Date;

public class Newspaper {
    private int id;
    private String title;
    private String eventName;
    private Date eventDate;
    private String eventLocation;
    private Date publishedDate;

    public Newspaper(String title, String eventName, Date eventDate, String eventLocation, Date publishedDate) {
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

    public Date getPublishedDate() {
        return publishedDate;
    }
}
