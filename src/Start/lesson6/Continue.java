package Start.lesson6;

public class Continue {
    static void main() {
        int [] results = {3, 5, 6, 2, 1};
        for (int result : results){
            System.out.println(result);
            if (result == 6){
                continue;

            }
            System.out.println("Спортсмен отжимается");
        }

    }
}
