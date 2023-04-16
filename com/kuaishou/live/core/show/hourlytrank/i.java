package com.kuaishou.live.core.show.hourlytrank.i;
import com.kuaishou.live.core.show.hourlytrank.e$b;
import com.kuaishou.live.core.show.hourlytrank.h;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankClosed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.protobuf.nano.MessageNano;
import lf3.g;
import java.lang.Boolean;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveDistrictRankInfo;
import com.kuaishou.livestream.message.nano.SCLivePopularityRankInfo;
import com.kuaishou.livestream.message.nano.SCLivePopularityRankClosed;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneLiveHourRankInfo;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCGzoneLiveHourRankInfoClose;

public class i implements e$b	// class@000c20
{
    public final h a;

    public void i(h p0){
       this.a = p0;
       super();
    }
    public void a(LiveStreamMessages$SCLiveDistrictRankClosed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "5")) {
          return;
       }
       this.a.n1.H4(p0);
       return;
    }
    public void b(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "1")) {
          return;
       }
       if (!p0) {
          i ta = this.a;
          ta.X = null;
          ta.j9(null);
       }
       return;
    }
    public void c(LiveStreamMessages$SCLiveDistrictRankInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       this.a.m1.H4(p0);
       return;
    }
    public void d(SCLivePopularityRankInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       this.a.q1.H4(p0);
       return;
    }
    public void e(SCLivePopularityRankClosed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       this.a.r1.H4(p0);
       return;
    }
    public void f(LiveStreamMessages$SCGzoneLiveHourRankInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "6")) {
          return;
       }
       this.a.o1.H4(p0);
       return;
    }
    public void g(LiveStreamMessages$SCGzoneLiveHourRankInfoClose p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "7")) {
          return;
       }
       this.a.p1.H4(p0);
       return;
    }
}
