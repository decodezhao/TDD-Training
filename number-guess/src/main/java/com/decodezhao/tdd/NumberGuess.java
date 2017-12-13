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

    private NumberFactory numberFactory = new NumberFactory();

    public String guess(UniqueNumber userInput) {
        if (userInput == null) {
            return "";
        }
        String number = userInput.getNumber();
        if (number == null || number.length() != 4) {
            return "";
        }
        UniqueNumber repeatNum = numberFactory.genNoRepeatNumber();
        System.out.println("The system number is:" + repeatNum.getNumber());

        // 判断数字相同且位置也相同
        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i < 4; i++) {
            char c = repeatNum.getNumber().charAt(i);
            if (c == number.charAt(i)) {
                aCount++;
            }
            else {
                if (number.contains(String.valueOf(c))) {
                    bCount++;
                }
            }

        }

        return aCount + "A" + bCount + "B";
    }
}
