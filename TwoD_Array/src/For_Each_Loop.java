import java.util.ArrayList;

public class For_Each_Loop {

    public static void main(String[] args) {

        String[] pokemons = {"WaterType","FireType","LightningType","PsychicType"};

        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String i : pokemons) {
            System.out.println(i);
        }
        for(String i : animals) {
            System.out.println(i);

        }
    }

}
