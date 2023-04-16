package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Bottom_Bar_Tuna_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import com.kuaishou.live.bottombar.component.widget.view.PressableFixedSimpleKwaiImageView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.widget.TextView;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;

public class X2C_Live_Audience_Bottom_Bar_Tuna_Layout implements IViewCreator	// class@0010d5
{

    public void X2C_Live_Audience_Bottom_Bar_Tuna_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.live_audience_bottom_bar_tuna_container);
       uFrameLayout.setClipChildren(false);
       uFrameLayout.setClipToPadding(false);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(c.b(resources, R.dimen.arg_RES_7f0702fe), c.b(resources, R.dimen.arg_RES_7f0702fe)));
       View view = new View(uFrameLayout.getContext());
       view.setId(R.id.background);
       view.setBackgroundResource(R.drawable.arg_RES_7f0810dd);
       view.setLayoutParams(new FrameLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f0702fe), c.b(resources, R.dimen.arg_RES_7f0702fe)));
       uFrameLayout.addView(view);
       PressableFixedSimpleKwaiImageView pressableFix = new PressableFixedSimpleKwaiImageView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 24.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 24.00f, c.c(resources)));
       pressableFix.setId(R.id.live_bottom_bar_icon);
       layoutParams.gravity = 17;
       pressableFix.setLayoutParams(layoutParams);
       uFrameLayout.addView(pressableFix);
       LiveLottieAnimationView liveLottieAn = new LiveLottieAnimationView(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams(c.b(resources, 0x7f07031d), c.b(resources, 0x7f07031d));
       liveLottieAn.setId(R.id.live_audience_bottom_bar_tuna_lottie_view);
       layoutParams.gravity = 17;
       liveLottieAn.setAutoPlay(1);
       liveLottieAn.q(1);
       liveLottieAn.setRepeatCount(-1);
       liveLottieAn.setLayoutParams(layoutParams);
       uFrameLayout.addView(liveLottieAn);
       SelectShapeTextView selectShapeT = new SelectShapeTextView(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams(-2, -2);
       selectShapeT.setId(R.id.live_bottom_bar_top_right_tip_view);
       layoutParams.gravity = 53;
       selectShapeT.setGravity(17);
       selectShapeT.setMaxLines(1);
       selectShapeT.setMinHeight((int)TypedValue.applyDimension(1, 14.00f, c.c(resources)));
       selectShapeT.setMinWidth((int)TypedValue.applyDimension(1, 14.00f, c.c(resources)));
       selectShapeT.setTextColor(resources.getColor(R.color.arg_RES_7f06060a));
       selectShapeT.setVisibility(8);
       selectShapeT.setPadding((int)TypedValue.applyDimension(1, 2.00f, c.c(resources)), false, (int)TypedValue.applyDimension(1, 2.00f, c.c(resources)), false);
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(29, Integer.valueOf(resources.getColor(R.color.arg_RES_7f06016d)));
       XmlAttrHostImpl xmlAttrHostI1 = new XmlAttrHostImpl();
       xmlAttrHostI1.addAttr(2, Integer.valueOf(c.b(resources, R.dimen.arg_RES_7f07042c)));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),xmlAttrHostI1};
       selectShapeT.setAttrs(iAttrHostArr);
       selectShapeT.setLayoutParams(layoutParams);
       uFrameLayout.addView(selectShapeT);
       view = new View(uFrameLayout.getContext());
       int i = c.b(resources, R.dimen.arg_RES_7f0706fc);
       layoutParams = new FrameLayout$LayoutParams(i, c.b(resources, 0x7f0706fc));
       view.setId(R.id.live_bottom_bar_item_dot);
       layoutParams.gravity = 53;
       view.setBackgroundResource(R.drawable.arg_RES_7f081119);
       view.setVisibility(8);
       view.setLayoutParams(layoutParams);
       uFrameLayout.addView(view);
       return uFrameLayout;
    }
}
