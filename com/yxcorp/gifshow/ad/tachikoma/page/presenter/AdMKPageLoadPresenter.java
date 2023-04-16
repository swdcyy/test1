package com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.tachikoma.a;
import java.util.HashMap;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$mLifecycle$1;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$b;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager;
import com.kwai.adclient.kscommerciallogger.snapshot.Span;
import d59.l;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import d59.m;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKPageConfig;
import android.view.View;
import d59.n;
import java.util.Map;
import java.lang.System;
import java.lang.Double;
import android.net.Uri;
import ekd.x0;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import a59.f;
import android.app.Activity;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$initBridge$tkBridgeContext$1;
import com.kwai.robust.PatchProxyResult;
import msd.l;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$pageStatusCallback$1;
import mxb.u;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import a59.j;
import a59.k;
import msd.r;
import java.lang.Integer;
import msd.a;
import gr.c;
import com.kwai.framework.player.core.b;
import io.reactivex.subjects.PublishSubject;
import c59.c;
import y49.f;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$initBridge$1;
import a59.c;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import d59.i;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$initBridge$3;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$initBridge$4;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$initBridge$5;
import d59.j;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$initBridge$7;
import d59.k;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$initBridge$9;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdMKPageLoadPresenter$initBridge$10;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import c59.b;
import android.os.SystemClock;
import java.lang.Long;
import cm9.a;
import com.kwai.adclient.kscommerciallogger.snapshot.a;
import com.kwai.framework.model.feed.BaseFeed;
import g59.h;
import yx.j0;
import android.view.ViewGroup;
import java.lang.StringBuilder;
import x49.q;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import java.lang.Throwable;
import o56.c;
import o56.a;
import java.lang.CharSequence;
import e17.i;
import xf6.l;
import com.google.gson.JsonObject;
import java.lang.Number;
import x49.h;
import wkd.b;
import k59.c2;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import android.widget.FrameLayout;
import android.view.ViewParent;
import com.yxcorp.gifshow.util.SoftInput;
import android.view.Window;
import lnc.s9;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Ref$FloatRef;
import lnc.r9;
import a2.r0$b;
import a2.i0;
import com.yxcorp.gifshow.ad.tachikoma.page.AdMKFragment;
import im8.f;

public final class AdMKPageLoadPresenter extends PresenterV2	// class@001855
{
    public final a A;
    public HashMap B;
    public HashMap C;
    public HashMap D;
    public b E;
    public boolean F;
    public String G;
    public AdMKFragment H;
    public a I;
    public a J;
    public final AdMKPageLoadPresenter$mLifecycle$1 K;
    public final AdMKPageLoadPresenter$b L;
    public PathLoadingView p;
    public KwaiActionBar q;
    public FrameLayout r;
    public View s;
    public QPhoto t;
    public PhotoAdvertisement$TkTemplateInfo u;
    public AdMKPageConfig v;
    public c w;
    public f x;
    public f y;
    public Uri z;
    public static final AdMKPageLoadPresenter$a M;

    static {
       AdMKPageLoadPresenter.M = new AdMKPageLoadPresenter$a(null);
    }
    public void AdMKPageLoadPresenter(){
       super();
       this.A = new a();
       this.B = new HashMap();
       this.C = new HashMap();
       this.D = new HashMap();
       this.K = new AdMKPageLoadPresenter$mLifecycle$1(this);
       this.L = new AdMKPageLoadPresenter$b(this);
    }
    public static final PhotoAdvertisement$TkTemplateInfo P8(AdMKPageLoadPresenter p0){
       p0 = p0.u;
       if (p0 == null) {
          a.S("mTkTemplateInfo");
       }
       return p0;
    }
    public void E8(){
       AdMKPageLoadPresenter t;
       AdMKPageLoadPresenter u;
       AdMKPageLoadPresenter v;
       String str4;
       Object[] objArray1;
       String str = this;
       AdMKPageLoadPresenter uAdMKPageLoa = AdMKPageLoadPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, str, uAdMKPageLoa, "6")) {
          return;
       }
       String str1 = SegmentManager.Instance.loadSessionId();
       a.o(str1, "SegmentManager.Instance.loadSessionId\(\)");
       str.G = str1;
       this.R8().c("onBind running ");
       String str2 = "mAdMKPageConfig";
       if (!PatchProxy.applyVoid(objArray, str, uAdMKPageLoa, "8")) {
          v = str.q;
          str4 = "mKwaiActionBar";
          if (v == null) {
             a.S(str4);
          }
          v.l(new l(str));
          v = str.q;
          if (v == null) {
             a.S(str4);
          }
          v.h(new m(str));
          v = str.v;
          if (v == null) {
             a.S(str2);
          }
          if (v.b()) {
             v = str.s;
             str4 = "mReloadView";
             if (v == null) {
                a.S(str4);
             }
             v.setVisibility(0);
             v = str.s;
             if (v == null) {
                a.S(str4);
             }
             v.setOnClickListener(new n(str));
          }
       }
       if (!PatchProxy.applyVoid(objArray, str, uAdMKPageLoa, "11")) {
          v = str.v;
          if (v == null) {
             a.S(str2);
          }
          str.u = v.g();
          v = str.B;
          AdMKPageLoadPresenter v1 = str.v;
          if (v1 == null) {
             a.S(str2);
          }
          String str3 = "pageId";
          v.put(str3, v1.e());
          str.B.put("pageCreateTimeMs", Double.valueOf((double)System.currentTimeMillis()));
          v = str.v;
          if (v == null) {
             a.S(str2);
          }
          str4 = "backupUrl";
          if (v.a() != null) {
             v = str.B;
             u = str.v;
             if (u == null) {
                a.S(str2);
             }
             v.put(str4, u.a());
             v = str.v;
             if (v == null) {
                a.S(str2);
             }
             Uri uri = x0.f(v.a());
             str.z = uri;
             Set set = x0.c(uri);
             if (set != null) {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                   String str5 = iterator.next();
                   AdMKPageLoadPresenter z = str.z;
                   String queryParamet = (z != null)? z.getQueryParameter(str5): objArray;
                   a.o(str5, "it");
                   str.B.put(str5, queryParamet);
                   str.C.put(str5, queryParamet);
                }
             }
          }
          Span span = this.R8();
          span.c("init data run");
          u = str.v;
          if (u == null) {
             a.S(str2);
          }
          span.d(str3, u.e());
          t = str.v;
          if (t == null) {
             a.S(str2);
          }
          span.d(str4, t.a());
          PhotoAdvertisement photoAdverti = k.B(str.t);
          str2 = (photoAdverti != null)? String.valueOf(photoAdverti.mCreativeId): objArray;
          span.d("creativeId", str2);
       }
       if (!PatchProxy.applyVoid(objArray, str, uAdMKPageLoa, "12")) {
          Activity activity = this.getActivity();
          t = str.t;
          u = str.u;
          if (u == null) {
             a.S("mTkTemplateInfo");
          }
          AdMKPageLoadPresenter$initBridge$tkBridgeContext$1 oinitBridge$ = new AdMKPageLoadPresenter$initBridge$tkBridgeContext$1(str);
          int i = 0;
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          AdMKPageLoadPresenter$pageStatusCallback$1 opageStatusC = PatchProxy.apply(objArray, str, uAdMKPageLoa, "13");
          if (opageStatusC != PatchProxyResult.class) {
          }else {
             opageStatusC = new AdMKPageLoadPresenter$pageStatusCallback$1(str);
          }
          f uof = new f(activity, t, u, null, null, null, null, null, opageStatusC, null, i, i1, i2, i3, i4, oinitBridge$, null, null, null, 0x77ef8, null);
          c uoc = new c(str1);
          str.w = uoc;
          uoc.i(new f("setMKPageTitle", new AdMKPageLoadPresenter$initBridge$1(str)));
          uAdMKPageLoa = str.w;
          if (uAdMKPageLoa == null) {
             a.S("mAdPageBridgeGroup");
          }
          uAdMKPageLoa.i(new i(str, "getPageJSON", AdMKPageLoadPresenter$initBridge$3.INSTANCE));
          uAdMKPageLoa = str.w;
          if (uAdMKPageLoa == null) {
             a.S("mAdPageBridgeGroup");
          }
          uAdMKPageLoa.i(new f("exitPage", new AdMKPageLoadPresenter$initBridge$4(str)));
          uAdMKPageLoa = str.w;
          if (uAdMKPageLoa == null) {
             a.S("mAdPageBridgeGroup");
          }
          uAdMKPageLoa.i(new f("reportPage", new AdMKPageLoadPresenter$initBridge$5(str)));
          uAdMKPageLoa = str.w;
          if (uAdMKPageLoa == null) {
             a.S("mAdPageBridgeGroup");
          }
          uAdMKPageLoa.i(new j(str, "setLeftBtnClick", AdMKPageLoadPresenter$initBridge$7.INSTANCE));
          uAdMKPageLoa = str.w;
          if (uAdMKPageLoa == null) {
             a.S("mAdPageBridgeGroup");
          }
          uAdMKPageLoa.i(new k(str, "registerPageEventListener", AdMKPageLoadPresenter$initBridge$9.INSTANCE));
          uAdMKPageLoa = str.w;
          if (uAdMKPageLoa == null) {
             a.S("mAdPageBridgeGroup");
          }
          uAdMKPageLoa.i(new f("keyboardAvoidToView", AdMKPageLoadPresenter$initBridge$10.INSTANCE));
          uAdMKPageLoa = str.w;
          if (uAdMKPageLoa == null) {
             a.S("mAdPageBridgeGroup");
          }
          uAdMKPageLoa.h();
       }
       this.V8();
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, AdMKPageLoadPresenter.class, "1")) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       activity.getLifecycle().addObserver(this.K);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, AdMKPageLoadPresenter.class, "21")) {
          return;
       }
       Activity activity = this.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       activity.getLifecycle().removeObserver(this.K);
       this.D.clear();
       return;
    }
    public void J8(){
       AdMKPageLoadPresenter tG;
       if (PatchProxy.applyVoid(null, this, AdMKPageLoadPresenter.class, "20")) {
          return;
       }
       this.R8().c("onUnbind running");
       AdMKPageLoadPresenter tE = this.E;
       String str = "mSessionId";
       if (tE != null) {
          tG = this.G;
          if (tG == null) {
             a.S(str);
          }
          if (!PatchProxy.applyVoidOneRefs(tG, tE, b.class, "9")) {
             a.p(tG, "sessionId");
             tE.a(2, Long.valueOf((SystemClock.elapsedRealtime() - tE.a)), tG);
          }
       }
       SegmentManager instance = SegmentManager.Instance;
       tG = this.G;
       if (tG == null) {
          a.S(str);
       }
       instance.clearBySessionId(tG);
       tE = this.w;
       if (tE == null) {
          a.S("mAdPageBridgeGroup");
       }
       tE.g();
       this.A.destroy();
       this.F = true;
       tE = this.I;
       if (tE != null) {
          tE.stop();
       }
       return;
    }
    public final Span R8(){
       SegmentManager obj = PatchProxy.apply(null, this, AdMKPageLoadPresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = SegmentManager.Instance;
       AdMKPageLoadPresenter tG = this.G;
       if (tG == null) {
          a.S("mSessionId");
       }
       Span span = obj.loadSegment(tG, "AD_MK_PAGE", 30).e();
       a.o(span, "SegmentManager.Instance.…MENT_NAME, 30\).loadSpan\(\)");
       return span;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, AdMKPageLoadPresenter.class, "9")) {
          return;
       }
       AdMKPageLoadPresenter tt = this.t;
       if (tt != null) {
          BaseFeed entity = tt.getEntity();
          if (entity != null) {
             h.a(this.getActivity(), entity, k.B(this.t));
          }
       }
       return;
    }
    public final void V8(){
       AdMKPageLoadPresenter uAdMKPageLoa = AdMKPageLoadPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uAdMKPageLoa, "18")) {
          return;
       }
       if (this.getActivity() != null) {
          this.B.put("preRenderTimeMs", Double.valueOf((double)System.currentTimeMillis()));
          AdMKPageLoadPresenter tu = this.u;
          if (tu == null) {
             a.S("mTkTemplateInfo");
          }
          if (!PatchProxy.applyVoidOneRefs(tu, this, uAdMKPageLoa, "19")) {
             int i = 0;
             Object[] objArray1 = new Object[i];
             String str = "AdMKLoadPresenter";
             j0.f(str, "syncInit start...", objArray1);
             AdMKPageLoadPresenter tA = this.A;
             AdMKPageLoadPresenter tr = this.r;
             if (tr == null) {
                a.S("mTkContentView");
             }
             AdMKPageLoadPresenter tw = this.w;
             if (tw == null) {
                a.S("mAdPageBridgeGroup");
             }
             Object[] objArray2 = new Object[i];
             j0.f(str, "syncInit finish initState : "+tA.a(tr, tw, i), objArray2);
             uAdMKPageLoa = this.E;
             if (uAdMKPageLoa != null && !PatchProxy.applyVoid(objArray, uAdMKPageLoa, b.class, "2")) {
                uAdMKPageLoa.b = SystemClock.elapsedRealtime();
             }
             this.A.b(tu, this.L);
          }
       }
       return;
    }
    public final void W8(boolean p0){
       AdMKPageLoadPresenter tp;
       AdMKPageLoadPresenter uAdMKPageLoa = AdMKPageLoadPresenter.class;
       if (PatchProxy.isSupport(uAdMKPageLoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uAdMKPageLoa, "10")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       j0.f("AdMKLoadPresenter", "setLoadingState : "+p0, objArray);
       if (p0) {
          tp = this.p;
          if (tp == null) {
             a.S("mLoadingView");
          }
          tp.setVisibility(i);
          tp = this.p;
          if (tp == null) {
             a.S("mLoadingView");
          }
          tp.k();
       }else {
          tp = this.p;
          if (tp == null) {
             a.S("mLoadingView");
          }
          tp.setVisibility(8);
          tp = this.p;
          if (tp == null) {
             a.S("mLoadingView");
          }
          tp.a();
       }
       return;
    }
    public final void X8(int p0,Throwable p1){
       String str;
       Activity activity;
       String str1;
       Object[] objArray;
       if (PatchProxy.isSupport(AdMKPageLoadPresenter.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, AdMKPageLoadPresenter.class, "15")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p1, this, AdMKPageLoadPresenter.class, "16")) {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          int i = (uoc.c())? this: null;
          if (i != null) {
             i = 0x7f11066a;
             StringBuilder str2 = "进入兜底原因：";
             str1 = (p1 != null)? p1.getMessage(): null;
             i.d(i, str2+str1);
          }
       }
       if (this.F != null || l.c("ad_mk_disable_downgrade", false)) {
          this.R8().c("want to start backup activity,but page is finished or disable downgrade is false");
          return;
       }else {
          AdMKPageLoadPresenter tE = this.E;
          if (tE != null) {
             str = String.valueOf(p1);
             b uob = b.class;
             if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), str, tE, uob, "11")) {
                str1 = "reason";
                a.p(str, str1);
                JsonObject jsonObject = new JsonObject();
                jsonObject.c0("template_id", tE.f);
                jsonObject.a0("version_code", Integer.valueOf(tE.g));
                jsonObject.c0("page_id", tE.i);
                jsonObject.a0("downgrade_type", Integer.valueOf(p0));
                jsonObject.c0("mid_page_template_id", tE.j);
                jsonObject.c0("creative_id", tE.h);
                jsonObject.c0(str1, str);
                jsonObject.a0("page_conversion_type", Integer.valueOf(tE.k));
                h.b("ks_mk_downgrade_event", jsonObject, null, null, 12, null);
             }
          }
          if (this.getActivity() != null) {
             AdMKPageLoadPresenter tt = this.t;
             BaseFeed entity = (tt != null)? tt.getEntity(): null;
             if (entity != null) {
                tt = this.v;
                str = "mAdMKPageConfig";
                if (tt == null) {
                   a.S(str);
                }
                if (tt.a() != null) {
                   c2 uoc2 = b.a(0xdb243e0);
                   activity = this.getActivity();
                   a.m(activity);
                   a.o(activity, "activity!!");
                   AdMKPageLoadPresenter tt1 = this.t;
                   a.m(tt1);
                   PhotoAdDataWrapper photoAdDataW = new PhotoAdDataWrapper(tt1.getEntity());
                   tt1 = this.v;
                   if (tt1 == null) {
                      a.S(str);
                   }
                   str = tt1.a();
                   a.m(str);
                   uoc2.a(activity, photoAdDataW, str, true);
                   if (!PatchProxy.applyVoid(null, this, AdMKPageLoadPresenter.class, "17")) {
                      Activity activity1 = this.getActivity();
                      if (activity1 != null) {
                         activity1.finish();
                         activity1.overridePendingTransition(false, false);
                      }
                   }
                }
             }
          }
       label_013b :
          return;
       }
    }
    public void doBindView(View p0){
       Object obj = this;
       View obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, AdMKPageLoadPresenter.class, "5")) {
          return;
       }
       a.p(obj1, "rootView");
       View view = obj1.findViewById(R.id.adtk_content_view);
       a.o(view, "rootView.findViewById\(R.id.adtk_content_view\)");
       obj.r = view;
       view = obj1.findViewById(R.id.loading_view);
       a.o(view, "rootView.findViewById\(R.id.loading_view\)");
       obj.p = view;
       view = obj1.findViewById(R.id.title_root);
       a.o(view, "rootView.findViewById\(R.id.title_root\)");
       obj.q = view;
       view = obj1.findViewById(R.id.reload);
       a.o(view, "rootView.findViewById\(R.id.reload\)");
       obj.s = view;
       obj1 = obj1.findViewById(R.id.adtk_wrapper_view);
       if (obj1 != null) {
          Activity activity = this.getActivity();
          if (activity != null) {
             r9 obj2 = null;
             ViewParent parent = obj1.getParent();
             if (!parent instanceof View) {
                parent = obj2;
             }
             ViewParent viewParent = parent;
             View view1 = null;
             String str = "$this$setWindowSoftInput";
             a.p(activity, str);
             if (activity instanceof ComponentActivity) {
                Objects.requireNonNull(SoftInput.c);
                activity.getLifecycle().addObserver(SoftInput.a);
             }
             Window window = activity.getWindow();
             a.o(window, "window");
             a.p(window, str);
             View decorView = window.getDecorView();
             a.o(decorView, "decorView");
             if (!s9.a(decorView) || SoftInput.c.a()) {
                s9.b(window, obj1, viewParent, null, 0, null);
             }else {
                window.setSoftInputMode(48);
                Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
                uBooleanRef.element = view1;
                Ref$BooleanRef uBooleanRef1 = new Ref$BooleanRef();
                uBooleanRef1.element = view1;
                Ref$IntRef intRef = new Ref$IntRef();
                intRef.element = view1;
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                objectRef.element = obj2;
                Ref$FloatRef uFloatRef = new Ref$FloatRef();
                uFloatRef.element = 0;
                obj2 = decorView;
                r9 or9 = decorView;
                obj2 = new r9(window, obj1, viewParent, uBooleanRef1, objectRef, uBooleanRef, null, intRef, null, 0, false, uFloatRef, 1);
                i0.Q0(window.getDecorView(), or9);
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, AdMKPageLoadPresenter.class, "4")) {
          return;
       }
       this.t = this.s8(QPhoto.class);
       f obj = this.q8(AdMKPageConfig.class);
       a.o(obj, "inject\(AdMKPageConfig::class.java\)");
       this.v = obj;
       this.E = this.s8(b.class);
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.H = obj;
       obj = this.x8("MK_PAGE_JSON_INFO");
       a.o(obj, "injectRef\(AccessIds.MK_PAGE_JSON_INFO\)");
       this.x = obj;
       obj = this.x8("MK_PAGE_RENDER_TIME");
       a.o(obj, "injectRef\(AccessIds.MK_PAGE_RENDER_TIME\)");
       this.y = obj;
       return;
    }
}
