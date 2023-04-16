package com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.d;
import k51.c;
import com.kuaishou.live.basic.tk.LiveTkItemManager;
import java.util.concurrent.LinkedBlockingQueue;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.b;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.a;
import wv1.c;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.lefttop.d$a;
import z1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import w51.a;
import lp3.e;
import p91.m;
import cs5.d;
import lp3.c;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate;
import lf3.g;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import wv1.p;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.k1;
import wv1.w;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveCommonActivityWidget;
import z51.g;
import wv1.t;
import wv1.u;
import msd.l;
import java.lang.Runnable;
import lp3.i;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import wv1.v;

public class d extends c	// class@001706
{
    public c A;
    public m p;
    public LiveStreamFeedWrapper q;
    public d r;
    public v s;
    public i t;
    public LiveTkItemManager u;
    public long v;
    public final LinkedBlockingQueue w;
    public final boolean x;
    public final g y;
    public final g z;
    public static String sLivePresenterClassName = "LiveLeftTopRevenueWidgetMessagePresenter";

    public void d(){
       super();
       this.u = new LiveTkItemManager();
       this.v = Long.MAX_VALUE;
       this.w = new LinkedBlockingQueue();
       this.x = true;
       this.y = new b(this);
       this.z = new a(this);
       this.A = new c(new d$a(this));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       if (a.H()) {
          return;
       }
       this.r = this.p.t5().a(d.class);
       this.p.u().u0(716, LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate.class, this.y);
       this.p.u().u0(718, LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetClose.class, this.z);
       this.X7(t.interval(1000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new p(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       if (a.H()) {
          return;
       }
       this.p.u().o(716, this.y);
       this.p.u().o(718, this.z);
       this.w.clear();
       k1.n(this);
       this.u.a();
       this.A.b = null;
       return;
    }
    public final void P8(LiveCommonActivityWidgetProto$SCLiveCommonActivityWidgetUpdate p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "6")) {
          return;
       }
       g og = w.a.a(p0.widget);
       og.e(p1);
       this.u.b(og, new t(this, p0), new u(p1));
       return;
    }
    public final void R8(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "9")) {
          return;
       }
       this.w.add(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.t = this.r8("LIVE_SERVICE_MANAGER");
       this.q = this.t8("LIVE_PHOTO");
       this.s = this.s8(v.class);
       return;
    }
}
