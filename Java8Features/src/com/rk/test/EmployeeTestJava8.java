package com.rk.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import com.rk.model.Employee;
import com.rk.model.enu.Designation;
import com.rk.model.enu.Gender;
import com.rk.model.enu.Status;

public class EmployeeTestJava8 {

	public static void main(String[] args) {

		List<Employee> empList = Arrays.asList(
				new Employee("Rushikesh", "Karkhanis", 23, 587000, Gender.MALE, Status.SINGLE,
						Designation.AssociateConsultant, "FullStack Developer"),
				new Employee("Diptesh", "Chipkar", 24, 720000, Gender.MALE, Status.SINGLE, Designation.StaffConsultant,
						"Java Mircoservice Developer"),
				new Employee("Akash", "Jadhav", 25, 800000, Gender.MALE, Status.SINGLE, Designation.StaffConsultant,
						"Spring WebServices"),
				new Employee("Diptesh", "Chipkar", 24, 720000, Gender.MALE, Status.SINGLE, Designation.StaffConsultant,
						"Java Mircoservice Developer"),
				new Employee("Manali", "Dhawan", 24, 720000, Gender.FEMALE, Status.SINGLE, Designation.StaffConsultant,
						"Python Developer"),
				new Employee("Sonali", "Singh", 25, 720000, Gender.FEMALE, Status.SINGLE, Designation.StaffConsultant,
						"Selinium Tester"),
				new Employee("Diptesh", "Chipkar", 24, 720000, Gender.MALE, Status.SINGLE, Designation.StaffConsultant,
						"Java Mircoservice Developer"),
				new Employee("Akash", "Jadhav", 25, 800000, Gender.MALE, Status.SINGLE, Designation.StaffConsultant,
						"Spring WebServices"),
				new Employee("Mayur", "Chitnis", 32, 900000, Gender.MALE, Status.SINGLE, Designation.AssistantManager,
						"Finance Lead"));

		long timeBefore = 0;
		long timeAfter = 0;

		timeBefore = System.currentTimeMillis();

		long count = empList.stream().distinct().count();

		System.out.println(count);

		List<String> empfilter = empList.stream()
				.filter(emp -> emp.getAge() < 25 && emp.getGender().equals(Gender.FEMALE))
				.sorted(Comparator.comparing(Employee::getAge)).map(em -> em.getFirstName() + "," + em.getLastName())
				.distinct().collect(Collectors.toList());

		List<Employee> collect = empList.stream()
				.filter(emp -> emp.getAge() < 25 && emp.getGender().equals(Gender.FEMALE))
				.sorted(Comparator.comparing(Employee::getAge)).distinct().collect(Collectors.toList());

		collect.forEach(System.out::println);
		timeAfter = System.currentTimeMillis();

		System.out.println(timeAfter - timeBefore + " " + "stream");
		System.out.println("Employee" + empfilter);

		Map<String, Optional<Employee>> empBySal = empList.stream()
				.collect(Collectors.groupingBy(Employee::getFirstName,
						Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));

		empBySal.forEach((s, e) -> {
			// System.out.println(s);
			System.out.println(e);
		});

		Optional<String> map = empList.stream().max(Comparator.comparing(Employee::getSalary))
				.map(e -> e.getFirstName());

		map.ifPresent(System.out::println);
		// System.out.println(map + "First name of the max salaried person");

		int size = empBySal.size();
		System.out.println(size);
	}

}
