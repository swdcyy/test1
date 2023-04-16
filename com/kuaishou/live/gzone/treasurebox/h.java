package com.kuaishou.live.gzone.treasurebox.h;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import java.lang.Object;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import m53.d;
import android.view.ViewPropertyAnimator;

public final class h implements PopupInterface$c	// class@001c6a
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final void a(View p0,Animator$AnimatorListener p1){
       p0.animate().translationY((float)p0.getHeight()).setDuration(200).setListener(p1);
    }
}
