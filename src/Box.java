public class Box {

    int maxObject = 1;
    boolean empty = false;
    Item<?> item = null;

    public int getMaxObject() {
        return maxObject;
    }

    public void setMaxObject(int maxObject) {
        this.maxObject = maxObject;
    }

    public boolean isFull() {
        return empty;
    }

    public void setFull(boolean full) {
        this.empty = full;
    }

    public Item<?> getItem() {
        return item;
    }

    public void setItem(Item<?> item) {
        this.item = item;
        this.empty = false;
    }

    public void emptyBox(){
        this.item = null;
        this.empty = true;
    }
}