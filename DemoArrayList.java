import java.util.ArrayList;

public class DemoArrayList {
    public void addElements(){
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        System.out.println(" Add Elements=" + integerArrayList);
    }
    public static void main(String[] args) {
        DemoArrayList add = new DemoArrayList();
        add.addElements();
    }
}
