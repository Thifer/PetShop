package Model;

public abstract class Pets {
    private String Name;
    private PetType Type;
    private String BirthDate;
    private String Commands;

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

    public String getName() {
        return Name;
    }

    public String getCommands() {
        return Commands;
    }

    public void setCommands(String commands) {
        Commands = commands;
    }
}
