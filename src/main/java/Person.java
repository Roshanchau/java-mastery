import java.util.ArrayList;

public class Person {
    private final String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name){
        this.name= name;
        this.age=7;
        this.weight=8;
        this.height=9;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightDivByHundred = this.height / 100.0;
        return this.weight / (heightDivByHundred * heightDivByHundred);
    }

    @Override
    public String toString(){
        return this.name+ ", age"+ this.age+ " years";
    }

    public static void main(String[] args){
        ArrayList<Person> persons= new ArrayList<>();

        persons.add(new Person("loki"));
        persons.add(new Person("groot"));
        persons.add(new Person("thor"));

        for(Person person: persons){
            System.out.println(person);
        }
    }
}
