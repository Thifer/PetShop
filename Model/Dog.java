package Model;

import java.util.Date;

public class Dog extends HomePets{
    public Dog(String name, String birthdate, String Command){
        super(name,PetType.Dog,birthdate,Command);
    }
}
