package com.decodezhao.tdd;

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
public class NumberGuess {

    NumberFactory numberFactory = new NumberFactory();

    public String guess(String userInput) {
        if (userInput == null || userInput.length() != 4) {
            return "";
        }
        String repeatNum = numberFactory.genNoRepeatNumber();

        // 判断数字相同且位置也相同
        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i < 4; i++) {
            char c = repeatNum.charAt(i);
            if (c == userInput.charAt(i)) {
                aCount++;
            }
            else {
                if (userInput.contains(String.valueOf(c))) {
                    bCount++;
                }
            }

        }

        return aCount + "A" + bCount + "B";
    }
}
