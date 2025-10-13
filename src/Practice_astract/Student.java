package Practice_astract;

public abstract class Student {
   private String name;
   private int age;
   private String address;
   private String classroom;

    public Student() {
    }


    public Student(String name, int age, String address, String classroom) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.classroom = classroom;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    public abstract void study();
    public abstract double getScore();

}
