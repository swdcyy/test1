package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Bottom_Bar_Follow_View;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView$ScaleType;
import com.yxcorp.gifshow.widget.density.KwaiFixedSimpleDraweeView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.facebook.drawee.generic.RoundingParams;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import com.kwai.library.widget.textview.StrokedTextView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.graphics.Typeface;

public class X2C_Live_Audience_Bottom_Bar_Follow_View implements IViewCreator	// class@0010d0
{

    public void X2C_Live_Audience_Bottom_Bar_Follow_View(){
       super();
    }
    public View createView(Context p0){
       Context uContext = p0;
       Resources resources = p0.getResources();
       ConstraintLayout uConstraintL = new ConstraintLayout(uContext);
       uConstraintL.setId(R.id.live_audience_bottom_bar_follow);
       uConstraintL.setBackgroundResource(R.drawable.arg_RES_7f08018e);
       uConstraintL.setLayoutParams(new ViewGroup$MarginLayoutParams(c.b(resources, R.dimen.arg_RES_7f0705b8), c.b(resources, R.dimen.arg_RES_7f0705e4)));
       AppCompatImageView uAppCompatIm = new AppCompatImageView(uConstraintL.getContext());
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams((int)TypedValue.applyDimension(1, 0, c.c(resources)), (int)TypedValue.applyDimension(1, 0, c.c(resources)));
       uAppCompatIm.setId(R.id.live_audience_bottom_bar_unfollow_background);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f080198);
       layoutParams.k = 0;
       layoutParams.d = 0;
       layoutParams.g = 0;
       layoutParams.h = 0;
       layoutParams.c();
       uAppCompatIm.setLayoutParams(layoutParams);
       uConstraintL.addView(uAppCompatIm);
       KwaiImageView kwaiImageVie = new KwaiImageView(uConstraintL.getContext());
       layoutParams = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f0705e1), c.b(resources, 0x7f0705e1));
       kwaiImageVie.setId(R.id.live_audience_bottom_bar_follow_item_animation_fake_icon);
       kwaiImageVie.setVisibility(8);
       layoutParams.k = 0;
       layoutParams.d = 0;
       layoutParams.g = 0;
       layoutParams.h = 0;
       layoutParams.c();
       kwaiImageVie.setLayoutParams(layoutParams);
       uConstraintL.addView(kwaiImageVie);
       uAppCompatIm = new AppCompatImageView(uConstraintL.getContext());
       layoutParams = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f070295), c.b(resources, 0x7f070295));
       uAppCompatIm.setId(R.id.live_audience_bottom_bar_follow_button);
       layoutParams.rightMargin = c.b(resources, 0x7f070271);
       uAppCompatIm.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f08241e);
       layoutParams.k = 0;
       layoutParams.h = 0;
       layoutParams.g = 0;
       layoutParams.c();
       uAppCompatIm.setLayoutParams(layoutParams);
       uConstraintL.addView(uAppCompatIm);
       KwaiFixedSimpleDraweeView kwaiFixedSim = new KwaiFixedSimpleDraweeView(uConstraintL.getContext());
       layoutParams = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f0702df), c.b(resources, 0x7f0702df));
       kwaiFixedSim.setId(R.id.live_audience_bottom_bar_follow_avatar);
       layoutParams.leftMargin = c.b(resources, 0x7f07031b);
       kwaiFixedSim.getHierarchy().u(t$b.e);
       layoutParams.k = 0;
       layoutParams.d = 0;
       layoutParams.h = 0;
       kwaiFixedSim.getHierarchy().F(ContextCompat.getDrawable(uContext, R.drawable.detail_avatar_secret));
       kwaiFixedSim.getHierarchy().L(RoundingParams.a());
       layoutParams.c();
       kwaiFixedSim.setLayoutParams(layoutParams);
       uConstraintL.addView(kwaiFixedSim);
       LiveLottieAnimationView liveLottieAn = new LiveLottieAnimationView(uConstraintL.getContext());
       ConstraintLayout$LayoutParams layoutParams1 = new ConstraintLayout$LayoutParams(c.b(resources, 0x7f070295), c.b(resources, 0x7f070295));
       liveLottieAn.setId(R.id.live_audience_bottom_bar_follow_lottie);
       layoutParams1.rightMargin = c.b(resources, 0x7f070271);
       layoutParams1.g = 0;
       layoutParams1.k = 0;
       layoutParams1.h = 0;
       layoutParams1.c();
       liveLottieAn.setLayoutParams(layoutParams1);
       uConstraintL.addView(liveLottieAn);
       RelativeLayout relativeLayo = new RelativeLayout(uConstraintL.getContext());
       layoutParams1 = new ConstraintLayout$LayoutParams((int)TypedValue.applyDimension(1, 40.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 27.00f, c.c(resources)));
       relativeLayo.setId(R.id.live_audience_bottom_bar_fans_group_entrance_container);
       relativeLayo.setVisibility(8);
       layoutParams1.d = 0;
       layoutParams1.k = 0;
       layoutParams1.g = 0;
       layoutParams1.h = 0;
       layoutParams1.c();
       relativeLayo.setLayoutParams(layoutParams1);
       uConstraintL.addView(relativeLayo);
       kwaiImageVie = new KwaiImageView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams2 = new RelativeLayout$LayoutParams(c.b(resources, 0x7f07030d), c.b(resources, 0x7f0702da));
       kwaiImageVie.setId(R.id.live_audience_bottom_bar_fans_group_entrance_icon);
       layoutParams2.addRule(13, -1);
       kwaiImageVie.setLayoutParams(layoutParams2);
       relativeLayo.addView(kwaiImageVie);
       StrokedTextView strokedTextV = new StrokedTextView(relativeLayo.getContext());
       layoutParams2 = new RelativeLayout$LayoutParams(-2, -2);
       strokedTextV.setId(R.id.live_audience_bottom_bar_fans_group_entrance_level);
       layoutParams2.addRule(13, -1);
       strokedTextV.setGravity(17);
       strokedTextV.setIncludeFontPadding(0);
       strokedTextV.setTextColor(resources.getColor(R.color.arg_RES_7f0620d1));
       strokedTextV.setTextSize(1, 10.00f);
       strokedTextV.setTypeface(null, 1);
       strokedTextV.setPadding((int)TypedValue.applyDimension(1, 0x3fc00000, c.c(resources)), 0, 0, 0);
       strokedTextV.setLayoutParams(layoutParams2);
       relativeLayo.addView(strokedTextV);
       relativeLayo = new RelativeLayout(uConstraintL.getContext());
       layoutParams1 = new ConstraintLayout$LayoutParams((int)TypedValue.applyDimension(1, 40.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 27.00f, c.c(resources)));
       relativeLayo.setId(R.id.live_audience_bottom_bar_fans_group_entrance_temp_container);
       relativeLayo.setVisibility(8);
       layoutParams1.k = 0;
       layoutParams1.e = 0x7f0a191f;
       layoutParams1.g = 0;
       layoutParams1.h = 0;
       layoutParams1.c();
       relativeLayo.setLayoutParams(layoutParams1);
       uConstraintL.addView(relativeLayo);
       kwaiImageVie = new KwaiImageView(relativeLayo.getContext());
       layoutParams2 = new RelativeLayout$LayoutParams(c.b(resources, 0x7f07030d), c.b(resources, 0x7f0702da));
       kwaiImageVie.setId(R.id.live_audience_bottom_bar_fans_group_entrance_temp_icon);
       layoutParams2.addRule(13, -1);
       kwaiImageVie.getHierarchy().u(t$b.h);
       kwaiImageVie.setLayoutParams(layoutParams2);
       relativeLayo.addView(kwaiImageVie);
       strokedTextV = new StrokedTextView(relativeLayo.getContext());
       layoutParams2 = new RelativeLayout$LayoutParams(-2, -2);
       strokedTextV.setId(R.id.live_audience_bottom_bar_fans_group_entrance_temp_level);
       layoutParams2.addRule(13, -1);
       strokedTextV.setGravity(17);
       strokedTextV.setIncludeFontPadding(0);
       strokedTextV.setTextColor(resources.getColor(R.color.arg_RES_7f061d96));
       strokedTextV.setTextSize(1, 10.00f);
       strokedTextV.setTypeface(null, 1);
       strokedTextV.setPadding((int)TypedValue.applyDimension(1, 0x3fc00000, c.c(resources)), 0, 0, 0);
       strokedTextV.setLayoutParams(layoutParams2);
       relativeLayo.addView(strokedTextV);
       return uConstraintL;
    }
}