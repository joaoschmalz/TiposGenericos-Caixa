public class Item<T>{

    T obj;

    Item(T o){
        obj = o;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public String showType(){
        return obj.getClass().getName();
    }
}
