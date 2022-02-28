package be.intecbrussel;

public class Beers {
    private  Integer id;
    private String name;

    public Beers(Integer id, String name) {
        this.id = id;
        this.name=name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String beer) {
        this.name = beer;
    }

    @Override
    public String toString() {
        return "Beers{" +
                "id=" + id +
                ", beer='" + name + '\'' +
                '}';
    }
}
