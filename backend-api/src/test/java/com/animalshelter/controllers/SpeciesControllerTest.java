package com.animalshelter.controllers;

import com.animalshelter.storages.SpeciesStorage;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.ui.Model;

import static org.mockito.Mockito.mock;

public class SpeciesControllerTest {

    private SpeciesStorage mockSpeciesStorage;
    private SpeciesController underTest;
    private Model model;

    @BeforeEach
    void setUp(){
        mockSpeciesStorage = mock(SpeciesStorage.class);
        underTest = new SpeciesController(mockSpeciesStorage);
        model = Mockito.mock(Model.class);
    }
}
