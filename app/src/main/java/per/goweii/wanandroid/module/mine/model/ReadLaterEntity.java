package per.goweii.wanandroid.module.mine.model;

import io.realm.RealmObject;

/**
 * @author CuiZhen
 * @date 2019/5/26
 * QQ: 302833254
 * E-mail: goweii@163.com
 * GitHub: https://github.com/goweii
 */
public class ReadLaterEntity extends RealmObject {

    private int userId;
    private String title;
    private String link;
    private long time;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
