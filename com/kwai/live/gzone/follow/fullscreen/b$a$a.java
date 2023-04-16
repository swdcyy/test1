package com.kwai.live.gzone.follow.fullscreen.b$a$a;
import android.animation.AnimatorListenerAdapter;
import com.kwai.live.gzone.follow.fullscreen.b$a;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.follow.fullscreen.b;
import g57.n;
import com.kwai.live.gzone.bean.LiveGzoneFollowTipConfig;
import java.lang.Runnable;
import ekd.k1;

public class b$a$a extends AnimatorListenerAdapter	// class@000cf8
{
    public final b$a a;

    public void b$a$a(b$a p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a$a.class, "1")) {
          return;
       }
       b$a b = this.a.b;
       k1.r(b.A, b.w.c.mDanmakuStayOnScreenDuringTimeMs);
       return;
    }
}
