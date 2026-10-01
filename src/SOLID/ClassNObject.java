package SOLID;
class Student{
    int age;
    String name;
    int weight;
    Student(int age, String name, int weight){
        this.age = age;
        this.name = name;
        this.weight = weight;
    }
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age; }
    void setWeight(int weight){
        this.weight = weight;
    }
    int getWeight() {
        return weight;
    }
}
public class ClassNObject {
    public static void main(String[] args) {
        Student s1=new Student(20,"John", 70);
        s1.weight=75;
        System.out.println(s1);
        System.out.println(s1.weight);
        System.out.println(s1.age);
        Student s2=new Student(22,"Mike", 80);

        System.out.println(s2);
        Student s3=s1;
        System.out.println(s3);
        System.out.println(s3.weight);

    }

}
