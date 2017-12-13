package com.decodezhao.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameRunnerTest {

    private GameRunner gameRunner;

    @Mock
    private ScannerHandler scannerHandler;

    @Before
    public void setUp() {
        gameRunner = new GameRunner(scannerHandler);
    }


    @Test
    public void shouldQuitWhenReadLineEmpty() {
        when(scannerHandler.readLine()).thenReturn("");
        String result = gameRunner.start();
        Assert.assertEquals("quit", result);
    }

}
