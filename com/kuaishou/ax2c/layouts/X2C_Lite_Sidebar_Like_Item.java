package com.kuaishou.ax2c.layouts.X2C_Lite_Sidebar_Like_Item;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.widget.FrameLayout$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.graphics.Typeface;

public class X2C_Lite_Sidebar_Like_Item implements IViewCreator	// class@0010c4
{

    public void X2C_Lite_Sidebar_Like_Item(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setMinimumHeight(c.b(resources, R.dimen.arg_RES_7f070335));
       uFrameLayout.setMinimumWidth(c.b(resources, R.dimen.arg_RES_7f07032a));
       uFrameLayout.setClipChildren(false);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(c.b(resources, R.dimen.arg_RES_7f07032a), c.b(resources, R.dimen.arg_RES_7f070335)));
       RelativeLayout relativeLayo = new RelativeLayout(uFrameLayout.getContext());
       relativeLayo.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(relativeLayo);
       KwaiImageView kwaiImageVie = new KwaiImageView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f070325), c.b(resources, 0x7f070325));
       kwaiImageVie.setId(R.id.live_sidebar_like_item_placeholer);
       layoutParams.addRule(14, -1);
       kwaiImageVie.setVisibility(false);
       kwaiImageVie.setLayoutParams(layoutParams);
       relativeLayo.addView(kwaiImageVie);
       kwaiImageVie = new KwaiImageView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f070325), c.b(resources, 0x7f070325));
       kwaiImageVie.setId(R.id.live_sidebar_like_default_item);
       layoutParams.addRule(14, -1);
       kwaiImageVie.setBackgroundResource(R.drawable.arg_RES_7f081318);
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_XY);
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.getHierarchy().x(false);
       kwaiImageVie.setLayoutParams(layoutParams);
       relativeLayo.addView(kwaiImageVie);
       LiveLottieAnimationView liveLottieAn = new LiveLottieAnimationView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f070325), c.b(resources, 0x7f070325));
       liveLottieAn.setId(R.id.live_sidebar_like_item_lottie_view);
       layoutParams.addRule(14, -1);
       liveLottieAn.setVisibility(4);
       liveLottieAn.setAutoPlay(false);
       liveLottieAn.q(false);
       liveLottieAn.setLayoutParams(layoutParams);
       relativeLayo.addView(liveLottieAn);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-2, c.b(resources, 0x7f070295));
       uAppCompatTe.setId(R.id.live_sidebar_like_count_item_text);
       layoutParams.addRule(3, R.id.live_sidebar_like_item_lottie_view);
       layoutParams.addRule(14, -1);
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, -8.00f, c.c(resources));
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), resources.getColor(R.color.arg_RES_7f0601e4));
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), 0x3f800000, uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(uAppCompatTe.getShadowRadius(), uAppCompatTe.getShadowDx(), 0x3f800000, uAppCompatTe.getShadowColor());
       uAppCompatTe.setShadowLayer(0x3f800000, uAppCompatTe.getShadowDx(), uAppCompatTe.getShadowDy(), uAppCompatTe.getShadowColor());
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0620c7));
       uAppCompatTe.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070271));
       uAppCompatTe.setTypeface(null, 1);
       uAppCompatTe.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatTe);
       return uFrameLayout;
    }
}
