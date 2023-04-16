package com.yxcorp.gifshow.page.cost.list.g;
import dd5.k;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import ok.x;
import java.lang.Object;
import ed5.b;
import java.util.HashSet;
import com.yxcorp.gifshow.page.cost.list.g$a;
import android.os.Looper;
import dd5.m;
import java.lang.String;
import com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver;
import tvb.a;
import com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver$a;
import androidx.lifecycle.LifecycleOwner;
import dd5.b$b;
import com.yxcorp.gifshow.page.cost.PageStageTracker;
import dd5.b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.yxcorp.gifshow.page.cost.list.ListPageStageCostHelper$2;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.t;
import com.yxcorp.gifshow.page.cost.list.f;
import erd.r;
import brd.m;
import t45.d;
import brd.z;
import tvb.b;
import com.yxcorp.gifshow.page.cost.list.d;
import erd.g;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.System;
import dd5.j;
import java.lang.StringBuilder;
import java.lang.Long;
import com.kwai.soc.arch.rubas.base.Rubas;
import com.yxcorp.gifshow.page.cost.list.ListReqLifecycle;
import com.yxcorp.gifshow.page.cost.list.a;
import ok.h;
import lnc.b9;
import com.yxcorp.gifshow.page.cost.list.ListPageFirstRenderObserver$FlagNode;
import java.util.Objects;
import ed5.g;
import fd5.a;
import android.os.SystemClock;
import ed5.e;

public final class g implements k	// class@000e2f
{
    public final m b;
    public final ListPageFirstRenderObserver c;
    public final e d;
    public final Set e;
    public long f;
    public long g;
    public b h;
    public long i;
    public long j;
    public b k;
    public final Handler l;

    public void g(BaseFragment p0,x p1){
       super(p0, true, p1);
    }
    public void g(BaseFragment p0,boolean p1,x p2){
       super();
       this.d = new b();
       this.e = new HashSet();
       this.i = -1;
       this.l = new g$a(this, Looper.getMainLooper());
       this.j = g.a();
       m om = p2.get();
       this.b = om;
       this.c = new ListPageFirstRenderObserver(new a(this), p0);
       b$b uob = new b$b();
       uob.a = new PageStageTracker(om.i(), p0, "enterToListRender", p1);
       uob.b(true);
       om.j(uob.a(), p0);
       om.o();
       om.a("bizType", "social");
       p0.getLifecycle().addObserver(new ListPageStageCostHelper$2(this));
       this.k = new FragmentCompositeLifecycleState(p0).i().filter(f.b).firstElement().u(d.a).y(new b(this, p0), d.b);
    }
    public static long a(){
       Object obj = PatchProxy.apply(null, null, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return System.currentTimeMillis();
    }
    public boolean D5(){
       return j.a(this);
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "14")) {
          return;
       }
       this.b.e(p0);
       if (("reqNetToDataParsed").equals(p0) && !this.f) {
          this.f = g.a();
          Rubas.d("dataToListRender_begin_"+this.b.i(), Long.valueOf(this.f));
       }
       Rubas.c(p0+"_end_"+this.b.i());
       return;
    }
    public void c(ListReqLifecycle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "6")) {
          return;
       }
       this.h = b9.c(this.h, new a(this, p0));
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       this.c.a(ListPageFirstRenderObserver$FlagNode.LAUNCH_FINISH_PRE_RENDER);
       return;
    }
    public void e(String p0,long p1,long p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), this, g.class, "15")) {
          return;
       }
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(m.class) || !PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Long.valueOf(p2), tb, m.class, "15")) {
          m e = tb.e;
          if (e != null) {
             e.c(p0, p1, p2);
          }
       }
       Rubas.d(p0+"_end_"+this.b.i(), Long.valueOf(p2));
       return;
    }
    public void f(String p0,long p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, og, "13")) {
          return;
       }
       og = this.b;
       Objects.requireNonNull(og);
       m om = m.class;
       if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), og, om, "14")) {
          om = og.e;
          if (om != null) {
             om.j(p0, p1);
             if (og.r()) {
                og.c.b(p0);
             }
          }
       }
       Rubas.d(p0+"_begin_"+this.b.i(), Long.valueOf(p1));
       return;
    }
    public final long g(long p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, og, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return (g.a() - (SystemClock.currentThreadTimeMillis() - p0));
    }
    public e qe(){
       return this.d;
    }
}
