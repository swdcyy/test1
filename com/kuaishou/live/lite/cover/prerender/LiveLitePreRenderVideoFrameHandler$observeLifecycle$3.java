package com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameHandler$observeLifecycle$3;
import androidx.lifecycle.LifecycleEventObserver;
import oa3.d;
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
import oa3.b;
import java.lang.Enum;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$LeavePageEvent;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$LiveLitePreRenderVideoFrameEvent;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.Lifecycle;

public final class LiveLitePreRenderVideoFrameHandler$observeLifecycle$3 implements LifecycleEventObserver	// class@0008b6
{
    public final d b;

    public void LiveLitePreRenderVideoFrameHandler$observeLifecycle$3(d p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePreRenderVideoFrameHandler$observeLifecycle$3.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       b.Z(LiveLiteLogTag.COVER, this.b.a+" homeTabLifecycle "+p1);
       int i = b.c[p1.ordinal()];
       if (i == 1 || (i == 2 || i == 3)) {
          d g = this.b.g;
          a.m(g);
          g.a(new LiveLitePreRenderVideoFrameStateMachine$LeavePageEvent());
          LiveLitePreRenderVideoFrameHandler$observeLifecycle$3 tb = this.b;
          g = tb.o;
          a.m(g);
          tb.x.removeObserver(g);
       }
       return;
    }
}
