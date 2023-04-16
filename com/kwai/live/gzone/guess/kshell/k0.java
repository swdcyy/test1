package com.kwai.live.gzone.guess.kshell.k0;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import p57.y1;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;

public final class k0 implements PopupInterface$c	// class@000d49
{
    public static final k0 a;

    static {
       k0.a = new k0();
    }
    public void k0(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       p0.setTranslationY((float)p0.getHeight());
       p0.animate().translationY(0).setDuration(250).setInterpolator(new DecelerateInterpolator()).setListener(p1);
    }
}
