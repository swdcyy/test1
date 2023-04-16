package com.kuaishou.live.core.show.redpacket.activity.c;
import erd.o;
import com.kuaishou.live.core.show.redpacket.activity.LiveRedPacketActivityManager;
import java.lang.String;
import mrd.c;
import java.lang.Object;
import com.kuaishou.live.common.core.component.redpacket.model.LiveRedPacketActivityTokenResponse;
import java.util.Objects;
import brd.t;
import og2.d;
import erd.g;

public final class c implements o	// class@000e54
{
    public final LiveRedPacketActivityManager b;
    public final int c;
    public final String d;
    public final int e;
    public final boolean f;
    public final c g;

    public void c(LiveRedPacketActivityManager p0,int p1,String p2,int p3,boolean p4,c p5){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public final Object apply(Object p0){
       c tb = this.b;
       c td = this.d;
       Objects.requireNonNull(tb);
       p0 = tb.b(this.c, p0.mGrabToken, td, this.e, p0.mGrabRequestMaxDelayMillis, this.f);
       return p0.doOnError(new d(td, this.g));
    }
}
