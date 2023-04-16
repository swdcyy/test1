package com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$i;
import com.kwai.statechart.a;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine;
import java.lang.String;
import java.lang.Object;
import ut7.h;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$h;

public final class LiveLitePrePlayStateMachine$i extends a	// class@000a7c
{
    public final LiveLitePrePlayStateMachine d;

    public void LiveLitePrePlayStateMachine$i(LiveLitePrePlayStateMachine p0,String p1){
       this.d = p0;
       super(p1);
    }
    public void e(Object p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePrePlayStateMachine$i.class, "1")) {
       }else {
          a.p(p0, "param");
          a.p(p1, "reason");
          this.d.f.a(p0.a, p0.b);
       }
       return;
    }
}
