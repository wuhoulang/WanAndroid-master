package per.goweii.wanandroid.module.mine.view;

import per.goweii.basic.core.base.BaseView;
import per.goweii.wanandroid.module.mine.model.AboutMeBean;

/**
 * @author CuiZhen
 * @date 2019/5/23
 * QQ: 302833254
 * E-mail: goweii@163.com
 * GitHub: https://github.com/goweii
 */
public interface AboutMeView extends BaseView {
    void getAboutMeSuccess(int code, AboutMeBean data);
    void getAboutMeFailed(int code, String msg);
}
