package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Bottom_Bar_Wish_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout$LayoutParams;
import cw9.c;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import android.widget.FrameLayout$LayoutParams;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.TextView;
import java.lang.CharSequence;
import android.graphics.Typeface;

public class X2C_Live_Audience_Bottom_Bar_Wish_Layout implements IViewCreator	// class@0010d6
{

    public void X2C_Live_Audience_Bottom_Bar_Wish_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setClipChildren(false);
       linearLayout.setClipToPadding(false);
       linearLayout.setOrientation(false);
       linearLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
       FrameLayout uFrameLayout = new FrameLayout(linearLayout.getContext());
       uFrameLayout.setClipChildren(false);
       uFrameLayout.setClipToPadding(false);
       uFrameLayout.setLayoutParams(new LinearLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f07033b), c.b(resources, R.dimen.arg_RES_7f0702fe)));
       linearLayout.addView(uFrameLayout);
       LiveLottieAnimationView liveLottieAn = new LiveLottieAnimationView(uFrameLayout.getContext());
       liveLottieAn.setId(R.id.live_audience_bottom_bar_wish_lottie_view);
       liveLottieAn.setAutoPlay(true);
       liveLottieAn.q(true);
       liveLottieAn.setRepeatCount(-1);
       liveLottieAn.setLayoutParams(new FrameLayout$LayoutParams(c.b(resources, R.dimen.arg_RES_7f07033b), c.b(resources, R.dimen.arg_RES_7f0702fe)));
       uFrameLayout.addView(liveLottieAn);
       AppCompatTextView uAppCompatTe = new AppCompatTextView(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
       layoutParams.gravity = 21;
       layoutParams.rightMargin = c.b(resources, 0x7f07025d);
       uAppCompatTe.setIncludeFontPadding(false);
       uAppCompatTe.setText("ะํิธ");
       uAppCompatTe.setTextColor(resources.getColor(R.color.arg_RES_7f061fda));
       uAppCompatTe.setTextSize(false, (float)c.b(resources, R.dimen.arg_RES_7f070283));
       uAppCompatTe.setTypeface(null, true);
       uAppCompatTe.setLayoutParams(layoutParams);
       uFrameLayout.addView(uAppCompatTe);
       return linearLayout;
    }
}
