package com.kuaishou.ax2c.layouts.X2C_Live_Gift_Slot_Spring_Naming_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import cw9.c;
import java.lang.String;
import android.graphics.Color;
import android.text.TextUtils$TruncateAt;
import java.lang.CharSequence;

public class X2C_Live_Gift_Slot_Spring_Naming_Layout implements IViewCreator	// class@0010e3
{

    public void X2C_Live_Gift_Slot_Spring_Naming_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setId(R.id.live_gift_spring_naming_animation_layout);
       relativeLayo.setVisibility(8);
       relativeLayo.setAlpha(0);
       relativeLayo.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       KwaiImageView kwaiImageVie = new KwaiImageView(relativeLayo.getContext());
       kwaiImageVie.setId(R.id.live_gift_spring_naming_animation_imageview);
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_CENTER);
       kwaiImageVie.getHierarchy().u(t$b.a);
       kwaiImageVie.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(kwaiImageVie);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -1);
       uAppCompatTe.setId(R.id.live_gift_spring_naming_animation_textView);
       layoutParams.leftMargin = c.b(resources, 0x7f07034b);
       uAppCompatTe.setBackgroundColor(Color.parseColor("#00000000"));
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setMaxEms(5);
       uAppCompatTe.setMaxLines(1);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0620c7));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f07025e));
       uAppCompatTe.setPadding(c.b(resources, R.dimen.arg_RES_7f070283), 0, 0, 0);
       uAppCompatTe.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatTe);
       uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-2, -1);
       uAppCompatTe.setId(R.id.live_gift_spring_naming_animation_textView2);
       layoutParams.addRule(1, R.id.live_gift_spring_naming_animation_textView);
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setText("Ö÷²¥¹ÚÃû");
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0620c7));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f07025e));
       uAppCompatTe.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatTe);
       return relativeLayo;
    }
}
