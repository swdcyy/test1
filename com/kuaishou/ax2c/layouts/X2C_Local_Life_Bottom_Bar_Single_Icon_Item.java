package com.kuaishou.ax2c.layouts.X2C_Local_Life_Bottom_Bar_Single_Icon_Item;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import com.kuaishou.live.bottombar.component.widget.view.PressableFixedSimpleKwaiImageView;
import android.widget.ImageView;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import com.airbnb.lottie.LottieAnimationView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.widget.TextView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import com.kuaishou.ax2c.XmlAttrHostImpl;
import java.lang.Integer;
import com.kuaishou.ax2c.IAttrHost;
import ald.b;

public class X2C_Local_Life_Bottom_Bar_Single_Icon_Item implements IViewCreator	// class@001117
{

    public void X2C_Local_Life_Bottom_Bar_Single_Icon_Item(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setId(R.id.live_bottom_bar_single_icon_container);
       relativeLayo.setLayoutParams(new ViewGroup$MarginLayoutParams(c.b(resources, R.dimen.arg_RES_7f07031d), c.b(resources, R.dimen.arg_RES_7f07031d)));
       View view = new View(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f0702fe), c.b(resources, 0x7f0702fe));
       view.setId(R.id.background);
       layoutParams.addRule(13, -1);
       view.setBackgroundResource(R.drawable.arg_RES_7f0810dd);
       view.setLayoutParams(layoutParams);
       relativeLayo.addView(view);
       PressableFixedSimpleKwaiImageView pressableFix = new PressableFixedSimpleKwaiImageView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f0702cc), c.b(resources, 0x7f0702cc));
       pressableFix.setId(R.id.live_bottom_bar_icon);
       layoutParams.addRule(13, -1);
       pressableFix.setLayoutParams(layoutParams);
       relativeLayo.addView(pressableFix);
       LiveLottieAnimationView liveLottieAn = new LiveLottieAnimationView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f07031d), c.b(resources, 0x7f07031d));
       liveLottieAn.setId(R.id.live_bottom_bar_lottie_view);
       layoutParams.addRule(13, -1);
       liveLottieAn.setAutoPlay(true);
       liveLottieAn.q(true);
       liveLottieAn.setRepeatCount(-1);
       liveLottieAn.setLayoutParams(layoutParams);
       relativeLayo.addView(liveLottieAn);
       SelectShapeTextView selectShapeT = new SelectShapeTextView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       selectShapeT.setId(R.id.live_bottom_bar_top_right_tip_view);
       layoutParams.addRule(10, -1);
       layoutParams.addRule(11, -1);
       selectShapeT.setMinWidth((int)TypedValue.applyDimension(true, 14.00f, c.c(resources)));
       selectShapeT.setMinHeight((int)TypedValue.applyDimension(true, 14.00f, c.c(resources)));
       selectShapeT.setMaxLines(true);
       selectShapeT.setGravity(17);
       selectShapeT.setTextColor(resources.getColor(R.color.arg_RES_7f06060a));
       selectShapeT.setTextSize(true, 10.00f);
       selectShapeT.setVisibility(8);
       selectShapeT.setPadding((int)TypedValue.applyDimension(true, 2.00f, c.c(resources)), 0, (int)TypedValue.applyDimension(true, 2.00f, c.c(resources)), 0);
       XmlAttrHostImpl xmlAttrHostI = new XmlAttrHostImpl();
       xmlAttrHostI.addAttr(29, Integer.valueOf(resources.getColor(R.color.arg_RES_7f06016d)));
       XmlAttrHostImpl xmlAttrHostI1 = new XmlAttrHostImpl();
       xmlAttrHostI1.addAttr(2, Integer.valueOf(c.b(resources, R.dimen.arg_RES_7f07042c)));
       IAttrHost[] iAttrHostArr = new IAttrHost[]{xmlAttrHostI,new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),new XmlAttrHostImpl(),xmlAttrHostI1};
       selectShapeT.setAttrs(iAttrHostArr);
       selectShapeT.setLayoutParams(layoutParams);
       relativeLayo.addView(selectShapeT);
       view = new View(relativeLayo.getContext());
       int i = c.b(resources, R.dimen.arg_RES_7f0706fc);
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(i, c.b(resources, 0x7f0706fc));
       view.setId(R.id.live_bottom_bar_item_dot);
       layoutParams1.addRule(10, -1);
       layoutParams1.addRule(11, -1);
       view.setBackgroundResource(R.drawable.arg_RES_7f081119);
       view.setVisibility(8);
       view.setLayoutParams(layoutParams1);
       relativeLayo.addView(view);
       return relativeLayo;
    }
}
