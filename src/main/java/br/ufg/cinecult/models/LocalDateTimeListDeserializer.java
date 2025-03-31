package br.ufg.cinecult.models;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class LocalDateTimeListDeserializer extends JsonDeserializer<List<LocalDateTime>> {
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

    @Override
    public List<LocalDateTime> deserialize(JsonParser p, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        String[] dateStrings = p.readValueAs(String[].class);
        return Arrays.stream(dateStrings)
                .map(date -> LocalDateTime.parse(date, FORMATTER))
                .toList();
    }
}
