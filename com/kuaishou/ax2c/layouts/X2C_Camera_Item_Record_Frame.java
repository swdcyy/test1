package com.kuaishou.ax2c.layouts.X2C_Camera_Item_Record_Frame;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kwai.feature.post.api.flywheel.widget.FlyWheelFrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.textview.PressedDisableWithAlphaTextImageView;
import android.widget.FrameLayout$LayoutParams;
import cw9.c;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import android.content.res.ColorStateList;

public class X2C_Camera_Item_Record_Frame implements IViewCreator	// class@00109b
{

    public void X2C_Camera_Item_Record_Frame(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FlyWheelFrameLayout uFlyWheelFra = new FlyWheelFrameLayout(p0);
       uFlyWheelFra.setId(R.id.switch_frame_mode_layout);
       uFlyWheelFra.setVisibility(8);
       uFlyWheelFra.setTextViewId(R.id.switch_frame_mode_btn_v2);
       uFlyWheelFra.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
       PressedDisableWithAlphaTextImageView pressedDisab = new PressedDisableWithAlphaTextImageView(uFlyWheelFra.getContext());
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
       pressedDisab.setId(R.id.switch_frame_mode_btn_v2);
       pressedDisab.setText(R.string.arg_RES_7f10106b);
       pressedDisab.setImageHeight(c.b(resources, R.dimen.arg_RES_7f07012a));
       pressedDisab.setImageDrawable(R.drawable.arg_RES_7f081bcf);
       pressedDisab.setImageWidth(c.b(resources, R.dimen.arg_RES_7f07012a));
       pressedDisab.setLayoutParams(new FrameLayout$LayoutParams(-2, -2));
       uFlyWheelFra.addView(pressedDisab);
       return uFlyWheelFra;
    }
}
