package com.kuaishou.ax2c.layouts.X2C_Ksa_Album_Main_Fragment_Tab;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import android.widget.TextView;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class X2C_Ksa_Album_Main_Fragment_Tab implements IViewCreator	// class@0010b1
{

    public void X2C_Ksa_Album_Main_Fragment_Tab(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setOrientation(0);
       linearLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, (int)TypedValue.applyDimension(1, 50.00f, c.c(resources))));
       LinearLayout linearLayout1 = new LinearLayout(linearLayout.getContext());
       linearLayout1.setId(R.id.title_tv_wrapper);
       linearLayout1.setLayoutParams(new LinearLayout$LayoutParams(-2, c.b(resources, R.dimen.arg_RES_7f070517)));
       linearLayout.addView(linearLayout1);
       SizeAdjustableTextView sizeAdjustab = new SizeAdjustableTextView(linearLayout1.getContext());
       sizeAdjustab.setId(R.id.tab_text);
       sizeAdjustab.setMaxWidth((int)TypedValue.applyDimension(1, 180.00f, c.c(resources)));
       sizeAdjustab.setTextColor(resources.getColor(R.color.arg_RES_7f060b41));
       sizeAdjustab.setText(R.string.arg_RES_7f101895);
       sizeAdjustab.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f0704c9));
       sizeAdjustab.setInitTextSize(TypedValue.applyDimension(0, (float)c.b(resources, R.dimen.arg_RES_7f0704c9), c.c(resources)));
       sizeAdjustab.setTypeface(null, 1);
       sizeAdjustab.setBackgroundDrawable(null);
       sizeAdjustab.setGravity(17);
       sizeAdjustab.setSingleLine(1);
       sizeAdjustab.setTextSizeAdjustable(1);
       sizeAdjustab.setLayoutParams(new LinearLayout$LayoutParams(-2, c.b(resources, R.dimen.arg_RES_7f070517)));
       linearLayout1.addView(sizeAdjustab);
       ImageView imageView = new ImageView(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(c.b(resources, 0x7f0704c3), c.b(resources, 0x7f0704be));
       imageView.setId(R.id.album_indicator);
       layoutParams.leftMargin = c.b(resources, 0x7f0704ea);
       imageView.setClickable(0);
       layoutParams.gravity = 16;
       imageView.setImageResource(R.drawable.arg_RES_7f080ab3);
       imageView.setLayoutParams(layoutParams);
       linearLayout.addView(imageView);
       return linearLayout;
    }
}
