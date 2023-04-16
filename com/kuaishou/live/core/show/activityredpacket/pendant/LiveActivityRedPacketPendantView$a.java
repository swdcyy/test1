package com.kuaishou.live.core.show.activityredpacket.pendant.LiveActivityRedPacketPendantView$a;
import ub.a;
import com.kuaishou.live.core.show.activityredpacket.pendant.LiveActivityRedPacketPendantView;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import tw1.g;
import java.util.List;
import com.kuaishou.android.live.log.b;

public class LiveActivityRedPacketPendantView$a extends a	// class@00096a
{
    public final CDNUrl[] b;
    public final LiveActivityRedPacketPendantView c;

    public void LiveActivityRedPacketPendantView$a(LiveActivityRedPacketPendantView p0,CDNUrl[] p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveActivityRedPacketPendantView$a.class, "1")) {
          return;
       }
       b.P(LiveActivityRedPacketPendantView.j, "pendant bind background fail, url = "+g.a(this.b));
       return;
    }
}
