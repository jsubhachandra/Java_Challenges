/**
 * 
 */
package com.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author subhachandra
 *
 */
public class Challenge1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		School school = new School();
		List<String> list = school.findStudentNameWithHistorySubject(school.createStudents());
		list.forEach(name->System.out.println("History as subject: "+name));
		System.out.println("-------");

		List<String> ll = school.findSubjects(school.createStudents());
		ll.forEach(System.out::println);
	}

}

class Student {
	private String name;
	private List<String> subjects;

	Student(String name, List<String> subjects) {
		this.name = name;
		this.subjects = subjects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
}

class School {
	public List<Student> createStudents() {
		List<String> list = Arrays.asList("English", "Science", "History");
		Student student1 = new Student("Rohit", list);

		List<String> list2 = Arrays.asList("English", "Science", "Mathematics");

		Student student2 = new Student("Rahul", list2);
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		return studentList;
	}

	List<String> findStudentNameWithHistorySubject(List<Student> students) {

		List<Student> ll = students.stream().filter(stu -> stu.getSubjects().stream().anyMatch("History"::equals))
				.collect(Collectors.toList());

		return Arrays.asList(ll.get(0).getName());

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	List<String> findSubjects(List<Student> students) {
		Set<String> set = new HashSet<String>();

		for (Student student : students) {
			for (String string : student.getSubjects()) {
				set.add(string);
			}
		}
		return new ArrayList(set);

	}
}	