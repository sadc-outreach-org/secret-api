package hello;

public class Learn {
    private final String learn= "This is the Learn Object";
    private final long id;
    private final String content;
    private final boolean test = true;

    public Learn(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}