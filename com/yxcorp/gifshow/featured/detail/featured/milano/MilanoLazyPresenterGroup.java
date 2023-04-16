package com.yxcorp.gifshow.featured.detail.featured.milano.MilanoLazyPresenterGroup;
import tda.m0;
import com.yxcorp.gifshow.featured.detail.featured.milano.MilanoLazyPresenterGroup$a;
import nsd.u;
import tda.n0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.featured.detail.featured.milano.MilanoLazyPresenterGroup$STATE;
import java.util.ArrayList;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qrd.l1;
import com.yxcorp.gifshow.featured.detail.featured.milano.MilanoLazyPresenterGroup$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.utility.Log;
import java.lang.Enum;
import java.lang.StringBuilder;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import ekd.k1;

public final class MilanoLazyPresenterGroup extends m0	// class@000f1d
{
    public MilanoLazyPresenterGroup$STATE b;
    public MilanoLazyPresenterGroup$STATE c;
    public final ArrayList d;
    public final PresenterV2 e;
    public View f;
    public Object[] g;
    public a h;
    public int i;
    public final Runnable j;
    public static final MilanoLazyPresenterGroup$a k;

    static {
       MilanoLazyPresenterGroup.k = new MilanoLazyPresenterGroup$a(null);
    }
    public void MilanoLazyPresenterGroup(n0 p0){
       a.p(p0, "factory");
       super(p0);
       MilanoLazyPresenterGroup$STATE nONE = MilanoLazyPresenterGroup$STATE.NONE;
       this.b = nONE;
       this.c = nONE;
       ArrayList uArrayList = new ArrayList();
       this.d = uArrayList;
       PresenterV2 presenterV2 = new PresenterV2();
       uArrayList.add(presenterV2);
       this.e = presenterV2;
       this.j = new MilanoLazyPresenterGroup$b(this);
    }
    public void a(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, MilanoLazyPresenterGroup.class, "4")) {
          return;
       }
       a.p(p0, "presenter");
       this.d.add(p0);
       PatchProxy.onMethodExit(MilanoLazyPresenterGroup.class, "4");
       return;
    }
    public void b(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoLazyPresenterGroup.class, "6")) {
          return;
       }
       a.p(p0, "callerContext");
       this.c = MilanoLazyPresenterGroup$STATE.BIND;
       this.g = p0;
       this.i();
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoLazyPresenterGroup.class, "5")) {
          return;
       }
       a.p(p0, "view");
       this.c = MilanoLazyPresenterGroup$STATE.CREATE;
       this.f = p0;
       this.i();
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, MilanoLazyPresenterGroup.class, "7")) {
          return;
       }
       this.c = MilanoLazyPresenterGroup$STATE.NONE;
       this.j();
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          PresenterV2 presenterV2 = iterator.next();
          if (presenterV2.R1()) {
             presenterV2.destroy();
          }
       }
       return;
    }
    public PresenterV2 e(){
       return this.e;
    }
    public boolean g(){
       MilanoLazyPresenterGroup tc = this.c;
       boolean b = (tc == MilanoLazyPresenterGroup$STATE.CREATE || tc == MilanoLazyPresenterGroup$STATE.BIND)? true: false;
       return b;
    }
    public final void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoLazyPresenterGroup.class, "8")) {
          return;
       }
       Log.g("MilanoLazyPresenterGroup", p0);
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, MilanoLazyPresenterGroup.class, "2")) {
          return;
       }
       MilanoLazyPresenterGroup$STATE bIND = MilanoLazyPresenterGroup$STATE.BIND;
       boolean b = true;
       boolean b1 = (this.b.compareTo(bIND) < 0)? true: false;
       this.h("schedule high "+b1);
       e.f(this.j, "MilanoDelayPresenter action", b, b1);
       MilanoLazyPresenterGroup tj = this.j;
       long l = (this.b != bIND)? 1000: 500;
       k1.s(tj, "MilanoLazyPresenterGroup", l);
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, MilanoLazyPresenterGroup.class, "3")) {
          return;
       }
       this.h("unSchedule");
       e.c(this.j);
       k1.n("MilanoLazyPresenterGroup");
       return;
    }
}
