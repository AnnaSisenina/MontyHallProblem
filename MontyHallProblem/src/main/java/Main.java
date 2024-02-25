import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        DescriptiveStatistics statisticsChangingDecision = new DescriptiveStatistics();
        DescriptiveStatistics statisticsSameDecision = new DescriptiveStatistics();
        Random rd = new Random();
        for (int i = 0; i < 1000; i++) {
            ThreeDoors doors1 = new ThreeDoors();
            Game game1 = new Game(doors1, rd.nextInt(3));
            statisticsChangingDecision.addValue(game1.checkResultWithChangingDecision());
        }
        for (int i = 0; i < 1000; i++) {
            ThreeDoors doors1 = new ThreeDoors();
            Game game1 = new Game(doors1, rd.nextInt(3));
            statisticsSameDecision.addValue(game1.checkResultWithSameDecision());
        }
        System.out.println("Статистика побед, если игрок меняет свой первоначальный выбор: " + statisticsChangingDecision.getMean());
        System.out.println("Статистика побед, если игрок не меняет свой первоначальный выбор: " + statisticsSameDecision.getMean());
    }
}
