package com.kuaishou.live.core.voiceparty.playway.ktv.view.binding.KtvViewDataBinding$bind$11;
import androidx.lifecycle.LifecycleEventObserver;
import mu2.m;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.animation.Animator;

public final class KtvViewDataBinding$bind$11 implements LifecycleEventObserver	// class@001860
{
    public final m b;

    public void KtvViewDataBinding$bind$11(m p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KtvViewDataBinding$bind$11.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_DESTROY) {
          this.b.g.cancel();
       }
       return;
    }
}
