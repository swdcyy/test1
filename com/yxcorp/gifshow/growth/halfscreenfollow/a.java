package com.yxcorp.gifshow.growth.halfscreenfollow.a;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class a implements PopupInterface$b	// class@001385
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Animator a(View p0){
       float[] uofloatArray = new float[]{(float)p0.getMeasuredHeight(),0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
       objectAnimat.setDuration(250).setInterpolator(new AccelerateDecelerateInterpolator());
       return objectAnimat;
    }
}
