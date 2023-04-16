package com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$f;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$StopPrePlayEvent;
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

public final class LiveLitePrePlayStateMachine$f implements o	// class@000a79
{
    public static final LiveLitePrePlayStateMachine$f a;

    static {
       LiveLitePrePlayStateMachine$f.a = new LiveLitePrePlayStateMachine$f();
    }
    public void LiveLitePrePlayStateMachine$f(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, LiveLitePrePlayStateMachine$f.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(new LiveLitePrePlayStateMachine$g(false, true), null, 2, null);
       }
       return uoa;
    }
}
