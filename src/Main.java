public class Main {
    public static void main(String[] args) {
            University university = new University();
            university.setName("Manas");
            university.setPara(6);
            university.setStudent(700);

            University university1 = new University();
            university1.setName("Ata Tyrk");
            university1.setPara(5);
            university1.setStudent(500);

            University university2 = new University();
            university2.setName("BGU");
            university2.setPara(4);
            university2.setStudent(800);

            University[] universities = {university, university2, university1};
            for (University university3 : universities) {
            System.out.println(university3.getName());
            System.out.println(university3.getPara());
            System.out.println(university3.getStudent());
            System.out.println("---------------------------");

        }
            School school = new School();
            school.setName("UVKG69");
            school.setLesson(6);
            school.setPupils(2000);

            School school1=new School();
            school.setName("UVG29");
            school.setLesson(7);
            school1.setPupils(3000);

            School school2=new School();
            school2.setName("school 64");
            school2.setLesson(4);
            school2.setPupils(1500);

            School[] schools={school,school2,school1};
            for (School school3:schools) {

            System.out.println(school3.getName());
            System.out.println(school3.getLesson());
            System.out.println(school3.getLesson());
            System.out.println("--------------------");

            Car car=new Car();
            car.setBrand("BMW");
            car.setColor("black");
            car.setPrice(75000);

            Car car1=new Car();
            car1.setBrand("Mercedes benz");
            car1.setColor("red");
            car1.setPrice(90000);

            Car  car2=new Car();
            car2.setBrand("AUDI");
            car2.setColor("grey");
            car2.setPrice(60000);

            Car [] cars={car,car1,car2};
            for (Car car3:cars) {
                System.out.println(car3.getBrand());
                System.out.println(car3.getColor());
                System.out.println(car3.getPrice());
                System.out.println("------------------------");

                Person person=new Person();
                person.setName("Samira");
                person.setSurname("Nurmat");
                person.setAge(18);

                Person person1= new Person();
                person1.setName("Saikal");
                person1.setSurname("Muratova");
                person1.setAge(18);

                Person person2=new Person();
                person2.setName("Saltanat");
                person2.setSurname("Numatila kyzy");
                person2.setAge(20);

                Person[] people={person,person1,person2} ;
                for (Person person3:people) {
                    System.out.println(person3.getName());
                    System.out.println(person3.getSurname());
                    System.out.println(person3.getAge());
                    System.out.println("-----------------");

                }
            }





        }

    }
}


