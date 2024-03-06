package co.edu.uniquindio.poo.util.QuaryBuilder;

public class User {
    private String name;
    private long id;


    public User( String name, long id){
        assert name != null;
        assert id != 0;

        this.name= name;
        this.id= id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }
}
    


