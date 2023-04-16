package com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$a;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$EndTimingEvent;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import ut7.h;
import nsd.u;

public final class LiveLitePrePlayStateMachine$a implements o	// class@000a74
{
    public static final LiveLitePrePlayStateMachine$a a;

    static {
       LiveLitePrePlayStateMachine$a.a = new LiveLitePrePlayStateMachine$a();
    }
    public void LiveLitePrePlayStateMachine$a(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, LiveLitePrePlayStateMachine$a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(l1.a, null, 2, null);
       }
       return uoa;
    }
}
