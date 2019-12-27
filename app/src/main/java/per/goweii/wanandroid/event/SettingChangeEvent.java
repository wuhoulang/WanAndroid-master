package per.goweii.wanandroid.event;

/**
 * @author CuiZhen
 * @date 2019/5/17
 * QQ: 302833254
 * E-mail: goweii@163.com
 * GitHub: https://github.com/goweii
 */
public class SettingChangeEvent extends BaseEvent {

    private boolean showReadLaterChanged;
    private boolean showTopChanged;
    private boolean showBannerChanged;
    private boolean hideAboutMeChanged;
    private boolean hideOpenChanged;
    private boolean rvAnimChanged;

    public SettingChangeEvent() {
    }

    @Override
    public void post() {
        if (showReadLaterChanged || showTopChanged || showBannerChanged ||
                hideAboutMeChanged || hideOpenChanged || rvAnimChanged) {
            super.post();
        }
    }

    public boolean isShowReadLaterChanged() {
        return showReadLaterChanged;
    }

    public void setShowReadLaterChanged(boolean readLaterChanged) {
        this.showReadLaterChanged = readLaterChanged;
    }

    public boolean isShowTopChanged() {
        return showTopChanged;
    }

    public void setShowTopChanged(boolean showTopChanged) {
        this.showTopChanged = showTopChanged;
    }

    public boolean isShowBannerChanged() {
        return showBannerChanged;
    }

    public void setShowBannerChanged(boolean showBannerChanged) {
        this.showBannerChanged = showBannerChanged;
    }

    public boolean isHideAboutMeChanged() {
        return hideAboutMeChanged;
    }

    public void setHideAboutMeChanged(boolean hideAboutMeChanged) {
        this.hideAboutMeChanged = hideAboutMeChanged;
    }

    public boolean isHideOpenChanged() {
        return hideOpenChanged;
    }

    public void setHideOpenChanged(boolean hideOpenChanged) {
        this.hideOpenChanged = hideOpenChanged;
    }

    public boolean isRvAnimChanged() {
        return rvAnimChanged;
    }

    public void setRvAnimChanged(boolean rvAnimChanged) {
        this.rvAnimChanged = rvAnimChanged;
    }
}
