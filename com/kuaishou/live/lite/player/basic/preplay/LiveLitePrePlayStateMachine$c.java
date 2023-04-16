package com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$c;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$EnterLiteEvent;
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

public final class LiveLitePrePlayStateMachine$c implements o	// class@000a76
{
    public static final LiveLitePrePlayStateMachine$c a;

    static {
       LiveLitePrePlayStateMachine$c.a = new LiveLitePrePlayStateMachine$c();
    }
    public void LiveLitePrePlayStateMachine$c(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, LiveLitePrePlayStateMachine$c.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(new LiveLitePrePlayStateMachine$g(true, false), null, 2, null);
       }
       return uoa;
    }
}
