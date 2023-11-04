package Model;

import java.util.Date;

public abstract class Pets {
    public String Name;
    public PetType Type;
    public Date BirthDate;
    public String Commands;

    public Pets(String name,PetType Type, Date birthdate,String Command){
        this.Name = name;
        this.Type = Type;
        this.BirthDate = birthdate;
        this.Commands = Command;
    }
}
