import com.step.demo.DemoUsingRegularSolutions;
import com.step.model.Gender;
import com.step.model.Person;
import com.step.model.PersonHelper;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        DemoUsingRegularSolutions regularSolutions = new DemoUsingRegularSolutions();
        List<Person> random10Person = PersonHelper.getRandomPerson(10);
        regularSolutions.max3Salaries(random10Person);
    }

}
