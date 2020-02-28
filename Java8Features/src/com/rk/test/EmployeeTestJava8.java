package com.rk.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.xml.crypto.Data;

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
				new Employee("Akash", "Jadhav", 25, 800000, Gender.MALE, Status.SINGLE, Designation.StaffConsultant,
						"Spring WebServices"),
				new Employee("Mayur", "Chitnis", 32, 900000, Gender.MALE, Status.SINGLE, Designation.AssistantManager,
						"Finance Lead"));

		long timeBefore = 0;
		long timeAfter = 0;

		timeBefore = System.currentTimeMillis();

		List<String> empfilter = empList.stream().filter(emp -> emp.getAge() < 25).map(em -> em.getFirstName()).sorted()
				.distinct().collect(Collectors.toList());

		timeAfter = System.currentTimeMillis();

		System.out.println(timeAfter - timeBefore + " " + "stream");
		System.out.println(empfilter);

		Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);

		Map<String, Optional<Employee>> empBySal = empList.stream().collect(
				Collectors.groupingBy(Employee::getLastName, Collectors.reducing(BinaryOperator.maxBy(bySalary))));

		System.out.println(empBySal);
	}

}
