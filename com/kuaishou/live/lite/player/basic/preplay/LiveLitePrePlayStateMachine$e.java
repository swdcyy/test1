package com.kuaishou.live.lite.player.basic.preplay.LiveLitePrePlayStateMachine$e;
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

public final class LiveLitePrePlayStateMachine$e implements o	// class@000a78
{
    public static final LiveLitePrePlayStateMachine$e a;

    static {
       LiveLitePrePlayStateMachine$e.a = new LiveLitePrePlayStateMachine$e();
    }
    public void LiveLitePrePlayStateMachine$e(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, LiveLitePrePlayStateMachine$e.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(new LiveLitePrePlayStateMachine$g(false, false), null, 2, null);
       }
       return uoa;
    }
}
