import java.awt.*;
import java.util.ArrayList;

public class WorkShop<T> {
    private final Point pos;
    private ArrayList<T> carsInWorkshop;
    private final int capacity;

    public Point getPos() {return pos;}

    public int getCapacity() {return capacity;}

    public List<T> getCarsInWorkshop() {return carsInWorkshop;}

    public WorkShop(Point pos, int capacity) {
        this.pos = pos;
        this.capacity = capacity;
    }

    public void addToWorkshop(T item) {
        if (carsInWorkshop.size() >= capacity || carsInWorkshop.contains(item)) return;
        carsInWorkshop.add(item);
    }
    public T removeFromWorkshop(T item) {
        if (carsInWorkshop.contains(item)) {
            int i = carsInWorkshop.indexOf(item);
            T removedItem = carsInWorkshop.get(i);
            carsInWorkshop.remove(item);
            return removedItem;
        }
        return null;
    }
}


//Example: WorkShop shop = new WorkShop(Model.Saab95);
