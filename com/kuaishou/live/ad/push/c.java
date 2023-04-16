package com.kuaishou.live.ad.push.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import yl0.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fq5.b;
import sr5.b;
import aq5.d;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import aq5.b;
import com.kuaishou.livestream.message.nano.SCLiveAuthorBuyPushOpened;
import yl0.c;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.SCLiveAuthorBuyPushClosed;
import yl0.d;
import crd.b;
import lnc.b9;
import ekd.k1;
import yl0.a;
import com.kwai.robust.PatchProxyResult;
import yl0.b;
import wkd.b;
import ia0.g;
import com.kwai.framework.model.router.RouteType;
import t45.d;
import brd.z;
import com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.e;
import brd.t;
import cjd.e;
import erd.o;
import com.kuaishou.live.ad.push.a;
import com.kuaishou.live.ad.push.b;
import erd.g;
import ks5.b;
import ks5.c;
import com.kuaishou.live.ad.push.c$a;

public class c extends PresenterV2	// class@0009ec
{
    public b p;
    public a q;
    public c r;
    public FansTopNoticeBubbleView s;
    public b t;
    public b u;
    public b v;
    public static final boolean w;

    public void c(){
       super();
       this.v = new e(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.VOICE_PARTY};
       this.p.b().A0().u5(this.v, uoaArray);
       this.q.u0(727, SCLiveAuthorBuyPushOpened.class, new c(this));
       this.q.u0(728, SCLiveAuthorBuyPushClosed.class, new d(this));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.VOICE_PARTY};
       this.p.b().A0().G5(this.v, uoaArray);
       b9.a(this.u);
       k1.n(this);
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "7")) {
          return;
       }
       k1.n(this);
       b9.a(this.u);
       b uob = PatchProxy.apply(null, null, a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else if(a.a == null){
          a.a = e.b(b.a(-1961311520).a(RouteType.LIVE, d.b), b.class);
       }
       uob = a.a;
       this.u = uob.a(this.p.b().getLiveStreamId(), p0).map(new e()).subscribe(new a(this, p0), b.b);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       c tt = this.t;
       if (tt != null) {
          this.r.c(tt);
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       if (this.t == null) {
          this.t = new c$a(this);
       }
       this.r.b(this.t);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_PUSH_CALLER_CONTEXT");
       this.q = this.r8("LIVE_LONG_CONNECTION");
       this.r = this.q8(c.class);
       return;
    }
}
