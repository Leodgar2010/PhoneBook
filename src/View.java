import model.Item;
import java.util.ArrayList;
import java.util.Scanner;

public class View {

    public Item addItem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Имя");
        String name = sc.nextLine();
        System.out.println("Введите номер");
        String phoneNumber = sc.nextLine();
        return new Item(name, phoneNumber );
    }

    public void printAllItems(ArrayList<Item> itemArrayList) {
        System.out.println(itemArrayList);
    }

}
