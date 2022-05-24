package ClassInheritance.DifferentKindsOfBoxes;
import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> oneItemBox;
    public OneItemBox() {
        this.oneItemBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (oneItemBox.isEmpty()) {
            oneItemBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return oneItemBox.contains(item);
    }
}