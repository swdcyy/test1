package com.kuaishou.live.lite.player.basic.preplay.LiveLitePlayerPrePlayHandler$observeLifecycle$1;
import androidx.lifecycle.LifecycleEventObserver;
import mc3.c;
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
import mc3.a;
import java.lang.Enum;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$LeavePageEvent;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$LiveLitePrePlayEvent;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$EnterLiteEvent;

public final class LiveLitePlayerPrePlayHandler$observeLifecycle$1 implements LifecycleEventObserver	// class@000a6a
{
    public final c b;

    public void LiveLitePlayerPrePlayHandler$observeLifecycle$1(c p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       c o;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePlayerPrePlayHandler$observeLifecycle$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       b.Z(LiveLiteLogTag.PLAYER, this.b.a+" playerVCLifecycle "+p1);
       int i = a.a[p1.ordinal()];
       if (i != 1 && i != 2) {
          if (i == 3 || (i == 4 || i == 5)) {
             o = this.b.o;
             a.m(o);
             o.a(new LiveLitePrePlayStateMachine$LeavePageEvent());
             o.k = false;
          }
       }else {
          o = this.b.o;
          a.m(o);
          o.a(new LiveLitePrePlayStateMachine$EnterLiteEvent());
       }
       return;
    }
}
