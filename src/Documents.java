import java.util.Date;

public class Documents implements MediaInterface, IDInterface, FileTypeInterface{
    private int id;
    private String eventName;
    private Date eventDate;
    private String eventLocation;
    private String title;
    private Date publishedDate;
    private String type;
    private String typeName;

    public Documents(int id, String eventName, Date eventDate, String eventLocation, String title, Date publishedDate, String type, String typeName) {
        this.id = id;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.title = title;
        this.publishedDate = publishedDate;
        this.type = type;
        this.typeName = type;
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

    public String getType() {
        return type;
    }

    public String getTypeName() {
        return typeName;
    }
}
