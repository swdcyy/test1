package com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$d;
import ut7.o;
import java.lang.Object;
import ut7.i;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$LeavePageEvent;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import ut7.i$a;
import com.kuaishou.live.lite.cover.prerender.LiveLitePreRenderVideoFrameStateMachine$j;
import ut7.h;
import nsd.u;

public final class LiveLitePreRenderVideoFrameStateMachine$d implements o	// class@0008c3
{
    public static final LiveLitePreRenderVideoFrameStateMachine$d a;

    static {
       LiveLitePreRenderVideoFrameStateMachine$d.a = new LiveLitePreRenderVideoFrameStateMachine$d();
    }
    public void LiveLitePreRenderVideoFrameStateMachine$d(){
       super();
    }
    public i a(Object p0,Object p1){
       i$a uoa = PatchProxy.applyTwoRefs(p0, p1, this, LiveLitePreRenderVideoFrameStateMachine$d.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else {
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          uoa = new i$a(new LiveLitePreRenderVideoFrameStateMachine$j(true, false), null, 2, null);
       }
       return uoa;
    }
}