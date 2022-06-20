import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Box b = new Box();
        Scanner scan = new Scanner(System.in);

        System.out.println("Press 1 to start with FULL box, otherwise it will start empty");
        b.setFull(1 == scan.nextInt());

        Item<String> item = new Item<String>("Cake");
        if(!b.isFull()){
            b.setItem(item);
        }else{
            System.out.println("The box is already full...");
            System.out.println("Do you want to empty box?");
            System.out.println("Answer with 1 for YES, or 0 for NO");
            if(1 == scan.nextInt()){
                b.emptyBox();
            }
        }

        System.out.println("Box is empty: " + b.isFull());
        if(!b.isFull()){
            System.out.println("Item in the box: " + item.showType());
        }
    }
}
