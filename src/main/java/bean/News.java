package bean;

/**
 * @author 赵浩博
 * @version 1.0.0
 * @ClassName News.java
 * @Description TODO
 * @createTime 2021年11月25日 15:33:00
 */
public class News {
    String contents;
    String title;
    String cname;

    public News() {
    }

    public News(String contents, String title, String cname) {
        this.contents = contents;
        this.title = title;
        this.cname = cname;
    }

    public News(String title, String cname) {
        this.title = title;
        this.cname = cname;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
