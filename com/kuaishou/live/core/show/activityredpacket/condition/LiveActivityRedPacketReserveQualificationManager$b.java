package com.kuaishou.live.core.show.activityredpacket.condition.LiveActivityRedPacketReserveQualificationManager$b;
import erd.o;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import m22.a;
import m22.a$a;
import brd.t;

public final class LiveActivityRedPacketReserveQualificationManager$b implements o	// class@000944
{
    public final String b;
    public final String c;

    public void LiveActivityRedPacketReserveQualificationManager$b(String p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, LiveActivityRedPacketReserveQualificationManager$b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = a.a.a().a(this.b, this.c);
       }
       return ot;
    }
}
