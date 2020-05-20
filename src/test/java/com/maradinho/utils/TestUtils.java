package com.maradinho.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class TestUtils {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static <T> T fromJson(String jsonFilename, TypeReference<T> valueType) {
        T object = null;

        InputStream json = TestUtils.class.getClassLoader().getResourceAsStream(jsonFilename);
        if (json != null) {
            try {
                object = mapper.readValue(json, valueType);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return object;
    }

}
