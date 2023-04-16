package com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import rp7.a;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement$b;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement$c;
import crd.a;
import qp7.a;
import v6a.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import p5a.e;
import de5.a;
import jf5.a;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import oq7.j;
import java.lang.Boolean;
import qp7.b;
import xx9.a;
import rf5.u;
import qp7.b1;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement$a;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qp7.d;
import com.kwai.slide.play.detail.danmaku.topguide.a;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.c;
import oq7.i;
import rd5.e;
import com.kwai.framework.player.core.b$b;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.detail.common.danmaku.topguide.BaseOpenCloseGuideElement$onBecomesAttached$1;
import tx9.a;
import msd.l;
import qp7.x0;
import java.util.Objects;
import pp7.b;

public abstract class BaseOpenCloseGuideElement extends DispatchBaseElement	// class@0013f6
{
    public BaseFragment A;
    public QPhoto B;
    public final a C;
    public b t;
    public a u;
    public u v;
    public PublishSubject w;
    public boolean x;
    public final BaseOpenCloseGuideElement$b y;
    public final b$b z;

    public void BaseOpenCloseGuideElement(a p0,a p1){
       a.p(p0, "bizType");
       super(p0, p1);
       this.y = new BaseOpenCloseGuideElement$b(this);
       this.z = new BaseOpenCloseGuideElement$c(this);
       this.C = new a();
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, BaseOpenCloseGuideElement.class, "5")) {
       }else {
          a.p(p0, "callerContext");
          a b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.A = b;
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.B = mPhoto;
          m0 j = p0.j;
          a.o(j, "callerContext.mPlayModule");
          e player = j.getPlayer();
          a.o(player, "callerContext.mPlayModule.player");
          this.t = player;
          j = p0.r;
          a.o(j, "callerContext.mScreenCleanStatusCombination");
          this.u = j;
          b = p0.v.R;
          a.o(b, "callerContext.mPhotoDeta¡­wipeToProfileFeedMovement");
          this.v = b;
          p0 = p0.d;
          a.o(p0, "callerContext.mProgressPublisher");
          this.w = p0;
          PatchProxy.onMethodExit(BaseOpenCloseGuideElement.class, "5");
       }
       return;
    }
    public a f0(a p0){
       j oj = PatchProxy.applyOneRefs(p0, this, BaseOpenCloseGuideElement.class, "13");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j(p0);
       }
       return oj;
    }
    public void j0(boolean p0){
       if (PatchProxy.isSupport(BaseOpenCloseGuideElement.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BaseOpenCloseGuideElement.class, "8")) {
          return;
       }
       this.b0();
       if (this.u0()) {
          return;
       }
       this.o0();
       return;
    }
    public boolean n0(){
       boolean b;
       BaseOpenCloseGuideElement obj = PatchProxy.apply(null, this, BaseOpenCloseGuideElement.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       if (obj == null) {
          a.S("mScreenCleanStatusCombination");
       }
       if (!obj.c()) {
          obj = this.v;
          if (obj == null) {
             a.S("mSwipeToProfileFeedMovement");
          }
          if (obj.u() && this.x == null) {
             b = true;
          label_0039 :
             return b;
          }
       }
    label_0038 :
       b = false;
       goto label_0039 ;
    }
    public void o0(){
       if (PatchProxy.applyVoid(null, this, BaseOpenCloseGuideElement.class, "9")) {
          return;
       }
       this.i(this.y);
       b uob = this.H().A1.subscribe(new BaseOpenCloseGuideElement$a(this));
       a.o(uob, "pageConfig.navigationVid¡­cribe { mIsSeeking = it }");
       this.j(uob);
       return;
    }
    public final BaseFragment p0(){
       BaseOpenCloseGuideElement obj = PatchProxy.apply(null, this, BaseOpenCloseGuideElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj == null) {
          a.S("mFragment");
       }
       return obj;
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, BaseOpenCloseGuideElement.class, "11");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public final QPhoto q0(){
       BaseOpenCloseGuideElement obj = PatchProxy.apply(null, this, BaseOpenCloseGuideElement.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.B;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public c r(){
       i oi = PatchProxy.apply(null, this, BaseOpenCloseGuideElement.class, "12");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = new i();
       }
       return oi;
    }
    public abstract void r0(e p0);
    public void s0(){
       if (PatchProxy.applyVoid(null, this, BaseOpenCloseGuideElement.class, "6")) {
          return;
       }
       BaseOpenCloseGuideElement tt = this.t;
       if (tt == null) {
          a.S("mPlayer");
       }
       tt.w(this.z);
       tt = this.C;
       BaseOpenCloseGuideElement tw = this.w;
       if (tw == null) {
          a.S("mProgressPublisher");
       }
       tt.c(tw.subscribe(new a(new BaseOpenCloseGuideElement$onBecomesAttached$1(this))));
       return;
    }
    public void t0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BaseOpenCloseGuideElement.class, "7")) {
          return;
       }
       this.C.d();
       BaseOpenCloseGuideElement tt = this.t;
       if (tt == null) {
          a.S("mPlayer");
       }
       tt.O(this.z);
       j oj = this.E();
       Objects.requireNonNull(oj);
       if (!PatchProxy.applyVoid(objArray, oj, j.class, "7")) {
          oj.g.f(Boolean.TRUE);
       }
       this.b0();
       return;
    }
    public abstract boolean u0();
}
