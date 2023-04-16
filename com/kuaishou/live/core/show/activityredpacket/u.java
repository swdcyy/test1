package com.kuaishou.live.core.show.activityredpacket.u;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.core.show.activityredpacket.y;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketFragment$b;
import java.lang.Object;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;

public class u extends Accessor	// class@000997
{
    public final LiveActivityRedPacketFragment$b c;
    public final y d;

    public void u(y p0,LiveActivityRedPacketFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.B;
    }
    public void set(Object p0){
       this.c.B = p0;
    }
}
