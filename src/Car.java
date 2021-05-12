public class Car
{
     private String model;
     private String make;
     private String licenseNumber;
     private int year;

     public Car(String model, String make, String licenseNumber, int year)
     {
          this.model = model;
          this.make = make;
          this.licenseNumber = licenseNumber;
          this.year = year;
     }

     public String getModel()
     {
          return model;
     }

     public void setModel(String model)
     {
          this.model = model;
     }

     public String getMake()
     {
          return make;
     }

     public void setMake(String make)
     {
          this.make = make;
     }
}
