package LibraryProject.demo.database;

import LibraryProject.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Repository("fakePersonDao")
public class FakePersonDataAccess implements PersonDao{
    private static final List<Person>DBPERSON=new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        DBPERSON.add(new Person(id, person.getName(), person.getAge()));
        return 1;
    }
}
