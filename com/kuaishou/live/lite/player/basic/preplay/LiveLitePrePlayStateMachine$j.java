package com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$j;
import com.kwai.statechart.a;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$h;

public final class LiveLitePrePlayStateMachine$j extends a	// class@000a7d
{
    public final LiveLitePrePlayStateMachine d;

    public void LiveLitePrePlayStateMachine$j(LiveLitePrePlayStateMachine p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePrePlayStateMachine$j.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          this.d.f.b();
       }
       return;
    }
}
