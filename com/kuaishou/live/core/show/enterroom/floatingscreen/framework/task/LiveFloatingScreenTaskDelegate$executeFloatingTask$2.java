package com.kuaishou.live.core.show.enterroom.floatingscreen.framework.task.LiveFloatingScreenTaskDelegate$executeFloatingTask$2;
import java.lang.Runnable;
import s72.b;
import s72.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.task.LiveFloatingScreenTaskDelegate$executeFloatingTask$2$a;
import w72.a;
import java.util.Objects;
import android.database.Observable;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import android.animation.Animator;
import kr5.a;
import com.kuaishou.live.core.show.enterroom.floatingscreen.framework.task.LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1;
import android.animation.Animator$AnimatorListener;

public final class LiveFloatingScreenTaskDelegate$executeFloatingTask$2 implements Runnable	// class@000b11
{
    public final b b;
    public final a c;
    public final View d;
    public final Runnable e;

    public void LiveFloatingScreenTaskDelegate$executeFloatingTask$2(b p0,a p1,View p2,Runnable p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveFloatingScreenTaskDelegate$executeFloatingTask$2.class, "1")) {
          return;
       }
       LiveFloatingScreenTaskDelegate$executeFloatingTask$2$a uoexecuteFlo = new LiveFloatingScreenTaskDelegate$executeFloatingTask$2$a(this);
       a uoa = this.b.e();
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoidOneRefs(uoexecuteFlo, uoa, a.class, "4")) {
          uoa.b.registerObserver(uoexecuteFlo);
       }
       this.b.i(this.b.e().a(this.b.f.h().getBizType()));
       LiveFloatingScreenTaskDelegate$executeFloatingTask$2 tb = this.b;
       tb.b = tb.d.b(this.c.h(), this.d);
       Animator uAnimator = this.b.a();
       if (uAnimator != null) {
          uAnimator.addListener(new LiveFloatingScreenTaskDelegate$executeFloatingTask$2$$special$$inlined$addListener$1(this, uoexecuteFlo, this));
       }
       Animator uAnimator1 = this.b.a();
       if (uAnimator1 != null) {
          uAnimator1.start();
       }
       return;
    }
}
