package com.kuaishou.live.core.voiceparty.b0;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.util.Property;
import android.animation.ObjectAnimator;

public final class b0 implements PopupInterface$c	// class@00133a
{
    public static final b0 a;

    static {
       b0.a = new b0();
    }
    public void b0(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       float[] uofloatArray = new float[]{0,(float)p0.getHeight()};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
       objectAnimat.setDuration(300);
       if (p1 != null) {
          objectAnimat.addListener(p1);
       }
       objectAnimat.start();
       return;
    }
}
