package com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$a;
import nsd.u;
import jh5.a;
import fq7.a;
import rp7.a;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$b;
import android.os.Looper;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$mAttachChangedListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import rf5.u;
import java.lang.String;
import kotlin.jvm.internal.a;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import jf5.a;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import iq7.j;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import bf5.r;
import bf5.d;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qp7.b1;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$d;
import qp7.g;
import fq7.c;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$e;
import java.util.Objects;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$f;
import io.reactivex.g;
import brd.z;
import io.reactivex.android.schedulers.a;
import lrd.b;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$g;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$h;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import j06.a;
import m9a.y;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.components.feedmodel.ProgressHighLightInfo;
import com.kuaishou.android.model.mix.w;
import android.os.Handler;
import qp7.x0;
import qp7.d;
import iq7.a;
import tkd.b;
import tkd.d;
import wjc.l;
import com.kuaishou.android.model.mix.PhotoDisplayLocationInfo;
import com.kuaishou.android.model.mix.CommonMeta;
import wjc.l$a;
import qp7.c;
import iq7.i;

public final class ProgressPreviewElement extends DispatchBaseElement	// class@0013c1
{
    public a A;
    public c B;
    public BaseFragment C;
    public a D;
    public a E;
    public u F;
    public PublishSubject G;
    public d H;
    public boolean I;
    public v J;
    public final Handler K;
    public final p L;
    public boolean t;
    public boolean u;
    public boolean v;
    public long w;
    public boolean x;
    public SlidePlayViewModel y;
    public QPhoto z;
    public static final ProgressPreviewElement$a M;

    static {
       ProgressPreviewElement.M = new ProgressPreviewElement$a(null);
    }
    public void ProgressPreviewElement(a p0){
       super(a.a, p0);
       this.I = true;
       this.K = new ProgressPreviewElement$b(this, Looper.getMainLooper());
       this.L = s.c(new ProgressPreviewElement$mAttachChangedListener$2(this));
    }
    public static final u n0(ProgressPreviewElement p0){
       p0 = p0.F;
       if (p0 == null) {
          a.S("mSwipeToProfileFeedMovement");
       }
       return p0;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ProgressPreviewElement.class, "1")) {
       }else {
          a.p(p0, "callerContext");
          m0 o = p0.o;
          a.o(o, "callerContext.mLogListener");
          this.E = o;
          o = p0.r;
          a.o(o, "callerContext.mScreenCleanStatusCombination");
          this.D = o;
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.z = mPhoto;
          a b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.C = b;
          o = p0.j;
          a.o(o, "callerContext.mPlayModule");
          this.A = o;
          this.G = this.H().R1;
          o = p0.k;
          a.o(o, "callerContext.mPlayInfoListenerBundle");
          this.B = o;
          p0 = p0.v.R;
          a.o(p0, "callerContext.mPhotoDeta¡­wipeToProfileFeedMovement");
          this.F = p0;
          this.I = true;
          PatchProxy.onMethodExit(ProgressPreviewElement.class, "1");
       }
       return;
    }
    public a f0(a p0){
       j oj = PatchProxy.applyOneRefs(p0, this, ProgressPreviewElement.class, "12");
       if (oj != PatchProxyResult.class) {
       }else {
          oj = new j(p0);
       }
       return oj;
    }
    public void j0(boolean p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ProgressPreviewElement progressPrev = ProgressPreviewElement.class;
       if (PatchProxy.isSupport(progressPrev) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, progressPrev, "5")) {
          return;
       }
       ProgressPreviewElement tC = this.C;
       String str = "mFragment";
       if (tC == null) {
          a.S(str);
       }
       Fragment parentFragme = tC.getParentFragment();
       Object[] objArray = null;
       if (!parentFragme instanceof r) {
          parentFragme = objArray;
       }
       d uod = (parentFragme != null)? parentFragme.j6(): objArray;
       this.H = uod;
       Object[] objArray1 = new Object[0];
       o.C().w("ProgressPreviewElement", "tryHide onBind "+this.s(), objArray1);
       this.b0();
       tC = this.C;
       if (tC == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tC.getParentFragment());
       a.m(slidePlayVie);
       this.y = slidePlayVie;
       b b1 uob1 = PatchProxy.apply(objArray, this, progressPrev, "2");
       if (uob1 == patchProxyRe) {
          uob1 = this.L.getValue();
       }
       this.i(uob1);
       g e = Functions.e;
       b uob = this.H().B1.subscribe(new ProgressPreviewElement$c(this), e);
       a.o(uob, "pageConfig.videoProgress¡­Functions.ERROR_CONSUMER\)");
       this.j(uob);
       uob = this.H().A1.subscribe(new ProgressPreviewElement$d(this), e);
       a.o(uob, "pageConfig.navigationVid¡­Functions.ERROR_CONSUMER\)");
       this.j(uob);
       c uoc = this.D();
       ProgressPreviewElement$e uoe = new ProgressPreviewElement$e(this);
       e = Functions.d();
       a.o(e, "Functions.emptyConsumer\(\)");
       Objects.requireNonNull(uoc);
       uob1 = PatchProxy.applyTwoRefs(uoe, e, uoc, c.class, "1");
       if (uob1 != patchProxyRe) {
       }else {
          a.p(uoe, "consumer");
          a.p(e, "error");
          uob1 = uoc.b.subscribe(uoe, e);
          a.o(uob1, "sidebarProgressTrackingS¡­ubscribe\(consumer, error\)");
       }
       this.j(uob1);
       uob = t.create(new ProgressPreviewElement$f(this)).distinct().buffer(5).observeOn(a.c()).subscribeOn(b.c()).subscribe(new ProgressPreviewElement$g(this));
       a.o(uob, "Observable.create\(Observ¡­rite\(it.last\(\)\)\n        }");
       this.j(uob);
       tC = this.G;
       if (tC != null) {
          a.m(tC);
          uob = tC.subscribe(new ProgressPreviewElement$h(this));
          a.o(uob, "mCoronaPayPanelSubject!!¡­yHide\(\)\n        }\n      }");
          this.j(uob);
       }
       return;
    }
    public void m0(boolean p0){
    }
    public final boolean o0(){
       float f;
       ProgressPreviewElement obj = PatchProxy.apply(null, this, ProgressPreviewElement.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.z;
       String str = "mPhoto";
       if (obj == null) {
          a.S(str);
       }
       if (a.a(obj.getEntity())) {
          obj = this.z;
          if (obj == null) {
             a.S(str);
          }
          f = y.e(obj);
       }else {
          f = null;
       }
       ProgressPreviewElement tz = this.z;
       if (tz == null) {
          a.S(str);
       }
       boolean b = false;
       if (tz.getPhotoMeta() != null) {
          tz = this.z;
          if (tz == null) {
             a.S(str);
          }
          if (w.R(tz.getEntity()) != null) {
             tz = this.z;
             if (tz == null) {
                a.S(str);
             }
             ProgressHighLightInfo[] progressHigh = w.R(tz.getEntity());
             a.o(progressHigh, "PhotoMetaExt.getHighLightInfo\(mPhoto.entity\)");
             int i = (!progressHigh.length)? 1: 0;
             if ((i ^ 1) && (f <= 0 || f - 0x3f800000 >= 0)) {
                obj = this.y;
                if (obj == null) {
                   a.S("mSlidePlayViewModel");
                }
                if (!obj.r()) {
                   b = true;
                }
             }
          }
       }
    label_008c :
       return b;
    }
    public final void p0(){
       if (PatchProxy.applyVoid(null, this, ProgressPreviewElement.class, "11")) {
          return;
       }
       this.K.removeMessages(1);
       this.E().h(false);
       return;
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, ProgressPreviewElement.class, "14");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public final void q0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProgressPreviewElement.class, "6")) {
          return;
       }
       b uob = d.a(0x46ffacbc);
       ProgressPreviewElement tz = this.z;
       String str = "mPhoto";
       if (tz == null) {
          a.S(str);
       }
       if (!uob.qa(tz.getPhotoId())) {
          tz = this.z;
          if (tz == null) {
             a.S(str);
          }
          String photoId = tz.getPhotoId();
          ProgressPreviewElement tz1 = this.z;
          if (tz1 == null) {
             a.S(str);
          }
          boolean b = (tz1.getPhotoDisplayLocationInfo() != null)? true: false;
          ProgressPreviewElement tz2 = this.z;
          if (tz2 == null) {
             a.S(str);
          }
          CommonMeta commonMeta = tz2.getCommonMeta();
          if (commonMeta != null) {
             objArray = commonMeta.mSourcePhotoPage;
          }
          uob.Q30(photoId, b, objArray, "1", null);
       }
       return;
    }
    public c r(){
       i oi = PatchProxy.apply(null, this, ProgressPreviewElement.class, "13");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = new i();
       }
       return oi;
    }
    public String s(){
       Object[] objArray = null;
       ProgressPreviewElement obj = PatchProxy.apply(objArray, this, ProgressPreviewElement.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.z;
       if (obj != null) {
          if (obj == null) {
             a.S("mPhoto");
          }
          objArray = obj.getCaption();
       }
       return objArray;
    }
}
