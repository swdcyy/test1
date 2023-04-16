package com.kuaishou.nearby_poi.poi.comment.PoiCommentElement;
import bq7.a;
import com.kuaishou.nearby_poi.poi.comment.PoiCommentElement$a;
import nsd.u;
import jh5.a;
import bq7.d;
import rp7.a;
import java.lang.String;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kuaishou.nearby_poi.poi.comment.PoiCommentElement$b;
import qp7.a;
import le5.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qp7.b;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import tkd.b;
import tkd.d;
import xw5.c;
import com.yxcorp.gifshow.entity.QPhoto;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import qn4.k;
import qn4.j;
import java.lang.Boolean;
import qp7.b1;
import qp7.c;
import com.kuaishou.nearby_poi.poi.comment.PoiCommentElement$c;
import erd.g;
import io.reactivex.internal.functions.Functions;
import java.util.Objects;
import crd.b;
import brd.t;
import com.kuaishou.nearby_poi.poi.comment.PoiCommentElement$d;
import com.yxcorp.gifshow.util.rx.RxBus;
import sw5.d;
import t45.d;
import brd.z;
import com.kuaishou.nearby_poi.poi.comment.PoiCommentElement$onBind$3;
import qn4.b;
import msd.l;
import qp7.d;
import qn4.i;
import bq7.f;

public final class PoiCommentElement extends a	// class@000a1b
{
    public QPhoto A;
    public final List B;
    public final PoiCommentElement$b C;
    public String v;
    public Activity w;
    public BaseFragment x;
    public String y;
    public int z;
    public static final PoiCommentElement$a D;

    static {
       PoiCommentElement.D = new PoiCommentElement$a(null);
    }
    public void PoiCommentElement(a p0){
       super(d.d, p0);
       this.y = "";
       String[] stringArray = new String[]{"one","two","three","four","five"};
       this.B = CollectionsKt__CollectionsKt.L(stringArray);
       this.C = new PoiCommentElement$b(this);
    }
    public void P(a p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, PoiCommentElement.class, "2")) {
       }else {
          a.p(p0, "callerContext");
          super.P(p0);
          a = p0.a;
          a.o(a, "callerContext.mActivity");
          this.w = a;
          a = p0.b;
          a.o(a, "callerContext.mFragment");
          this.x = a;
          PoiCommentElement tw = this.w;
          String str = "mActivity";
          if (tw == null) {
             a.S(str);
          }
          PoiCommentElement tw1 = this.w;
          if (tw1 == null) {
             a.S(str);
          }
          this.z = n.P(tw, (float)n.z(tw1));
          this.A = p0.c.mPhoto;
       }
       return;
    }
    public void S(){
       if (PatchProxy.applyVoid(null, this, PoiCommentElement.class, "10")) {
          return;
       }
       PoiCommentElement tA = this.A;
       if (tA != null) {
          d.a(0x1e777b83).LW(tA);
       }
       return;
    }
    public a f0(a p0){
       k ok = PatchProxy.applyOneRefs(p0, this, PoiCommentElement.class, "11");
       if (ok != PatchProxyResult.class) {
       }else {
          ok = new k(null, 1, null);
       }
       return ok;
    }
    public void j0(boolean p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j oj = j.class;
       PoiCommentElement poiCommentEl = PoiCommentElement.class;
       if (PatchProxy.isSupport(poiCommentEl) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, poiCommentEl, "3")) {
          return;
       }
       this.i(this.C);
       this.b0();
       PoiCommentElement tA = this.A;
       a.m(tA);
       if (this.s0(tA)) {
          this.b0();
          return;
       }else {
          j oj1 = this.A();
          PoiCommentElement$c uoc = new PoiCommentElement$c(this);
          g og = Functions.d();
          String str = "Functions.emptyConsumer\(\)";
          a.o(og, str);
          Objects.requireNonNull(oj1);
          b uob = PatchProxy.applyTwoRefs(uoc, og, oj1, oj, "2");
          if (uob != patchProxyRe) {
          }else {
             a.p(uoc, "onNext");
             a.p(og, "onError");
             uob = oj1.a.subscribe(uoc, og);
             a.o(uob, "commentCloseClickSubject¡­ubscribe\(onNext, onError\)");
          }
          this.j(uob);
          oj1 = this.A();
          PoiCommentElement$d uod = new PoiCommentElement$d(this);
          og = Functions.d();
          a.o(og, str);
          Objects.requireNonNull(oj1);
          b uob1 = PatchProxy.applyTwoRefs(uod, og, oj1, oj, "4");
          if (uob1 != patchProxyRe) {
          }else {
             a.p(uod, "onNext");
             a.p(og, "onError");
             uob1 = oj1.b.subscribe(uod, og);
             a.o(uob1, "commentStarClickSubject.subscribe\(onNext, onError\)");
          }
          this.j(uob1);
          b uob2 = RxBus.f.f(d.class).observeOn(d.a).subscribe(new b(new PoiCommentElement$onBind$3(this)));
          a.o(uob2, "RxBus.INSTANCE.toObserva¡­e\(this::processHideEvent\)");
          this.j(uob2);
          return;
       }
    }
    public d q(){
       i oi = PatchProxy.apply(null, this, PoiCommentElement.class, "12");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = new i();
       }
       return oi;
    }
    public c r(){
       j oj = PatchProxy.apply(null, this, PoiCommentElement.class, "13");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j();
       }
       return oj;
    }
    public final void r0(){
       if (PatchProxy.applyVoid(null, this, PoiCommentElement.class, "5")) {
          return;
       }
       f uof = new f(false, true, true);
       uof.c(true);
       a.o(uof, "BottomPanelVisibilityEve¡­true\).setPoiComment\(true\)");
       this.o0(uof, 250);
       return;
    }
    public final boolean s0(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PoiCommentElement.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getPostWorkInfoId() < 0)? true: false;
       return b;
    }
}
