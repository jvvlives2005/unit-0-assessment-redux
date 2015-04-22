package nyc.c4q;

public class Singer {

    private String name;                             //changed to private
    private String location;                         //changed to private

    public Singer(){                                 //give empty method to eliminate errors

    }

    public Singer(String name, String location){
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
