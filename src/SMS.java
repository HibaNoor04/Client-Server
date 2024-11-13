import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SMS implements Comparable {
    int id;
    String timestamp;
    String content;

    public SMS(int id, String timestamp, String content) {
        this.id = id;
        this.timestamp = timestamp;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "(ID: " + id + ", " + timestamp + "): " + content;
    }

    @Override
    public int compareTo(Object o) {
        SMS sms = (SMS) o;
        LocalDateTime thisTime = LocalDateTime.parse(this.timestamp, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")); //calling func
        LocalDateTime parameterwala = LocalDateTime.parse(sms.timestamp, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));


        return parameterwala.compareTo(thisTime);
    }
}