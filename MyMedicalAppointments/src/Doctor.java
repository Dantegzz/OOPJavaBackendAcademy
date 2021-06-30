
public class Doctor {
    //Atributos
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    Doctor(){
        System.out.println("Building Doctor Object");
    }

    Doctor(String name, String speciality){
        System.out.println("The assigned Doctor name is: " + name);
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    //Behaviour
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
