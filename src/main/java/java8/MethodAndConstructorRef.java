package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodAndConstructorRef {

	public static void main(String args[]) {
		constructorRef();
		methodRef();
		instanceMethodRef();
	}

	public static void constructorRef() {
		Function<String, Student> s = Student::new;
		System.out.println(s.apply("Akshaya"));
		Supplier<Student> supplier = Student::new;
		System.out.println(supplier.get());

	}

	public static void methodRef() {
		Consumer<Student> consumer = System.out::println;
		StudentDatabase.addStudents().forEach(consumer);
	}

	public static void instanceMethodRef() {
		Consumer<Student> consumer = Student::printName;
		StudentDatabase.addStudents().forEach(consumer);
	}

}
