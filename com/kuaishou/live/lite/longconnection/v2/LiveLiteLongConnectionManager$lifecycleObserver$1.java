package com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$lifecycleObserver$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$EnterDetail;
import ut7.e;
import com.kuaishou.live.lite.longconnection.v2.LiveBaseLongConnectionManager;

public final class LiveLiteLongConnectionManager$lifecycleObserver$1 implements LifecycleEventObserver	// class@000a26
{
    public final LiveLiteLongConnectionManager b;

    public void LiveLiteLongConnectionManager$lifecycleObserver$1(LiveLiteLongConnectionManager p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLiteLongConnectionManager$lifecycleObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_PAUSE) {
          LiveLiteLongConnectionManager$lifecycleObserver$1 tb = this.b;
          if (tb.u != null) {
             tb.M1(new LiveLiteLongConnectionManager$EnterDetail());
          }else if(p1 == Lifecycle$Event.ON_RESUME){
             tb.u = false;
          }
       }else {
          goto label_0028 ;
       }
       return;
    }
}
