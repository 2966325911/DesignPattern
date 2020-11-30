package main.java.state;

/**
 * @author：vic
 * @date： 2020/11/30 10:40
 * @desc:
 */
public enum StateEnum {
    BOOKED(1,"房间已预订！别人不能定！"),
    CHECKED(2,"房间已入住！请勿打扰！"),
    FREE(3,"房间空闲！！！没人住！")
    ;
    private Integer state;
    private String msg;

    StateEnum(Integer state,String msg) {
        this.state = state;
        this.msg = msg;
    }

    public Integer getState() {
        return state;
    }

    public String getMsg() {
        return msg;
    }
}
