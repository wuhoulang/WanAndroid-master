package per.goweii.wanandroid.module.mine.adapter;

import android.animation.ValueAnimator;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.TypedValue;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import per.goweii.wanandroid.R;
import per.goweii.wanandroid.module.main.model.CoinInfoBean;

/**
 * @author CuiZhen
 * @date 2019/5/15
 * QQ: 302833254
 * E-mail: goweii@163.com
 * GitHub: https://github.com/goweii
 */
public class CoinRankAdapter extends BaseQuickAdapter<CoinInfoBean, BaseViewHolder> {

    private int mMax = 0;

    public CoinRankAdapter() {
        super(R.layout.rv_item_coin_rank);
    }

    @Override
    public void setNewData(@Nullable List<CoinInfoBean> data) {
        super.setNewData(data);
        if (data != null && !data.isEmpty()) {
            mMax = data.get(0).getCoinCount();
        }
    }

    @Override
    protected void convert(BaseViewHolder helper, CoinInfoBean item) {
        ProgressBar pb = helper.getView(R.id.pb);
        doProgressAnim(pb, item.getCoinCount());
        int index = helper.getAdapterPosition() + 1;
        helper.setText(R.id.tv_index, "" + index);
        helper.setText(R.id.tv_index, "" + index);
        helper.setText(R.id.tv_user_name, item.getUsername());
        helper.setText(R.id.tv_coin_count, "" + item.getCoinCount());
        ImageView iv_index = helper.getView(R.id.iv_index);
        TextView tv_index = helper.getView(R.id.tv_index);
        if (index == 1) {
            iv_index.setImageResource(R.drawable.ic_rank_1);
            tv_index.setTextColor(ContextCompat.getColor(tv_index.getContext(), R.color.text_surface_alpha));
            tv_index.setTextSize(TypedValue.COMPLEX_UNIT_PX, tv_index.getContext().getResources().getDimension(R.dimen.text_auxiliary));
        } else if (index == 2) {
            iv_index.setImageResource(R.drawable.ic_rank_2);
            tv_index.setTextColor(ContextCompat.getColor(tv_index.getContext(), R.color.text_surface_alpha));
            tv_index.setTextSize(TypedValue.COMPLEX_UNIT_PX, tv_index.getContext().getResources().getDimension(R.dimen.text_auxiliary));
        } else if (index == 3) {
            iv_index.setImageResource(R.drawable.ic_rank_3);
            tv_index.setTextColor(ContextCompat.getColor(tv_index.getContext(), R.color.text_surface_alpha));
            tv_index.setTextSize(TypedValue.COMPLEX_UNIT_PX, tv_index.getContext().getResources().getDimension(R.dimen.text_auxiliary));
        } else {
            iv_index.setImageResource(R.color.transparent);
            tv_index.setTextColor(ContextCompat.getColor(tv_index.getContext(), R.color.text_second));
            tv_index.setTextSize(TypedValue.COMPLEX_UNIT_PX, tv_index.getContext().getResources().getDimension(R.dimen.text_content));
        }
    }

    private void doProgressAnim(final ProgressBar pb, int to) {
        final int f = 1000;
        pb.setMax(mMax * f);
        ValueAnimator animator = ValueAnimator.ofInt(0, to);
        animator.setDuration(1000);
        animator.setInterpolator(new DecelerateInterpolator());
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                pb.setProgress((int) animation.getAnimatedValue() * f);
            }
        });
        animator.start();
    }
}
