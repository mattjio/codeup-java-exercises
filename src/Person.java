public class Person {

        private String name;

        public Person(String personName) {
            this.name = personName;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void sayHello() {
            System.out.println("Hello " + this.name);
        }

        public static void main(String[] args) {
            Person thisGuy = new Person("Matthew");
            System.out.println(thisGuy.getName());
            thisGuy.sayHello();
            thisGuy.setName("Matt");
            thisGuy.sayHello();


            //Person person1 = new Person("John");
            //Person person2 = new Person("John");
            //System.out.println(person1.getName().equals(person2.getName()));
            //System.out.println(person1 == person2);

            //Person person1 = new Person("John");
            //Person person2 = person1;
            //System.out.println(person1 == person2);

            Person person1 = new Person("John");
            System.out.println(person1.getName());
            System.out.println(person1.getName());
            person1.setName("Jane");
            System.out.println(person1.getName());
            System.out.println(person1.getName());
        }
    }

