import java.util.*;

public class SetExample {

	public static void main(String[] args) {

		Set<String> names = new HashSet<>();

		names.add("Patrick");
		names.add("Mike");
		names.add("Joe");
		names.add("Mike");  // add a second time

		for(String uniqueName : names) {
			System.out.println(uniqueName);
		}
	}
}
