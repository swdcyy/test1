package com.kuaishou.ax2c.layouts.X2C_Share_Publish_Button_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kwai.feature.post.api.flywheel.widget.FlyWheelConstraintLayout;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import com.yxcorp.gifshow.album.widget.SizeAdjustableTextView;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;

public class X2C_Share_Publish_Button_Layout implements IViewCreator	// class@00112f
{

    public void X2C_Share_Publish_Button_Layout(){
       super();
    }
    public View createView(Context p0){
       Context uContext = p0;
       Resources resources = p0.getResources();
       FlyWheelConstraintLayout uFlyWheelCon = new FlyWheelConstraintLayout(uContext);
       uFlyWheelCon.setId(R.id.publish_button_container);
       uFlyWheelCon.setTextViewId(R.id.publish_button);
       uFlyWheelCon.setTKContainerId(R.id.fly_wheel_publish_tk_container);
       uFlyWheelCon.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -2));
       AppCompatButton uAppCompatBu = new AppCompatButton(uFlyWheelCon.getContext(), null, 0);
       ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams((int)TypedValue.applyDimension(1, 0, c.c(resources)), c.b(resources, 0x7f07010a));
       uAppCompatBu.setBackgroundResource(R.drawable.arg_RES_7f0801be);
       uAppCompatBu.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070117));
       uAppCompatBu.setMaxLines(1);
       uAppCompatBu.setGravity(17);
       uAppCompatBu.setTextColor(resources.getColor(R.color.arg_RES_7f061fbd));
       uAppCompatBu.setId(R.id.publish_button);
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 9.00f, c.c(resources));
       uAppCompatBu.setText(R.string.arg_RES_7f10400f);
       layoutParams.d = 0;
       layoutParams.g = 0;
       layoutParams.h = 0;
       layoutParams.O = 0x3f333333;
       layoutParams.c();
       uAppCompatBu.setLayoutParams(layoutParams);
       uFlyWheelCon.addView(uAppCompatBu);
       RelativeLayout relativeLayo = new RelativeLayout(uFlyWheelCon.getContext());
       ConstraintLayout$LayoutParams layoutParams1 = new ConstraintLayout$LayoutParams(-2, -2);
       relativeLayo.setId(R.id.text_icon_contain);
       layoutParams1.topMargin = (int)TypedValue.applyDimension(1, 9.00f, c.c(resources));
       layoutParams1.d = 0;
       layoutParams1.g = 0;
       layoutParams1.h = 0;
       layoutParams1.k = 0;
       layoutParams1.c();
       relativeLayo.setLayoutParams(layoutParams1);
       uFlyWheelCon.addView(relativeLayo);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams2 = new RelativeLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 56.00f, c.c(resources)));
       uAppCompatTe.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070117));
       uAppCompatTe.setMaxLines(1);
       uAppCompatTe.setGravity(17);
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061fbd));
       uAppCompatTe.setId(R.id.publish_button_text);
       uAppCompatTe.setBackgroundColor(resources.getColor(R.color.arg_RES_7f062057));
       layoutParams2.addRule(14, -1);
       layoutParams2.addRule(9, -1);
       uAppCompatTe.setVisibility(4);
       uAppCompatTe.setLayoutParams(layoutParams2);
       relativeLayo.addView(uAppCompatTe);
       KwaiImageView kwaiImageVie = new KwaiImageView(relativeLayo.getContext());
       layoutParams2 = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 22.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 22.00f, c.c(resources)));
       kwaiImageVie.setId(R.id.publish_button_icon);
       kwaiImageVie.setBackgroundColor(resources.getColor(R.color.arg_RES_7f062057));
       kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_XY);
       layoutParams2.addRule(14, -1);
       layoutParams2.addRule(15, -1);
       layoutParams2.addRule(1, R.id.publish_button_text);
       layoutParams2.leftMargin = (int)TypedValue.applyDimension(1, 3.00f, c.c(resources));
       kwaiImageVie.setVisibility(4);
       kwaiImageVie.setLayoutParams(layoutParams2);
       relativeLayo.addView(kwaiImageVie);
       ConstraintLayout uConstraintL = new ConstraintLayout(uFlyWheelCon.getContext());
       ConstraintLayout$LayoutParams layoutParams3 = new ConstraintLayout$LayoutParams((int)TypedValue.applyDimension(1, 0, c.c(resources)), (int)TypedValue.applyDimension(1, 0, c.c(resources)));
       uConstraintL.setId(R.id.fly_wheel_publish_tk_container);
       layoutParams3.k = 0;
       layoutParams3.d = 0;
       layoutParams3.g = 0;
       layoutParams3.h = 0;
       layoutParams3.c();
       uConstraintL.setLayoutParams(layoutParams3);
       uFlyWheelCon.addView(uConstraintL);
       SizeAdjustableTextView sizeAdjustab = new SizeAdjustableTextView(uFlyWheelCon.getContext());
       layoutParams3 = new ConstraintLayout$LayoutParams(-2, -2);
       sizeAdjustab.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070117));
       sizeAdjustab.setInitTextSize(TypedValue.applyDimension(0, (float)c.b(resources, R.dimen.arg_RES_7f070117), c.c(resources)));
       sizeAdjustab.setMaxLines(1);
       sizeAdjustab.setGravity(17);
       sizeAdjustab.setTextColor(resources.getColor(R.color.arg_RES_7f061fbd));
       sizeAdjustab.setId(R.id.publish_in_one_day);
       sizeAdjustab.setBackgroundColor(resources.getColor(R.color.arg_RES_7f062057));
       sizeAdjustab.setText(R.string.arg_RES_7f104cff);
       sizeAdjustab.setCompoundDrawablePadding(c.b(resources, R.dimen.arg_RES_7f0702e3));
       sizeAdjustab.setTextSizeAdjustable(false);
       layoutParams3.topMargin = (int)TypedValue.applyDimension(1, 9.00f, c.c(resources));
       layoutParams3.d = 0;
       layoutParams3.g = 0;
       layoutParams3.h = 0;
       layoutParams3.k = 0;
       sizeAdjustab.setVisibility(4);
       sizeAdjustab.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(uContext, R.drawable.arg_RES_7f081ba9), null, null, null);
       layoutParams3.c();
       sizeAdjustab.setLayoutParams(layoutParams3);
       uFlyWheelCon.addView(sizeAdjustab);
       return uFlyWheelCon;
    }
}