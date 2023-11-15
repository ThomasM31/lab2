import java.awt.*;
import java.util.List;
import java.util.concurrent.CompletionException;

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
        if(carsInWorkshop.size() >= capacity) return;
        carsInWorkshop.add(item);
    }
    public T removeFromWorkshop(T item) {
        int i = carsInWorkshop.indexOf(item);
        T removedItem = carsInWorkshop.get(i);
        carsInWorkshop.remove(item);
        return removedItem;
    }
}


//Example: WorkShop shop = new WorkShop(Model.Saab95);
