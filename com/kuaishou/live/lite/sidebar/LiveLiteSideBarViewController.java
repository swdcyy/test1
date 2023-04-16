package com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$a;
import nsd.u;
import com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource;
import xp5.i;
import tj3.e;
import fd3.n;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ec3.f;
import com.kuaishou.live.lite.util.viewupdater.a;
import com.kuaishou.live.lite.util.viewupdater.a$a;
import vd3.a;
import java.util.HashMap;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$animController$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.widget.LinearLayout;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import ha1.b;
import k51.d;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import java.lang.Enum;
import android.view.ViewGroup;
import com.kuaishou.live.lite.util.viewupdater.d;
import java.util.Objects;
import com.kuaishou.live.lite.util.viewupdater.d$a;
import com.kuaishou.live.lite.util.viewupdater.PosRandomChangeLinearLayout;
import com.kuaishou.live.lite.util.viewupdater.f;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$c;
import z1.a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$d;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import android.app.Activity;
import com.yxcorp.utility.n;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import fd3.r;
import android.view.View$OnClickListener;
import fd3.s;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import fd3.t;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$e;
import vd3.c;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import com.kuaishou.live.lite.util.viewupdater.LiteTouchEventConsumeAwareLayout;
import android.animation.AnimatorSet;
import com.kuaishou.live.lite.sidebar.LiteSideBarReplaceAnimController;
import android.animation.Animator;
import com.kuaishou.live.lite.sidebar.e$a;
import com.google.gson.JsonObject;
import com.kuaishou.live.core.show.startup.LiveLiteSideBarConfig;
import com.kuaishou.live.lite.sidebar.LiteSideBarConfigDataSource$a;
import com.kuaishou.live.lite.sidebar.LiveLiteSideBarViewController$b;
import android.widget.FrameLayout;
import va1.a;

public final class LiveLiteSideBarViewController extends ViewController	// class@000b44
{
    public final a j;
    public d k;
    public ViewGroup l;
    public LinearLayout m;
    public View n;
    public AnimatorSet o;
    public final Map p;
    public final p q;
    public List r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final LiteSideBarConfigDataSource v;
    public final i w;
    public final e x;
    public final n y;
    public static final LiveLiteSideBarViewController$a z;

    static {
       LiveLiteSideBarViewController.z = new LiveLiteSideBarViewController$a(null);
    }
    public void LiveLiteSideBarViewController(LiteSideBarConfigDataSource p0,i p1,e p2,n p3,LiveLiteScatterLoadManager p4){
       a.p(p0, "configDataSource");
       a.p(p1, "logPackageProvider");
       a.p(p2, "logReporter");
       a.p(p3, "sideBarServiceImpl");
       a.p(p4, "liveLiteScatterLoadService");
       super();
       this.v = p0;
       this.w = p1;
       this.x = p2;
       this.y = p3;
       a uoa = (f.h())? new a(a.b(p4)): new a(a.a());
       this.j = uoa;
       this.p = new HashMap();
       this.q = s.c(new LiveLiteSideBarViewController$animController$2(this));
       this.r = CollectionsKt__CollectionsKt.E();
       this.t = true;
       return;
    }
    public static final LinearLayout V2(LiveLiteSideBarViewController p0){
       p0 = p0.m;
       if (p0 == null) {
          a.S("sideBarBizContainerView");
       }
       return p0;
    }
    public void F2(){
       boolean b;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveLiteSideBarViewController liveLiteSide = LiveLiteSideBarViewController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteSide, "2")) {
          return;
       }
       View view = b.e(this.D2(), R.layout.lite_sidebar_container);
       view.setTag(d.a, LayoutViewType.RightBottomBar.name());
       String str = "view";
       a.o(view, str);
       this.R2(view);
       this.l = this.A2(0x7f0a20ef);
       this.n = this.A2(0x7f0a180d);
       LinearLayout linearLayout = this.A2(R.id.live_lite_sidebar_biz_container_view);
       this.m = linearLayout;
       d$a j0 = d.j0;
       if (linearLayout == null) {
          a.S("sideBarBizContainerView");
       }
       Objects.requireNonNull(j0);
       LinearLayout linearLayout1 = PatchProxy.applyOneRefs(linearLayout, j0, d$a.class, "1");
       if (linearLayout1 != patchProxyRe) {
       }else {
          a.p(linearLayout, str);
          linearLayout1 = (linearLayout instanceof PosRandomChangeLinearLayout)? linearLayout: new f(linearLayout);
       }
       this.k = linearLayout1;
       String str1 = "updateViewHelper";
       if (linearLayout1 == null) {
          a.S(str1);
       }
       linearLayout1.setAddViewCallback(new LiveLiteSideBarViewController$c(this));
       LiveLiteSideBarViewController tk = this.k;
       if (tk == null) {
          a.S(str1);
       }
       tk.setRemoveViewCallback(new LiveLiteSideBarViewController$d(this));
       if (!PatchProxy.applyVoid(objArray, this, liveLiteSide, "4")) {
          Activity obj = PatchProxy.apply(objArray, this, liveLiteSide, "18");
          b = false;
          boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableLiteSideBarFlod", b);
          if (b1) {
             obj = this.B2();
             Object obj1 = PatchProxy.applyOneRefs(obj, this, liveLiteSide, "17");
             if (obj1 != patchProxyRe) {
                b2 = obj1.booleanValue();
             }else if(((float)n.j(obj) / n.i(this.D2())) - (float)660 >= 0){
                b2 = true;
             }else {
                b2 = false;
             }
             b.c0(LiveLiteLogTag.SIDE_BAR_SHRINK, "checkHeightValidForShrink", "valid", Boolean.valueOf(b2));
             if (b2) {
                b = 1;
             }
          }
          if (b) {
             LiveLiteSideBarViewController tn = this.n;
             if (tn == null) {
                a.S("sideBarShrinkView");
             }
             tn.setOnClickListener(new r(this));
             this.y.d.observe(this, new s(this));
             this.y.e.observe(this, new t(this));
          }
       }
       this.y.b.e(new LiveLiteSideBarViewController$e(this));
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteSideBarViewController.class, "3")) {
          return;
       }
       b.Z(LiveLiteLogTag.SIDE_BAR, "LiveLiteSideBarViewController.onDestroy");
       this.j.b();
       LiveLiteSideBarViewController tk = this.k;
       if (tk == null) {
          a.S("updateViewHelper");
       }
       tk.release();
       this.s = false;
       Iterator iterator = this.p.values().iterator();
       while (iterator.hasNext()) {
          this.Z2(iterator.next());
       }
       tk = this.o;
       if (tk != null && tk.isRunning() == true) {
          tk = this.o;
          if (tk != null) {
             tk.removeAllListeners();
             tk.cancel();
          }
       }
       LiteSideBarReplaceAnimController liteSideBarR = this.W2();
       Objects.requireNonNull(liteSideBarR);
       if (!PatchProxy.applyVoid(objArray, liteSideBarR, LiteSideBarReplaceAnimController.class, "12")) {
          liteSideBarR = liteSideBarR.a;
          if (liteSideBarR != null) {
             liteSideBarR.removeAllListeners();
             liteSideBarR.end();
          }
       }
       return;
    }
    public final LiteSideBarReplaceAnimController W2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteSideBarViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
    public final View X2(Context p0,e$a p1,boolean p2){
       LiveLiteSideBarViewController obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveLiteSideBarViewController.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, LiveLiteSideBarViewController.class, "12");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.v;
       Objects.requireNonNull(obj);
       JsonObject jsonObject = PatchProxy.applyOneRefs(p1, obj, LiteSideBarConfigDataSource.class, "11");
       if (jsonObject != patchProxyRe) {
       }else {
          a.p(p1, "item");
          JsonObject jsonObject1 = obj.c(obj.a.mLiteSidebarItemConfigMap, p1);
          if (jsonObject1 == null) {
             jsonObject1 = obj.c(LiteSideBarConfigDataSource.g.a().mLiteSidebarItemConfigMap, p1);
          }
          jsonObject = jsonObject1;
       }
       LiteTouchEventConsumeAwareLayout liteTouchEve = LiteTouchEventConsumeAwareLayout.a(this.p, p1.k(p0, jsonObject, p2));
       liteTouchEve.setTouchEventConsumedListener(new LiveLiteSideBarViewController$b(this, p1));
       a.o(liteTouchEve, "view");
       liteTouchEve.setTag(p1);
       liteTouchEve.setClipChildren(false);
       return liteTouchEve;
    }
    public final e$a Y2(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLiteSideBarViewController.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       e$a tag = p0.getTag();
       if (!tag instanceof e$a) {
          tag = null;
       }
       return tag;
    }
    public final void Z2(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteSideBarViewController.class, "19")) {
          return;
       }
       if (p0 instanceof LiteTouchEventConsumeAwareLayout) {
          p0.setTouchEventConsumedListener(a.a());
       }
       Object obj = null;
       p0.setTag(obj);
       if (!p0 instanceof ViewGroup) {
          p0 = obj;
       }
       if (p0 != null) {
          p0.setClipChildren(true);
       }
       return;
    }
}
