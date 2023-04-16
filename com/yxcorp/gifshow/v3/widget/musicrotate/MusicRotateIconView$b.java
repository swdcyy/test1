package com.yxcorp.gifshow.v3.widget.musicrotate.MusicRotateIconView$b;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;

public final class MusicRotateIconView$b extends AnimatorListenerAdapter	// class@001673
{
    public final View a;
    public final long b;

    public void MusicRotateIconView$b(View p0,long p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MusicRotateIconView$b.class, "1")) {
          return;
       }
       this.a.setLayerType(0, null);
       this.a.setRotation(0);
       PatchProxy.onMethodExit(MusicRotateIconView$b.class, "1");
       return;
    }
    public void onAnimationStart(Animator p0){
    }
}
