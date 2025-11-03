
public class Student {
	
	private String name;
	private String id;
	private int age;

	 public String getName () { return name; }
	 public String getId () { return id; }
	 public int getAge () { return age; }
	 
	 public void setName(String name) { this.name = name; }
	 public void setId(String id) { this.id = id; }
	 public void setAge(int age) { this.age = age; }

	 public Student(String name, String id, int age) {
		 setName(name);
		 setAge(age);
		 setId(id);
	 }
	 
	 
}
