package com.kuaishou.live.core.voiceparty.a0;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.util.Property;
import android.animation.ObjectAnimator;

public final class a0 implements PopupInterface$c	// class@00131d
{
    public static final a0 a;

    static {
       a0.a = new a0();
    }
    public void a0(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       float[] uofloatArray = new float[]{(float)p0.getHeight(),0};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
       objectAnimat.setDuration(300);
       if (p1 != null) {
          objectAnimat.addListener(p1);
       }
       objectAnimat.start();
       return;
    }
}
