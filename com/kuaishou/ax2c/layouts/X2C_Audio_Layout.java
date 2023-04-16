package com.kuaishou.ax2c.layouts.X2C_Audio_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.yxcorp.gifshow.widget.record.PressedDisableLinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout$LayoutParams;
import com.yxcorp.gifshow.widget.PressedImageView;
import android.widget.FrameLayout$LayoutParams;
import cw9.c;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.cdn.KwaiLottieAnimationView;
import android.widget.ImageView$ScaleType;
import com.yxcorp.gifshow.widget.textview.PressedDisableWithAlphaTextImageView;
import android.widget.TextView;
import android.text.TextUtils$TruncateAt;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public class X2C_Audio_Layout implements IViewCreator	// class@00108b
{

    public void X2C_Audio_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       PressedDisableLinearLayout pressedDisab = new PressedDisableLinearLayout(p0);
       pressedDisab.setId(R.id.record_audio_btn);
       pressedDisab.setGravity(1);
       pressedDisab.setOrientation(1);
       pressedDisab.setVisibility(8);
       pressedDisab.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
       FrameLayout uFrameLayout = new FrameLayout(pressedDisab.getContext());
       uFrameLayout.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
       pressedDisab.addView(uFrameLayout);
       PressedImageView pressedImage = new PressedImageView(uFrameLayout.getContext());
       pressedImage.setId(R.id.record_audio_icon);
       pressedImage.setImageResource(R.drawable.arg_RES_7f081dfd);
       pressedImage.setDisableAlpha(0.40f);
       pressedImage.setPressedAlpha(0.40f);
       pressedImage.setLayoutParams(new FrameLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f07012a), c.b(resources, R.dimen.arg_RES_7f07012a)));
       uFrameLayout.addView(pressedImage);
       KwaiLottieAnimationView kwaiLottieAn = new KwaiLottieAnimationView(uFrameLayout.getContext());
       kwaiLottieAn.setId(R.id.record_audio_icon_anim_view);
       kwaiLottieAn.setVisibility(8);
       kwaiLottieAn.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       kwaiLottieAn.setLayoutParams(new FrameLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f07030d), c.b(resources, R.dimen.arg_RES_7f07030d)));
       uFrameLayout.addView(kwaiLottieAn);
       PressedDisableWithAlphaTextImageView pressedDisab1 = new PressedDisableWithAlphaTextImageView(pressedDisab.getContext());
       pressedDisab1.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f070f6d));
       pressedDisab1.setEllipsize(TextUtils$TruncateAt.END);
       pressedDisab1.setImageHorizontalCenter(1);
       pressedDisab1.setShadowLayer(0x3f800000, pressedDisab1.getShadowDx(), pressedDisab1.getShadowDy(), pressedDisab1.getShadowColor());
       pressedDisab1.setMaxLines(1);
       pressedDisab1.setShadowLayer(pressedDisab1.getShadowRadius(), 3.00f, pressedDisab1.getShadowDy(), pressedDisab1.getShadowColor());
       pressedDisab1.setShadowLayer(pressedDisab1.getShadowRadius(), pressedDisab1.getShadowDx(), 3.00f, pressedDisab1.getShadowColor());
       pressedDisab1.setGravity(1);
       pressedDisab1.setShadowLayer(pressedDisab1.getShadowRadius(), pressedDisab1.getShadowDx(), pressedDisab1.getShadowDy(), resources.getColor(R.color.arg_RES_7f06010e));
       pressedDisab1.setTextColor(resources.getColorStateList(R.drawable.arg_RES_7f08044f));
       pressedDisab1.setBackgroundDrawable(null);
       pressedDisab1.setText(R.string.arg_RES_7f100481);
       pressedDisab1.setDisableAlpha(0.40f);
       pressedDisab1.setPressedAlpha(0.40f);
       int i = c.b(resources, R.dimen.arg_RES_7f070129);
       int i1 = c.b(resources, R.dimen.arg_RES_7f070129);
       int i2 = c.b(resources, R.dimen.arg_RES_7f070129);
       pressedDisab1.setPadding(i, i1, i2, c.b(resources, R.dimen.arg_RES_7f070129));
       pressedDisab1.setLayoutParams(new LinearLayout$LayoutParams(-2, -2));
       pressedDisab.addView(pressedDisab1);
       return pressedDisab;
    }
}
