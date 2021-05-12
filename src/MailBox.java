public class MailBox
{
     private Person person;
     private int age;
     private String name;

     public MailBox(Person person, int age, String name)
     {
          this.person = person;
          this.age= age;
          this.name = name;
     }

     public Person getPerson()
     {
          return person;
     }

     public void setPerson(Person person)
     {
          this.person = person;
     }
}
