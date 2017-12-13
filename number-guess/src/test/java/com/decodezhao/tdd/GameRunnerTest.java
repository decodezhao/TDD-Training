package com.decodezhao.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GameRunnerTest {

    private GameRunner gameRunner;

    @Mock
    private ScannerHandler scannerHandler;

    @Mock
    private NumberGuess numberGuess;

    @Before
    public void setUp() {
        gameRunner = new GameRunner(scannerHandler, numberGuess);
    }


    @Test
    public void shouldQuitWhenReadLineEmpty() {
        when(scannerHandler.readLine()).thenReturn("");
        String result = gameRunner.start();
        Assert.assertEquals("quit", result);
    }

    @Test
    public void shouldReturn4A0BWhenReadLine_1234() {
        when(numberGuess.guess(any(UniqueNumber.class))).thenReturn("4A0B");
        when(scannerHandler.readLine()).thenReturn("1234");

        gameRunner.start();

        verify(numberGuess, times(1)).guess(new UniqueNumber("1234"));

    }

}
