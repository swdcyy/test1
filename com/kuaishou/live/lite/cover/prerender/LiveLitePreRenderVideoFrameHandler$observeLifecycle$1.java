package com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameHandler$observeLifecycle$1;
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
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$DestroyLiteEvent;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$LiveLitePreRenderVideoFrameEvent;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$LeavePageEvent;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$EnterLiteEvent;

public final class LiveLitePreRenderVideoFrameHandler$observeLifecycle$1 implements LifecycleEventObserver	// class@0008b4
{
    public final d b;

    public void LiveLitePreRenderVideoFrameHandler$observeLifecycle$1(d p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       d g;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePreRenderVideoFrameHandler$observeLifecycle$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       b.Z(LiveLiteLogTag.COVER, this.b.a+" coverVCLifecycle "+p1);
       int i = b.a[p1.ordinal()];
       if (i != 1 && i != 2) {
          if (i != 3 && i != 4) {
             if (i == 5) {
                g = this.b.g;
                a.m(g);
                g.a(new LiveLitePreRenderVideoFrameStateMachine$DestroyLiteEvent());
             }
          }else {
             g = this.b.g;
             a.m(g);
             g.a(new LiveLitePreRenderVideoFrameStateMachine$LeavePageEvent());
          }
       }else {
          g = this.b.g;
          a.m(g);
          g.a(new LiveLitePreRenderVideoFrameStateMachine$EnterLiteEvent());
       }
       return;
    }
}
