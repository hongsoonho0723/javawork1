package ex0206.homework;

public class Student implements Comparable<Student>{
   private String sno;
   private String name;
   private int age;
   private String addr;
   
   public Student() {}
   
   /**
    *  수정할대 사용할 생성자
    * */
   public Student(String sno, int age, String addr) {
	super();
	this.sno = sno;
	this.age = age;
	this.addr = addr;
  }
   /**
    * 등록 or 조회 할대 사용할 생성자
    * */
   public Student(String sno, String name, int age, String addr) {
		this(sno, age, addr);
		this.name = name;
   }
   
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [sno=");
		builder.append(sno);
		builder.append(", name=");
		builder.append(name);
		builder.append(", age=");
		builder.append(age);
		builder.append(", addr=");
		builder.append(addr);
		builder.append("]");
		return builder.toString();
	}

	/**
	 * 현재 객체와 인수로 전달 객체를 비교 
	 *  @return : 음수 , 0 , 양수 
	 * */
	@Override
	public int compareTo(Student o) {
		return  o.getAge() - age; //내림차순
	}
   
}
