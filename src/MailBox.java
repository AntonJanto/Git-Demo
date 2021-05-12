public class MailBox
{
     private Person person;
     private int age;
     private String height;

     public MailBox(Person person, int age, String height)
     {
          this.person = person;
          this.age= age;
          this.height = height;
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
