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
        Mockito.when(numberFactory.genNoRepeatNumber()).thenReturn("1234");
    }

    @Test
    public void shouldReturn4NoRepeatNumbers() {
        String sysNumber = numberFactory.genNoRepeatNumber();
        Assert.assertEquals("1234", sysNumber);
    }

    @Test
    public void shouldReturnEmptyWhenInputInValid() {
        String guess = numberGuess.guess(null);
        Assert.assertEquals("", guess);

        guess = numberGuess.guess("123456");
        Assert.assertEquals("", guess);
    }

    @Test
    public void shouldReturn4A0BWhenInput_1234() {
        String guess = numberGuess.guess("1234");
        Assert.assertEquals("4A0B", guess);
    }

}
