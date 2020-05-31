package com.maradinho.coupons.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.maradinho.coupons.testing.AbstractTest;
import com.maradinho.coupons.model.dtos.ContactDto;
import com.maradinho.coupons.service.ContactService;
import com.maradinho.utils.TestUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
public class ContactControllerTest extends AbstractTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ContactService contactService;

    private static final String TEST_DATA_FOLDER = "com/maradinho/controller/";

    @BeforeAll
    static void setup() {
    }

    @Test
    public void getContacts() throws Exception {
        List<ContactDto> contacts = TestUtils.fromJson(TEST_DATA_FOLDER + "contacts.json", new TypeReference<List<ContactDto>>(){});
        when(contactService.findAll()).thenReturn(contacts);

        ResultActions actions = mvc.perform(MockMvcRequestBuilders.get("/contacts").accept(MediaType.APPLICATION_JSON));
        actions.andExpect(status().isOk())
                .andExpect(jsonPath("$").isArray())
                .andExpect(jsonPath("$", hasSize(contacts.size())));

        int i = 0;
        for(ContactDto c : contacts) {
            actions.andExpect(jsonPath(String.format("$[%d].id", i), is(c.getId().intValue())))
                    .andExpect(jsonPath(String.format("$[%d].name", i), is(c.getName())))
                    .andExpect(jsonPath(String.format("$[%d].comments", i), is(c.getComments())));
            i++;
        }
    }
}