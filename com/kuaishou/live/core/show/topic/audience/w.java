package com.kuaishou.live.core.show.topic.audience.w;
import k51.c;
import ql2.c0;
import ql2.b0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.SCLiveTagUpdate;
import lf3.g;
import hf3.a;
import com.kuaishou.livestream.message.nano.SCLiveTagClose;
import com.kuaishou.live.common.core.component.turbomode.OptimizedElement;
import brd.t;
import qy1.a;
import t45.d;
import brd.z;
import ql2.d0;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import ks5.b;
import ks5.c;
import com.kuaishou.live.core.show.topic.audience.x$c;
import com.kwai.robust.PatchProxyResult;
import ol2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.topic.a;
import lp3.i;
import lp3.c;

public class w extends c	// class@00121f
{
    public a p;
    public SCLiveTagUpdate q;
    public c r;
    public x$c s;
    public a t;
    public m u;
    public a v;
    public final g w;
    public final g x;
    public static String sLivePresenterClassName = "LiveAudienceTopicPendantPresenter";

    public void w(){
       super();
       this.w = new c0(this);
       this.x = new b0(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, w.class, "2")) {
          return;
       }
       this.t.u0(765, SCLiveTagUpdate.class, this.w);
       this.t.u0(766, SCLiveTagClose.class, this.x);
       w tv = this.v;
       if (tv != null) {
          this.X7(tv.vo(OptimizedElement.AUDIENCE_TOPIC).observeOn(d.a).distinctUntilChanged().subscribe(new d0(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, w.class, "3")) {
          return;
       }
       this.t.o(765, this.w);
       this.t.o(766, this.x);
       this.P8(true);
       this.q = null;
       return;
    }
    public final void P8(boolean p0){
       w ow = w.class;
       if (PatchProxy.isSupport(ow) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ow, "7")) {
          return;
       }
       ow = this.p;
       if (ow != null) {
          this.r.c(ow);
          if (p0) {
             this.p = null;
          }
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, w.class, "5")) {
          return;
       }
       w tq = this.q;
       this.s.a(tq.tagId, tq.tagName, 1);
       return;
    }
    public final boolean S8(){
       w obj = PatchProxy.apply(null, this, w.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.p != null) {
          obj = this.v;
          if (obj == null || obj.Ko(OptimizedElement.AUDIENCE_TOPIC)) {
             obj = this.p;
             a.j(obj.e, obj.f, this.u.a());
             this.r.b(this.p);
             return true;
          }
       }
       return false;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, w.class, "1")) {
          return;
       }
       this.r = this.q8(c.class);
       this.s = this.r8("LIVE_AUDIENCE_TOPIC_DETAIL_SERVICE");
       this.t = this.r8("LIVE_LONG_CONNECTION");
       this.u = this.r8("LIVE_BASIC_CONTEXT");
       this.v = this.r8("LIVE_SERVICE_MANAGER").c(a.class);
       return;
    }
}
