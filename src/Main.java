public class Main {
    public static void main(String[] args) {
        //6
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес двух бойцов: " + (boxer1Weight + boxer2Weight));
        System.out.println("Разница в весе двух бойцов: " + (boxer2Weight - boxer1Weight));

        //7
        System.out.println("Разница в весе двух бойцов: " + (boxer2Weight - boxer1Weight));
        System.out.println("Разница в весе двух бойцов: " + (boxer2Weight % boxer1Weight));

        //8
        var totalWorkingHours = 640;
        var hoursDay = 8;
        var totalEmployee = totalWorkingHours / hoursDay;
        System.out.println("Всего работников в компании - " + totalEmployee + " человек");

        totalEmployee = totalEmployee + 94;
        totalWorkingHours = totalEmployee * hoursDay;
        System.out.println("Если в комании работает  " + totalEmployee + " человека, то всего " + totalWorkingHours + " часа работы может быть поделено между сотрудниками");


    }
}