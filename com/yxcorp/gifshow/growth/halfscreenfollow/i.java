package com.yxcorp.gifshow.growth.halfscreenfollow.i;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class i implements PopupInterface$b	// class@00138f
{
    public static final i a;

    static {
       i.a = new i();
    }
    public void i(){
       super();
    }
    public final Animator a(View p0){
       float[] uofloatArray = new float[]{(float)p0.getMeasuredHeight(),0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
       objectAnimat.setDuration(250).setInterpolator(new AccelerateDecelerateInterpolator());
       return objectAnimat;
    }
}
