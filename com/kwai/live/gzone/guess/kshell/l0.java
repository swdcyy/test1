package com.kwai.live.gzone.guess.kshell.l0;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import p57.y1;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.animation.TimeInterpolator;

public final class l0 implements PopupInterface$c	// class@000d4b
{
    public static final l0 a;

    static {
       l0.a = new l0();
    }
    public void l0(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       p0.animate().translationY((float)p0.getHeight()).setInterpolator(new AccelerateInterpolator()).setDuration(250).setListener(p1);
    }
}
