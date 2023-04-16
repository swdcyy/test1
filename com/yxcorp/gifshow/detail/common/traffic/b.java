package com.yxcorp.gifshow.detail.common.traffic.b;
import qp7.b;
import zs7.a;
import rp7.a;
import com.yxcorp.gifshow.detail.common.traffic.b$a;
import com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.b1;
import at7.f;
import zz9.a;
import java.util.Objects;
import crd.b;
import kotlin.jvm.internal.a;
import erd.g;
import brd.t;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl$b;
import com.yxcorp.gifshow.detail.common.traffic.a;
import io.reactivex.internal.functions.Functions;
import qp7.a;
import v6a.m0;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import p1a.a$a;
import p1a.a;
import ekd.k1;
import qp7.d;
import at7.e;
import qp7.c;
import qp7.x0;
import at7.g;

public class b extends b	// class@0014f8
{
    public QPhoto q;
    public BaseFragment r;
    public a s;
    public boolean t;
    public final b1 u;

    public void b(){
       super(a.b);
       this.t = false;
       this.u = new b$a(this);
    }
    public void O(){
       SlidePlayTrafficViewModelImpl slidePlayTra = SlidePlayTrafficViewModelImpl.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "1")) {
          return;
       }
       this.b0();
       this.i(this.u);
       b ti = this.i;
       a uoa = new a(this);
       Objects.requireNonNull(ti);
       b uob = PatchProxy.applyOneRefs(uoa, ti, f.class, "2");
       if (uob != patchProxyRe) {
       }else {
          a.p(uoa, "onNext");
          uob = ti.a.subscribe(uoa);
          a.o(uob, "mAnimHideEnd.subscribe\(onNext\)");
       }
       this.j(uob);
       FragmentActivity uFragmentAct = this.r.requireActivity();
       SlidePlayTrafficViewModelImpl slidePlayTra1 = PatchProxy.applyOneRefs(uFragmentAct, objArray, slidePlayTra, "6");
       if (slidePlayTra1 != patchProxyRe) {
       }else {
          slidePlayTra1 = SlidePlayTrafficViewModelImpl.h.a(uFragmentAct);
       }
       a uoa1 = new a(this);
       g e = Functions.e;
       Objects.requireNonNull(slidePlayTra1);
       b uob1 = PatchProxy.applyTwoRefs(uoa1, e, slidePlayTra1, slidePlayTra, "2");
       if (uob1 != patchProxyRe) {
       }else {
          a.p(uoa1, "onNext");
          a.p(e, "onError");
          uob1 = slidePlayTra1.e.subscribe(uoa1, e);
          a.o(uob1, "trafficToastPublisher.subscribe\(onNext, onError\)");
       }
       this.j(uob1);
       return;
    }
    public void P(a p0){
       this.q = p0.c.mPhoto;
       this.r = p0.b;
       this.s = p0.o;
    }
    public void S(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "6")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "7")) {
          a$a uoa = new a$a(6, 0, "VIDEO_SAVEFLOW_TIPS_CARD");
          uoa.f("VIDEO_SAVEFLOW_TIPS_CARD");
          this.s.b(uoa);
       }
       return;
    }
    public void T(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       k1.n(this);
       return;
    }
    public d q(){
       e uoe = PatchProxy.apply(null, this, b.class, "4");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e();
       }
       return uoe;
    }
    public c r(){
       f uof = PatchProxy.apply(null, this, b.class, "5");
       if (uof != PatchProxyResult.class) {
       }else {
          uof = new f();
       }
       return uof;
    }
    public x0 t(){
       g og = PatchProxy.apply(null, this, b.class, "3");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g();
       }
       return og;
    }
}
