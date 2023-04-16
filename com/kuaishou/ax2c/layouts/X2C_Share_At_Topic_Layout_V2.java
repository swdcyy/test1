package com.kuaishou.ax2c.layouts.X2C_Share_At_Topic_Layout_V2;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import android.widget.FrameLayout$LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.Typeface;
import android.widget.TextView;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.a;
import androidx.core.content.ContextCompat;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.widget.FrameLayout;

public class X2C_Share_At_Topic_Layout_V2 implements IViewCreator	// class@001122
{

    public void X2C_Share_At_Topic_Layout_V2(){
       super();
    }
    public View createView(Context p0){
       Context uContext = p0;
       Resources resources = p0.getResources();
       HorizontalScrollView horizontalSc = new HorizontalScrollView(uContext);
       int i = 1;
       int i1 = 0x7f0702f8;
       horizontalSc.setVerticalScrollBarEnabled(false);
       horizontalSc.setHorizontalScrollBarEnabled(false);
       horizontalSc.setLayoutParams(new ConstraintLayout$LayoutParams((int)TypedValue.applyDimension(i, 0, c.c(resources)), c.b(resources, i1)));
       LinearLayout linearLayout = new LinearLayout(horizontalSc.getContext());
       linearLayout.setId(R.id.at_location_layout);
       linearLayout.setOrientation(false);
       linearLayout.setLayoutParams(new FrameLayout$LayoutParams(-1, c.b(resources, i1)));
       horizontalSc.addView(linearLayout);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(linearLayout.getContext());
       int i2 = -2;
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(i2, c.b(resources, i1));
       int i3 = 0x7f081fab;
       uAppCompatTe.setBackgroundResource(i3);
       uAppCompatTe.setTypeface(null, i);
       uAppCompatTe.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070f6f));
       uAppCompatTe.setSingleLine(i);
       uAppCompatTe.setGravity(16);
       uAppCompatTe.setCompoundDrawablePadding(c.b(resources, R.dimen.arg_RES_7f0702e3));
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061641));
       uAppCompatTe.setId(R.id.at_button);
       int i4 = 80;
       layoutParams.gravity = i4;
       uAppCompatTe.setText(R.string.arg_RES_7f1010c7);
       Drawable[] compoundDraw = uAppCompatTe.getCompoundDrawables();
       int i5 = 0;
       i1 = 0x7f061ea7;
       while (i5 < 4) {
          if (compoundDraw[i5] != null) {
             compoundDraw[i5] = a.r(compoundDraw[i5]);
             a.n(compoundDraw[i5].mutate(), resources.getColor(i1));
          }
          i5 = i5 + 1;
          object oobject = 16;
       }
       uAppCompatTe.setCompoundDrawablesWithIntrinsicBounds(compoundDraw[0], compoundDraw[i], compoundDraw[2], compoundDraw[3]);
       uAppCompatTe.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(uContext, R.drawable.arg_RES_7f081b9f), null, null, null);
       uAppCompatTe.setPadding(c.b(resources, R.dimen.arg_RES_7f07034b), false, c.b(resources, R.dimen.arg_RES_7f070271), false);
       uAppCompatTe.setLayoutParams(layoutParams);
       linearLayout.addView(uAppCompatTe);
       LinearLayout linearLayout1 = new LinearLayout(linearLayout.getContext());
       layoutParams = new LinearLayout$LayoutParams(i2, i2);
       linearLayout1.setId(R.id.topic_button);
       layoutParams.gravity = i4;
       layoutParams.leftMargin = (int)TypedValue.applyDimension(i, 10.00f, c.c(resources));
       linearLayout1.setBackgroundResource(i3);
       linearLayout1.setOrientation(false);
       linearLayout1.setPadding(c.b(resources, R.dimen.arg_RES_7f07034b), false, c.b(resources, R.dimen.arg_RES_7f070271), false);
       linearLayout1.setLayoutParams(layoutParams);
       linearLayout.addView(linearLayout1);
       KwaiLoadingView kwaiLoadingV = new KwaiLoadingView(linearLayout1.getContext());
       layoutParams = new LinearLayout$LayoutParams(i2, i2);
       kwaiLoadingV.setId(R.id.topic_button_loading);
       layoutParams.gravity = 16;
       layoutParams.rightMargin = c.b(resources, 0x7f07031b);
       kwaiLoadingV.setLoadingWidth(c.b(resources, R.dimen.arg_RES_7f0702b8));
       kwaiLoadingV.setLoadingHeight(c.b(resources, R.dimen.arg_RES_7f0702b8));
       kwaiLoadingV.setLayoutParams(layoutParams);
       linearLayout1.addView(kwaiLoadingV);
       AppCompatTextView uAppCompatTe1 = new AppCompatTextView(linearLayout1.getContext());
       layoutParams = new LinearLayout$LayoutParams(i2, c.b(resources, 0x7f0702f8));
       uAppCompatTe1.setId(R.id.topic_button_tv);
       uAppCompatTe1.setCompoundDrawablePadding(c.b(resources, R.dimen.arg_RES_7f0702e3));
       uAppCompatTe1.setGravity(16);
       uAppCompatTe1.setText(R.string.arg_RES_7f104d7d);
       uAppCompatTe1.setTextColor(resources.getColor(R.color.arg_RES_7f061641));
       uAppCompatTe1.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070f6f));
       uAppCompatTe1.setTypeface(null, i);
       uAppCompatTe1.setSingleLine(i);
       Drawable[] compoundDraw1 = uAppCompatTe1.getCompoundDrawables();
       i5 = 0;
       while (i5 < 4) {
          if (compoundDraw1[i5] != null) {
             compoundDraw1[i5] = a.r(compoundDraw1[i5]);
             a.n(compoundDraw1[i5].mutate(), resources.getColor(R.color.arg_RES_7f061ea7));
          }
          i5 = i5 + 1;
          i4 = 80;
       }
       uAppCompatTe1.setCompoundDrawablesWithIntrinsicBounds(compoundDraw1[0], compoundDraw1[i], compoundDraw1[2], compoundDraw1[3]);
       uAppCompatTe1.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(uContext, R.drawable.arg_RES_7f081bbe), null, null, null);
       uAppCompatTe1.setLayoutParams(layoutParams);
       linearLayout1.addView(uAppCompatTe1);
       uAppCompatTe1 = new AppCompatTextView(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams1 = new LinearLayout$LayoutParams(i2, c.b(resources, 0x7f0702f8));
       uAppCompatTe1.setBackgroundResource(R.drawable.arg_RES_7f081fab);
       uAppCompatTe1.setTypeface(null, i);
       uAppCompatTe1.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070f6f));
       uAppCompatTe1.setSingleLine(i);
       uAppCompatTe1.setGravity(16);
       uAppCompatTe1.setCompoundDrawablePadding(c.b(resources, R.dimen.arg_RES_7f0702e3));
       uAppCompatTe1.setTextColor(resources.getColor(R.color.arg_RES_7f061641));
       uAppCompatTe1.setId(R.id.copy_writing);
       layoutParams1.gravity = 80;
       layoutParams1.leftMargin = (int)TypedValue.applyDimension(i, 10.00f, c.c(resources));
       layoutParams1.rightMargin = c.b(resources, 0x7f070295);
       uAppCompatTe1.setText(R.string.arg_RES_7f10403b);
       uAppCompatTe1.setVisibility(8);
       Drawable[] compoundDraw2 = uAppCompatTe1.getCompoundDrawables();
       i3 = 0;
       object oobject1 = 4;
       while (i3 < oobject1) {
          if (compoundDraw2[i3] != null) {
             compoundDraw2[i3] = a.r(compoundDraw2[i3]);
             a.n(compoundDraw2[i3].mutate(), resources.getColor(R.color.arg_RES_7f061ea7));
          }else {
             int i6 = 0x7f061ea7;
          }
          i3 = i3 + 1;
       }
       uAppCompatTe1.setCompoundDrawablesWithIntrinsicBounds(compoundDraw2[0], compoundDraw2[i], compoundDraw2[2], compoundDraw2[3]);
       uAppCompatTe1.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(uContext, R.drawable.arg_RES_7f081ba2), null, null, null);
       uAppCompatTe1.setPadding(c.b(resources, R.dimen.arg_RES_7f07034b), false, c.b(resources, R.dimen.arg_RES_7f070271), false);
       uAppCompatTe1.setLayoutParams(layoutParams1);
       linearLayout.addView(uAppCompatTe1);
       return horizontalSc;
    }
}
