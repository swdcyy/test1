package com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$a;
import nsd.u;
import com.yxcorp.gifshow.activity.GifshowActivity;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hs7.d;
import rp7.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$mTipsBottomMargin$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$d;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$e;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$c;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.a;
import v6a.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import wq6.d;
import as6.a;
import jf5.a;
import uy6.h;
import uy6.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import k2b.u1;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import js7.o;
import java.lang.Boolean;
import qp7.b;
import fr6.a;
import fr6.e;
import jta.c;
import rf5.u;
import qp7.x0;
import com.kuaishou.android.model.mix.PhotoMeta;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$f;
import erd.g;
import crd.b;
import xy5.j;
import java.lang.Number;
import tkd.b;
import tkd.d;
import gx5.b;
import qp7.c;
import js7.n;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$g;
import io.reactivex.internal.functions.Functions;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$h;
import qp7.b1;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$i;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$j;
import qp7.t0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$k;
import ekd.k1;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$b;
import w4.j;
import sf5.b;
import qp7.d;
import js7.a;
import java.lang.Integer;
import java.lang.Long;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import lnc.b9;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$l;

public final class CollectElement extends DispatchBaseElement	// class@0014a1
{
    public b A;
    public d B;
    public u C;
    public final long D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public int I;
    public boolean J;
    public boolean K;
    public int L;
    public final p M;
    public final e N;
    public final c O;
    public final ViewPager$i P;
    public final GifshowActivity Q;
    public m0 t;
    public PhotoDetailParam u;
    public QPhoto v;
    public j w;
    public BaseFragment x;
    public SlidePlayViewModel y;
    public b z;
    public static final CollectElement$a R;

    static {
       CollectElement.R = new CollectElement$a(null);
    }
    public void CollectElement(GifshowActivity p0,a p1){
       a.p(p0, "mActivity");
       super(d.p.a(), p1);
       this.Q = p0;
       this.D = 1;
       this.F = 1;
       this.G = 2;
       this.H = 3;
       this.I = this.E;
       this.M = s.c(new CollectElement$mTipsBottomMargin$2(this));
       this.N = new CollectElement$d(this);
       this.O = new CollectElement$e(this);
       this.P = new CollectElement$c(this);
    }
    public static final QPhoto n0(CollectElement p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public static void s0(CollectElement p0,boolean p1,int p2,int p3,Object p4){
       CollectElement f;
       if (p3 & 0x02) {
          f = p0.F;
       }
       p0.r0(p1, f);
       return;
    }
    public void P(a p0){
       CollectElement tx;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, CollectElement.class, "5")) {
       }else {
          a.p(p0, "callerContext");
          a c = p0.c;
          a.o(c, "callerContext.mPhotoDetailParam");
          this.u = c;
          if (c == null) {
             a.S("mParam");
          }
          PhotoDetailParam mPhoto = c.mPhoto;
          a.o(mPhoto, "mParam.mPhoto");
          this.v = mPhoto;
          c = p0.b;
          a.o(c, "callerContext.mFragment");
          this.x = c;
          if (c == null) {
             a.S("mFragment");
          }
          if (c.getParentFragment() != null) {
             tx = this.x;
             if (tx == null) {
                a.S("mFragment");
             }
             this.y = SlidePlayViewModel.B0(tx.getParentFragment());
          }
          this.t = p0;
          tx = this.x;
          if (tx == null) {
             a.S("mFragment");
          }
          this.B = a.e(tx);
          this.C = p0.v.R;
          PatchProxy.onMethodExit(CollectElement.class, "5");
       }
       return;
    }
    public void S(){
       CollectElement uCollectElem = CollectElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uCollectElem, "12")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uCollectElem, "18") && h.a.r == null) {
          uCollectElem = this.u;
          if (uCollectElem == null) {
             a.S("mParam");
          }
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          PhotoDetailParam mPhoto = uCollectElem.mPhoto;
          String str = "mPhoto";
          a.o(mPhoto, str);
          uContentPack.photoPackage = w1.f(mPhoto.getEntity());
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "COLLECTION_BUTTON";
          i3 oi3 = i3.f();
          PhotoDetailParam mPhoto1 = uCollectElem.mPhoto;
          a.o(mPhoto1, str);
          String str1 = (mPhoto1.isCollected())? "CANCEL_COLLECTION": "TO_COLLECTION";
          oi3.d("collection_type", str1);
          oi3.d("source", "RIGHT_BAR");
          uElementPack.params = oi3.e();
          uCollectElem = this.x;
          if (uCollectElem == null) {
             a.S("mFragment");
          }
          u1.C0("", uCollectElem, 6, uElementPack, uContentPack);
       }
       return;
    }
    public a f0(a p0){
       o oo = PatchProxy.applyOneRefs(p0, this, CollectElement.class, "2");
       if (oo != PatchProxyResult.class) {
       }else {
          oo = new o(p0);
       }
       return oo;
    }
    public void j0(boolean p0){
       o oo;
       CollectElement tv;
       b uob;
       CollectElement uCollectElem = CollectElement.class;
       if (PatchProxy.isSupport(uCollectElem) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCollectElem, "6")) {
          return;
       }
       this.c0();
       CollectElement tB = this.B;
       if (tB != null) {
          a uoa = tB.b0();
          if (uoa != null) {
             uoa.a(this.N);
          }
       }
       tB = this.C;
       if (tB != null) {
          tB.j(this.O);
       }
       if (h.a.j == null) {
          oo = this.E();
          tv = this.v;
          if (tv == null) {
             a.S("mPhoto");
          }
          oo.l(tv.isCollected());
          oo = this.E();
          tv = this.v;
          if (tv == null) {
             a.S("mPhoto");
          }
          oo.m(tv.numberOfCollects());
       }
       tB = this.v;
       if (tB == null) {
          a.S("mPhoto");
       }
       PhotoMeta photoMeta = tB.getPhotoMeta();
       if (photoMeta != null) {
          uob = photoMeta.observable().subscribe(new CollectElement$f(this));
          a.o(uob, "it.observable\(\).subscrib¡­mberOfCollects\(\)\)\n      }");
          this.j(uob);
       }
       tv = this.v;
       if (tv == null) {
          a.S("mPhoto");
       }
       j oj = new j(tv);
       oj.f();
       Number number = PatchProxy.apply(null, this, uCollectElem, "1");
       if (number == PatchProxyResult.class) {
          number = this.M.getValue();
       }
       oj.l(number.intValue());
       a.o(oj, "PhotoCollectHelper\(mPhot¡­Margin\(mTipsBottomMargin\)");
       this.w = oj;
       tB = this.u;
       if (tB == null) {
          a.S("mParam");
       }
       if (tB != null) {
          b uob1 = d.a(0x3673894c);
          tv = this.w;
          if (tv == null) {
             a.S("mCollectHelper");
          }
          a.m(tv);
          uob1.Vk(tv, tB.getSource(), tB.getBizType());
       }
       g e = Functions.e;
       a.o(e, "Functions.ERROR_CONSUMER");
       this.j(this.A().c(new CollectElement$g(this), e));
       tB = this.y;
       if (tB != null) {
          tB.i(this.P);
       }
       this.i(new CollectElement$h(this));
       this.o0();
       oo = this.E();
       uCollectElem = this.v;
       if (uCollectElem == null) {
          a.S("mPhoto");
       }
       oo.l(uCollectElem.isCollected());
       oo = this.E();
       uCollectElem = this.v;
       if (uCollectElem == null) {
          a.S("mPhoto");
       }
       oo.m(uCollectElem.numberOfCollects());
       this.j(this.A().a(new CollectElement$i(this)));
       this.j(this.A().b(new CollectElement$j(this)));
       uob = this.H().u1.subscribe(new CollectElement$k(this));
       a.o(uob, "pageConfig.showCommentDi¡­ntPanelShowd = true\n    }");
       this.j(uob);
       return;
    }
    public void m0(boolean p0){
       CollectElement uCollectElem = CollectElement.class;
       if (PatchProxy.isSupport(uCollectElem) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uCollectElem, "7")) {
          return;
       }
       k1.n(this);
       this.I = this.E;
       this.E().j(true);
       this.E().j(false);
       CollectElement ty = this.y;
       if (ty != null) {
          ty.g(this.P);
       }
       ty = this.B;
       if (ty != null) {
          a uoa = ty.b0();
          if (uoa != null) {
             uoa.d(this.N);
          }
       }
       ty = this.C;
       if (ty != null) {
          ty.B(this.O);
       }
       return;
    }
    public final void o0(){
       if (PatchProxy.applyVoid(null, this, CollectElement.class, "17")) {
          return;
       }
       this.E().g();
       return;
    }
    public final String p0(boolean p0){
       CollectElement uCollectElem = CollectElement.class;
       if (PatchProxy.isSupport(uCollectElem)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uCollectElem, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(p0, new CollectElement$b(this));
    }
    public d q(){
       a uoa = PatchProxy.apply(null, this, CollectElement.class, "3");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = new a();
       }
       return uoa;
    }
    public final GifshowActivity q0(){
       return this.Q;
    }
    public c r(){
       n on = PatchProxy.apply(null, this, CollectElement.class, "4");
       if (on != PatchProxyResult.class) {
       }else {
          on = new n();
       }
       return on;
    }
    public final void r0(boolean p0,int p1){
       CollectElement uCollectElem = CollectElement.class;
       if (PatchProxy.isSupport(uCollectElem) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uCollectElem, "19")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       CollectElement tv = this.v;
       if (tv == null) {
          a.S("mPhoto");
       }
       uContentPack.photoPackage = w1.f(tv.getEntity());
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       String str = (p0)? "COLLECTION_BUBBLE": "COLLECTION_LOTTIE";
       uElementPack.action2 = str;
       if (p0) {
          i3 oi3 = i3.f();
          if (p1 == this.G) {
             oi3.d("bubble_type", "KSBubbleId_11009");
          }else if(p1 == this.H){
             oi3.d("bubble_type", "KSBubbleId_11012");
          }else {
             oi3.d("bubble_type", "KSBubbleId_11008");
          }
          uElementPack.params = oi3.e();
       }
       CollectElement tx = this.x;
       if (tx == null) {
          a.S("mFragment");
       }
       u1.C0("", tx, 0, uElementPack, uContentPack);
       return;
    }
    public final void t0(long p0,String p1){
       CollectElement uCollectElem = CollectElement.class;
       if (PatchProxy.isSupport(uCollectElem) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uCollectElem, "9")) {
          return;
       }
       Log.g("CollectElementTag", "showStrongTipBubble: delayTime:"+p0+", text:"+p1);
       b9.a(this.z);
       this.z = t.just(Boolean.TRUE).delay(p0, TimeUnit.SECONDS).observeOn(d.a).subscribe(new CollectElement$l(this, p1));
       return;
    }
}
