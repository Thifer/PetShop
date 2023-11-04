package Model;

import Model.Pets;

import java.util.Date;

public class HomePets extends Pets {
    public HomePets(String name, PetType type , Date birthdate, String Command){
        super(name,type,birthdate,Command);
    }
}
