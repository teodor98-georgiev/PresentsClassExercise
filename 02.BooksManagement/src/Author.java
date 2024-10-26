public class Author {
    int id;
    String firstName;
    String lastName;

    public Author(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString(){
        return "idAuthor: " + this.id + " firstName: " + this.firstName + " lastName: " + this.lastName;
    }
}
