package wathsapp.classes;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    long id ;
    private String name;

    private int number;


    private String password;
    private String imege;
    List<String>messages = new ArrayList<>();

    private Status status;


    public Profile() {
    }

    public Profile(long id, String name, int number, String password, String imege, List<String> messages, Status status) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.password = password;
        this.imege = imege;
        this.messages = messages;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getImege() {
        return imege;
    }

    public void setImege(String imege) {
        this.imege = imege;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", password='" + password + '\'' +
                ", imege='" + imege + '\'' +
                ", messages=" + messages +
                ", status=" + status +
                '}';
    }
}
