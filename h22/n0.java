package h22.n0;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import h22.b;
import h22.j0;
import java.lang.Class;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService;
import h22.k0;
import h22.l0;
import java.lang.String;
import h22.m0;
import mm8.a;

public final class n0 implements b	// class@002c03
{

    public void n0(){
       super();
    }
    public void a(a p0,Object p1){
       p0.h(b.class, new j0(this, p1));
       p0.h(LiveActivityRedPacketService.class, new k0(this, p1));
       l0 ol0 = new l0(this, p1);
       String str = "LIVE_ACTIVITY_RED_PACKET_HAS_AUTO_SHOWN_ID";
       try{
          p0.i(str, ol0);
          p0.h(LiveActivityRedPacketPresenter.class, new m0(this, p1));
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
