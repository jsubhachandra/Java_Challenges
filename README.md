# java8_challenges

Coding question :
Class 1 ( 3 minutes )
Create class Student
Add 2 properties in this class -- String name and List<String> subjects
Create Getters and parameterized constructor to initialize the values of properties.
Class 2 ( 5 minutes)
Create class School
Add one method -- List<Student> createStudents() which will return list of Student objects
Return below 2 Students in a list from createStudents() -->

name : Rohit ; subjects : English, Science, History

name : Rahul ; subjects : English, Science, Mathematics

User Story 1 ( 10 minutes )
Product Owner wants to know the names of Students who have History as subject. Create a method List<String> findStudentNameWithHistorySubject(List<Student> students)

This method should accept List<Student> as parameter and find out the names of all students who have History as subject & return in a List.
User Story 2 ( 10 minutes)
Product Owner wants to know what all different subjects are being taught in your school. Create a method List<String> findSubjects(List<Student> students)

This method should accept List<Student> as parameter and find out different subjects & return in a List. (not Set/HashSet). Subjects should not be duplicated.
