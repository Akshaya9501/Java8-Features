package java8;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfacesExample {
	static Consumer<Student> consumer1 = (student) -> System.out.println(student.getId());
	static Consumer<Student> consumer2 = (student) -> System.out.println(student.getName());
	static List<Student> studentList = StudentDatabase.addStudents();
	static Predicate<Integer> predicate1 = (i) -> i % 2 == 0;
	static Predicate<Integer> predicate2 = (i) -> i % 5 == 0;
	static Predicate<Student> pr1 = (student) -> student.getId() >= 2;
	static Predicate<Student> pr2 = (student) -> student.getGrade() > 4;
	static BiPredicate<Student, Student> bipr = (i, j) -> i.getGrade() < 4 && j.getId() == 4;
	static BiPredicate<Student, Student> bipr1 = (i, j) -> i.getName() == "Ira" && j.getId() < 4;

	public static void main(String args[]) {

		// andThen method implementation
		studentList.forEach(consumer1.andThen(consumer2));
		// consumer implementation with condition
		consumerWithCondition();
		// BiConsumer Implementation
		calculate();
		// predicate functional interface
		predicateAnd();
		predicateOr();
		predicateNegation();
		predicateWithCondition();
		// BiPredicate
		biPredicate();
		// Function interface
		functionInterface();
		// Supplier
		supplier();

	};

	public static void consumerWithCondition() {
		studentList.forEach(student -> {
			if (student.getGrade() > 1) {
				consumer1.andThen(consumer2).accept(student);
			}
			System.out.println(consumer1.toString());
		});
	}

	public static void calculate() {
		BiConsumer<Integer, Integer> consumer1 = (a, b) -> System.out.println("Multiplication" + a * b);
		BiConsumer<Integer, Integer> consumer2 = (a, b) -> System.out.println("Division" + a / b);
		BiConsumer<Integer, Integer> consumer3 = (a, b) -> System.out.println("Addition" + (a + b));
		BiConsumer<Integer, Integer> consumer4 = (a, b) -> System.out.println("Subtraction" + (a - b));
		consumer1.andThen(consumer2).andThen(consumer3).andThen(consumer4).accept(25, 5);
	}

	public static void predicateAnd() {
		System.out.println(predicate1.and(predicate2).test(25));
	}

	public static void predicateOr() {
		System.out.println(predicate1.or(predicate2).test(25));
	}

	public static void predicateNegation() {
		System.out.println(predicate1.and(predicate2).negate().test(25));
	}

	public static void predicateWithCondition() {

		studentList.forEach(student -> {
			if (pr1.and(pr2).test(student)) {
				System.out.println(student);
			}
		});
	}

	public static void biPredicate() {
		studentList.forEach(student -> {
			if (bipr.or(bipr1).test(student, student)) {
				System.out.println("Selected student" + student);
			}

		});
	}

	public static void supplier() {

		Supplier<List<Student>> supplier = () -> StudentDatabase.addStudents();
		System.out.println("Students" + supplier.get());
		// Supplier<Student> supplier1 = () -> ;
		System.out.println("Students" + supplier.get());
	}

	public static void functionInterface() {
		// UnaryOperator
		UnaryOperator<String> operator = (s) -> s.concat("Hello");
		System.out.println(operator.apply("Hi"));
		// BinaryOperator
		BinaryOperator<Integer> binary = (a, b) -> (a * b);
		System.out.println(binary.apply(4, 7));
		Comparator<Integer> comparator = (i, j) -> i.compareTo(j);
		BinaryOperator<Integer> max = BinaryOperator.maxBy(comparator);
		BinaryOperator<Integer> min = BinaryOperator.minBy(comparator);
		System.out.println("Maximum" + max.apply(4, 5) + "Minimum" + min.apply(2, 3));
	}

}
