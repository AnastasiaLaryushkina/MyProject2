import java.util.ArrayList;

public class Catalog {
    private int id;
    private String section;
    private DataStorage items;

    public Catalog() {
    }

    public Catalog(int id, String section, DataStorage items) {
        this.id = id;
        this.section = section;
        this.items = items;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public DataStorage getItems() {
        return items;
    }

    public void setItems(DataStorage items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", section='" + section + '\'' +
                ", items=" + items +
                '}';
    }
}


