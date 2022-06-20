import java.util.Scanner;

public class Main {

    static String ANSWER_OPTIONS_MESSAGE = "Answer 1 for YES, 0 for NO";
    static String CONTENT_MESSAGE = "Inform Item content: ";
    static String FILL_BOX_QUESTION = "Fill box with created item?";

    public static void main(String[] args) {

        boolean close = false;
        Box b = new Box();
        Item<String> item = new Item<>("Cake");
        b.setItem(item);

        Scanner scan = new Scanner(System.in);

        System.out.println("Press 0 to start with EMPTY box");
        b.setEmpty(0 == scan.nextInt());

        while (!close) {

            System.out.println("1 - Create new Item?");
            System.out.println("2 - Empty box");
            System.out.println("3 - Box information");
            System.out.println("4 - Exit");

            int menuOption = scan.nextInt();
            switch (menuOption) {
                case 1 -> {
                    System.out.println("Choose Item type...");
                    System.out.println("1 - Integer");
                    System.out.println("2 - Double");
                    System.out.println("3 - Float");
                    System.out.println("4 - String");
                    System.out.println("5 - Boolean");

                    int option = scan.nextInt();
                    switch (option) {
                        case 1 -> {
                            System.out.println(CONTENT_MESSAGE);
                            Item<Integer> intItem = new Item<>(scan.nextInt());
                            System.out.println(FILL_BOX_QUESTION);
                            System.out.println(ANSWER_OPTIONS_MESSAGE);
                            if (scan.nextInt() == 1) {
                                fillBox(b, intItem);
                            }
                        }
                        case 2 -> {
                            System.out.println(CONTENT_MESSAGE);
                            Item<Double> doubleItem = new Item<>(scan.nextDouble());
                            System.out.println(FILL_BOX_QUESTION);
                            System.out.println(ANSWER_OPTIONS_MESSAGE);
                            if (scan.nextInt() == 1) {
                                fillBox(b, doubleItem);
                            }
                        }
                        case 3 -> {
                            System.out.println(CONTENT_MESSAGE);
                            Item<Float> floatItem = new Item<>(scan.nextFloat());
                            System.out.println(FILL_BOX_QUESTION);
                            System.out.println(ANSWER_OPTIONS_MESSAGE);
                            if (scan.nextInt() == 1) {
                                fillBox(b, floatItem);
                            }
                        }
                        case 4 -> {
                            System.out.println(CONTENT_MESSAGE);
                            Item<String> stringItem = new Item<>(scan.next());
                            System.out.println(FILL_BOX_QUESTION);
                            System.out.println(ANSWER_OPTIONS_MESSAGE);
                            if (scan.nextInt() == 1) {
                                fillBox(b, stringItem);
                            }
                        }
                        case 5 -> {
                            System.out.println(CONTENT_MESSAGE);
                            Item<Boolean> booleanItem = new Item<>(scan.nextBoolean());
                            System.out.println(FILL_BOX_QUESTION);
                            System.out.println(ANSWER_OPTIONS_MESSAGE);
                            if (scan.nextInt() == 1) {
                                fillBox(b, booleanItem);
                            }
                        }
                    }
                }
                case 2 -> {
                    b.emptyBox();
                }
                case 3 -> {
                    System.out.println("Box is empty? " + b.isEmpty());
                    if (!b.isEmpty()) {
                        System.out.println("Type of Item in the box: " + b.item.showType());
                    }
                }
                case 4 -> {
                    close = true;
                }
            }
        }
    }

    public static void fillBox(Box b, Item<?> item) {
        Scanner s = new Scanner(System.in);

        if (b.isEmpty()) {
            b.setItem(item);
        } else {
            System.out.println("The box is already full...");
            System.out.println("Do you want to replace item?");
            System.out.println(ANSWER_OPTIONS_MESSAGE);
            if (1 == s.nextInt()) {
                b.setItem(item);
            }
        }
    }
}
