package com.kuaishou.live.common.ad.fanstop.a$c;
import erd.g;
import com.kuaishou.live.common.ad.fanstop.a;
import h91.a;
import java.lang.Object;
import com.kuaishou.live.common.ad.fanstop.model.LiveFansTopRealtimeInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.ad.fanstop.model.LiveFansTopRealTimeInfo;
import com.kuaishou.live.common.ad.fanstop.UpdateFansTopStatusListener$FansTopStatus;

public class a$c implements g	// class@000e65
{
    public final a b;
    public final boolean c;
    public final a d;

    public void a$c(a p0,a p1,boolean p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$c.class, "1")) {
       }else {
          a$c tb = this.b;
          if (tb != null) {
             tb.onSuccess(p0);
          }
          if (this.c != null) {
             tb = this.d;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(p0, tb, a.class, "10")) {
                if (p0 != null) {
                   p0 = p0.mRealTimeInfo;
                   if (p0 != null) {
                      p0 = (p0.mFlameSelected != null)? UpdateFansTopStatusListener$FansTopStatus.OPEN_FLAME_SELECTED: UpdateFansTopStatusListener$FansTopStatus.OPEN_FLAME_UNSELECTED;
                      tb.a = p0;
                      tb.k(p0);
                   }
                }
                tb.a = UpdateFansTopStatusListener$FansTopStatus.OPEN_FLAME_UNSELECTED;
             }
          }
       }
       return;
    }
}
