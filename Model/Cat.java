package Model;

import java.util.Date;

public class Cat extends HomePets{
    public Cat(String name, String birthdate, String Command){
        super(name,PetType.Cat,birthdate,Command);
    }
}
