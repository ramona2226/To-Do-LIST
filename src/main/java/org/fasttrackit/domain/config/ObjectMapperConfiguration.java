package org.fasttrackit.domain.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class ObjectMapperConfiguration {


    public static ObjectMapper objectMapper;

        public static ObjectMapper getObjectMapper(){

            if (objectMapper == null) {
                objectMapper = new ObjectMapper();
                objectMapper.registerModule(new JavaTimeModule());
            }

            return objectMapper;
        }
    }




