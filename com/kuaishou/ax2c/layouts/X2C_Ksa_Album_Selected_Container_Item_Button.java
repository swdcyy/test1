package com.kuaishou.ax2c.layouts.X2C_Ksa_Album_Selected_Container_Item_Button;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import android.graphics.Typeface;

public class X2C_Ksa_Album_Selected_Container_Item_Button implements IViewCreator	// class@0010b3
{

    public void X2C_Ksa_Album_Selected_Container_Item_Button(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setClipToPadding(false);
       relativeLayo.setClipChildren(false);
       relativeLayo.setLayoutParams(new RelativeLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f070500), c.b(resources, R.dimen.arg_RES_7f0704fd)));
       RelativeLayout relativeLayo1 = new RelativeLayout(relativeLayo.getContext());
       relativeLayo1.setId(R.id.button_background_layout);
       relativeLayo1.setBackgroundResource(R.drawable.arg_RES_7f080f86);
       relativeLayo1.setLayoutParams(new RelativeLayout$LayoutParams(-1, -1));
       relativeLayo.addView(relativeLayo1);
       ImageView imageView = new ImageView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 0x41f00000, c.c(resources)), (int)TypedValue.applyDimension(1, 0x41f00000, c.c(resources)));
       imageView.setId(R.id.im_button);
       layoutParams.leftMargin = (int)TypedValue.applyDimension(1, 82.00f, c.c(resources));
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 14.00f, c.c(resources));
       imageView.setImageResource(R.drawable.arg_RES_7f080fd1);
       imageView.setLayoutParams(layoutParams);
       relativeLayo.addView(imageView);
       TextView textView = new TextView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       textView.setId(R.id.tv_button);
       layoutParams.leftMargin = (int)TypedValue.applyDimension(1, 82.00f, c.c(resources));
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 43.00f, c.c(resources));
       textView.setGravity(17);
       textView.setIncludeFontPadding(false);
       textView.setTypeface(null, 1);
       textView.setMaxLines(1);
       textView.setText(R.string.arg_RES_7f1018a0);
       textView.setTextColor(resources.getColor(R.color.arg_RES_7f060b52));
       textView.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f0704a7));
       textView.setLayoutParams(layoutParams);
       relativeLayo.addView(textView);
       return relativeLayo;
    }
}
