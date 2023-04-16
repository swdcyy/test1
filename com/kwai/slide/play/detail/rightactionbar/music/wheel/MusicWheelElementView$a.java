package com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView$a;
import android.animation.AnimatorListenerAdapter;
import com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import qp7.t0;
import qp7.d;

public final class MusicWheelElementView$a extends AnimatorListenerAdapter	// class@001869
{
    public final MusicWheelElementView a;
    public final View b;
    public final long c;

    public void MusicWheelElementView$a(MusicWheelElementView p0,View p1,long p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MusicWheelElementView$a.class, "2")) {
          return;
       }
       this.b.setLayerType(0, null);
       this.b.setRotation(0);
       PatchProxy.onMethodExit(MusicWheelElementView$a.class, "2");
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MusicWheelElementView$a.class, "1")) {
          return;
       }
       if (this.a.j().f()) {
          this.b.setLayerType(2, null);
       }
       PatchProxy.onMethodExit(MusicWheelElementView$a.class, "1");
       return;
    }
}
