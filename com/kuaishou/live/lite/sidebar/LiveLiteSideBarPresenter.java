package com.kuaishou.live.lite.sidebar.LiveLiteSideBarPresenter;
import b93.d;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarPresenter$dataSource$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.LinkedHashMap;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarPresenter$a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarPresenter$sideBarService$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController;
import com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource;
import kotlin.jvm.internal.a;
import tj3.e;
import ga1.d;
import xp5.i;
import fd3.n;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import vb3.p;
import com.kuaishou.live.viewcontroller.ViewController;
import vb3.n;
import com.kuaishou.live.lite.sidebar.debuginfo.LiteDebugViewController;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Iterable;
import fd3.c;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import fd3.c$a;
import gd3.a;
import com.kuaishou.live.lite.sidebar.e;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.kuaishou.live.lite.sidebar.LiteSideBarDebugController$shop2GiftItem$1;
import com.kuaishou.live.lite.sidebar.LiteSideBarDebugController$removeShopInGift$1;
import com.kuaishou.live.lite.sidebar.LiteSideBarDebugController$popularity2GuideGiftItem$1;
import com.kuaishou.live.lite.sidebar.LiteSideBarDebugController$removePopularityInGuideGift$1;
import com.kuaishou.live.lite.sidebar.LiteSideBarDebugController$popularity2GiftItem$1;
import com.kuaishou.live.lite.sidebar.LiteSideBarDebugController$removePopularityInGift$1;
import com.kuaishou.live.lite.sidebar.LiteSideBarDebugController$viceGiftGuide2GiftItem$1;
import com.kuaishou.live.lite.sidebar.LiteSideBarDebugController$removeGuideGift2InGift$1;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import c93.b;
import e93.a;
import d93.a;
import d93.b;

public final class LiveLiteSideBarPresenter extends d	// class@000b3b
{
    public LiveLiteSideBarViewController A;
    public final p B;
    public final Map C;
    public LiteDebugViewController D;
    public final a E;
    public final LiveLiteSideBarPresenter$sideBarService$1 F;
    public n v;
    public i w;
    public d x;
    public LiveLiteScatterLoadManager y;
    public a z;

    public void LiveLiteSideBarPresenter(){
       super();
       this.B = s.c(new LiveLiteSideBarPresenter$dataSource$2(this));
       this.C = new LinkedHashMap();
       this.E = new LiveLiteSideBarPresenter$a(this);
       this.F = new LiveLiteSideBarPresenter$sideBarService$1(this);
    }
    public void F8(){
       LiveLiteSideBarPresenter tv;
       c c;
       LiveLiteSideBarPresenter liveLiteSide = LiveLiteSideBarPresenter.class;
       Object[] objArray = null;
       String str = "5";
       if (PatchProxy.applyVoid(objArray, this, liveLiteSide, str)) {
          return;
       }
       super.F8();
       String str1 = "7";
       String str2 = "viewProviderService";
       if (!PatchProxy.applyVoid(objArray, this, liveLiteSide, str1)) {
          LiteSideBarConfigDataSource liteSideBarC = this.c9();
          LiveLiteSideBarPresenter tw = this.w;
          if (tw == null) {
             a.S("logPackageProvider");
          }
          tv = this.x;
          if (tv == null) {
             a.S("logReporterService");
          }
          e uoe = tv.a();
          LiveLiteSideBarPresenter tF = this.F;
          LiveLiteSideBarPresenter ty = this.y;
          if (ty == null) {
             a.S("liteScatterLoadManager");
          }
          LiveLiteSideBarViewController liveLiteSide1 = new LiveLiteSideBarViewController(liteSideBarC, tw, uoe, tF, ty);
          this.A = v4;
          tv = this.v;
          if (tv == null) {
             a.S(str2);
          }
          tv.c(LayoutViewType.RightBottomBar, v4);
       }
       String str3 = "6";
       if (!PatchProxy.applyVoid(objArray, this, liveLiteSide, str3)) {
          LiteDebugViewController liteDebugVie = new LiteDebugViewController();
          tv = this.v;
          if (tv == null) {
             a.S(str2);
          }
          tv.c(LayoutViewType.DebugContainerView, liteDebugVie);
          LiveLiteSideBarPresenter tC = this.C;
          Iterator iterator = tC.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             liteDebugVie.X1(key, uEntry.getValue());
          }
          tC.clear();
          this.D = liteDebugVie;
          c$a f = c.f;
          Context context = this.getContext();
          tC = this.E;
          tv = this.F;
          Objects.requireNonNull(f);
          if (!PatchProxy.applyVoidThreeRefs(context, tC, tv, f, c$a.class, "1")) {
             a.p(tC, "debugViewService");
             a.p(tv, "sideBarService");
             if (c.e && context != null) {
                c uoc = new c(context, tC, tv);
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (!PatchProxy.applyVoid(objArray, uoc, c.class, "1")) {
                   c = uoc.c;
                   View[] viewArray = new View[8];
                   int i = 0;
                   View view = PatchProxy.apply(objArray, uoc, c.class, "2");
                   if (view != patchProxyRe) {
                   }else {
                      view = uoc.a("小黄车替换礼物", new LiteSideBarDebugController$shop2GiftItem$1(uoc));
                   }
                   viewArray[i] = view;
                   i = 1;
                   view = PatchProxy.apply(objArray, uoc, c.class, "3");
                   if (view != patchProxyRe) {
                   }else {
                      view = uoc.a("移除小黄车", new LiteSideBarDebugController$removeShopInGift$1(uoc));
                   }
                   viewArray[i] = view;
                   i = 2;
                   View view1 = PatchProxy.apply(objArray, uoc, c.class, str3);
                   if (view1 != patchProxyRe) {
                   }else {
                      view1 = uoc.a("人气票替换快捷礼物", new LiteSideBarDebugController$popularity2GuideGiftItem$1(uoc));
                   }
                   viewArray[i] = view1;
                   int i1 = 3;
                   View view2 = PatchProxy.apply(objArray, uoc, c.class, str1);
                   if (view2 != patchProxyRe) {
                   }else {
                      view2 = uoc.a("移除人气票\(快捷礼物\)", new LiteSideBarDebugController$removePopularityInGuideGift$1(uoc));
                   }
                   viewArray[i1] = view2;
                   int i2 = 4;
                   view1 = PatchProxy.apply(objArray, uoc, c.class, "4");
                   if (view1 != patchProxyRe) {
                   }else {
                      view1 = uoc.a("人气票替换礼物", new LiteSideBarDebugController$popularity2GiftItem$1(uoc));
                   }
                   viewArray[i2] = view1;
                   i2 = 5;
                   View view3 = PatchProxy.apply(objArray, uoc, c.class, str);
                   if (view3 != patchProxyRe) {
                   }else {
                      view3 = uoc.a("移除人气票\(礼物\)", new LiteSideBarDebugController$removePopularityInGift$1(uoc));
                   }
                   viewArray[i2] = view3;
                   int i3 = 6;
                   view2 = PatchProxy.apply(objArray, uoc, c.class, "8");
                   if (view2 != patchProxyRe) {
                   }else {
                      view2 = uoc.a("快捷礼物替换礼物", new LiteSideBarDebugController$viceGiftGuide2GiftItem$1(uoc));
                   }
                   viewArray[i3] = view2;
                   View view4 = PatchProxy.apply(objArray, uoc, c.class, "9");
                   if (view4 != patchProxyRe) {
                   }else {
                      view4 = uoc.a("移除快捷礼物2\(礼物\)", new LiteSideBarDebugController$removeGuideGift2InGift$1(uoc));
                   }
                   viewArray[7] = view4;
                   c.X1("SideBar", CollectionsKt__CollectionsKt.L(viewArray));
                }
             }
          }
       }
    label_01a9 :
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSideBarPresenter.class, "3")) {
          return;
       }
       a.p(p0, "provider");
       this.z = p0.a(a.class);
       this.w = p0.a(i.class);
       this.y = p0.a(LiveLiteScatterLoadManager.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSideBarPresenter.class, "4")) {
          return;
       }
       a.p(p0, "provider");
       this.v = p0.a(n.class);
       this.x = p0.a(d.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSideBarPresenter.class, "2")) {
          return;
       }
       a.p(p0, "register");
       p0.d(e.class, this.F);
       p0.d(a.class, this.E);
       return;
    }
    public final LiteSideBarConfigDataSource c9(){
       Object obj = PatchProxy.apply(null, this, LiveLiteSideBarPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getValue();
    }
}
