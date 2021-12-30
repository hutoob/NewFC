package bean;

/**
 * @author 赵浩博
 * @version 1.0.0
 * @ClassName Tu.java
 * @Description TODO
 * @createTime 2021年11月25日 22:58:00
 */
public class Tu {
    String name;
    String num;

    public Tu(String name, String num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
