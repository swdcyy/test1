package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.ordertag.LiveAudienceMultiLineArenaLineOrderTagViewModel$tagStyleConfig$1$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Number;
import pq1.b;
import lu1.r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import f02.c;

public final class LiveAudienceMultiLineArenaLineOrderTagViewModel$tagStyleConfig$1$1 extends Lambda implements p	// class@00150a
{
    public static final LiveAudienceMultiLineArenaLineOrderTagViewModel$tagStyleConfig$1$1 INSTANCE;

    static {
       LiveAudienceMultiLineArenaLineOrderTagViewModel$tagStyleConfig$1$1.INSTANCE = new LiveAudienceMultiLineArenaLineOrderTagViewModel$tagStyleConfig$1$1();
    }
    public void LiveAudienceMultiLineArenaLineOrderTagViewModel$tagStyleConfig$1$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0.intValue(), p1);
    }
    public final r invoke(int p0,b p1){
       if (PatchProxy.isSupport(LiveAudienceMultiLineArenaLineOrderTagViewModel$tagStyleConfig$1$1.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, LiveAudienceMultiLineArenaLineOrderTagViewModel$tagStyleConfig$1$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "cellInfo");
       int i = 1;
       if (p0 == i) {
          i = false;
       }
       return c.a(p1, i);
    }
}
