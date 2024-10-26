public class Publisher {
    int id;
    String publisherName;

    public Publisher(int id, String publisherName) {
        this.id = id;
        this.publisherName = publisherName;
    }
    public String toString(){
        return "idPublisher: " + this.id + " name of publisher: " + this.publisherName;
    }
}
