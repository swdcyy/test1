package com.kuaishou.ax2c.layouts.X2C_Live_Play_Top_Bar_Popup_Head_Right_Container_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import cw9.c;
import android.widget.TextView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.text.TextUtils$TruncateAt;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView;
import com.kwai.library.widget.recyclerview.CustomFadeEdgeRecyclerView;
import java.lang.Boolean;
import android.view.ViewGroup;
import android.widget.ImageView$ScaleType;

public class X2C_Live_Play_Top_Bar_Popup_Head_Right_Container_Layout implements IViewCreator	// class@00110f
{

    public void X2C_Live_Play_Top_Bar_Popup_Head_Right_Container_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setId(R.id.live_audience_top_bar_right_container);
       relativeLayo.setClipChildren(false);
       relativeLayo.setLayoutParams(new RelativeLayout$LayoutParams(-1, -2));
       AppCompatTextView uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, c.b(resources, 0x7f0702e8));
       uAppCompatTe.setId(R.id.live_audience_count_text);
       layoutParams.addRule(15, -1);
       layoutParams.leftMargin = (int)TypedValue.applyDimension(1, -2.00f, c.c(resources));
       layoutParams.addRule(false, R.id.live_close_place_holder);
       uAppCompatTe.setBackgroundResource(R.drawable.arg_RES_7f08022e);
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setMaxLines(1);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0607e1));
       uAppCompatTe.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070271));
       uAppCompatTe.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatTe);
       uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-2, c.b(resources, 0x7f0702e8));
       uAppCompatTe.setId(R.id.live_audience_grpr_count_text);
       layoutParams.addRule(15, -1);
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 2.50f, c.c(resources));
       layoutParams.addRule(false, R.id.live_close_place_holder);
       uAppCompatTe.setBackgroundResource(R.drawable.arg_RES_7f08022e);
       uAppCompatTe.setEllipsize(TextUtils$TruncateAt.END);
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setMaxLines(1);
       uAppCompatTe.setMinWidth((int)TypedValue.applyDimension(1, 40.00f, c.c(resources)));
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0607e1));
       uAppCompatTe.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070271));
       uAppCompatTe.setVisibility(8);
       uAppCompatTe.setPadding((int)TypedValue.applyDimension(1, 8.00f, c.c(resources)), false, (int)TypedValue.applyDimension(1, 8.00f, c.c(resources)), false);
       uAppCompatTe.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatTe);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 5.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 5.00f, c.c(resources)));
       uAppCompatIm.setId(R.id.live_audience_red_dot_view);
       layoutParams.addRule(7, R.id.live_audience_count_text);
       layoutParams.addRule(6, R.id.live_audience_count_text);
       layoutParams.rightMargin = (int)TypedValue.applyDimension(1, 4.00f, c.c(resources));
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 0xbf800000, c.c(resources));
       uAppCompatIm.setBackgroundResource(R.drawable.arg_RES_7f081440);
       uAppCompatIm.setVisibility(8);
       uAppCompatIm.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatIm);
       CustomFadeEdgeRecyclerView uCustomFadeE = new CustomFadeEdgeRecyclerView(relativeLayo.getContext(), null, null, Boolean.TRUE, Boolean.FALSE);
       layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       uAppCompatIm.setId(R.id.live_audience_recycler_view);
       layoutParams.addRule(15, -1);
       layoutParams.addRule(false, R.id.live_audience_count_text);
       uAppCompatIm.setClipChildren(false);
       uAppCompatIm.setFadingEdgeLength((int)TypedValue.applyDimension(1, 100.00f, c.c(resources)));
       uAppCompatIm.setOverScrollMode(2);
       uAppCompatIm.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatIm);
       uAppCompatIm = new AppCompatImageView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(c.b(resources, 0x7f0702cc), c.b(resources, 0x7f0702cc));
       uAppCompatIm.setId(R.id.live_close_place_holder);
       layoutParams1.addRule(11, -1);
       layoutParams1.addRule(15, -1);
       layoutParams1.leftMargin = c.b(resources, 0x7f0702e3);
       uAppCompatIm.setScaleType(ImageView$ScaleType.CENTER_CROP);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f081334);
       uAppCompatIm.setLayoutParams(layoutParams1);
       relativeLayo.addView(uAppCompatIm);
       return relativeLayo;
    }
}
