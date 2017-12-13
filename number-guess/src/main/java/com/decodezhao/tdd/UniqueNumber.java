package com.decodezhao.tdd;

/**
 * <Description> <br>
 *
 * @author zhao.zhengwei162 <br>
 * @version 1.0 <br>
 * @taskId <br>
 * @CreateDate 2017/12/12 <br>
 * @see com.decodezhao.tdd <br>
 * @since V90C<br>
 */
public class UniqueNumber {

    private String number;

    public UniqueNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UniqueNumber)) return false;

        UniqueNumber that = (UniqueNumber) o;

        return number != null ? number.equals(that.number) : that.number == null;
    }

    @Override
    public int hashCode() {
        return number != null ? number.hashCode() : 0;
    }
}
