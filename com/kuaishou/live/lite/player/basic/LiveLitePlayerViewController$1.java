package com.kuaishou.live.lite.player.basic.LiveLitePlayerViewController$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.kuaishou.live.lite.player.basic.LiveLitePlayerViewController;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class LiveLitePlayerViewController$1 implements LifecycleEventObserver	// class@000a60
{
    public final LiveLitePlayerViewController b;

    public void LiveLitePlayerViewController$1(LiveLitePlayerViewController p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePlayerViewController$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       b.Z(LiveLiteLogTag.LIFECYCLE, this.b.j+' '+p1);
       return;
    }
}
