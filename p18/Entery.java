class Student
{
  List<Course> courses;
  
}

class Course
{
  List<Student> students;
  
}

Solution:

class Student
{
  List<Course> courses;
  
}

class Course
{
  List<Student> students;
  
}

class Register{
  List<Course> courses;
  List<Student> students;
  map<sid,List<courses>> ;
  map<cid, List<students>> ;
}
