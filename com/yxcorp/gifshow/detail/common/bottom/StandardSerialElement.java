package com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$a;
import nsd.u;
import jh5.a;
import sp7.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import kotlin.jvm.internal.a;
import rp7.a;
import b9a.b;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$mSwitchTipsEventMap$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.HashSet;
import java.util.ArrayList;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus$d;
import ox9.o;
import ox9.m;
import ox9.n;
import ox9.p;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import qp7.a;
import v6a.m0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import jf5.a;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import fm5.a;
import uw9.l0;
import n8a.a;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import uw9.v3;
import ok.x;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import rq7.a;
import yp7.i;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.user.User;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$c;
import erd.g;
import crd.b;
import e0a.j;
import java.util.List;
import ox9.k;
import qp7.b1;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$b;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$d;
import io.reactivex.internal.functions.Functions;
import qp7.c;
import yp7.h;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$e;
import vy6.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.tube.SerialInfo;
import com.yxcorp.gifshow.tube.SerialInfo$SplitEntranceDescription;
import qp7.x0;
import kotlin.Pair;
import pp7.b;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$f;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$g;
import u8a.q;
import rf5.u;
import qp7.d;
import yp7.b;
import wm5.b;
import d6a.f;
import zl5.c;
import com.kuaishou.android.model.mix.CommonMeta;
import qvb.a;
import qvb.n0;
import zl5.f;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import qvb.i;
import d6a.i;
import d6a.j;
import com.yxcorp.gifshow.detail.slideplay.b;
import tkd.b;
import tkd.d;
import wm5.a;
import android.view.View;
import wx6.d;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import java.lang.CharSequence;
import android.text.TextUtils;
import kotlin.text.StringsKt__StringsKt;
import f6a.c;
import y8a.c;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kwai.corona.CoronaApiExperimentUtil;
import u8a.b;
import ox9.l;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment;
import ilc.a;
import k2b.e0;
import qrd.l1;
import az6.a;
import yy6.c;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$a;
import u8a.q$a;
import com.yxcorp.gifshow.detail.common.bottom.StandardSerialElement$showBottomSerialPanel$$inlined$let$lambda$1;

public class StandardSerialElement extends DispatchBaseElement	// class@0013a2
{
    public final b A;
    public final p B;
    public a C;
    public u D;
    public SwipeLayout E;
    public a F;
    public long G;
    public a H;
    public t I;
    public SlidePlayViewModel J;
    public Boolean K;
    public q L;
    public b M;
    public PhotoDetailParam N;
    public c O;
    public long P;
    public boolean Q;
    public HashSet R;
    public GifshowActivity S;
    public String T;
    public List U;
    public final n U0;
    public final MilanoContainerEventBus$d V;
    public final p V0;
    public MilanoContainerEventBus W;
    public PhotoDetailLogger X;
    public final a Y;
    public final a Z;
    public boolean t;
    public QPhoto u;
    public BaseFragment v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public static String W0;
    public static boolean X0;
    public static final StandardSerialElement$a Y0;

    static {
       StandardSerialElement.Y0 = new StandardSerialElement$a(null);
    }
    public void StandardSerialElement(a p0){
       Objects.requireNonNull(c.j);
       a d = c.d;
       a.p(d, "bizType");
       super(d, p0);
       this.A = new b();
       this.B = s.c(StandardSerialElement$mSwitchTipsEventMap$2.INSTANCE);
       this.R = new HashSet();
       this.U = new ArrayList();
       this.V = new MilanoContainerEventBus$d();
       this.Y = new o(this);
       this.Z = new m(this);
       this.U0 = new n(this);
       this.V0 = new p(this);
    }
    public static final BaseFragment n0(StandardSerialElement p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, StandardSerialElement.class, "9")) {
       }else {
          a.p(p0, "callerContext");
          this.t = false;
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
          this.u = mPhoto;
          a b = p0.b;
          a.o(b, "callerContext.mFragment");
          this.v = b;
          m0 j = p0.j;
          a.o(j, "callerContext.mPlayModule");
          this.H = j;
          this.D = p0.v.R;
          this.E = w9.c(p0.a);
          this.F = p0.r;
          StandardSerialElement tu = this.u;
          if (tu == null) {
             a.S("mPhoto");
          }
          String str = PatchProxy.applyOneRefs(tu, this, StandardSerialElement.class, "8");
          if (str != PatchProxyResult.class) {
          }else if(a.g(tu) != null){
             str = a.g(tu);
          }else {
             str = null;
          }
          this.T = str;
          l0 e1 = p0.v.e1;
          this.C = e1;
          if (e1 != null) {
             str = p0.c;
             a.o(str, "callerContext.mPhotoDetailParam");
             if (!PatchProxy.applyVoidOneRefs(str, e1, a.class, "1")) {
                a.p(str, "photoDetailParams");
                e1.d = str;
             }
          }
          this.x = this.H().Z();
          this.z = this.H().a0;
          this.y = this.H().F();
          this.I = p0.e;
          this.N = p0.c;
          j = p0.v;
          if (j != null) {
             this.O = j.f;
          }
          b = j.X;
          a.o(b, "callerContext.mPhotoDeta¡­.mMilanoContainerEventBus");
          this.W = b;
          p0 = p0.p.get();
          a.o(p0, "callerContext.mLogger.get\(\)");
          this.X = p0;
          PatchProxy.onMethodExit(StandardSerialElement.class, "9");
       }
       return;
    }
    public a f0(a p0){
       i oi = PatchProxy.applyOneRefs(p0, this, StandardSerialElement.class, "20");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = new i(p0);
       }
       return oi;
    }
    public void j0(boolean p0){
       b uob;
       SerialInfo$SplitEntranceDescription mTitle;
       SerialInfo$SplitEntranceDescription mContinueInf;
       i oi2;
       Object[] objArray;
       i oi = i.class;
       StandardSerialElement standardSeri = StandardSerialElement.class;
       if (PatchProxy.isSupport(standardSeri) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, standardSeri, "11")) {
          return;
       }
       StandardSerialElement tv = this.v;
       String str = "mFragment";
       if (tv == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tv.requireParentFragment());
       this.J = slidePlayVie;
       slidePlayVie = (slidePlayVie != null)? slidePlayVie.r(): false;
       this.w = slidePlayVie;
       tv = this.v;
       if (tv == null) {
          a.S(str);
       }
       FragmentActivity activity = tv.getActivity();
       if (!activity instanceof GifshowActivity) {
          activity = null;
       }
       this.S = activity;
       this.P = 0;
       if (this.v0()) {
          this.b0();
          return;
       }else {
          tv = this.u;
          String str1 = "mPhoto";
          if (tv == null) {
             a.S(str1);
          }
          if (tv != null) {
             User user = tv.getUser();
             if (user != null) {
                t ot = user.observable();
                if (ot != null) {
                   uob = ot.subscribe(new StandardSerialElement$c(this));
                   if (uob != null) {
                      this.j(uob);
                   }
                }
             }
          }
          if (j.f()) {
             tv = this.V;
             StandardSerialElement tJ = this.J;
             QPhoto currentPhoto = (tJ != null)? tJ.getCurrentPhoto(): null;
             tv.a = currentPhoto;
             this.U.add(this.V0);
          }
          if (!PatchProxy.applyVoid(null, this, standardSeri, "18")) {
             this.i(new k(this));
          }
          if (this.y == null) {
             tv = this.I;
             if (tv != null) {
                uob = tv.subscribe(new StandardSerialElement$b(this));
                a.o(uob, "it.subscribe\(Consumer<Lo¡­ }\n          }\n        }\)");
                this.j(uob);
             }
             uob = this.H().M1.subscribe(new StandardSerialElement$d(this), Functions.e);
             a.o(uob, "pageConfig.mNasaEpisodeS¡­.ERROR_CONSUMER\n        \)");
             this.j(uob);
          }
          h oh = this.A();
          StandardSerialElement$e uoe = new StandardSerialElement$e(this);
          Objects.requireNonNull(oh);
          b uob1 = PatchProxy.applyOneRefs(uoe, oh, h.class, "2");
          if (uob1 != PatchProxyResult.class) {
          }else {
             a.p(uoe, "onNext");
             uob1 = oh.a.subscribe(uoe, Functions.d());
             a.o(uob1, "mLabelClickSubject.subsc¡­unctions.emptyConsumer\(\)\)");
          }
          this.j(uob1);
          tv = this.J;
          a.m(tv);
          standardSeri = this.v;
          if (standardSeri == null) {
             a.S(str);
          }
          tv.P(standardSeri, this.Z);
          tv = this.u;
          if (tv == null) {
             a.S(str1);
          }
          SerialInfo serialInfo = a.h(tv.getEntity());
          serialInfo = (serialInfo != null)? serialInfo.mSplitEntranceDescription: null;
          String str2 = "";
          if (serialInfo != null) {
             mTitle = serialInfo.mTitle;
             mContinueInf = serialInfo.mContinueInfo;
          }else {
             tv = this.u;
             if (tv == null) {
                a.S(str1);
             }
             serialInfo = a.h(tv.getEntity());
             if (serialInfo != null) {
                mTitle = serialInfo.mEntranceDescription;
                if (mTitle != null) {
                   mContinueInf = str2;
                }
             }
             mContinueInf = null;
             mTitle = mContinueInf;
          }
          i oi1 = this.E();
          if (mTitle == null) {
             mTitle = str2;
          }
          if (mContinueInf != null) {
             str2 = mContinueInf;
          }
          Objects.requireNonNull(oi1);
          if (!PatchProxy.applyVoidTwoRefs(mTitle, str2, oi1, oi, "3")) {
             a.p(mTitle, "titleText");
             a.p(str2, "continueText");
             oi1.d.f(new Pair(mTitle, str2));
          }
          if (this.H().h0()) {
             oi2 = this.E();
             Objects.requireNonNull(oi2);
             if (!PatchProxy.applyVoid(null, oi2, oi, "4")) {
                oi2.g.f(Boolean.TRUE);
             }
          }
          uob = this.H().N1.subscribe(new StandardSerialElement$f(this), StandardSerialElement$g.b);
          a.o(uob, "pageConfig.mNasaOpenSeri¡­gUtil.logError\(it\)\n    }\)");
          this.j(uob);
          oi2 = this.E();
          standardSeri = this.u;
          if (standardSeri == null) {
             a.S(str1);
          }
          boolean b = a.w(standardSeri);
          Objects.requireNonNull(oi2);
          if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), oi2, oi, "1")) {
             oi2.f.f(Boolean.valueOf(b));
          }
          return;
       }
    }
    public void m0(boolean p0){
       StandardSerialElement standardSeri = StandardSerialElement.class;
       if (PatchProxy.isSupport(standardSeri) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, standardSeri, "28")) {
          return;
       }
       this.o0();
       this.U.remove(this.V0);
       return;
    }
    public final void o0(){
       if (PatchProxy.applyVoid(null, this, StandardSerialElement.class, "29")) {
          return;
       }
       StandardSerialElement tL = this.L;
       if (tL != null) {
          StandardSerialElement tS = this.S;
          Objects.requireNonNull(tS, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
          tL.Dd(tS);
       }
       this.L = null;
       this.p0(true);
       return;
    }
    public final void p0(boolean p0){
       StandardSerialElement standardSeri = StandardSerialElement.class;
       if (PatchProxy.isSupport(standardSeri) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, standardSeri, "26")) {
          return;
       }
       standardSeri = this.D;
       if (standardSeri != null) {
          standardSeri.F(p0, 15);
       }
       standardSeri = this.E;
       if (standardSeri != null) {
          standardSeri.n(p0, 18);
       }
       standardSeri = this.J;
       if (standardSeri != null) {
          standardSeri.d(p0, 16);
       }
       return;
    }
    public d q(){
       Object obj = PatchProxy.apply(null, this, StandardSerialElement.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
    public final void q0(BaseFragment p0,QPhoto p1,b p2){
       CommonMeta commonMeta;
       CommonMeta uCommonMeta;
       int i;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, StandardSerialElement.class, "17")) {
          return;
       }
       String str = f.b(p0);
       a.o(str, "SlidePlayDataFetcher.buildFetcherId\(fragment\)");
       String str1 = "";
       if (a.v(p1)) {
          commonMeta = p1.getCommonMeta();
          if (commonMeta != null) {
             commonMeta = commonMeta.mSourcePhotoPage;
             if (commonMeta != null) {
                uCommonMeta = commonMeta;
             label_0031 :
                a.p(p1, "photo");
                a.p("", "serialContext");
                a.p(uCommonMeta, "photoPage");
                String photoId = p1.getPhotoId();
                a.o(photoId, "photo.photoId");
                c uoc = new c(a.g(p1), a.r(p1), "", photoId, uCommonMeta);
                a.v(p1).add(p1);
                a.v(p1).R1(true);
             }
          }
          uCommonMeta = str1;
          goto label_0031 ;
       }else {
          commonMeta = p1.getCommonMeta();
          if (commonMeta != null) {
             commonMeta = commonMeta.mSourcePhotoPage;
             if (commonMeta != null) {
                str1 = commonMeta;
             }
          }
          SerialInfo serialInfo = a.i(p1);
          serialInfo = (serialInfo != null)? serialInfo.mBusinessType: 0;
          f uof = new f(p1, str1, serialInfo);
       }
       b.g(j.e(a.v(p1), str, SlideMediaType.ALL));
       b uob = d.a(0x66aa3a58);
       StandardSerialElement tv = this.v;
       if (tv == null) {
          a.S("mFragment");
       }
       FragmentActivity uFragmentAct = tv.requireActivity();
       Objects.requireNonNull(uFragmentAct, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       uob.kL(uFragmentAct, p1, p2, str, null, null);
       return;
    }
    public c r(){
       h oh = PatchProxy.apply(null, this, StandardSerialElement.class, "22");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = new h();
       }
       return oh;
    }
    public final MilanoContainerEventBus r0(){
       StandardSerialElement obj = PatchProxy.apply(null, this, StandardSerialElement.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.W;
       if (obj == null) {
          a.S("mMilanoContainerEventBus");
       }
       return obj;
    }
    public final QPhoto s0(){
       StandardSerialElement obj = PatchProxy.apply(null, this, StandardSerialElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj == null) {
          a.S("mPhoto");
       }
       return obj;
    }
    public final a t0(){
       return this.C;
    }
    public final boolean u0(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, StandardSerialElement.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       obj = StandardSerialElement.W0;
       a.m(obj);
       return StringsKt__StringsKt.O2(obj, String.valueOf(p0), false, 2, null);
    }
    public boolean v0(){
       c a;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StandardSerialElement standardSeri = StandardSerialElement.class;
       Object[] objArray = null;
       StandardSerialElement obj = PatchProxy.apply(objArray, this, standardSeri, "23");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.x == null) {
          obj = this.u;
          if (obj == null) {
             a.S("mPhoto");
          }
          if (obj.isVideoType()) {
             obj = this.u;
             if (obj == null) {
                a.S("mPhoto");
             }
             if (c.e(obj)) {
                a = c.a;
                StandardSerialElement tu = this.u;
                if (tu == null) {
                   a.S("mPhoto");
                }
                if (!a.h(tu)) {
                   Object obj1 = PatchProxy.apply(objArray, this, standardSeri, "24");
                   if (obj1 != patchProxyRe) {
                      b1 = obj1.booleanValue();
                   }else {
                      StandardSerialElement tu1 = this.u;
                      if (tu1 == null) {
                         a.S("mPhoto");
                      }
                      PhotoAdvertisement photoAdverti = k.B(tu1);
                      if (photoAdverti != null) {
                         objArray = photoAdverti.mHidePlayletBarSwitch;
                      }
                      if (a.g(objArray, Boolean.TRUE) && CoronaApiExperimentUtil.d.a()) {
                         b1 = true;
                      }else {
                         b1 = false;
                      }
                   }
                   if (!b1) {
                   label_0079 :
                      return b;
                   }
                }
             }
          }
       }
    label_0078 :
       b = true;
       goto label_0079 ;
    }
    public final void w0(QPhoto p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StandardSerialElement standardSeri = StandardSerialElement.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, standardSeri, "16")) {
          return;
       }
       b uob = new b();
       uob.a = StandardSerialElement.W0;
       Object[] objArray = null;
       Boolean obj = PatchProxy.apply(objArray, this, standardSeri, "15");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(CoronaApiExperimentUtil.d.b() == 1){
          b = true;
       }else {
          b = false;
       }
       uob.b = b;
       obj = PatchProxy.apply(objArray, objArray, j.class, "25");
       if (obj == patchProxyRe) {
          obj = j.j.get();
       }
       String str = "mFragment";
       if (obj.booleanValue()) {
          StandardSerialElement tv = this.v;
          if (tv == null) {
             a.S(str);
          }
          this.q0(tv, p0, uob);
       }else {
          a uoa = d.a(0x66aa3a58);
          StandardSerialElement tv1 = this.v;
          if (tv1 == null) {
             a.S(str);
          }
          FragmentActivity uFragmentAct = tv1.requireActivity();
          Objects.requireNonNull(uFragmentAct, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          uoa.cF(uFragmentAct, p0, uob);
       }
       return;
    }
    public final void x0(){
       StandardSerialElement standardSeri = StandardSerialElement.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, standardSeri, "13")) {
          return;
       }
       StandardSerialElement tu = this.u;
       if (tu == null) {
          a.S("mPhoto");
       }
       if (tu == null) {
          return;
       }else {
          l ol = PatchProxy.apply(objArray, this, standardSeri, "14");
          if (ol != PatchProxyResult.class) {
          }else {
             ol = new l(this);
          }
          this.M = ol;
          if (this.L == null) {
             SerialEpisodePanelFragment$a c1 = SerialEpisodePanelFragment.C1;
             int i = 0;
             a uoa = new a(i, 1, objArray);
             StandardSerialElement tu1 = this.u;
             if (tu1 == null) {
                a.S("mPhoto");
             }
             uoa.F0(tu1);
             tu1 = this.S;
             if (tu1 != null && tu1 instanceof e0) {
                uoa.A0(tu1);
             }
             tu1 = this.N;
             StandardSerialElement tO = this.O;
             if (tu1 == null || (tu1.mSource == 16 || (tu1 != null && tu1.mSource == 262))) {
                i = true;
             }
             this.L = c1.a(uoa, tu1, tO, i);
          }else {
             q$a uoa1 = new q$a();
             StandardSerialElement tu3 = this.u;
             if (tu3 == null) {
                a.S("mPhoto");
             }
             uoa1 = uoa1.b(tu3);
             tu3 = this.M;
             if (tu3 == null) {
                a.S("mNasaSimilarPhotoPanelCallback");
             }
             uoa1 = uoa1.a(tu3);
             tu3 = this.L;
             if (tu3 != null) {
                tu3.g6(uoa1);
             }
          }
          standardSeri = this.L;
          if (standardSeri != null) {
             standardSeri.Y2(this.U);
          }
          StandardSerialElement tS = this.S;
          if (tS != null) {
             standardSeri = this.L;
             if (standardSeri instanceof SerialEpisodePanelFragment) {
                objArray = standardSeri;
             }
             Object[] objArray1 = objArray;
             if (objArray1 != null) {
                Objects.requireNonNull(standardSeri, "null cannot be cast to non-null type com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment");
                StandardSerialElement tu2 = this.u;
                if (tu2 == null) {
                   a.S("mPhoto");
                }
                StandardSerialElement tM = this.M;
                if (tM == null) {
                   a.S("mNasaSimilarPhotoPanelCallback");
                }
                objArray1.Ig(tS, "SerialEpisodePanelFragment", 0x1020002, tu2, 0, tM, true, new StandardSerialElement$showBottomSerialPanel$$inlined$let$lambda$1(this));
             }
          }
          return;
       }
    }
}
