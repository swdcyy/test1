package com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter;
import im8.g;
import c12.f;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter$a;
import nsd.u;
import java.util.ArrayList;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter$mKrnEventListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.HashMap;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter$c;
import ek2.a0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ek2.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kuaishou.krn.event.a;
import oj0.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.stayinfo.b;
import java.util.Map;
import t02.a0;
import kotlin.jvm.internal.a;
import tq5.c;
import lp3.i;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import java.lang.System;
import com.kuaishou.live.core.show.stayinfo.LiveAudienceStayInfoDispatcherPresenter$d;
import com.kwai.feature.api.live.base.service.quitlive.AudienceQuitLiveCheckOrder;
import tq5.a;

public final class LiveAudienceStayInfoDispatcherPresenter extends f implements g	// class@0010ad
{
    public boolean K;
    public long L;
    public boolean M;
    public List N;
    public final p O;
    public int P;
    public g Q;
    public final Map R;
    public a0 S;
    public i T;
    public BaseFragment U;
    public c V;
    public final LiveAudienceStayInfoDispatcherPresenter$b W;
    public static final LiveAudienceStayInfoDispatcherPresenter$a X;
    public static String sLivePresenterClassName;

    static {
       LiveAudienceStayInfoDispatcherPresenter.X = new LiveAudienceStayInfoDispatcherPresenter$a(null);
    }
    public void LiveAudienceStayInfoDispatcherPresenter(){
       super();
       this.N = new ArrayList();
       this.O = s.c(new LiveAudienceStayInfoDispatcherPresenter$mKrnEventListener$2(this));
       this.R = new HashMap();
       this.W = new LiveAudienceStayInfoDispatcherPresenter$c(this);
       this.U7(new a0());
       this.U7(new c());
    }
    public void Q(boolean p0){
       if (PatchProxy.isSupport(LiveAudienceStayInfoDispatcherPresenter.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAudienceStayInfoDispatcherPresenter.class, "4")) {
          return;
       }
       this.N.clear();
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceStayInfoDispatcherPresenter.class, "6")) {
          return;
       }
       a.b().c("live_stay_card_send_biz_type", this.a9());
       return;
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceStayInfoDispatcherPresenter.class, "5")) {
          return;
       }
       a.b().a("live_stay_card_send_biz_type", this.a9());
       return;
    }
    public final a a9(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceStayInfoDispatcherPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.O.getValue();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceStayInfoDispatcherPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new b();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceStayInfoDispatcherPresenter.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAudienceStayInfoDispatcherPresenter.class, new b());
       }else {
          obj.put(LiveAudienceStayInfoDispatcherPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceStayInfoDispatcherPresenter.class, "2")) {
          return;
       }
       super.j8();
       Object obj = this.q8(a0.class);
       a.o(obj, "inject\(LivePlayCallerContext::class.java\)");
       this.S = obj;
       obj = this.r8("LIVE_QUIT_LIVE_SERVICE");
       a.o(obj, "inject\(LiveAccessIds.LIVE_QUIT_LIVE_SERVICE\)");
       this.V = obj;
       obj = this.r8("LIVE_SERVICE_MANAGER");
       a.o(obj, "inject\(LiveAccessIds.LIVE_SERVICE_MANAGER\)");
       this.T = obj;
       obj = this.r8("LIVE_FRAGMENT");
       a.o(obj, "inject\(LiveAccessIds.LIVE_FRAGMENT\)");
       this.U = obj;
       return;
    }
    public void x(boolean p0){
       LiveAudienceStayInfoDispatcherPresenter liveAudience = LiveAudienceStayInfoDispatcherPresenter.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveAudience, "3")) {
          return;
       }
       LiveAudienceStayInfoDispatcherPresenter tS = this.S;
       String str = "mLivePlayCallerContext";
       if (tS == null) {
          a.S(str);
       }
       a0 c = tS.c;
       a.o(c, "mLivePlayCallerContext.mPhoto");
       User user = c.getUser();
       a.o(user, "mLivePlayCallerContext.mPhoto.user");
       this.K = user.isFollowingOrFollowRequesting();
       tS = this.S;
       if (tS == null) {
          a.S(str);
       }
       this.P = tS.l;
       this.L = System.currentTimeMillis();
       tS = this.V;
       if (tS == null) {
          a.S("mQuitLiveService");
       }
       tS.Ci(new LiveAudienceStayInfoDispatcherPresenter$d(this), AudienceQuitLiveCheckOrder.LIVE_STAY_INFO);
       return;
    }
}
