package com.decodezhao.tdd;

import java.util.Random;

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
public class NumberFactory {

    public String genNoRepeatNumber() {
        StringBuilder sb = new StringBuilder();
        int[] a = new int[] {
            -1, -1, -1, -1
        };// 初始化数组
        Random random = new Random();
        int count = 0;// 记录有效的随机数个数
        while (count < a.length) {
            boolean flag = true;// 用来标志的变量
            int r = random.nextInt(10);
            for (int i = 0; i < a.length; i++) {
                if (r == a[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                a[count] = r;
                sb.append(r);
                count++;
            }
        }
        return sb.toString();
    }

}
