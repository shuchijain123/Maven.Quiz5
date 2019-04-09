package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington extends Student   {


    List<Student> myStudents = new ArrayList<Student>();

    HashMap<Student, Double> mymap = new HashMap<Student, Double>();

    public void enroll(Student student) {

        myStudents.add(student);


    }

    public Boolean isEnrolled(Student student) {

        if (myStudents.contains(student));

        return true;
    }

    public void lecture(double numberOfHours) {


       // double  numberOfHoursPerLearner = numberOfHours / myStudents.size();

        for (int i=0;i<myStudents.size();i++){

            myStudents.get(i).learn(numberOfHours);
        }




    }

    public Map<Student, Double> getStudyMap() {


        for (int i = 0; i < myStudents.size(); i++) {


          //  mymap.put(myStudents.get(i), myStudents.get(i).INSTANCE.getTotalStudyTime());
            mymap.put(myStudents.get(i), myStudents.get(i).getTotalStudyTime());

        }

        return mymap;

    }
}
