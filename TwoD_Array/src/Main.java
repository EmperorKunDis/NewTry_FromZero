import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> MovingList = new ArrayList() ;


        ArrayList<String> NewHouseNeed = new ArrayList<>();
        NewHouseNeed.add("I must solve Kitchen problem (Our actually kitchen is absolute mirror).");
        NewHouseNeed.add("I Must repair Upper floor for my office.");
        NewHouseNeed.add("I must find someone what can move all of my things to new place.");
        NewHouseNeed.add("I must call to T-Mobile and ask them for glass cabel internet.");
        NewHouseNeed.add("I need better cooling for my PC(Immediatly)."+"\n");

        ArrayList<String> NewHouseFloors = new ArrayList<>();
        NewHouseFloors.add("Underground floor");
        NewHouseFloors.add("Grounde floor");
        NewHouseFloors.add("First floor");
        NewHouseFloors.add("Second floor");
        NewHouseFloors.add("Garden"+"\n");

        ArrayList<String> NewHouseRooms = new ArrayList<>();
        NewHouseRooms.add("Childrens room");
        NewHouseRooms.add("Obyvak");
        NewHouseRooms.add("Kuchyn");
        NewHouseRooms.add("Loznice");
        NewHouseRooms.add("Pracovna"+"\n");

        MovingList.add(NewHouseNeed);
        MovingList.add(NewHouseRooms);
        MovingList.add(NewHouseFloors);
        System.out.println(MovingList);

    }
}