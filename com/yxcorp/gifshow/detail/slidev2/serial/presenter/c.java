package com.yxcorp.gifshow.detail.slidev2.serial.presenter.c;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class c implements PopupInterface$c	// class@0019e8
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0x3f800000,0});
       objectAnimat.setDuration(300);
       objectAnimat.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       objectAnimat.addListener(p1);
       objectAnimat.start();
    }
}
