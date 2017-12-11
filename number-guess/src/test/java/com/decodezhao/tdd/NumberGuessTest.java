package com.decodezhao.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
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

    @Before
    public void setUp() {
        Mockito.when(numberFactory.genNoRepeatNumber()).thenReturn("1234");
    }

    @Test
    public void shouldReturn4NoRepeatNumbers() {
        String sysNumber = numberFactory.genNoRepeatNumber();
        Assert.assertEquals("1234", sysNumber);
    }

}
