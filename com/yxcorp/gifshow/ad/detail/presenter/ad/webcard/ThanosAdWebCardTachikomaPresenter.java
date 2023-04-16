package com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.tachikoma.a;
import java.util.HashMap;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$mEnableBindReset$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$e;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$d;
import z49.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import de5.a;
import a59.f;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import mxb.c;
import s09.b;
import q09.a;
import q09.b;
import x49.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.l$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import java.util.List;
import com.yxcorp.gifshow.ad.report.monitor.DynamicMonitorFactory;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$onBind$1;
import com.kwai.framework.model.feed.BaseFeed;
import msd.l;
import cm9.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$i;
import android.app.Activity;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$initBridgeGroup$1;
import y49.h;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$initBridgeGroup$2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$initBridgeGroup$3;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$initBridgeGroup$4;
import mxb.u;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import a59.j;
import a59.k;
import msd.r;
import java.lang.Integer;
import java.util.Map;
import gr.c;
import com.kwai.framework.player.core.b;
import io.reactivex.subjects.PublishSubject;
import yx.j0;
import android.view.ViewGroup;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import com.yxcorp.gifshow.util.rx.RxBus;
import a59.g;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$g;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.photoad.CommonCardType;
import com.yxcorp.gifshow.photoad.CommonCardType$a;
import n49.s;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.photoad.download.h;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask$DownloadStatus;
import im8.f;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$c;
import t09.a;
import android.view.View;
import com.yxcorp.gifshow.ad.util.i$c;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.animation.AdWebCardAnimationDelegate;
import java.lang.StringBuilder;
import x49.q;
import mxb.j0;
import com.yxcorp.gifshow.photoad.o;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webcard.ThanosAdWebCardTachikomaPresenter$j;
import ekd.m1;
import n49.o;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Long;
import java.lang.Runnable;

public final class ThanosAdWebCardTachikomaPresenter extends PresenterV2	// class@00162b
{
    public b A;
    public PublishSubject B;
    public BaseFragment C;
    public ViewGroup D;
    public FrameLayout E;
    public ViewGroup F;
    public int G;
    public int H;
    public boolean I;
    public PhotoAdvertisement$TkTemplateData J;
    public PhotoAdvertisement$TkTemplateInfo K;
    public AdWebCardAnimationDelegate L;
    public final a M;
    public boolean N;
    public boolean O;
    public HashMap P;
    public final p Q;
    public final IMediaPlayer$OnInfoListener R;
    public final Runnable S;
    public final ThanosAdWebCardTachikomaPresenter$b T;
    public a U;
    public final a V;
    public boolean p;
    public c q;
    public a r;
    public f s;
    public QPhoto t;
    public o u;
    public List v;
    public a w;
    public f x;
    public PhotoDetailParam y;
    public c z;
    public static final ThanosAdWebCardTachikomaPresenter$a W;

    static {
       ThanosAdWebCardTachikomaPresenter.W = new ThanosAdWebCardTachikomaPresenter$a(null);
    }
    public void ThanosAdWebCardTachikomaPresenter(){
       super();
       this.H = -1;
       this.M = new a();
       this.P = new HashMap(8);
       this.Q = s.c(ThanosAdWebCardTachikomaPresenter$mEnableBindReset$2.INSTANCE);
       this.R = new ThanosAdWebCardTachikomaPresenter$f(this);
       this.S = new ThanosAdWebCardTachikomaPresenter$e(this);
       this.T = new ThanosAdWebCardTachikomaPresenter$b(this);
       this.V = new ThanosAdWebCardTachikomaPresenter$d(this);
    }
    public static final a P8(ThanosAdWebCardTachikomaPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mAdWebBridgeGroup");
       }
       return p0;
    }
    public static final QPhoto R8(ThanosAdWebCardTachikomaPresenter p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mPhoto");
       }
       return p0;
    }
    public static final a S8(ThanosAdWebCardTachikomaPresenter p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mPlayModule");
       }
       return p0;
    }
    public static final f V8(ThanosAdWebCardTachikomaPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mTkBridgeContext");
       }
       return p0;
    }
    public void E8(){
       l$a a;
       DynamicMonitorFactory c;
       PhotoAdvertisement$TkTemplateInfo tkTemplateIn = this;
       ThanosAdWebCardTachikomaPresenter thanosAdWebC = ThanosAdWebCardTachikomaPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tkTemplateIn, thanosAdWebC, "12")) {
          return;
       }
       if (this.Y8()) {
          this.e9();
       }
       ThanosAdWebCardTachikomaPresenter t = tkTemplateIn.t;
       String str = "mPhoto";
       if (t == null) {
          a.S(str);
       }
       if (c.W(k.B(t))) {
          if (!PatchProxy.applyVoid(objArray, tkTemplateIn, thanosAdWebC, "14")) {
             t = tkTemplateIn.A;
             if (t != null) {
                t.c(new b(tkTemplateIn));
             }
          }
       }else if(!this.W8()){
          return;
       }
       t = tkTemplateIn.t;
       if (t == null) {
          a.S(str);
       }
       String str1 = c.l(k.B(t));
       a = l.a;
       ThanosAdWebCardTachikomaPresenter t1 = tkTemplateIn.t;
       if (t1 == null) {
          a.S(str);
       }
       PhotoAdvertisement photoAdverti = k.B(t1);
       a.m(photoAdverti);
       String str2 = "CommercialFeedExt.getPhotoAd\(mPhoto\)!!";
       a.o(photoAdverti, str2);
       tkTemplateIn.K = a.a(str1, photoAdverti);
       t1 = tkTemplateIn.t;
       if (t1 == null) {
          a.S(str);
       }
       photoAdverti = k.B(t1);
       a.m(photoAdverti);
       a.o(photoAdverti, str2);
       tkTemplateIn.J = a.b(str1, photoAdverti);
       if (!PatchProxy.applyVoid(objArray, tkTemplateIn, thanosAdWebC, "20")) {
          t = tkTemplateIn.E;
          if (t != null) {
             t.removeAllViews();
          }
          t = tkTemplateIn.E;
          if (t != null) {
             t.setVisibility(4);
          }
          t = tkTemplateIn.E;
          ViewGroup$LayoutParams layoutParams = (t != null)? t.getLayoutParams(): objArray;
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.bottomMargin = a1.e(-10.00f);
       }
       t = tkTemplateIn.v;
       if (t == null) {
          a.S("mAttachListeners");
       }
       t.add(tkTemplateIn.V);
       c = DynamicMonitorFactory.c;
       t = tkTemplateIn.t;
       if (t == null) {
          a.S(str);
       }
       QPhoto mEntity = t.mEntity;
       a.o(mEntity, "mPhoto.mEntity");
       t = tkTemplateIn.C;
       if (t == null) {
          a.S("mFragment");
       }
       tkTemplateIn.U = c.F("ad_detail_page", "ad_detail_page_tk_card", mEntity, t.m(), new ThanosAdWebCardTachikomaPresenter$onBind$1(tkTemplateIn));
       ThanosAdWebCardTachikomaPresenter$i oi = new ThanosAdWebCardTachikomaPresenter$i(tkTemplateIn);
       if (!PatchProxy.applyVoidOneRefs(oi, tkTemplateIn, thanosAdWebC, "25")) {
          t1 = tkTemplateIn.t;
          if (t1 == null) {
             a.S(str);
          }
          photoAdverti = k.B(t1);
          str2 = c.l(photoAdverti);
          a.m(photoAdverti);
          PhotoAdvertisement$TkTemplateData tkTemplateDa = a.b(str2, photoAdverti);
          PhotoAdvertisement$TkTemplateInfo tkTemplateIn1 = a.a(str2, photoAdverti);
          Activity activity = this.getActivity();
          ThanosAdWebCardTachikomaPresenter t3 = tkTemplateIn.t;
          if (t3 == null) {
             a.S(str);
          }
          ThanosAdWebCardTachikomaPresenter u = tkTemplateIn.u;
          if (u == null) {
             a.S("mPhotoAdActionBarClickProcessor");
          }
          ThanosAdWebCardTachikomaPresenter y = tkTemplateIn.y;
          if (y == null) {
             a.S("mDetailParam");
          }
          ThanosAdWebCardTachikomaPresenter z = tkTemplateIn.z;
          if (z == null) {
             a.S("mStateLogger");
          }
          ThanosAdWebCardTachikomaPresenter$initBridgeGroup$1 oinitBridgeG = str2;
          ThanosAdWebCardTachikomaPresenter$initBridgeGroup$1 oinitBridgeG1 = new ThanosAdWebCardTachikomaPresenter$initBridgeGroup$1(oi);
          ThanosAdWebCardTachikomaPresenter$initBridgeGroup$2 oinitBridgeG2 = oinitBridgeG1;
          ThanosAdWebCardTachikomaPresenter$initBridgeGroup$2 oinitBridgeG3 = new ThanosAdWebCardTachikomaPresenter$initBridgeGroup$2(oi);
          ThanosAdWebCardTachikomaPresenter$initBridgeGroup$3 oinitBridgeG4 = oinitBridgeG3;
          ThanosAdWebCardTachikomaPresenter$initBridgeGroup$3 oinitBridgeG5 = new ThanosAdWebCardTachikomaPresenter$initBridgeGroup$3(oi);
          ThanosAdWebCardTachikomaPresenter$initBridgeGroup$4 oinitBridgeG6 = oi;
          ThanosAdWebCardTachikomaPresenter$initBridgeGroup$4 oinitBridgeG7 = new ThanosAdWebCardTachikomaPresenter$initBridgeGroup$4(tkTemplateIn, photoAdverti);
          f uof = new f(activity, t3, tkTemplateIn1, u, tkTemplateDa, y, z, null, oinitBridgeG, null, null, oinitBridgeG2, oinitBridgeG4, null, null, oinitBridgeG6, tkTemplateIn.q, null, null, 0x66680, null);
          tkTemplateIn.s = a;
          ThanosAdWebCardTachikomaPresenter s = tkTemplateIn.s;
          if (s == null) {
             a.S("mTkBridgeContext");
          }
          tkTemplateIn.r = new a(s);
       }
       if (!PatchProxy.applyVoid(objArray, tkTemplateIn, thanosAdWebC, "16")) {
          objArray = new Object[0];
          j0.l("TachikomaWebCard", String.valueOf(tkTemplateIn.K), objArray);
          thanosAdWebC = tkTemplateIn.M;
          ThanosAdWebCardTachikomaPresenter t2 = tkTemplateIn.t;
          if (t2 == null) {
             a.S(str);
          }
          thanosAdWebC.o(t2);
          thanosAdWebC = tkTemplateIn.M;
          t2 = tkTemplateIn.E;
          t = tkTemplateIn.r;
          if (t == null) {
             a.S("mAdWebBridgeGroup");
          }
          thanosAdWebC.a(t2, t, true);
       }
       tkTemplateIn.X7(RxBus.f.f(g.class).observeOn(d.a).subscribe(new ThanosAdWebCardTachikomaPresenter$g(tkTemplateIn)));
       thanosAdWebC = tkTemplateIn.B;
       if (thanosAdWebC == null) {
          a.S("mCardToggleStateSubject");
       }
       tkTemplateIn.X7(thanosAdWebC.subscribe(new ThanosAdWebCardTachikomaPresenter$h(tkTemplateIn)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdWebCardTachikomaPresenter.class, "17")) {
          return;
       }
       ThanosAdWebCardTachikomaPresenter tv = this.v;
       if (tv == null) {
          a.S("mAttachListeners");
       }
       tv.remove(this.V);
       this.M.destroy();
       this.O = false;
       this.b9();
       return;
    }
    public final boolean W8(){
       Object[] objArray1;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CommonCardType$a obj = PatchProxy.apply(objArray, this, ThanosAdWebCardTachikomaPresenter.class, "15");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = CommonCardType.Companion;
       CommonCardType tACHIKOMA = CommonCardType.TACHIKOMA;
       ThanosAdWebCardTachikomaPresenter tt = this.t;
       if (tt == null) {
          a.S("mPhoto");
       }
       if (!obj.a(tACHIKOMA, tt, true)) {
          objArray1 = new Object[0];
          j0.f("TachikomaWebCard", "onBind\(\) shouldUse false", objArray1);
          return 0;
       }else {
          ThanosAdWebCardTachikomaPresenter tt1 = this.t;
          if (tt1 == null) {
             a.S("mPhoto");
          }
          PhotoAdvertisement photoAdverti = k.B(tt1);
          if (PatchProxy.isSupport(s.class)) {
             PhotoAdvertisement$TkTemplateData obj1 = PatchProxy.applyTwoRefs(photoAdverti, Boolean.TRUE, objArray, s.class, "31");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(photoAdverti == null || photoAdverti.getAdData() == null){
                String str = c.l(photoAdverti);
                if (!TextUtils.isEmpty(str)) {
                   obj1 = l.b(str, photoAdverti);
                   PhotoAdvertisement$TkTemplateInfo tkTemplateIn = l.a(str, photoAdverti);
                   if (s.v() && (s.C(tkTemplateIn) && s.B(obj1, true))) {
                      b = true;
                   }
                }
             }
             b = false;
          }else {
             goto label_0057 ;
          }
          if (!b) {
             objArray1 = new Object[0];
             j0.f("TachikomaWebCard", "onBind\(\) isTachikomaCardInfoValid false", objArray1);
             return 0;
          }else {
             ThanosAdWebCardTachikomaPresenter tt2 = this.t;
             if (tt2 == null) {
                a.S("mPhoto");
             }
             if (s.z(tt2)) {
                objArray1 = new Object[0];
                j0.f("TachikomaWebCard", "onBind\(\) isReservationExpired false", objArray1);
                return 0;
             }else {
                return true;
             }
          }
       }
    }
    public final boolean X8(){
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, ThanosAdWebCardTachikomaPresenter.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.getActivity() != null) {
          obj = h.n();
          ThanosAdWebCardTachikomaPresenter tt = this.t;
          if (tt == null) {
             a.S("mPhoto");
          }
          PhotoAdvertisement photoAdverti = k.B(tt);
          if (photoAdverti != null) {
             objArray = photoAdverti.mUrl;
          }
          if (obj.k(objArray) != APKDownloadTask$DownloadStatus.STARTED) {
             b = true;
          }
       }
       return b;
    }
    public final boolean Y8(){
       Object obj = PatchProxy.apply(null, this, ThanosAdWebCardTachikomaPresenter.class, "3");
       if (obj == PatchProxyResult.class) {
          obj = this.Q.getValue();
       }
       return obj.booleanValue();
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdWebCardTachikomaPresenter.class, "21")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("TachikomaWebCard", "hideWebCard\(\)", objArray);
       ThanosAdWebCardTachikomaPresenter tx = this.x;
       if (tx == null) {
          a.S("mIsWebCardShowing");
       }
       tx.set(Boolean.FALSE);
       if (!this.a9()) {
          return;
       }else {
          ThanosAdWebCardTachikomaPresenter$c uoc = new ThanosAdWebCardTachikomaPresenter$c();
          if (this.E != null && this.F != null) {
             ThanosAdWebCardTachikomaPresenter tL = this.L;
             if (tL != null && !PatchProxy.applyVoidOneRefs(uoc, tL, a.class, "2")) {
                tL.b(tL.a, tL.b, uoc);
             }
          }
          return;
       }
    }
    public final boolean a9(){
       int[] obj = PatchProxy.apply(null, this, ThanosAdWebCardTachikomaPresenter.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = new int[2];
       ThanosAdWebCardTachikomaPresenter tE = this.E;
       int i = 0;
       if (tE != null) {
          View childAt = tE.getChildAt(i);
          if (childAt != null) {
             childAt.getLocationInWindow(obj);
          }
       }
       if (obj[i] >= 0 && obj[1] > 0) {
          i = true;
       }
       return i;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, ThanosAdWebCardTachikomaPresenter.class, "4")) {
          return;
       }
       ThanosAdWebCardTachikomaPresenter tU = this.U;
       if (tU != null) {
          tU.stop();
       }
       this.U = null;
       return;
    }
    public final void c9(){
       if (PatchProxy.applyVoid(null, this, ThanosAdWebCardTachikomaPresenter.class, "11")) {
          return;
       }
       this.O = true;
       Object[] objArray = new Object[0];
       j0.l("TachikomaWebCard", "tachikoma render "+this.K, objArray);
       ThanosAdWebCardTachikomaPresenter tK = this.K;
       if (tK != null) {
          this.M.b(tK, null);
       }
       return;
    }
    public final void d9(int p0){
       ThanosAdWebCardTachikomaPresenter thanosAdWebC = ThanosAdWebCardTachikomaPresenter.class;
       if (PatchProxy.isSupport(thanosAdWebC) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, thanosAdWebC, "22")) {
          return;
       }
       if (!this.a9()) {
          return;
       }
       j0 oj0 = o.z();
       int i = 243;
       ThanosAdWebCardTachikomaPresenter tt = this.t;
       if (tt == null) {
          a.S("mPhoto");
       }
       oj0.e(i, tt.mEntity).d(new ThanosAdWebCardTachikomaPresenter$j(p0)).a();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdWebCardTachikomaPresenter.class, "2")) {
          return;
       }
       a.p(p0, "view");
       this.D = m1.f(p0, 0x7f0a00d7);
       this.E = m1.f(p0, 0x7f0a0175);
       this.F = m1.f(p0, 0x7f0a3ea3);
       return;
    }
    public final void e9(){
       if (PatchProxy.applyVoid(null, this, ThanosAdWebCardTachikomaPresenter.class, "24")) {
          return;
       }
       ThanosAdWebCardTachikomaPresenter tF = this.F;
       float f = 0x3f800000;
       if (tF != null) {
          tF.setAlpha(f);
       }
       tF = this.E;
       if (tF != null) {
          tF.setAlpha(f);
       }
       tF = this.F;
       if (tF != null) {
          tF.setTranslationX(0);
       }
       tF = this.E;
       if (tF != null) {
          tF.setTranslationX((- (float)this.G));
       }
       tF = this.F;
       if (tF != null) {
          tF.setTranslationY(0);
       }
       tF = this.E;
       if (tF != null) {
          tF.setTranslationY(0);
       }
       return;
    }
    public final boolean h9(PhotoAdvertisement$TkTemplateData p0){
       boolean b = (p0 != null && p0.mShowControlType == null)? true: false;
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdWebCardTachikomaPresenter.class, "1")) {
          return;
       }
       f obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.t = obj;
       obj = this.q8(o.class);
       a.o(obj, "inject\(PhotoAdActionBarClickProcessor::class.java\)");
       this.u = obj;
       obj = this.r8("DETAIL_ATTACH_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_ATTACH_LISTENERS\)");
       this.v = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(DetailPlayModule::class.java\)");
       this.w = obj;
       obj = this.x8("DETAIL_IS_WEB_CARD_SHOWING");
       a.o(obj, "injectRef\(AccessIds.DETAIL_IS_WEB_CARD_SHOWING\)");
       this.x = obj;
       Object obj1 = this.q8(PhotoDetailParam.class);
       a.o(obj1, "inject\(PhotoDetailParam::class.java\)");
       this.y = obj1;
       obj1 = this.q8(c.class);
       a.o(obj1, "inject\(PhotoDetailStatLogger::class.java\)");
       this.z = obj1;
       this.A = this.t8("REQUEST_REPLACE_DATA_SERVICE");
       obj1 = this.r8("CARD_TOGGLE_STATE");
       a.o(obj1, "inject\(AccessIds.CARD_TOGGLE_STATE\)");
       this.B = obj1;
       this.q = this.q8(c.class);
       obj1 = this.r8("DETAIL_FRAGMENT");
       a.o(obj1, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.C = obj1;
       return;
    }
    public final void j9(long p0){
       ThanosAdWebCardTachikomaPresenter thanosAdWebC = ThanosAdWebCardTachikomaPresenter.class;
       if (PatchProxy.isSupport(thanosAdWebC) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, thanosAdWebC, "5")) {
          return;
       }
       thanosAdWebC = this.E;
       if (thanosAdWebC != null) {
          thanosAdWebC.removeCallbacks(this.T);
       }
       this.T.b(true);
       this.T.a(false);
       thanosAdWebC = this.E;
       if (thanosAdWebC != null) {
          thanosAdWebC.postDelayed(this.T, p0);
       }
       return;
    }
}
