package com.kuaishou.ax2c.layouts.X2C_Edit_Expand_Fold_Help_View;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import android.graphics.Typeface;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;

public class X2C_Edit_Expand_Fold_Help_View implements IViewCreator	// class@0010a3
{

    public void X2C_Edit_Expand_Fold_Help_View(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, (int)TypedValue.applyDimension(1, 50.00f, c.c(resources))));
       View view = new View(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -1);
       view.setId(R.id.fill_view);
       layoutParams.addRule(12, -1);
       view.setLayoutParams(layoutParams);
       relativeLayo.addView(view);
       RelativeLayout relativeLayo1 = new RelativeLayout(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-1, -1);
       relativeLayo1.setId(R.id.updown_layout);
       layoutParams.addRule(14, -1);
       layoutParams.addRule(15, -1);
       relativeLayo1.setLayoutParams(layoutParams);
       relativeLayo.addView(relativeLayo1);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(relativeLayo1.getContext());
       RelativeLayout$LayoutParams layoutParams1 = new RelativeLayout$LayoutParams(-2, -2);
       uAppCompatTe.setId(R.id.edit_expand_title);
       layoutParams1.addRule(13, -1);
       uAppCompatTe.setTypeface(null, 1);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f0601cb));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f73));
       uAppCompatTe.setLayoutParams(layoutParams1);
       relativeLayo1.addView(uAppCompatTe);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(relativeLayo1.getContext());
       layoutParams1 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 40.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 40.00f, c.c(resources)));
       uAppCompatIm.setId(R.id.left_btn);
       layoutParams1.leftMargin = c.b(resources, 0x7f07034b);
       layoutParams1.bottomMargin = c.b(resources, 0x7f070329);
       layoutParams1.topMargin = c.b(resources, 0x7f070329);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f080839);
       uAppCompatIm.setLayoutParams(layoutParams1);
       relativeLayo1.addView(uAppCompatIm);
       uAppCompatIm = new AppCompatImageView(relativeLayo1.getContext());
       layoutParams1 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 40.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 40.00f, c.c(resources)));
       uAppCompatIm.setId(R.id.right_btn);
       layoutParams1.addRule(11, -1);
       layoutParams1.rightMargin = c.b(resources, 0x7f070267);
       layoutParams1.bottomMargin = c.b(resources, 0x7f070329);
       layoutParams1.topMargin = c.b(resources, 0x7f070329);
       uAppCompatIm.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f080802);
       uAppCompatIm.setLayoutParams(layoutParams1);
       relativeLayo1.addView(uAppCompatIm);
       return relativeLayo;
    }
}
