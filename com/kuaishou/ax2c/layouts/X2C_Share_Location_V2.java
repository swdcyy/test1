package com.kuaishou.ax2c.layouts.X2C_Share_Location_V2;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.widget.LinearLayout$LayoutParams;
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
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class X2C_Share_Location_V2 implements IViewCreator	// class@001129
{

    public void X2C_Share_Location_V2(){
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
       linearLayout.setPadding(0, c.b(resources, R.dimen.arg_RES_7f07031b), 0, 0);
       linearLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(i, i));
       RelativeLayout relativeLayo = new RelativeLayout(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-1, c.b(resources, 0x7f070325));
       relativeLayo.setId(R.id.ll_location_container);
       layoutParams.leftMargin = c.b(resources, 0x7f070e70);
       layoutParams.rightMargin = c.b(resources, 0x7f070e71);
       relativeLayo.setLayoutParams(layoutParams);
       linearLayout.addView(relativeLayo);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(i, i);
       uAppCompatIm.setId(R.id.iv_location_right_arrow);
       int i2 = 11;
       layoutParams1.addRule(i2, -1);
       int i3 = 15;
       layoutParams1.addRule(i3, -1);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f081ba7);
       drawable = uAppCompatIm.getDrawable();
       int i4 = 0x7f061ea6;
       if (drawable != null) {
          drawable = a.r(drawable);
          a.n(drawable.mutate(), resources.getColor(i4));
          uAppCompatIm.setImageDrawable(drawable);
       }
       uAppCompatIm.setLayoutParams(layoutParams1);
       relativeLayo.addView(uAppCompatIm);
       LinearLayout linearLayout1 = new LinearLayout(relativeLayo.getContext());
       layoutParams1 = new RelativeLayout$LayoutParams(i, i);
       linearLayout1.setId(R.id.ll_location_result);
       layoutParams1.addRule(i2, -1);
       layoutParams1.addRule(i3, -1);
       linearLayout1.setGravity(16);
       linearLayout1.setOrientation(0);
       linearLayout1.setLayoutParams(layoutParams1);
       relativeLayo.addView(linearLayout1);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(linearLayout1.getContext());
       LinearLayout$LayoutParams layoutParams2 = new LinearLayout$LayoutParams(i, i);
       uAppCompatTe.setId(R.id.tv_location);
       layoutParams2.gravity = 5;
       uAppCompatTe.setMaxEms(8);
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe.setGravity(0x800005);
       uAppCompatTe.setMaxLines(i1);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061ea7));
       uAppCompatTe.setTextSize(2, 12.00f);
       uAppCompatTe.setLayoutParams(layoutParams2);
       linearLayout1.addView(uAppCompatTe);
       AppCompatImageView uAppCompatIm1 = new AppCompatImageView(linearLayout1.getContext());
       layoutParams2 = new LinearLayout$LayoutParams(i, i);
       uAppCompatIm1.setId(R.id.iv_location_clear);
       uAppCompatIm1.setImageResource(R.drawable.arg_RES_7f081ff5);
       Drawable drawable1 = uAppCompatIm1.getDrawable();
       if (drawable1 != null) {
          drawable1 = a.r(drawable1);
          a.n(drawable1.mutate(), resources.getColor(i4));
          uAppCompatIm1.setImageDrawable(drawable1);
       }
       uAppCompatIm1.setLayoutParams(layoutParams2);
       linearLayout1.addView(uAppCompatIm1);
       AppCompatTextView uAppCompatTe1 = new AppCompatTextView(relativeLayo.getContext());
       layoutParams1 = new RelativeLayout$LayoutParams(i, i);
       uAppCompatTe1.setId(R.id.tv_location_title);
       layoutParams1.addRule(i3, -1);
       layoutParams1.rightMargin = (int)TypedValue.applyDimension(i1, 20.00f, c.c(resources));
       uAppCompatTe1.setCompoundDrawablePadding(c.b(resources, R.dimen.arg_RES_7f07034b));
       uAppCompatTe1.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe1.setSingleLine(i1);
       uAppCompatTe1.setText(R.string.user_location);
       uAppCompatTe1.setTextColor(resources.getColor(R.color.arg_RES_7f061f94));
       uAppCompatTe1.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f72));
       Drawable[] compoundDraw = uAppCompatTe1.getCompoundDrawables();
       uAppCompatTe1.setCompoundDrawablesWithIntrinsicBounds(a.d(uContext, R.drawable.common_base_location_24), compoundDraw[i1], compoundDraw[2], compoundDraw[3]);
       Drawable[] compoundDraw1 = uAppCompatTe1.getCompoundDrawables();
       i2 = 0;
       while (i2 < 4) {
          if (compoundDraw1[i2] != null) {
             compoundDraw1[i2] = a.r(compoundDraw1[i2]);
             a.n(compoundDraw1[i2].mutate(), resources.getColor(R.color.arg_RES_7f061ea7));
          }else {
             i4 = 0x7f061ea7;
          }
          i2 = i2 + 1;
       }
       uAppCompatTe1.setCompoundDrawablesWithIntrinsicBounds(compoundDraw1[0], compoundDraw1[i1], compoundDraw1[2], compoundDraw1[3]);
       uAppCompatTe1.setLayoutParams(layoutParams1);
       relativeLayo.addView(uAppCompatTe1);
       CustomRecyclerView uCustomRecyc = new CustomRecyclerView(linearLayout.getContext());
       uCustomRecyc.setId(R.id.location_recyclerview);
       uCustomRecyc.setClipToPadding(0);
       uCustomRecyc.setVisibility(8);
       uCustomRecyc.setPadding(0, 0, 0, c.b(resources, R.dimen.arg_RES_7f070295));
       uCustomRecyc.setLayoutParams(new LinearLayout$LayoutParams(-1, i));
       linearLayout.addView(uCustomRecyc);
       return linearLayout;
    }
}
