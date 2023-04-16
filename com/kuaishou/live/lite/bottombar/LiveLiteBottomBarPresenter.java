package com.kuaishou.live.lite.bottombar.LiveLiteBottomBarPresenter;
import b93.d;
import i93.f;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarPresenter$bottomBarService$1;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarPresenter$bottomBarService$2;
import msd.a;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarPresenter$bottomBarDataSource$2;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.bottombar.f;
import kotlin.jvm.internal.a;
import tj3.e;
import ga1.d;
import com.kuaishou.live.lite.bottombar.LiteBottomBarDataSource;
import com.kuaishou.live.lite.bottombar.e;
import xp5.i;
import or5.d;
import com.kuaishou.live.lite.bottombar.f$a;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import vb3.n;
import eq3.d;
import ad3.j;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import vq5.d;
import com.kuaishou.live.lite.sidebar.e;
import v51.a;
import com.kuaishou.live.lite.bottombar.i;
import rg0.e;
import i93.i;
import z1.a;
import m93.a;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import m93.a$a;
import gd3.a;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.kuaishou.live.lite.bottombar.debuginfo.LiteBottomBarDebugController$addGift$1;
import com.kuaishou.live.lite.bottombar.debuginfo.LiteBottomBarDebugController$removeGift$1;
import com.kuaishou.live.lite.bottombar.debuginfo.LiteBottomBarDebugController$addGiftGuide$1;
import com.kuaishou.live.lite.bottombar.debuginfo.LiteBottomBarDebugController$removeGiftGuide$1;
import com.kuaishou.live.lite.bottombar.debuginfo.LiteBottomBarDebugController$addShopCart$1;
import com.kuaishou.live.lite.bottombar.debuginfo.LiteBottomBarDebugController$removeShopCart$1;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Iterable;
import c93.b;
import td3.o;
import d93.a;
import d93.b;

public final class LiveLiteBottomBarPresenter extends d	// class@001eae
{
    public n A;
    public e B;
    public d C;
    public a D;
    public a E;
    public f F;
    public final p G;
    public final f v;
    public i w;
    public d x;
    public d y;
    public o z;

    public void LiveLiteBottomBarPresenter(){
       super();
       this.v = new f(new LiveLiteBottomBarPresenter$bottomBarService$1(this), new LiveLiteBottomBarPresenter$bottomBarService$2(this));
       this.G = s.c(new LiveLiteBottomBarPresenter$bottomBarDataSource$2(this));
    }
    public void F8(){
       LiveLiteBottomBarPresenter e;
       f uof = this;
       LiveLiteBottomBarPresenter liveLiteBott = LiveLiteBottomBarPresenter.class;
       String str = "5";
       if (PatchProxy.applyVoid(null, uof, liveLiteBott, str)) {
          return;
       }
       super.F8();
       LiveLiteBottomBarPresenter w = uof.w;
       String str1 = "logPackageProvider";
       if (w == null) {
          a.S(str1);
       }
       LiveLiteBottomBarPresenter x = uof.x;
       String str2 = "audienceInfoManager";
       if (x == null) {
          a.S(str2);
       }
       LiveLiteBottomBarPresenter c = uof.C;
       if (c == null) {
          a.S("logReporterService");
       }
       f uof1 = new f(w, x, c.a(), this.c9(), uof.v, e.a);
       uof.F = v4;
       c = uof.A;
       if (c == null) {
          a.S("viewProviderService");
       }
       c.c(LayoutViewType.BottomBar, v4);
       d uod = this.P8();
       x = uof.v;
       LiveLiteBottomBarPresenter x1 = uof.x;
       if (x1 == null) {
          a.S(str2);
       }
       LiveLiteBottomBarPresenter y = uof.y;
       String str3 = "routerManager";
       if (y == null) {
          a.S(str3);
       }
       LiveLiteBottomBarPresenter b = uof.B;
       if (b == null) {
          a.S("sideBarService");
       }
       LiveLiteBottomBarPresenter d = uof.D;
       if (d == null) {
          a.S("longConnectionManager");
       }
       LiveLiteBottomBarPresenter c1 = uof.C;
       if (c1 == null) {
          a.S("logReporterService");
       }
       j oj = new j(x, x1, y, b, d, c1.a());
       uod.xg(w);
       d uod1 = this.P8();
       w = uof.v;
       x = uof.B;
       if (x == null) {
          a.S("sideBarService");
       }
       x1 = uof.w;
       if (x1 == null) {
          a.S(str1);
       }
       uod1.xg(new i(w, x, x1));
       uod1 = this.P8();
       w = uof.x;
       if (w == null) {
          a.S(str2);
       }
       x = uof.v;
       x1 = uof.D;
       if (x1 == null) {
          a.S("longConnectionManager");
       }
       y = uof.y;
       if (y == null) {
          a.S(str3);
       }
       uod1.xg(new e(w, x, x1, y));
       String str4 = "6";
       int i = 3;
       if (!PatchProxy.applyVoidOneRefs(v4, uof, liveLiteBott, str4)) {
          liveLiteBott = uof.B;
          if (liveLiteBott == null) {
             a.S("sideBarService");
          }
          liveLiteBott.l(new i(v4), i);
       }
       a$a f = a.f;
       Context context = this.getContext();
       e = uof.E;
       String str5 = "debugViewService";
       if (e == null) {
          a.S(str5);
       }
       LiveLiteBottomBarPresenter v = uof.v;
       Objects.requireNonNull(f);
       if (!PatchProxy.applyVoidThreeRefs(context, e, v, f, a$a.class, "1")) {
          a.p(e, str5);
          a.p(v, "bottomBarService");
          if (a.e && context != null) {
             a uoa = new a(context, e, v);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, uoa, a.class, "1")) {
                a c2 = uoa.c;
                View[] viewArray = new View[6];
                int i1 = 0;
                View view = PatchProxy.apply(objArray, uoa, a.class, "2");
                if (view != patchProxyRe) {
                }else {
                   view = uoa.a("添加礼物", new LiteBottomBarDebugController$addGift$1(uoa));
                }
                viewArray[i1] = view;
                int i2 = 1;
                View view1 = PatchProxy.apply(null, uoa, a.class, "3");
                if (view1 != patchProxyRe) {
                }else {
                   view1 = uoa.a("移除礼物", new LiteBottomBarDebugController$removeGift$1(uoa));
                }
                viewArray[i2] = view1;
                i2 = 2;
                view1 = PatchProxy.apply(null, uoa, a.class, "4");
                if (view1 != patchProxyRe) {
                }else {
                   view1 = uoa.a("添加快捷礼物", new LiteBottomBarDebugController$addGiftGuide$1(uoa));
                }
                viewArray[i2] = view1;
                View view2 = PatchProxy.apply(null, uoa, a.class, str);
                if (view2 != patchProxyRe) {
                }else {
                   view2 = uoa.a("移除快捷礼物", new LiteBottomBarDebugController$removeGiftGuide$1(uoa));
                }
                viewArray[i] = view2;
                int i3 = 4;
                View view3 = PatchProxy.apply(null, uoa, a.class, str4);
                if (view3 != patchProxyRe) {
                }else {
                   view3 = uoa.a("添加小黄车", new LiteBottomBarDebugController$addShopCart$1(uoa));
                }
                viewArray[i3] = view3;
                int i4 = 5;
                view2 = PatchProxy.apply(null, uoa, a.class, "7");
                if (view2 != patchProxyRe) {
                }else {
                   view2 = uoa.a("移除小黄车", new LiteBottomBarDebugController$removeShopCart$1(uoa));
                }
                viewArray[i4] = view2;
                c2.X1("BottomBar", CollectionsKt__CollectionsKt.L(viewArray));
             }
          }
       }
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBottomBarPresenter.class, "3")) {
          return;
       }
       a.p(p0, "provider");
       this.D = p0.a(a.class);
       this.w = p0.a(i.class);
       this.x = p0.a(d.class);
       this.y = p0.a(d.class);
       this.z = p0.a(o.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBottomBarPresenter.class, "4")) {
          return;
       }
       a.p(p0, "provider");
       this.A = p0.a(n.class);
       this.B = p0.a(e.class);
       this.C = p0.a(d.class);
       this.E = p0.a(a.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteBottomBarPresenter.class, "2")) {
          return;
       }
       a.p(p0, "register");
       p0.d(LiveLiteBottomBarService.class, this.v);
       return;
    }
    public final LiteBottomBarDataSource c9(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBottomBarPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.G.getValue();
    }
}
