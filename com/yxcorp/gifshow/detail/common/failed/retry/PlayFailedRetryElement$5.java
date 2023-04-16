package com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement$5;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.gifshow.detail.common.failed.retry.PlayFailedRetryElement;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p5a.e;
import de5.a;
import p5a.c;
import java.util.BitSet;

public class PlayFailedRetryElement$5 implements DefaultLifecycleObserver	// class@001402
{
    public final PlayFailedRetryElement b;

    public void PlayFailedRetryElement$5(PlayFailedRetryElement p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayFailedRetryElement$5.class, "1")) {
          return;
       }
       if (this.b.y.getPlayer().i() == 2 && !this.b.I.cardinality()) {
          this.b.r0("activity resume, do retry");
          this.b.I.set(3);
          PlayFailedRetryElement$5 tb = this.b;
          tb.L = false;
          tb.p0(0);
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
