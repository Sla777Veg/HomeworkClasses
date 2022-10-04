public class Books {
    // String authorName;
    private int publisherAge;
    private String title;

    public Books(String title, int publisherAge) {
        this.title = title;
        this.publisherAge = publisherAge;
    }
    public String getTitle() {
        return this.title;
    }

    public int getPublisherAge() {
        return this.publisherAge;
    }

    public void setPublisherAge(int publisherAge) {
        this.publisherAge = publisherAge;
    }
}
