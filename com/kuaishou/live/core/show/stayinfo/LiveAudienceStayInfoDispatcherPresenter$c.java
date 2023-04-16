package com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter$c;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter$b;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter;
import java.lang.Object;
import ek2.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Map;

public final class LiveAudienceStayInfoDispatcherPresenter$c implements LiveAudienceStayInfoDispatcherPresenter$b	// class@0010a9
{
    public final LiveAudienceStayInfoDispatcherPresenter a;

    public void LiveAudienceStayInfoDispatcherPresenter$c(LiveAudienceStayInfoDispatcherPresenter p0){
       this.a = p0;
       super();
    }
    public void a(int p0,b p1){
       LiveAudienceStayInfoDispatcherPresenter$c uoc = LiveAudienceStayInfoDispatcherPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "2")) {
          return;
       }
       a.p(p1, "liveAudienceStayInfoService");
       if (a.g(this.a.R.get(Integer.valueOf(p0)), p1)) {
          this.a.R.remove(Integer.valueOf(p0));
       }
       return;
    }
    public void b(int p0,b p1){
       LiveAudienceStayInfoDispatcherPresenter$c uoc = LiveAudienceStayInfoDispatcherPresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "1")) {
          return;
       }
       a.p(p1, "liveAudienceStayInfoService");
       this.a.R.put(Integer.valueOf(p0), p1);
       return;
    }
}
