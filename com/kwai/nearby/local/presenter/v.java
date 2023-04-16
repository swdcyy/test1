package com.kwai.nearby.local.presenter.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.nearby.local.presenter.v$b;
import com.kwai.nearby.local.presenter.v$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import brd.m;
import dd7.p0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.framework.location.k;
import trb.a;
import q96.d;
import lrb.a;
import com.kwai.nearby.local.HomeLocalFragment;

public class v extends PresenterV2	// class@000fd9
{
    public HomeLocalFragment p;
    public v$b q;
    public NearbyLocationWindowShowConfig r;
    public RecyclerView$r s;

    public void v(){
       super();
       this.q = new v$b(null);
       this.s = new v$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, v.class, "2")) {
          return;
       }
       v tp = this.p;
       if (tp == null) {
          return;
       }
       if (tp.h0() != null) {
          this.p.h0().addOnScrollListener(this.s);
       }
       this.X7(this.p.Vg().i().firstElement().y(new p0(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, v.class, "3")) {
          return;
       }
       v tp = this.p;
       if (tp != null && tp.h0() != null) {
          this.p.h0().removeOnScrollListener(this.s);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, v.class, "5")) {
          return;
       }
       a.b = k.c("default");
       a.l(false, "nearby", "", this.q);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
