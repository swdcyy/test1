package com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$b;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter$e;
import com.kuaishou.live.core.show.activityredpacket.LiveActivityRedPacketPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import h22.g0;
import lnc.c3$a;
import lnc.c3;
import java.util.List;
import h22.h0;

public class LiveActivityRedPacketPresenter$b implements LiveActivityRedPacketPresenter$e	// class@000933
{
    public final LiveActivityRedPacketPresenter a;

    public void LiveActivityRedPacketPresenter$b(LiveActivityRedPacketPresenter p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveActivityRedPacketPresenter$b.class, "1")) {
          return;
       }
       c3.c(this.a.A, new g0(p0));
       return;
    }
    public void b(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveActivityRedPacketPresenter$b.class, "2")) {
          return;
       }
       c3.c(this.a.A, new h0(p0, p1));
       return;
    }
}
