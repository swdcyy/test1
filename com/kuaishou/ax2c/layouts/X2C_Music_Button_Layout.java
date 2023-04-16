package com.kuaishou.ax2c.layouts.X2C_Music_Button_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.EditSpectrumView;
import android.widget.FrameLayout$LayoutParams;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import com.yxcorp.gifshow.v3.widget.FadingEdgeMarqueeTextView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

public class X2C_Music_Button_Layout implements IViewCreator	// class@001118
{

    public void X2C_Music_Button_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.music_button_container);
       uFrameLayout.setBackgroundResource(R.drawable.arg_RES_7f0808c3);
       uFrameLayout.setVisibility(8);
       uFrameLayout.setPadding((int)TypedValue.applyDimension(1, 8.00f, c.c(resources)), 0, (int)TypedValue.applyDimension(1, 8.00f, c.c(resources)), 0);
       uFrameLayout.setLayoutParams(new RelativeLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 24.00f, c.c(resources))));
       EditSpectrumView uEditSpectru = new EditSpectrumView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 11.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 11.00f, c.c(resources)));
       uEditSpectru.setId(R.id.spectrum);
       layoutParams.gravity = 16;
       uEditSpectru.setSpectrumViewBarNum(4);
       uEditSpectru.setSpectrumViewBarRadius((int)TypedValue.applyDimension(1, 0x3f800000, c.c(resources)));
       uEditSpectru.setSpectrumViewBarWidth((int)TypedValue.applyDimension(1, 0x3fc00000, c.c(resources)));
       uEditSpectru.setSpectrumViewColor(resources.getColor(R.color.arg_RES_7f061c32));
       uEditSpectru.setSpectrumViewFrequence(50);
       uEditSpectru.setLayoutParams(layoutParams);
       uFrameLayout.addView(uEditSpectru);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(uFrameLayout.getContext());
       layoutParams = new FrameLayout$LayoutParams((int)TypedValue.applyDimension(1, 11.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 11.00f, c.c(resources)));
       uAppCompatIm.setId(R.id.spectrum_static);
       layoutParams.gravity = 16;
       uAppCompatIm.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       uAppCompatIm.setImageResource(R.drawable.arg_RES_7f082048);
       uAppCompatIm.setVisibility(8);
       uAppCompatIm.setLayoutParams(layoutParams);
       uFrameLayout.addView(uAppCompatIm);
       FadingEdgeMarqueeTextView uFadingEdgeM = new FadingEdgeMarqueeTextView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(-2, (int)TypedValue.applyDimension(1, 14.00f, c.c(resources)));
       uFadingEdgeM.setId(R.id.music_name);
       layoutParams1.gravity = 16;
       layoutParams1.setMarginStart((int)TypedValue.applyDimension(1, 15.00f, c.c(resources)));
       uFadingEdgeM.setGravity(17);
       uFadingEdgeM.setIncludeFontPadding(0);
       uFadingEdgeM.setMaxWidth(c.b(resources, R.dimen.arg_RES_7f07031d));
       uFadingEdgeM.setSingleLine(1);
       uFadingEdgeM.setTextColor(resources.getColor(R.color.arg_RES_7f06180d));
       uFadingEdgeM.setTextSize(0, (float)c.b(resources, R.dimen.arg_RES_7f07025d));
       uFadingEdgeM.setEnableFadingEdge(1);
       uFadingEdgeM.setLayoutParams(layoutParams1);
       uFrameLayout.addView(uFadingEdgeM);
       return uFrameLayout;
    }
}
