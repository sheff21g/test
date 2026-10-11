package PracticBasic;

public class PracticeVariable {
    static void main() {
        //Объявите переменные для имени, возраста и роста, выведите их на экран.
        String Name = "Ivan";
        int Age = 23;
        int Height = 203;
        System.out.printf("Имя:" + Name + "\n" + "Возраст:" + Age + "\n" + "Рост:" + Height+ "\n");
        System.out.printf("---------------------------------"+"\n");
        //Переведите температуру из Цельсия в Фаренгейт (формула: F = C * 9/5 + 32).
        int Celcius = 30; // температура по цельсию
        int F = Celcius * 9/5 + 32;
        System.out.printf("Температура по Фаренгейту ="+ " " + F+ "\n");
        System.out.printf("---------------------------------"+"\n");
        //Посчитайте площадь и периметр прямоугольника по введённым сторонам.
        int StoronaA = 15;
        int StoronaB = 25;
        int Perimetr = (StoronaA + StoronaB)*2;
        int Squre = StoronaA*StoronaB;
        System.out.println("Периметр:" + Perimetr);
        System.out.println("Площадь:" + Squre);
        System.out.printf("---------------------------------"+"\n");
        //Переведите заданное количество секунд в часы, минуты и секунды.
        int Hour = 8;
        int Minute = Hour * 60;
        int Second = Minute * 60;
        System.out.println("Час:" + Hour +"\n" + "Минуты:" + Minute + "\n" + "Секунды:" + Second+"\n");
        System.out.printf("---------------------------------"+"\n");
        //Посчитайте, сколько секунд человек прожил, зная возраст в годах (без учёта високосных лет).
        int Year = 23;
        int sec = Year * 365 * 24 * 60 * 60;
        System.out.println("Прожил секунд:" + sec +"\n" );
        System.out.printf("---------------------------------"+"\n");
        double Principal = 6_600_000; // начальная сумма
        double RatePercent = 12; // ставка в процентах
        int yaer1 = 15; // количество лет
        double Rate = RatePercent/100; //перевод процента
        double amount = Principal * Math.pow(1 + Rate, yaer1);
        System.out.printf("Начальная сумма: %.2f%n", Principal);
        System.out.printf("Ставка: %.1f%% годовых%n", RatePercent);
        System.out.printf("Через %d лет сумма составит: %.2f%n", yaer1, amount);
        System.out.printf("Чистая прибыль: %.2f%n", amount - Principal);
        System.out.printf("---------------------------------"+"\n");









    }
}
