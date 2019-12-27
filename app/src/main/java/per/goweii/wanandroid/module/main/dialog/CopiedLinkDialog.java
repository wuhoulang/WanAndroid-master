package per.goweii.wanandroid.module.main.dialog;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;

import per.goweii.anylayer.Align;
import per.goweii.anylayer.DragLayout;
import per.goweii.anylayer.Layer;
import per.goweii.anylayer.PopupLayer;
import per.goweii.basic.utils.listener.SimpleListener;
import per.goweii.wanandroid.R;
import per.goweii.wanandroid.module.main.activity.WebActivity;

/**
 * @author CuiZhen
 * @date 2019/10/19
 * QQ: 302833254
 * E-mail: goweii@163.com
 * GitHub: https://github.com/goweii
 */
public class CopiedLinkDialog extends PopupLayer {

    private final String link;

    public CopiedLinkDialog(View targetView, String link, SimpleListener onClose) {
        super(targetView);
        this.link = link;
        contentView(R.layout.dialog_copied_link);
        interceptKeyEvent(false);
        outsideInterceptTouchEvent(false);
        horizontal(Align.Horizontal.ALIGN_LEFT);
        vertical(Align.Vertical.ALIGN_BOTTOM);
        direction(Align.Direction.HORIZONTAL);
        dragDismiss(DragLayout.DragStyle.Left);
        onClickToDismiss(new OnClickListener() {
            @Override
            public void onClick(Layer layer, View v) {
                if (onClose != null) {
                    onClose.onResult();
                }
            }
        }, R.id.dialog_copied_link_iv_close);
        onClickToDismiss(new OnClickListener() {
            @Override
            public void onClick(Layer layer, View v) {
                if (onClose != null) {
                    onClose.onResult();
                }
                WebActivity.start(getActivity(), link);
            }
        }, R.id.dialog_copied_link_rl);
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public void onAttach() {
        super.onAttach();
        TextView tvLink = getView(R.id.dialog_copied_link_tv_link);
        tvLink.setText(link);
    }
}
