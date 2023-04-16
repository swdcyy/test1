package com.kuaishou.live.common.core.component.pendant.miniwidget.item.kds.LiveMiniWidgetKdsItem;
import cs5.f;
import com.kuaishou.live.common.core.component.pendant.miniwidget.item.kds.LiveMiniWidgetKdsItem$a;
import nsd.u;
import android.content.Context;
import p91.m;
import qv1.a;
import z51.c;
import com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetPositionType;
import cs5.h;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lp3.e;
import cs5.g;
import com.kuaishou.live.common.core.component.pendant.miniwidget.item.kds.LiveMiniWidgetKdsItem$mainScope$2;
import msd.a;
import qrd.p;
import qrd.s;
import o63.a;
import java.lang.Class;
import lp3.c;
import z51.a;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import tx4.h;
import sx4.e;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import z51.g;
import java.lang.Integer;
import tx4.w;
import pv1.a;
import sq5.b;
import java.lang.Number;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout;
import cs5.b;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView$b;
import ftd.k0;
import com.kuaishou.live.common.core.component.pendant.miniwidget.item.kds.LiveMiniWidgetKdsItem$createTkView$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import com.kwai.feature.api.live.merchant.miniwidget.LiveMiniWidgetItemType;
import java.util.concurrent.CancellationException;
import ftd.l0;
import java.lang.Boolean;
import qrd.l1;

public final class LiveMiniWidgetKdsItem extends f	// class@0016f7
{
    public LiveMiniWidgetKdsView q;
    public final a r;
    public final p s;
    public a t;
    public String u;
    public a v;
    public Context w;
    public final m x;
    public a y;
    public c z;
    public static final LiveMiniWidgetKdsItem$a A;

    static {
       LiveMiniWidgetKdsItem.A = new LiveMiniWidgetKdsItem$a(null);
    }
    public void LiveMiniWidgetKdsItem(Context p0,m p1,a p2,c p3,LiveMiniWidgetPositionType p4,h p5){
       a.p(p0, "context");
       a.p(p1, "liveBasicContext");
       a.p(p2, "kdsWidgetData");
       a.p(p3, "tkItem");
       a.p(p4, "positionType");
       e uoe = p1.t5();
       a.o(uoe, "liveBasicContext.liveServiceManager");
       super(uoe, p2.a, p4, p5);
       this.w = p0;
       this.x = p1;
       this.y = p2;
       this.z = p3;
       this.s = s.c(LiveMiniWidgetKdsItem$mainScope$2.INSTANCE);
       e uoe1 = p1.t5();
       a.m(uoe1);
       c uoc = uoe1.a(a.class);
       a.o(uoc, "liveBasicContext.liveSer¡­ridgeService::class.java\)");
       this.r = uoc;
    }
    public final void A0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMiniWidgetKdsItem.class, "8")) {
          return;
       }
       a.p(p0, "invoker");
       this.t = p0;
       return;
    }
    public void D(){
       LiveMiniWidgetKdsView b;
       if (PatchProxy.applyVoid(null, this, LiveMiniWidgetKdsItem.class, "12")) {
          return;
       }
       LiveMiniWidgetKdsItem tq = this.q;
       if (tq != null && !PatchProxy.applyVoid(null, tq, LiveMiniWidgetKdsView.class, "7")) {
          b.c0(LiveLogTag.LIVE_MINI_WIDGET_KDS, "KdsView onHide", "widgetId", tq.g);
          b = tq.b;
          if (b != null) {
             b.b("onWidgetHide", null, null);
          }
       }
       return;
    }
    public f h(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "5";
       LiveMiniWidgetKdsItem liveMiniWidg = PatchProxy.apply(null, this, LiveMiniWidgetKdsItem.class, str);
       if (liveMiniWidg != patchProxyRe) {
       }else {
          g og = this.z.c();
          g a = og.a;
          g b = og.b;
          g c = og.c;
          g d = og.d;
          g e = og.e;
          g f = og.f;
          g og1 = g.class;
          if (PatchProxy.isSupport(og1)) {
             Object[] objArray = new Object[]{a,b,c,d,e,f};
             og = PatchProxy.apply(objArray, og, og1, str);
             if (og != patchProxyRe) {
             label_0063 :
                LiveMiniWidgetKdsItem liveMiniWidg1 = new LiveMiniWidgetKdsItem(this.w, this.x, this.y, new c(og, this.z.g), this.u(), this.s());
                og.t = this.t;
                og.y0(this.v);
                this.g(og);
             }
          }
          a.p(a, "bundleId");
          a.p(b, "viewKey");
          a.p(e, "kdsCommonParams");
          a.p(f, "traceId");
          g og2 = new g(a, b, c, d, e, f);
          goto label_0063 ;
       }
       return liveMiniWidg;
    }
    public b i(){
       Object obj = PatchProxy.apply(null, this, LiveMiniWidgetKdsItem.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.i().a("bundleId", this.y.a().a());
    }
    public void k0(){
       LiveMiniWidgetKdsView b;
       if (PatchProxy.applyVoid(null, this, LiveMiniWidgetKdsItem.class, "13")) {
          return;
       }
       LiveMiniWidgetKdsItem tq = this.q;
       if (tq != null && !PatchProxy.applyVoid(null, tq, LiveMiniWidgetKdsView.class, "8")) {
          b.c0(LiveLogTag.LIVE_MINI_WIDGET_KDS, "KdsView onContainerFold", "widgetId", tq.g);
          b = tq.b;
          if (b != null) {
             b.b("onWidgetFold", null, null);
          }
       }
       return;
    }
    public void l0(){
       LiveMiniWidgetKdsView b;
       if (PatchProxy.applyVoid(null, this, LiveMiniWidgetKdsItem.class, "14")) {
          return;
       }
       LiveMiniWidgetKdsItem tq = this.q;
       if (tq != null && !PatchProxy.applyVoid(null, tq, LiveMiniWidgetKdsView.class, "9")) {
          b.c0(LiveLogTag.LIVE_MINI_WIDGET_KDS, "KdsView onContainerUnFold", "widgetId", tq.g);
          b = tq.b;
          if (b != null) {
             b.b("onWidgetUnfold", null, null);
          }
       }
       return;
    }
    public long m(){
       Object obj = PatchProxy.apply(null, this, LiveMiniWidgetKdsItem.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.x.s();
    }
    public View n0(){
       Object obj = PatchProxy.apply(null, this, LiveMiniWidgetKdsItem.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       b.c0(LiveLogTag.LIVE_MINI_WIDGET_KDS, "KdsItem onCreateRootView", "widgetId", this.z());
       LiveMiniWidgetKdsView liveMiniWidg = new LiveMiniWidgetKdsView(this.w, this.r, this.z(), this.z, this.t);
       obj.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
       obj.setContainerDelegate(this.k());
       obj.setKdsViewLogger(this.v);
       if (!PatchProxy.applyVoidOneRefs(obj, this, LiveMiniWidgetKdsItem.class, "4")) {
          a.p(obj, "view");
          a.f(this.x0(), null, null, new LiveMiniWidgetKdsItem$createTkView$1(this, obj, null), 3, null);
       }
       this.q = obj;
       return obj;
    }
    public LiveMiniWidgetItemType o(){
       return LiveMiniWidgetItemType.KDS_TYPE;
    }
    public void o0(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMiniWidgetKdsItem.class, "10")) {
          return;
       }
       a.p(p0, "status");
       LiveMiniWidgetKdsItem tv = this.v;
       if (tv != null) {
          tv.d(this.z(), this.y.a().a());
       }
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, LiveMiniWidgetKdsItem.class, "11")) {
          return;
       }
       LiveMiniWidgetKdsItem tq = this.q;
       if (tq != null) {
          tq.d();
       }
       return;
    }
    public void p0(){
       if (PatchProxy.applyVoid(null, this, LiveMiniWidgetKdsItem.class, "9")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_MINI_WIDGET_KDS, "KdsItem destroy", "widgetId", this.z());
       l0.f(this.x0(), null, 1, null);
       LiveMiniWidgetKdsItem tq = this.q;
       if (tq != null) {
          tq.b();
       }
       return;
    }
    public boolean t0(f p0,String p1){
       int b;
       LiveMiniWidgetKdsItem tq;
       l1 a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMiniWidgetKdsItem.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = "newItem";
       a.p(p0, obj);
       String str = "kdsCommonParams";
       a.p(p1, str);
       LiveLogTag lIVE_MINI_WI = LiveLogTag.LIVE_MINI_WIDGET_KDS;
       b.c0(lIVE_MINI_WI, "KdsItem updateData", "widgetId", this.z());
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, this, LiveMiniWidgetKdsItem.class, "7");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          a.p(p0, obj);
          a.p(p1, str);
          if (p0 instanceof LiveMiniWidgetKdsItem) {
             tq = p0;
             if (!(a.g(tq.y.a().a(), this.y.a().a()) ^ true)) {
                if (!(a.g(this.y, tq.y) ^ true)) {
                   Object obj2 = PatchProxy.applyOneRefs(p1, this, LiveMiniWidgetKdsItem.class, "17");
                   b = (obj2 != patchProxyRe)? obj2.booleanValue(): p1.equals(this.u) ^ true;
                   if (!b) {
                   label_008d :
                      b = false;
                   }
                }
                b = true;
             }
          }
       }
       if (b) {
          b.c0(lIVE_MINI_WI, "shouldUpdateData", "widgetId", this.z());
          LiveMiniWidgetKdsItem y = p0.y;
          this.y = y;
          this.u = p1;
          tq = this.q;
          if (tq != null) {
             tq.c(y.a().b(), p1);
          }else {
             this.z = p0.z;
             a = l1.a;
          }
          return true;
       }else {
          return false;
       }
    }
    public final LiveMiniWidgetKdsView v0(){
       return this.q;
    }
    public final m w0(){
       return this.x;
    }
    public final k0 x0(){
       Object obj = PatchProxy.apply(null, this, LiveMiniWidgetKdsItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public final void y0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMiniWidgetKdsItem.class, "2")) {
          return;
       }
       this.v = p0;
       LiveMiniWidgetKdsItem tq = this.q;
       if (tq != null) {
          tq.setKdsViewLogger(p0);
       }
       return;
    }
}
