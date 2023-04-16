package h22.y;
import java.lang.Runnable;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import java.lang.String;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketService$RemoveRedPacketActionSource;
import java.lang.Object;
import java.util.Map;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import cx1.a;
import p91.m;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$UpdateOption;
import o22.b;

public final class y implements Runnable	// class@002c14
{
    public final LiveActivityRedPacketPresenter b;
    public final String c;
    public final LiveActivityRedPacketService$RemoveRedPacketActionSource d;
    public final int e;

    public void y(LiveActivityRedPacketPresenter p0,String p1,LiveActivityRedPacketService$RemoveRedPacketActionSource p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       y tb = this.b;
       y tc = this.c;
       y td = this.d;
       y te = this.e;
       if (!tb.u.containsKey(tc)) {
       }else {
          b.T(LiveActivityRedPacketPresenter.I, "removeShowingRedPacket", "redPacketId", tc, "removeSource", td.getName());
          LiveActivityRedPacketPresenter liveActivity = LiveActivityRedPacketPresenter.class;
          if (!PatchProxy.isSupport(liveActivity) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(te), tc, tb, liveActivity, "4")) {
             a uoa = tb.p.n();
             if (uoa != null) {
                uoa.a(te, tc);
             }
          }
          tb.u.remove(tc);
          tb.V8(tb.u, LiveActivityRedPacketPresenter$UpdateOption.REMOVE, null);
       }
       return;
    }
}
