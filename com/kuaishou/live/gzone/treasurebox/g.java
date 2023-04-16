package com.kuaishou.live.gzone.treasurebox.g;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import m53.d;
import android.view.ViewPropertyAnimator;

public final class g implements PopupInterface$c	// class@001c69
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       p0.setTranslationY((float)p0.getHeight());
       p0.animate().translationY(0).setDuration(200).setListener(p1);
    }
}
