package Model;

public abstract class Pets {
    public String Name;
    public PetType Type;
    public String BirthDate;
    public String Commands;

    public Pets(String name,PetType Type, String birthdate,String Command){
        this.Name = name;
        this.Type = Type;
        this.BirthDate = birthdate;
        this.Commands = Command;
    }

    @Override
    public String toString() {
        return  "==============" +'\n' +
                "Имя=" + Name + '\n' +
                "Вид=" + Type + '\n' +
                "Дата рождения='" + BirthDate + '\n' +
                "Комманды='" + Commands + '\n'+
                "=================";
    }
}
