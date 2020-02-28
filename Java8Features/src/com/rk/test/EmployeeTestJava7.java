package com.rk.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.rk.model.Employee;
import com.rk.model.EmployeeDTO;
import com.rk.model.enu.Designation;
import com.rk.model.enu.Gender;
import com.rk.model.enu.Status;

public class EmployeeTestJava7 {

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

		Set<Employee> emSet = new HashSet<Employee>();

		for (Employee employee : empList) {
			if (employee.getAge() < 25) {
				emSet.add(employee);
			}
		}

		List<Employee> list = new ArrayList<Employee>(emSet);

		for (Employee e : list) {

			System.out.println(e.getFirstName());
		}

		timeAfter = System.currentTimeMillis();

		System.out.println(timeAfter - timeBefore + " " + "Java 7");

		EmployeeTestJava7 employeeTestJava7 = new EmployeeTestJava7();
		employeeTestJava7.getEmp(empList);

		getEmpJav8(empList);
	}

	public EmployeeDTO getEmp(List<Employee> empList) {

		Set<Employee> ser = new HashSet<Employee>(empList);
		System.out.println("ser" + ser.toString());
		String f = null, l = null;
		for (Employee s1 : ser) {
			if (s1.getAge() > 22 && s1.getAge() < 25 && s1.getSalary() > 500000 && s1.getSalary() < 700000) {
				f = s1.getFirstName();
				l = s1.getLastName();
				System.out.println("f" + f + "l" + l);
			}
		}

		EmployeeDTO employedto = new EmployeeDTO();
		employedto.setF(f);
		employedto.setL(l);

		System.out.println(employedto);
		return employedto;

	}

	public static List<String> getEmpJav8(List<Employee> emplist1) {

		List<String> empfilter = emplist1.stream()
				.filter(e -> e.getAge() > 22 && e.getAge() < 25 && e.getSalary() > 500000 && e.getSalary() < 700000)
				.map(e -> e.getFirstName()).collect(Collectors.toList());

		System.out.println(empfilter + "empfilter");

		return empfilter;
	}

}
