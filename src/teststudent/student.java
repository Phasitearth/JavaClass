
package teststudent;

public class student {
    private long id ;
    private String name;
    
    public student (long id, String name) {
        this.id = id;
        this.name = name;
    }

    public student(long id) {
        this.id = id;
    }

    public student(String name) {
        this.name = name;
    }

    public student() {
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name ;
    }
    
    
    
}
