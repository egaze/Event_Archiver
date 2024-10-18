import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class TestCases {
    Date event1date = new Date();

    // String eventName, Date eventDate, String eventLocation, String type
    @org.junit.Test

    @Test
    public void testGetEventDetails() {
        Event event = new Event("#FreeTheCitizens Riot", event1date, "Flag Staff House", "Political");

        assertEquals("#FreeTheCitizens Riot", event.getEventName());
        assertEquals("Political", event.getType());
    }

    @Test
    public void testNewspaperGetDetails() {
        // String title, String eventName, String eventDate, String eventLocation, Date publishedDate
        Newspaper newspaperEvent = new Newspaper("Angry Citizens Rage Against Galamsey", "#FreeTheCitizens Riot", event1date, "Independence Square", event1date);

        assertEquals("Angry Citizens Rage Against Galamsey", newspaperEvent.getTitle());
        assertEquals("#FreeTheCitizens Riot", newspaperEvent.getEventName());
        assertEquals("Independence Square", newspaperEvent.getEventLocation());
        assertEquals(event1date, newspaperEvent.getPublishedDate());
    }

    @Test
    public void testGetVideoNumberOfFrames() {
        // int id, String eventName, String eventDate, String eventLocation, String title, Date datePosted, String type, int numberOfFrames
        Videos videoEvent = new Videos(419218, "#FreeTheCitizens Demonstration", event1date, "Independence Square", "GTV", event1date, ".mov", 271000);

        assertEquals(271000, videoEvent.getNumberOfFrames());
    }

    @Test
    void testGetPictureType() {
        // int id, String eventName, Date eventDate, String eventLocation, String title, Date datePosted, String location, String type
        Pictures pictureEvent = new Pictures(101182, "#FreeTheCitizens Demonstration", event1date, "Independence Square", "Picture of Angry citizens", event1date, "Independence Square", ".jpeg");

        assertEquals(".jpeg", pictureEvent.getType());
        assertEquals("Independence Square", pictureEvent.getEventLocation());
    }

    @Test
    void testGetVideoEventLocation() {
        Videos videoEvent = new Videos(171790, "#FreeTheCitizens Demonstration", event1date, "Independence Square", "Is the government going to do anything about this?", event1date, ".mov", 812000);

        assertEquals("Independence Square", videoEvent.getEventLocation());
        assertEquals(171790, videoEvent.getID());
        assertEquals(".mov", videoEvent.getType());
        assertEquals("Is the government going to do anything about this?", videoEvent.getTitle());
    }

    @Test
    void testGetDocumentEventDetails() {
        // int id, String eventName, Date eventDate, String eventLocation, String title, Date publishedDate, String type, String typeName
        Documents documentEvent = new Documents(487199, "#FreeTheCitizens Riot", event1date, "Independence Square", "Angry Ghanaian Citizens Storm Roads", event1date, ".pdf", "Document");

        assertEquals(487199, documentEvent.getID());
        assertEquals("Angry Ghanaian Citizens Storm Roads", documentEvent.getTitle());
        assertEquals(487199, documentEvent.getID());
    }
}
