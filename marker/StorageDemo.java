import java.util.Set;
import java.util.HashSet;

public class StorageDemo {
    public static void main(String[] args) {
        Set<WritingUtensil> utensils = new HashSet<>();
        utensils.add(new Crayon("Red Crayon"));
        utensils.add(new Pencil("No. 2 Pencil"));
        utensils.add(new Crayon("Blue Crayon"));

        Set<WritingUtensil> meltableUtensils = new HashSet<>();
        Set<WritingUtensil> nonMeltableUtensils = new HashSet<>();

        for (WritingUtensil utensil : utensils) {
            if (utensil instanceof Meltable) {
                meltableUtensils.add(utensil);
            } else {
                nonMeltableUtensils.add(utensil);
            }
        }

        System.out.println("Meltable utensils:");
        for (WritingUtensil utensil : meltableUtensils) {
            System.out.println(utensil.getName());
        }

        System.out.println("\nNon-meltable utensils:");
        for (WritingUtensil utensil : nonMeltableUtensils) {
            System.out.println(utensil.getName());
        }
    }
}

