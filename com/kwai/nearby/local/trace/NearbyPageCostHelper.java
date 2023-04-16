package com.kwai.nearby.local.trace.NearbyPageCostHelper;
import com.kwai.nearby.local.HomeLocalFragment;
import java.lang.Object;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.kwai.nearby.local.trace.NearbyPageCostHelper$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.t;
import com.kwai.nearby.local.trace.c;
import erd.r;
import t45.d;
import brd.z;
import kd7.c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import rd7.c;

public class NearbyPageCostHelper	// class@000ffc
{
    public final boolean a;
    public boolean b;
    public final HomeLocalFragment c;
    public final b d;
    public b e;
    public b f;
    public boolean g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;

    public void NearbyPageCostHelper(HomeLocalFragment p0,boolean p1){
       super();
       this.g = false;
       this.a = p1;
       this.c = p0;
       p0.getLifecycle().addObserver(new NearbyPageCostHelper$1(this));
       this.d = new FragmentCompositeLifecycleState(p0).i().filter(c.b).observeOn(d.a).subscribe(new c(this), Functions.e);
    }
    public final void a(){
       Object obj = this;
       if (PatchProxy.applyVoid(null, obj, NearbyPageCostHelper.class, "5")) {
          return;
       }
       if (obj.g != null) {
          return;
       }
       NearbyPageCostHelper h = obj.h;
       long l = 0;
       if (h - l && obj.j - l) {
          NearbyPageCostHelper i = obj.i;
          if (i - l) {
             long l1 = Math.max((obj.j - obj.h), l);
             long l2 = Math.max((obj.l - obj.h), l);
             long l3 = Math.max((obj.m - obj.h), l);
             long l4 = Math.max((obj.k - obj.h), l);
             l = Math.max((obj.j - obj.h), l);
             c.f("enterToCover", Math.max((i - h), l));
             c.f("seeCover", l1);
             c.f("netData_render", (obj.i - obj.k));
             String str = (obj.j - obj.i)? 1: null;
             if (str) {
                c.f("cache_render", l1);
             }
             c.f("t0", l2);
             c.f("t1", l3);
             c.f("t2", l4);
             c.f("t3", l);
             c.g(true);
             obj.g = true;
          }
       }
       return;
    }
}
