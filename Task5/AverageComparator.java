import java.util.List;

public class AverageComparator {
    public String compareAverages(List<Double> list1, List<Double> list2) {
        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }

    private double calculateAverage(List<Double> list) {
        if (list.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (Double number : list) {
            sum += number;
        }
        return sum / list.size();
    }
}