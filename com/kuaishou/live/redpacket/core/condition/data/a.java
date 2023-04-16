package com.kuaishou.live.redpacket.core.condition.data.a;
import java.lang.Runnable;
import com.kuaishou.live.redpacket.core.condition.data.RedPacketConditionRedPackInfoWrapper;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketCurrentInfoResponse;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t45.d;
import tm3.h;
import crd.b;
import brd.z;

public class a implements Runnable	// class@000e72
{
    public final LiveConditionRedPacketCurrentInfoResponse b;
    public final RedPacketConditionRedPackInfoWrapper c;

    public void a(RedPacketConditionRedPackInfoWrapper p0,LiveConditionRedPacketCurrentInfoResponse p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       d.c.d(new h(this, this.b));
       return;
    }
}
