package com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView;
import android.widget.FrameLayout;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView$a;
import nsd.u;
import android.content.Context;
import o63.a;
import java.lang.String;
import z51.c;
import z51.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.basic.tk.LiveTkBridge;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView$createTkView$bridge$1;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView$createTkView$bridge$2;
import msd.a;
import android.app.Activity;
import e3a.a;
import sx4.e;
import sx4.e$a;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import tx4.h;
import java.lang.Throwable;
import cs5.b;
import com.kuaishou.live.basic.tk.LiveMiniWidgetKdsView$b;

public final class LiveMiniWidgetKdsView extends FrameLayout	// class@000d0d
{
    public e b;
    public b c;
    public LiveMiniWidgetKdsView$b d;
    public final LiveMiniWidgetKdsView$c e;
    public final a f;
    public final String g;
    public final c h;
    public final a i;
    public HashMap j;
    public static final LiveMiniWidgetKdsView$a k;

    static {
       LiveMiniWidgetKdsView.k = new LiveMiniWidgetKdsView$a(null);
    }
    public void LiveMiniWidgetKdsView(Context p0,a p1,String p2,c p3,a p4){
       a.p(p0, "viewContext");
       a.p(p1, "liveJsBridgeService");
       a.p(p2, "widgetId");
       a.p(p3, "tkItem");
       super(p0);
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       this.e = new LiveMiniWidgetKdsView$c(this);
    }
    public final boolean a(){
       boolean b;
       LiveLogTag obj = PatchProxy.apply(null, this, LiveMiniWidgetKdsView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = LiveLogTag.LIVE_MINI_WIDGET_KDS;
       b.c0(obj, "KdsView createTkView", "widgetId", this.g);
       this.b();
       this.h.d = this.e;
       LiveTkBridge liveTkBridge = new LiveTkBridge(this.f, new LiveMiniWidgetKdsView$createTkView$bridge$1(this), new LiveMiniWidgetKdsView$createTkView$bridge$2(this));
       Activity uActivity = a.b(this.getContext());
       b = false;
       if (uActivity == null) {
          b.c0(obj, "KdsView createTkView error, activity is null", "widgetId", this.g);
          return b;
       }else {
          e uoe = this.h.a(liveTkBridge, uActivity);
          this.b = uoe;
          LiveMiniWidgetKdsView ti = this.i;
          if (ti != null) {
             if (uoe != null) {
                uoe.setIJS2NativeInvoker(ti);
             }
             this.i.c(this.b);
          }
          LiveMiniWidgetKdsView tb = this.b;
          if (tb != null) {
             this.addView(tb.getView(), new FrameLayout$LayoutParams(-1, -1));
             b = true;
          }
          return b;
       }
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, LiveMiniWidgetKdsView.class, "3")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_MINI_WIDGET_KDS, "KdsView destroyTkView", "widgetId", this.g);
       this.h.b();
       this.b = null;
       this.removeAllViews();
       return;
    }
    public final boolean c(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveMiniWidgetKdsView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p1, "kdsCommonParams");
       b.c0(LiveLogTag.LIVE_MINI_WIDGET_KDS, "KdsView notifyTachUpdate", "widgetId", this.g);
       return this.h.e(p0, p1);
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, LiveMiniWidgetKdsView.class, "6")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_MINI_WIDGET_KDS, "KdsView onShow", "widgetId", this.g);
       LiveMiniWidgetKdsView tb = this.b;
       if (tb != null) {
          tb.b("onWidgetShow", null, null);
       }
       return;
    }
    public final b getContainerDelegate(){
       return this.c;
    }
    public final LiveMiniWidgetKdsView$b getKdsViewLogger(){
       return this.d;
    }
    public final e getTkViewContainer(){
       return this.b;
    }
    public final void setContainerDelegate(b p0){
       this.c = p0;
    }
    public final void setKdsViewLogger(LiveMiniWidgetKdsView$b p0){
       this.d = p0;
    }
}
