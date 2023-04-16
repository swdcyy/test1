package com.kuaishou.ax2c.layouts.X2C_Live_Top_Bar_Like_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.widget.LiveLottieAnimationView;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.widget.ImageView$ScaleType;
import android.widget.ProgressBar;
import android.view.ContextThemeWrapper;
import android.util.AttributeSet;
import android.os.Looper;
import java.lang.Thread;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Long;
import java.lang.Exception;
import com.kuaishou.live.common.core.component.like.widget.LiveLikeNewStyleTopBarTextView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.graphics.Typeface;

public class X2C_Live_Top_Bar_Like_Layout implements IViewCreator	// class@001114
{

    public void X2C_Live_Top_Bar_Like_Layout(){
       super();
    }
    public View createView(Context p0){
       long id;
       LiveLikeNewStyleTopBarTextView liveLikeNewS;
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(p0);
       relativeLayo.setId(R.id.live_like_top_bar_container);
       relativeLayo.setBackgroundResource(R.drawable.arg_RES_7f08023f);
       relativeLayo.setLayoutParams(new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 0, c.c(resources)), c.b(resources, R.dimen.arg_RES_7f070984)));
       LiveLottieAnimationView liveLottieAn = new LiveLottieAnimationView(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams((int)TypedValue.applyDimension(1, 50.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 50.00f, c.c(resources)));
       liveLottieAn.setId(R.id.live_like_top_bar_heart_lottie);
       layoutParams.addRule(10, -1);
       layoutParams.addRule(11, -1);
       layoutParams.addRule(12, -1);
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, -10.00f, c.c(resources));
       layoutParams.rightMargin = (int)TypedValue.applyDimension(1, -5.00f, c.c(resources));
       layoutParams.bottomMargin = (int)TypedValue.applyDimension(1, -10.00f, c.c(resources));
       liveLottieAn.setVisibility(8);
       liveLottieAn.setLayoutParams(layoutParams);
       relativeLayo.addView(liveLottieAn);
       AppCompatImageView uAppCompatIm = new AppCompatImageView(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(c.b(resources, 0x7f0702d6), c.b(resources, 0x7f0702d6));
       int i = 0x7f0a209d;
       uAppCompatIm.setId(i);
       layoutParams.addRule(21, -1);
       layoutParams.addRule(15, -1);
       layoutParams.rightMargin = c.b(resources, 0x7f070295);
       uAppCompatIm.setScaleType(ImageView$ScaleType.FIT_XY);
       uAppCompatIm.setVisibility(8);
       uAppCompatIm.setLayoutParams(layoutParams);
       relativeLayo.addView(uAppCompatIm);
       ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(relativeLayo.getContext(), 0x1010078), null, 0);
       id = Looper.getMainLooper().getThread().getId();
       if (id - Thread.currentThread().getId()) {
          try{
             Field declaredFiel = ProgressBar.class.getDeclaredField("mUiThreadId");
             declaredFiel.setAccessible(1);
             declaredFiel.set(progressBar, Long.valueOf(id));
          }catch(java.lang.Exception e2){
             e2.printStackTrace();
          }
       }
    }
}
