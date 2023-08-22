import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    long[] testData={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    @Test
    public void shouldReturnMinSalesMonth(){
        StatsService statsService = new StatsService();
        int expected=9;
        int actual= statsService.minSales(testData);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnMaxSalesMonth(){
        StatsService statsService = new StatsService();
        int expected=8;
        int actual= statsService.maxSales(testData);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnSumSales(){
        StatsService statsService = new StatsService();
        int expected=180;
        int actual= statsService.sumSales(testData);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnAvgSales(){
        StatsService statsService = new StatsService();
        int expected=15;
        int actual= statsService.avgSales(testData);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnAboveAvgSales(){
        StatsService statsService = new StatsService();
        int expected=5;
        int actual= statsService.aboveAvg(testData);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReturnBelowAvgSales(){
        StatsService statsService = new StatsService();
        int expected=5;
        int actual= statsService.belowAvg(testData);
        Assertions.assertEquals(expected, actual);
    }

}
