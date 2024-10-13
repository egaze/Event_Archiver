import java.util.Date;

public class Videos {
    private int id;
    private String eventName;
    private String eventDate;
    private String eventLocation;
    private String title;
    private Date datePosted;
    private String type;
    private int numberOfFrames;

    public Videos(int id, String eventName, String eventDate, String eventLocation, String title, Date datePosted, String type, int numberOfFrames) {
        this.id = id;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.title = title;
        this.datePosted = datePosted;
        this.type = type;
        this.numberOfFrames = numberOfFrames;
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

    public String getEventDate() {
        return eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfFrames() {
        return numberOfFrames;
    }

}
