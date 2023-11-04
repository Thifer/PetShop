package Model;

import java.util.Date;

public class Hamster extends HomePets{
    public Hamster(String name, Date birthdate, String Command){
        super(name,PetType.Hamster,birthdate,Command);
    }
}
