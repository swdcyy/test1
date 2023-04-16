package ky9.e;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import jh5.a;
import xq7.d;
import rp7.a;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ly9.g;
import ly9.l;
import com.yxcorp.gifshow.detail.common.information.marquee.model.MarqueeConfig;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import de5.a;
import com.yxcorp.gifshow.comment.e;
import io.reactivex.subjects.PublishSubject;
import brd.t;
import com.yxcorp.gifshow.detail.common.information.marquee.model.c;
import ly9.m;
import ly9.k;
import qp7.x0;
import gr7.j;
import ly9.f;
import qp7.c;
import gr7.h;
import qp7.g;
import xq7.e;
import ly9.q;
import ky9.f;
import rq7.a;
import java.lang.Boolean;
import ky9.a;
import kp.r1;
import com.kuaishou.android.model.mix.CoCreateInfo;
import qp7.b1;
import ky9.b;
import io.reactivex.internal.functions.Functions;
import java.util.Objects;
import crd.b;
import erd.g;
import ky9.c;
import kotlin.jvm.internal.a;
import ky9.d;
import com.kwai.feature.api.danmaku.DanmakuExperimentUtils;
import qp7.d;
import gr7.g;

public class e extends DispatchBaseElement	// class@002d25
{
    public PhotoDetailParam A;
    public boolean B;
    public boolean C;
    public boolean D;
    public a t;
    public c u;
    public m v;
    public k w;
    public f x;
    public q y;
    public QPhoto z;

    public void e(a p0){
       super(d.a, p0);
       this.B = false;
       this.C = false;
       this.D = false;
    }
    public void P(a p0){
       MarqueeConfig sTATUS_DETAI;
       c uoc = this;
       a obj = p0;
       if (PatchProxy.applyVoidOneRefsWithListener(obj, uoc, e.class, "1")) {
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          String str = "2";
          l ol = PatchProxy.applyOneRefsWithListener(obj, uoc, e.class, str);
          if (ol != patchProxyRe) {
          }else {
             String str1 = "3";
             MarqueeConfig marqueeConfi = PatchProxy.applyOneRefsWithListener(obj, uoc, e.class, str1);
             if (marqueeConfi != patchProxyRe) {
             }else if(obj.c.getSource() == 218){
                sTATUS_DETAI = MarqueeConfig.STATUS_DETAIL;
                PatchProxy.onMethodExit(e.class, str1);
             }else {
                sTATUS_DETAI = MarqueeConfig.FRIEND;
                PatchProxy.onMethodExit(e.class, str1);
             }
             marqueeConfi = sTATUS_DETAI;
             PhotoDetailParam mPhoto = obj.c.mPhoto;
             a b = obj.b;
             m0 j = obj.j;
             m0 l = obj.l;
             int i = (this.H().q0 == null && (this.H().r0 != null || obj.c.mPhoto.shouldShowViewersPage()))? 3: 1;
             l ol1 = new l(marqueeConfi, mPhoto, b, j, l, i, obj.F, this.H().u1, obj.P);
             PatchProxy.onMethodExit(e.class, str);
          }
          c uoc1 = new c(ol);
          uoc.u = uoc1;
          m om = new m();
          uoc.v = om;
          uoc.w = new k(om, uoc1, this.E(), ol);
          f uof = new f(uoc.u, uoc.v, this.A(), this.D(), ol);
          uoc.x = uoc1;
          uoc.y = new q(uoc.u, this.A(), ol);
          uof = new f(this.E(), uoc.u, uoc.v, uoc.w, uoc.x, uoc.y, ol);
          uoc.t = uoc1;
          if (obj != null) {
             obj = obj.c;
             if (obj != null) {
                uoc.z = obj.mPhoto;
                uoc.A = obj;
             }
          }
          PatchProxy.onMethodExit(e.class, "1");
       }
       return;
    }
    public a f0(a p0){
       j oj = PatchProxy.applyOneRefs(p0, this, e.class, "7");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j(p0);
       }
       return oj;
    }
    public void j0(boolean p0){
       g e;
       e uoe = e.class;
       e uoe1 = e.class;
       if (PatchProxy.isSupport(uoe1) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe1, "4")) {
          return;
       }
       this.t.b();
       if (r1.A2(this.z)) {
          this.b0();
          return;
       }else if(this.z.getCoCreateInfo() != null && this.z.getCoCreateInfo().mMembers != null){
          this.b0();
          return;
       }else {
          this.i(this.w.k);
          b ti = this.i;
          b uob = new b(this);
          e = Functions.e;
          Objects.requireNonNull(ti);
          b uob1 = PatchProxy.applyTwoRefs(uob, e, ti, h.class, "12");
          if (uob1 != PatchProxyResult.class) {
          }else {
             uob1 = ti.f.subscribe(uob, e);
          }
          this.j(uob1);
          e uoe2 = this.D();
          c uoc = new c(this);
          Objects.requireNonNull(uoe2);
          uob1 = PatchProxy.applyOneRefs(uoc, uoe2, uoe, "28");
          if (uob1 != PatchProxyResult.class) {
          }else {
             a.p(uoc, "onNext");
             uob1 = uoe2.n.subscribe(uoc);
             a.o(uob1, "mDanmakuVisible.subscribe\(onNext\)");
          }
          this.j(uob1);
          uoe2 = this.D();
          d uod = new d(this);
          Objects.requireNonNull(uoe2);
          b uob2 = PatchProxy.applyTwoRefs(uod, e, uoe2, uoe, "6");
          if (uob2 != PatchProxyResult.class) {
          }else {
             a.p(uod, "onNext");
             a.p(e, "onError");
             uob2 = uoe2.i.subscribe(uod, e);
             a.o(uob2, "captionFoldSubject.subscribe\(onNext, onError\)");
          }
          this.j(uob2);
          return;
       }
    }
    public void m0(boolean p0){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, e.class, "6")) {
          return;
       }
       this.t.c();
       return;
    }
    public final void n0(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       if (this.B != null || (this.C == null || (DanmakuExperimentUtils.T() || this.D != null))) {
          this.b0();
       }else {
          this.c0();
       }
       return;
    }
    public d q(){
       g og = PatchProxy.apply(null, this, e.class, "8");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g();
       }
       return og;
    }
    public c r(){
       h oh = PatchProxy.apply(null, this, e.class, "9");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = new h();
       }
       return oh;
    }
}
