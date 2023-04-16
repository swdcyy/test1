package com.kuaishou.live.common.ad.fanstop.b;
import java.lang.Object;
import com.kuaishou.live.common.ad.fanstop.model.LiveFansTopAuthorityResponse;
import com.kuaishou.live.common.ad.fanstop.model.LiveFansTopRealtimeInfoResponse;
import com.kuaishou.live.common.ad.fanstop.UpdateFansTopStatusListener;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.ad.fanstop.model.LiveFansTopRealTimeInfo;
import com.kuaishou.live.common.ad.fanstop.UpdateFansTopStatusListener$FansTopStatus;

public class b	// class@000e68
{
    public boolean a;
    public boolean b;
    public LiveFansTopAuthorityResponse c;
    public LiveFansTopRealtimeInfoResponse d;

    public void b(){
       super();
       this.a = false;
       this.b = false;
    }
    public final void a(LiveFansTopAuthorityResponse p0,LiveFansTopRealtimeInfoResponse p1,UpdateFansTopStatusListener p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "1")) {
          return;
       }
       if (p0 == null || p0.mIsEnableLiveFansTop == null) {
          p2.a(UpdateFansTopStatusListener$FansTopStatus.CLOSE);
          return;
       }else if(p1 != null){
          LiveFansTopRealtimeInfoResponse mRealTimeInf = p1.mRealTimeInfo;
          if (mRealTimeInf != null) {
             UpdateFansTopStatusListener$FansTopStatus oPEN_FLAME_S = (mRealTimeInf.mFlameSelected != null)? UpdateFansTopStatusListener$FansTopStatus.OPEN_FLAME_SELECTED: UpdateFansTopStatusListener$FansTopStatus.OPEN_FLAME_UNSELECTED;
             p2.a(oPEN_FLAME_S);
             return;
          }
       }
       p2.a(UpdateFansTopStatusListener$FansTopStatus.OPEN_FLAME_UNSELECTED);
       return;
    }
    public void b(UpdateFansTopStatusListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.a = true;
       if (this.b != null) {
          this.a(this.c, this.d, p0);
       }
       return;
    }
    public void c(UpdateFansTopStatusListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       this.b = true;
       if (this.a != null) {
          this.a(this.c, this.d, p0);
       }
       return;
    }
}
