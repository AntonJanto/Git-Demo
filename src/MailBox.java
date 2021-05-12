public class MailBox
{
     private Person person;
     private int age;

     public MailBox(Person person, int age)
     {
          this.person = person;
          this.age= age;
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
