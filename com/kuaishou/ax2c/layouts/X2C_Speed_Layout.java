package com.kuaishou.ax2c.layouts.X2C_Speed_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.yxcorp.gifshow.widget.textview.PressedDisableWithAlphaTextImageView;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;

public class X2C_Speed_Layout implements IViewCreator	// class@001139
{

    public void X2C_Speed_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       PressedDisableWithAlphaTextImageView pressedDisab = new PressedDisableWithAlphaTextImageView(p0);
       pressedDisab.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f6d));
       pressedDisab.setEllipsize(TextUtils$TruncateAt.END);
       pressedDisab.setImageHorizontalCenter(true);
       pressedDisab.setShadowLayer(0x3f800000, pressedDisab.getShadowDx(), pressedDisab.getShadowDy(), pressedDisab.getShadowColor());
       pressedDisab.setMaxLines(true);
       pressedDisab.setShadowLayer(pressedDisab.getShadowRadius(), 3.00f, pressedDisab.getShadowDy(), pressedDisab.getShadowColor());
       pressedDisab.setShadowLayer(pressedDisab.getShadowRadius(), pressedDisab.getShadowDx(), 3.00f, pressedDisab.getShadowColor());
       pressedDisab.setGravity(true);
       pressedDisab.setShadowLayer(pressedDisab.getShadowRadius(), pressedDisab.getShadowDx(), pressedDisab.getShadowDy(), resources.getColor(R.color.arg_RES_7f06010e));
       pressedDisab.setTextColor(resources.getColorStateList(R.drawable.arg_RES_7f08044f));
       pressedDisab.setId(R.id.button_speed);
       pressedDisab.setBackgroundDrawable(null);
       pressedDisab.setText(R.string.arg_RES_7f10048c);
       pressedDisab.setImageDrawable(R.drawable.arg_RES_7f08044b);
       pressedDisab.setImageHeight(c.b(resources, R.dimen.arg_RES_7f07012a));
       pressedDisab.setImageWidth(c.b(resources, R.dimen.arg_RES_7f07012a));
       int i = c.b(resources, R.dimen.arg_RES_7f070129);
       int i1 = c.b(resources, R.dimen.arg_RES_7f070129);
       int i2 = c.b(resources, R.dimen.arg_RES_7f070129);
       pressedDisab.setPadding(i, i1, i2, c.b(resources, R.dimen.arg_RES_7f070129));
       pressedDisab.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
       return pressedDisab;
    }
}