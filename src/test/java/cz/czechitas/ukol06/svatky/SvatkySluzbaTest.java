package cz.czechitas.ukol06.svatky;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.MonthDay;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SvatkySluzbaTest {

    @Test
    void searchNamedayOnGivenDay() throws IOException {
        SvatkySluzba svatkySluzba = new SvatkySluzba();
        SeznamSvatku seznamSvatku = new SeznamSvatku();

        assertAll(
                () -> {
                    int onlyOneNamedayOnGivenDay = svatkySluzba.searchNamedayOnGivenDay(MonthDay.of(1, 4)).size();
                    assertEquals(1, onlyOneNamedayOnGivenDay);

                    String oneName = String.valueOf(svatkySluzba.searchNamedayOnGivenDay(MonthDay.parse("--08-31")));
                    assertEquals("[Pavlína]", oneName);
                },
                () -> {
                    int moreNamedaysOnGivenDay = svatkySluzba.searchNamedayOnGivenDay(MonthDay.of(7, 8)).size();
                    assertEquals(3, moreNamedaysOnGivenDay);

                    List<String> namedaysGiven = List.of("Nora", "Edgar", "Kilian");
                    List<String> resultNamedaysGiven = svatkySluzba.searchNamedayOnGivenDay(MonthDay.of(7, 8));
                    assertIterableEquals(namedaysGiven, resultNamedaysGiven);
                },
                () -> {
                    int noNamedayOnGivenDay = svatkySluzba.searchNamedayOnGivenDay(MonthDay.of(1, 1)).size();
                    assertEquals(0, noNamedayOnGivenDay);

                    List<String> emptyNameday = List.of();
                    List<String> resultEmptyNameday = svatkySluzba.searchNamedayOnGivenDay(MonthDay.of(1, 6));
                    assertIterableEquals(emptyNameday,resultEmptyNameday);
                }
        );
    }
}
