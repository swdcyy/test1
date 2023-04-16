package d59.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d59.v$a;
import nsd.u;
import com.yxcorp.gifshow.ad.tachikoma.a;
import d59.v$b;
import d59.v$c;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import d59.v$d;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkPageConfig;
import x49.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.l$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import c59.n;
import a59.f;
import android.app.Activity;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdtkPageLoadPresenter$initBridge$tkBridgeContext$1;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdtkPageLoadPresenter$initBridge$tkBridgeContext$2;
import mxb.u;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import msd.l;
import a59.j;
import a59.k;
import msd.r;
import java.lang.Integer;
import java.util.Map;
import msd.a;
import gr.c;
import com.kwai.framework.player.core.b;
import io.reactivex.subjects.PublishSubject;
import c59.c;
import d59.x;
import com.yxcorp.gifshow.ad.tachikoma.page.presenter.AdtkPageLoadPresenter$initBridge$2;
import a59.c;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import yx.j0;
import java.lang.System;
import d59.w;
import java.util.Objects;
import x49.p;
import tkd.b;
import tkd.d;
import rx4.i;
import android.content.Context;
import android.view.ViewGroup;
import brd.a0;
import x49.i;
import z1.a;
import x49.j;
import java.lang.StringBuilder;
import x49.q;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkFragment;

public final class v extends PresenterV2	// class@002064
{
    public PhotoAdvertisement$TkTemplateData A;
    public PhotoAdvertisement$TkTemplateInfo B;
    public final v$b C;
    public final v$c D;
    public AdtkHalfFrameLayout p;
    public FrameLayout q;
    public PublishSubject r;
    public AdtkFragment s;
    public QPhoto t;
    public AdtkPageConfig u;
    public PublishSubject v;
    public PublishSubject w;
    public c x;
    public final a y;
    public a z;
    public static final v$a E;

    static {
       v.E = new v$a(null);
    }
    public void v(){
       super();
       this.y = new a();
       this.C = new v$b(this);
       this.D = new v$c(this);
    }
    public static final AdtkHalfFrameLayout P8(v p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("mHalfContainerView");
       }
       return p0;
    }
    public void E8(){
       l$a a;
       PhotoAdvertisement$TkTemplateInfo tkTemplateIn = this;
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tkTemplateIn, ov, "3")) {
          return;
       }
       v r = tkTemplateIn.r;
       if (r == null) {
          a.S("mTkRenderSubject");
       }
       tkTemplateIn.X7(r.subscribe(new v$d(tkTemplateIn)));
       String str = "mQPhoto";
       if (!PatchProxy.applyVoid(objArray, tkTemplateIn, ov, "6")) {
          r = tkTemplateIn.t;
          if (r == null) {
             a.S(str);
          }
          PhotoAdvertisement photoAdverti = k.B(r);
          if (photoAdverti != null) {
             v u = tkTemplateIn.u;
             if (u == null) {
                a.S("mAdtkPageConfig");
             }
             String str1 = u.b();
             a = l.a;
             a.o(photoAdverti, "ad");
             tkTemplateIn.B = a.a(str1, photoAdverti);
             tkTemplateIn.A = a.b(str1, photoAdverti);
          }
       }
       if (!PatchProxy.applyVoid(objArray, tkTemplateIn, ov, "4")) {
          r = tkTemplateIn.p;
          if (r == null) {
             a.S("mHalfContainerView");
          }
          r.a(tkTemplateIn.C);
       }
       if (!PatchProxy.applyVoid(objArray, tkTemplateIn, ov, "7")) {
          Activity activity = this.getActivity();
          v t = tkTemplateIn.t;
          if (t == null) {
             a.S(str);
          }
          AdtkPageLoadPresenter$initBridge$tkBridgeContext$1 oinitBridge$ = objArray;
          AdtkPageLoadPresenter$initBridge$tkBridgeContext$1 oinitBridge$1 = new AdtkPageLoadPresenter$initBridge$tkBridgeContext$1(tkTemplateIn);
          AdtkPageLoadPresenter$initBridge$tkBridgeContext$2 oinitBridge$2 = oinitBridge$1;
          AdtkPageLoadPresenter$initBridge$tkBridgeContext$2 oinitBridge$3 = new AdtkPageLoadPresenter$initBridge$tkBridgeContext$2(tkTemplateIn);
          f uof = new f(activity, t, tkTemplateIn.B, null, tkTemplateIn.A, null, null, null, oinitBridge$2, null, null, oinitBridge$, null, null, null, null, null, null, null, 0x7f6e8, null);
          c uoc = new c(ov);
          tkTemplateIn.x = uoc;
          uoc.i(new x(tkTemplateIn, "registerPageTranslateProgress", AdtkPageLoadPresenter$initBridge$2.INSTANCE));
          ov = tkTemplateIn.x;
          if (ov == null) {
             a.S("mAdPageBridgeGroup");
          }
          ov.h();
       }
       this.R8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, v.class, "14")) {
          return;
       }
       v tx = this.x;
       if (tx == null) {
          a.S("mAdPageBridgeGroup");
       }
       tx.g();
       tx = this.p;
       if (tx == null) {
          a.S("mHalfContainerView");
       }
       tx.i(this.C);
       this.y.destroy();
       return;
    }
    public final void R8(){
       Object[] objArray1;
       Object obj = this;
       v ov = v.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, ov, "10")) {
          return;
       }
       boolean b = false;
       obj.S8(b);
       boolean b1 = true;
       obj.V8(b1);
       if (this.getActivity() != null) {
          v b2 = obj.B;
          if (b2 != null) {
             v obj1 = PatchProxy.apply(objArray, obj, ov, "13");
             boolean b3 = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): a.t().d("adtkInitWithAsync", b1);
             String str = "mAdPageBridgeGroup";
             String str1 = "mTkContentView";
             String str2 = "adtkLoadPresenter";
             if (b3) {
                if (!PatchProxy.applyVoidOneRefs(b2, obj, ov, "11")) {
                   objArray1 = new Object[b];
                   j0.f(str2, "asyncInit start... ", objArray1);
                   long l = System.currentTimeMillis();
                   ov = obj.y;
                   v q = obj.q;
                   if (q == null) {
                      a.S(str1);
                   }
                   obj1 = obj.x;
                   if (obj1 == null) {
                      a.S(str);
                   }
                   w ow = new w(obj, l, b2);
                   Objects.requireNonNull(ov);
                   if (!PatchProxy.applyVoidThreeRefs(q, obj1, ow, ov, a.class, "16")) {
                      ov.f.reset();
                      ov.f.g();
                      ov.k = d.a(0x256720e1).Ca(objArray, b, "", q).R(new i(ov, obj1, q, ow), new j(ow));
                   }
                }
             }else if(PatchProxy.applyVoidOneRefs(b2, obj, ov, "12")){
                objArray1 = new Object[b];
                j0.f(str2, "syncInit start... ", objArray1);
                ov = obj.y;
                v q1 = obj.q;
                if (q1 == null) {
                   a.S(str1);
                }
                obj1 = obj.x;
                if (obj1 == null) {
                   a.S(str);
                }
                objArray = new Object[b];
                j0.f(str2, "syncInit finish initState : "+ov.a(q1, obj1, b1)+' ', objArray);
                obj.y.b(b2, obj.D);
             }
          }
       }
    label_00ef :
       return;
    }
    public final void S8(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov, "8")) {
          return;
       }
       ov = this.w;
       if (ov == null) {
          a.S("mEmptyViewState");
       }
       ov.onNext(Boolean.valueOf(p0));
       return;
    }
    public final void V8(boolean p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ov, "5")) {
          return;
       }
       ov = this.v;
       if (ov == null) {
          a.S("mLoadingViewState");
       }
       ov.onNext(Boolean.valueOf(p0));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "2")) {
          return;
       }
       a.p(p0, "rootView");
       p0 = p0.findViewById(R.id.adtk_content_view);
       a.o(p0, "rootView.findViewById\(R.id.adtk_content_view\)");
       this.q = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.s = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.t = obj;
       obj = this.q8(AdtkHalfFrameLayout.class);
       a.o(obj, "inject\(AdtkHalfFrameLayout::class.java\)");
       this.p = obj;
       obj = this.q8(AdtkPageConfig.class);
       a.o(obj, "inject\(AdtkPageConfig::class.java\)");
       this.u = obj;
       obj = this.r8("TK_PAGE_HALF_LOADING_STATE");
       a.o(obj, "inject\(AccessIds.TK_PAGE_HALF_LOADING_STATE\)");
       this.v = obj;
       obj = this.r8("TK_PAGE_HALF_EMPTY_STATE");
       a.o(obj, "inject\(AccessIds.TK_PAGE_HALF_EMPTY_STATE\)");
       this.w = obj;
       obj = this.r8("TK_PAGE_HALF_EMPTY_RENDER_STATE");
       a.o(obj, "inject\(AccessIds.TK_PAGE_HALF_EMPTY_RENDER_STATE\)");
       this.r = obj;
       return;
    }
}
