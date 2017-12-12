package com.decodezhao.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * <Description> <br>
 *
 * @author zhao.zhengwei162 <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2017/12/11 <br>
 * @since V90C<br>
 * @see com.decodezhao.tdd <br>
 */
@RunWith(MockitoJUnitRunner.class)
public class NumberGuessTest {

    @Mock
    private NumberFactory numberFactory;

    @InjectMocks
    private NumberGuess numberGuess;

    @Before
    public void setUp() {
        UniqueNumber number = new UniqueNumber("1234");
        Mockito.when(numberFactory.genNoRepeatNumber()).thenReturn(number);
    }

    @Test
    public void shouldReturn4NoRepeatNumbers() {
        NumberFactory numberFactory = Mockito.spy(NumberFactory.class);
        Assert.assertNotNull(numberFactory.genNoRepeatNumber());
    }

    @Test
    public void shouldReturnEmptyWhenInputInValid() {
        String guess = numberGuess.guess(null);
        Assert.assertEquals("", guess);

        guess = numberGuess.guess(new UniqueNumber("123456"));
        Assert.assertEquals("", guess);
    }

    @Test
    public void shouldReturn4A0BWhenInput_1234() {
        UniqueNumber userInput = new UniqueNumber("1234");
        String guess = numberGuess.guess(userInput);
        Assert.assertEquals("4A0B", guess);
    }

    @Test
    public void shouldReturn0A4BWhenInput_4321() {
        UniqueNumber userInput = new UniqueNumber("4321");
        Assert.assertEquals("0A4B", numberGuess.guess(userInput));
    }

    @Test
    public void shouldReturn0A0BWhenInput_5678() {
        Assert.assertEquals("0A0B", numberGuess.guess(new UniqueNumber("5678")));
    }

    @Test
    public void shouldReturn1A1BWhenInput_1356() {
        Assert.assertEquals("1A1B", numberGuess.guess(new UniqueNumber("1356")));
    }

}
