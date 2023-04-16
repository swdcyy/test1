package com.kuaishou.live.core.show.activityredpacket.t;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.core.show.activityredpacket.y;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketFragment$b;
import java.lang.Object;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$e;

public class t extends Accessor	// class@000996
{
    public final LiveActivityRedPacketFragment$b c;
    public final y d;

    public void t(y p0,LiveActivityRedPacketFragment$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.C;
    }
    public void set(Object p0){
       this.c.C = p0;
    }
}
