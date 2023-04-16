package com.kwai.live.gzone.praise.b;
import com.kwai.live.gzone.praise.a$a;
import mq5.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import o67.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xp5.e;
import lp3.c;
import lp3.i;
import a77.l;
import a77.k;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import o67.f;
import lf3.g;
import hf3.a;
import mq5.b;
import java.lang.Long;
import u37.d;
import u37.e;
import fq5.b;
import brd.t;
import ekd.k1;
import java.util.concurrent.TimeUnit;
import o67.i;
import erd.o;
import o67.h;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import java.util.List;
import com.kwai.live.gzone.praise.a;
import a77.a$b;
import android.app.Activity;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import com.kwai.feature.api.live.base.service.livestop.LiveAudienceEndReason;
import mq5.g;
import ft5.b;
import com.kwai.library.widget.popup.common.c;

public class b extends PresenterV2 implements a$a, h	// class@000da3
{
    public b p;
    public b q;
    public i r;
    public a s;
    public b t;
    public k u;
    public String v;
    public a w;
    public RainbowCommentFeed x;
    public l y;

    public void b(){
       super();
       this.y = new g(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       if (!this.r.a(e.class).Qd()) {
          return;
       }
       b tu = this.u;
       if (tu != null) {
          tu.a("rainbowComment", this.y);
       }
       this.s.u0(510, SCActionSignal.class, new f(this));
       this.q.Km(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.q.le(this);
       b tu = this.u;
       if (tu != null) {
          tu.g("rainbowComment");
       }
       return;
    }
    public final void P8(long p0,long p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, uob, "8")) {
          return;
       }
       this.X7(t.timer(k1.k(p0), TimeUnit.MILLISECONDS).flatMap(new i(e.b().p(this.p.getLiveStreamId(), p1))).subscribe(new h(this), Functions.e));
       return;
    }
    public final void R8(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "4")) {
          return;
       }
       if (this.w == null) {
          a$b uob = new a$b(this.getActivity());
          uob.a0(this.r.a(e.class).l());
          a uoa = new a(uob);
          this.w = uoa;
          uoa.t = this;
          uoa.z = this.p.a();
       }
       b tw = this.w;
       Objects.requireNonNull(tw);
       if (!PatchProxy.applyVoidOneRefs(p0, tw, a.class, "9") && !q.f(p0)) {
          tw.u = p0;
       }
       this.w.e0(p1);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       if (this.u == null) {
          return;
       }
       this.X7(e.b().v(this.p.getLiveStreamId(), this.u.c(), this.v).subscribe(Functions.d(), Functions.d()));
       return;
    }
    public void fa(LiveAudienceEndReason p0){
       g.a(this, p0);
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.r8("LIVE_AUDIENCE_LIVE_END_SERVICE");
       this.u = this.s8(k.class);
       this.r = this.r8("LIVE_SERVICE_MANAGER");
       this.s = this.r8("LIVE_LONG_CONNECTION");
       this.t = this.r8("LIVE_AUDIENCE_SEND_COMMENTS_SERVICE");
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       b tw = this.w;
       if (tw != null && tw.K()) {
          this.w.q(0);
       }
       return;
    }
    public void r1(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       this.t.U2(p0);
       return;
    }
    public void y5(long p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uob, "7")) {
          return;
       }
       this.P8(1, p0);
       return;
    }
}
