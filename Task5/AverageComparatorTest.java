import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings({"checkstyle:Indentation", "checkstyle:MissingJavadocType"})
public class AverageComparatorTest {
    @SuppressWarnings("checkstyle:Indentation")
    private AverageComparator comparator;

    @SuppressWarnings("checkstyle:Indentation")
    @Before
    public void setUp() {
        comparator = new AverageComparator();
    }

    @SuppressWarnings("checkstyle:Indentation")
    @Test
    public void testCompareAverages_FirstListIsGreater() {
        List<Double> list1 = Arrays.asList(2.0, 3.0, 4.0);
        List<Double> list2 = Arrays.asList(1.0, 2.0, 3.0);

        String result = comparator.compareAverages(list1, list2);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @SuppressWarnings("checkstyle:Indentation")
    @Test
    public void testCompareAverages_SecondListIsGreater() {
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(2.0, 3.0, 4.0);

        String result = comparator.compareAverages(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @SuppressWarnings("checkstyle:Indentation")
    @Test
    public void testCompareAverages_AveragesAreEqual() {
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(1.0, 2.0, 3.0);

        String result = comparator.compareAverages(list1, list2);

        assertEquals("Средние значения равны", result);
    }

    @SuppressWarnings("checkstyle:Indentation")
    @Test
    public void testCompareAverages_EmptyLists() {
        List<Double> list1 = List.of();
        List<Double> list2 = List.of();

        String result = comparator.compareAverages(list1, list2);

        assertEquals("Средние значения равны", result);
    }
}