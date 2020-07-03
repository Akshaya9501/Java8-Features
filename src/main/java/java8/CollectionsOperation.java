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

	}

	public static void callList() {

		List<Integer> num = new ArrayList<>();

		num.add(1);
		num.add(2);
		num.add(3);
		System.out.println("Count" + IntStream.rangeClosed(0, 2).sum());

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "Akshaya"));
		studentList.add(new Student(2, "Atharva"));
		studentList.add(new Student(3, "Amit"));

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

	public static void callSet() {
		Set<Student> studentSet = new HashSet<Student>();
		studentSet.add(new Student(1, "Akshaya"));
		studentSet.add(new Student(2, "Atharva"));
		studentSet.add(new Student(3, "Amit"));
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
		studentMap.put(1, new Student(1, "Akshaya"));
		studentMap.put(2, new Student(2, "Atharva"));
		studentMap.put(3, new Student(3, "Amit"));
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
