public class Box {

    boolean empty = false;
    Item<?> item = null;

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public Item<?> getItem() {
        return item;
    }

    public void setItem(Item<?> item) {
        this.item = item;
        this.empty = false;
    }

    public void emptyBox() {
        this.item = null;
        this.empty = true;
    }
}