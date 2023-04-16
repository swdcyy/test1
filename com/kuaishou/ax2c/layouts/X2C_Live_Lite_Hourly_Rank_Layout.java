package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Hourly_Rank_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.lite.hourlyrank.LiveLiteHourlyRankPendantView;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.widget.RelativeLayout;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ImageView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.kuaishou.live.widget.ShootMarqueeView;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import androidx.appcompat.widget.AppCompatTextView;

public class X2C_Live_Lite_Hourly_Rank_Layout implements IViewCreator	// class@0010f2
{

    public void X2C_Live_Lite_Hourly_Rank_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LiveLiteHourlyRankPendantView liveLiteHour = new LiveLiteHourlyRankPendantView(p0);
       liveLiteHour.setBackgroundColor(resources.getColor(R.color.arg_RES_7f060846));
       liveLiteHour.setGravity(16);
       liveLiteHour.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, c.b(resources, R.dimen.arg_RES_7f0702b8)));
       AppCompatImageView uAppCompatIm = new AppCompatImageView(liveLiteHour.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f070295), c.b(resources, 0x7f070295));
       uAppCompatIm.setId(R.id.live_hourly_rank_pendant_icon);
       layoutParams.setMarginStart((int)TypedValue.applyDimension(1, 4.00f, c.c(resources)));
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f08131b);
       uAppCompatIm.setLayoutParams(layoutParams);
       liveLiteHour.addView(uAppCompatIm);
       ShootMarqueeView shootMarquee = new ShootMarqueeView(liveLiteHour.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-1, -2);
       shootMarquee.setId(R.id.live_hourly_rank_content_view);
       layoutParams.leftMargin = c.b(resources, 0x7f0708a4);
       shootMarquee.setGravity(16);
       layoutParams.addRule(17, R.id.live_hourly_rank_pendant_icon);
       shootMarquee.setEllipsize(TextUtils$TruncateAt.MARQUEE);
       shootMarquee.setSingleLine(1);
       shootMarquee.setTextColor(resources.getColor(R.color.arg_RES_7f060874));
       shootMarquee.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070271));
       shootMarquee.setLayoutParams(layoutParams);
       liveLiteHour.addView(shootMarquee);
       liveLiteHour.onFinishInflate();
       return liveLiteHour;
    }
}
