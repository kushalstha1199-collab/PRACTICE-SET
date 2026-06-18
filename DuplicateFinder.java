import java.util.ArrayList;

public class DuplicateFinder {
    public static void main(String[] args) {

        // Guest list
        ArrayList<String> guests = new ArrayList<>();

        guests.add("nature");
        guests.add("binay");
        guests.add("aryan");
        guests.add("tanmay");
        guests.add("ram");
        guests.add("binay");

        // Find duplicate names
        System.out.println("Duplicate Names:");

        for (int i = 0; i < guests.size(); i++) {
            for (int j = i + 1; j < guests.size(); j++) {

                if (guests.get(i).equals(guests.get(j))) {
                    System.out.println(guests.get(i));
                    break;
                }
            }
        }
    }
}