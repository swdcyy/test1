package com.kwai.nearby.local.presenter.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import dd7.m0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import org.greenrobot.eventbus.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import dd7.n0;
import lrb.a;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import q96.d;
import com.kwai.nearby.local.HomeLocalFragment;
import m56.f;
import m56.g;
import com.kwai.framework.activitycontext.ActivityContext;

public class t extends PresenterV2	// class@000fd5
{
    public HomeLocalFragment p;
    public boolean q;
    public NearbyLocationWindowShowConfig r;

    public void t(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "2")) {
          return;
       }
       this.X7(this.p.Vg().i().skip(1).subscribe(new m0(this), Functions.d()));
       if (!a.d().i(this)) {
          a.d().p(this);
       }
       this.X7(this.p.m().subscribe(new n0(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, t.class, "5")) {
          return;
       }
       if (a.d().i(this)) {
          a.d().t(this);
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, t.class, "6")) {
          return;
       }
       if (a.i() && this.p.c1()) {
          a.l(true, "nearby", "", null);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
    public void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "4")) {
          return;
       }
       if (this.p.Vg().c()) {
          this.q = false;
       }
       return;
    }
    public void onForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "3")) {
          return;
       }
       if (ActivityContext.g().h() && this.p.Vg().c()) {
          this.q = true;
       }
       return;
    }
}
