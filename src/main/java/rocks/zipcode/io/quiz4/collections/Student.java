package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student {


    static final Student INSTANCE= new Student();

    private double totalStudyTime=0.0;


    public Student(Integer  id) {
       this.id=id;
    }



    Integer id =1;
    public Student() {

     this.id=id;


        //this(null);
    }



    public void learn(Double amountOfHours) {



            totalStudyTime= totalStudyTime+amountOfHours;


        }







    public Double getTotalStudyTime()

    {
        return totalStudyTime;
    }
}
