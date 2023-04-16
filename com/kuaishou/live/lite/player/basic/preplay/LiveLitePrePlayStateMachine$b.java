package com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$b;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$LeavePageEvent;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$g;
import ut7.h;
import nsd.u;

public final class LiveLitePrePlayStateMachine$b implements o	// class@000a75
{
    public static final LiveLitePrePlayStateMachine$b a;

    static {
       LiveLitePrePlayStateMachine$b.a = new LiveLitePrePlayStateMachine$b();
    }
    public void LiveLitePrePlayStateMachine$b(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, LiveLitePrePlayStateMachine$b.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(new LiveLitePrePlayStateMachine$g(true, false), null, 2, null);
       }
       return uoa;
    }
}
