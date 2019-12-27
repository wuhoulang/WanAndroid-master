package per.goweii.wanandroid.module.main.activity;

import android.support.annotation.Nullable;

import per.goweii.basic.core.base.BaseActivity;
import per.goweii.basic.core.mvp.MvpPresenter;
import per.goweii.wanandroid.R;

/**
 * @author CuiZhen
 * @date 2019/5/7
 * QQ: 302833254
 * E-mail: goweii@163.com
 * GitHub: https://github.com/goweii
 */
public class SplashActivity extends BaseActivity {

    @Override
    public boolean swipeBackEnable() {
        return false;
    }

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Nullable
    @Override
    protected MvpPresenter initPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        MainActivity.start(getContext());
        finish();
        overridePendingTransition(R.anim.zoom_small_in, R.anim.zoom_small_out);
    }

    @Override
    protected void loadData() {
    }
}
