package cz.czechitas.ukol06.svatky;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.nio.file.Path;
import java.time.MonthDay;
import java.util.List;
import java.util.stream.Collectors;

public class SvatkySluzba {

    private final ObjectMapper objectMapper = JsonMapper.builder()
            .addModule(new JavaTimeModule())
            .build();
    private final Path cestaKDatum = Path.of("data/svatky.json");
    private final SeznamSvatku seznamSvatku;

    public SvatkySluzba() throws IOException {
        // načíst seznam svátků ze souboru svatky.json
        seznamSvatku = objectMapper.readValue(cestaKDatum.toFile(), SeznamSvatku.class);
    }

    public List<String> vyhledatSvatkyDnes() {
        return searchNamedayOnGivenDay(MonthDay.now());
    }

    public List<String> searchNamedayOnGivenDay(MonthDay day) {
        // získat seznam svátků
        // pomocí metody filter() vybrat jen ty, které odpovídají zadanému dni (porovnat MonthDay pomocí metodyequals())
        // pomocí metody map() získat z objektu jméno
        // pomocí toList() převést na List
        List<Svatek> allNamedays = seznamSvatku.getSvatky();
        return allNamedays.stream()
                .filter(oneNameday -> day.equals(oneNameday.getDen()))
               //.filter(jedenSvatek -> jedenSvatek.getDen().equals(day))
                .map(Svatek::getJmeno)
                .toList();
    }
}

