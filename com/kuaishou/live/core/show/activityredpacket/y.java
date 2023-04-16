package com.kuaishou.live.core.show.activityredpacket.y;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketFragment$b;
import com.kuaishou.live.core.show.activityredpacket.t;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.core.show.activityredpacket.u;
import h22.a;
import com.kuaishou.live.core.show.activityredpacket.v;
import java.lang.Class;
import com.kuaishou.live.core.show.activityredpacket.w;
import com.kuaishou.live.core.show.activityredpacket.x;
import mm8.a;

public final class y implements b	// class@0009b0
{

    public void y(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LiveActivityRedPacketDelegate", new t(this, p1));
       p0.i("LiveActivityRedPacketPendantService", new u(this, p1));
       p0.h(a.class, new v(this, p1));
       w ow = new w(this, p1);
       String str = "LIVE_BASIC_CONTEXT";
       try{
          p0.i(str, ow);
          p0.h(LiveActivityRedPacketFragment$b.class, new x(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
