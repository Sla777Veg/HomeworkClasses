public class Books {
    private Authors authorName;
    private Authors authorSurname;

    private int publisherAge;
    private String title;

    public Books(String title, int publisherAge, Authors authorName, Authors authorSurname) {
        this.title = title;
        this.publisherAge = publisherAge;
        this.authorName = authorName;
        this.authorSurname = authorSurname;
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

    private Authors getAuthorsName() {
        return this.authorName;
    }

    private Authors getAuthorsSurname() {
        return this.authorSurname;
    }

}
