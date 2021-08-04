public class HomeWorkApp3 {
    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Nicole Adkins", "Manager", "nicolead@mail.com", "1233321312",7000,30);
        personArray[1] = new Person("Kelly Anderson", "CEO", "kelly_and@mail.com", "123415213",18000,43);
        personArray[2] = new Person("Morgan Barnes", "Developer", "morgan_barnes@mail.com", "534654536",10000,28);
        personArray[3] = new Person("Andrew Bay", "Tester", "andrew_bay@mail.com", "4356432345",5000,44);
        personArray[4] = new Person("Emily Beazley", "HR", "emily_beaz@mail.com", "234534525",3000,22);
        for (Person person : personArray)
            if (person.getAge()>40)
                System.out.println(person);
    }

    static class Person {
        private String name;
        private String position;
        private String email;
        private String phone;
        private int salary;
        private int age;

        public Person(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String toString(){
            return("name: " + name + "\n-" +
                    "position: " + position + "\n-" +
                    "email: " + email + "\n-" +
                    "phone: " + phone + "\n-" +
                    "salary: " + salary + "\n-" +
                    "age: " + age + "\n");
        }
    }
}
