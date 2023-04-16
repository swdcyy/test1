package com.kuaishou.ax2c.layouts.X2C_Share_Connect_Hot;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.widget.LinearLayout$LayoutParams;
import cw9.c;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import r0.a;

public class X2C_Share_Connect_Hot implements IViewCreator	// class@001125
{

    public void X2C_Share_Connect_Hot(){
       super();
    }
    public View createView(Context p0){
       Drawable drawable;
       Context uContext = p0;
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(uContext);
       int i = -2;
       int i1 = 1;
       linearLayout.setOrientation(i1);
       linearLayout.setLayoutParams(new FrameLayout$LayoutParams(i, i));
       RelativeLayout relativeLayo = new RelativeLayout(linearLayout.getContext());
       int i2 = -1;
       relativeLayo.setLayoutParams(new LinearLayout$LayoutParams(i2, c.b(resources, R.dimen.arg_RES_7f070e6d)));
       linearLayout.addView(relativeLayo);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(i, i);
       int i3 = 0x7f0a1514;
       uAppCompatIm.setId(i3);
       int i4 = 11;
       layoutParams.addRule(i4, i2);
       int i5 = 15;
       layoutParams.addRule(i5, i2);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f081ba7);
       drawable = uAppCompatIm.getDrawable();
       int i6 = 0x7f061ea6;
       if (drawable != null) {
          drawable = a.r(drawable);
          a.n(drawable.mutate(), resources.getColor(i6));
          uAppCompatIm.setImageDrawable(drawable);
       }
       uAppCompatIm.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatIm);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(i, i);
       uAppCompatTe.setId(R.id.tv_share_connect_hot_tip);
       uAppCompatTe.setGravity(5);
       layoutParams.addRule(i5, i2);
       layoutParams.addRule(0, i3);
       uAppCompatTe.setText(R.string.arg_RES_7f103d93);
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f6e));
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0607e8));
       int i7 = 8;
       uAppCompatTe.setVisibility(i7);
       uAppCompatTe.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatTe);
       LinearLayout linearLayout1 = new LinearLayout(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(i, i);
       linearLayout1.setId(R.id.ll_connect_hot_result);
       layoutParams.addRule(i4, i2);
       layoutParams.addRule(i5, i2);
       linearLayout1.setGravity(16);
       linearLayout1.setOrientation(0);
       linearLayout1.setVisibility(i7);
       linearLayout1.setLayoutParams(layoutParams);
       relativeLayo.addView(linearLayout1);
       AppCompatTextView uAppCompatTe1 = new AppCompatTextView(linearLayout1.getContext());
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(i, i);
       uAppCompatTe1.setId(R.id.tv_connect_hot);
       layoutParams1.gravity = 5;
       uAppCompatTe1.setMaxEms(i7);
       uAppCompatTe1.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe1.setGravity(0x800005);
       uAppCompatTe1.setMaxLines(i1);
       uAppCompatTe1.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f6e));
       uAppCompatTe1.setTextColor(resources.getColor(R.color.arg_RES_7f061ea7));
       uAppCompatTe1.setLayoutParams(layoutParams1);
       linearLayout1.addView(uAppCompatTe1);
       AppCompatImageView uAppCompatIm1 = new AppCompatImageView(linearLayout1.getContext());
       layoutParams1 = new LinearLayout$LayoutParams(i, i);
       uAppCompatIm1.setId(R.id.iv_connect_hot_clear);
       uAppCompatIm1.setImageResource(R.drawable.arg_RES_7f081ff5);
       drawable = uAppCompatIm1.getDrawable();
       if (drawable != null) {
          drawable = a.r(drawable);
          a.n(drawable.mutate(), resources.getColor(R.color.arg_RES_7f061ea6));
          uAppCompatIm1.setImageDrawable(drawable);
       }
       uAppCompatIm1.setLayoutParams(layoutParams1);
       linearLayout1.addView(uAppCompatIm1);
       uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(i, i);
       uAppCompatTe.setId(R.id.tv_connect_hot_title);
       layoutParams.addRule(i5, i2);
       layoutParams.rightMargin = (int)TypedValue.applyDimension(i1, 20.00f, c.c(resources));
       uAppCompatTe.setCompoundDrawablePadding(c.b(resources, R.dimen.arg_RES_7f07034b));
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe.setSingleLine(i1);
       uAppCompatTe.setText(R.string.arg_RES_7f103de1);
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f72));
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061f94));
       Drawable[] compoundDraw = uAppCompatTe.getCompoundDrawables();
       uAppCompatTe.setCompoundDrawablesWithIntrinsicBounds(a.d(uContext, R.drawable.arg_RES_7f080536), compoundDraw[i1], compoundDraw[2], compoundDraw[3]);
       Drawable[] compoundDraw1 = uAppCompatTe.getCompoundDrawables();
       i = 0;
       while (i < 4) {
          if (compoundDraw1[i] != null) {
             compoundDraw1[i] = a.r(compoundDraw1[i]);
             a.n(compoundDraw1[i].mutate(), resources.getColor(R.color.arg_RES_7f061ea7));
          }
          i = i + 1;
       }
       uAppCompatTe.setCompoundDrawablesWithIntrinsicBounds(compoundDraw1[0], compoundDraw1[i1], compoundDraw1[2], compoundDraw1[3]);
       uAppCompatTe.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatTe);
       return linearLayout;
    }
}
