import java.io.Serializable;

public class Author implements Serializable {
    private int id;
    private String firstname;

    public Author() {
    }

    public Author(int id, String firstname) {
        this.id = id;
        this.firstname = firstname;
    }
//Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
