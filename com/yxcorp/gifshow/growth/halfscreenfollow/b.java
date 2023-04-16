package com.yxcorp.gifshow.growth.halfscreenfollow.b;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class b implements PopupInterface$b	// class@001386
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final Animator a(View p0){
       float[] uofloatArray = new float[]{(float)p0.getMeasuredHeight()};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
       objectAnimat.setDuration(250).setInterpolator(new AccelerateDecelerateInterpolator());
       return objectAnimat;
    }
}
