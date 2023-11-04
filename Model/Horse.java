package Model;

import java.util.Date;

public class Horse extends PackAnimals{
    public Horse(String name, Date birthdate, String Command){
        super(name,PetType.Horse,birthdate,Command);
    }
}
