package Superdata;

public class CollegeProfesser {

    void welcome(){
        System.out.println("welcome to college");
    }

    void greeting(){
        System.out.println("good morinring");

        this.welcome();
    }

    public static void main(String[] args) {
        CollegeProfesser data=new CollegeProfesser();
        data.greeting();
    }
}
