package com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$lifecycleObserver$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle$State;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$c;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$LiveActive;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager$LiveInactive;
import ut7.e;

public final class LiveBaseLongConnectionManager$lifecycleObserver$1 implements LifecycleEventObserver	// class@000a1f
{
    public final LiveBaseLongConnectionManager b;

    public void LiveBaseLongConnectionManager$lifecycleObserver$1(LiveBaseLongConnectionManager p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveBaseLongConnectionManager$lifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       boolean b = p1.getTargetState().isAtLeast(Lifecycle$State.RESUMED);
       if (this.b.N().a() != b) {
          p1.b = b;
          LiveBaseLongConnectionManager$lifecycleObserver$1 tb = this.b;
          LiveBaseLongConnectionManager$LiveActive liveActive = (b)? new LiveBaseLongConnectionManager$LiveActive(): new LiveBaseLongConnectionManager$LiveInactive();
          tb.M1(liveActive);
       }
       return;
    }
}
