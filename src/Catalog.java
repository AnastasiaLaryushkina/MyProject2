import java.util.ArrayList;

public class Catalog {
    int id;
    String section;
    ArrayList<Items> items;

    public Catalog() {
    }

    public Catalog(int id, String section, ArrayList<Items> items) {
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

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }
}

