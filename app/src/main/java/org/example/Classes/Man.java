package app.src.main.java.org.example.Classes;
public class Man implements Person {
private String name;
private int age;
private String city;
private String country;
public Man(String name, int age, String city, String country) {
    this.name = name;
    this.age = age;
    this.city = city;
    this.country = country;

}
@Override
public void introduce(String name){
    System.out.println("my name is " + this.name);

}
@Override
public void sayAge(int age){


    System.out.println("i am "+this.age+"years");
}
public void sayWhereFrom(String city,String country){

    System.out.println("i am "+this.city+" from "+country) ;

}


}