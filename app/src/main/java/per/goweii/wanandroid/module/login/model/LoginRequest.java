package per.goweii.wanandroid.module.login.model;

import android.support.annotation.NonNull;

import io.reactivex.disposables.Disposable;
import per.goweii.wanandroid.http.BaseRequest;
import per.goweii.wanandroid.http.RequestListener;
import per.goweii.wanandroid.http.WanApi;

/**
 * @author CuiZhen
 * @date 2019/5/16
 * QQ: 302833254
 * E-mail: goweii@163.com
 * GitHub: https://github.com/goweii
 */
public class LoginRequest extends BaseRequest {

    public static Disposable login(String userName, String password, @NonNull RequestListener<LoginBean> listener) {
        return request(WanApi.api().login(userName, password), listener);
    }

    public static Disposable register(String userName, String password, String repassword, @NonNull RequestListener<LoginBean> listener) {
        return request(WanApi.api().register(userName, password, repassword), listener);
    }
}
