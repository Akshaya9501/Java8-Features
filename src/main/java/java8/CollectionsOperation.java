package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class CollectionsOperation {

	public static void main(String[] args) {
		callList();
		callSet();
		callMap();
		// add();
	}

	public static void callList() {

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "Akshaya", 5));
		studentList.add(new Student(2, "Atharva", 4));
		studentList.add(new Student(3, "Amit", 2));

		// foreach loop
		for (Student st : studentList) {
			System.out.println("Id:" + st.id);
			System.out.println("Name:" + st.name);
		}

		// forEach method
		studentList.forEach(l -> {
			System.out.println("Id:" + l.id);
			System.out.println("Name:" + l.name);
		});

		// stream API
		studentList.stream().forEach(l -> {
			System.out.println("Id:" + l.id);
			System.out.println("Name:" + l.name);
		});

	}

	public void add() {
		List<Integer> num = new ArrayList<>();

		num.add(1);
		num.add(2);
		num.add(3);
		System.out.println("Count" + IntStream.rangeClosed(0, 2).sum());

	}

	public static void callSet() {
		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(new Student(1, "Akshaya", 8));
		studentSet.add(new Student(2, "Atharva", 5));
		studentSet.add(new Student(3, "Amit", 7));
		// foreach loop
		for (Student st : studentSet) {
			System.out.println("Id:" + st.id);
			System.out.println("Name:" + st.name);
		}

		// forEach method
		studentSet.forEach(l -> {
			System.out.println("Id:" + l.id);
			System.out.println("Name:" + l.name);
		});

		// stream API
		studentSet.stream().forEach(l -> {
			System.out.println("Id:" + l.id);
			System.out.println("Name:" + l.name);
		});
	}

	public static void callMap() {
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		studentMap.put(1, new Student(1, "Akshaya", 4));
		studentMap.put(2, new Student(2, "Atharva", 6));
		studentMap.put(3, new Student(3, "Amit", 2));
		for (Student st : studentMap.values()) {
			System.out.println("Id:" + st.id);
			System.out.println("Name:" + st.name);
		}

		// forEach method
		studentMap.forEach((k, v) -> {
			System.out.println("Key:" + k);
			System.out.println("Id:" + v.id);
			System.out.println("Name:" + v.name);
		});

	}
}
