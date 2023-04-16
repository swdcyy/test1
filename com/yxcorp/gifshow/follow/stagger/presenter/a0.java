package com.yxcorp.gifshow.follow.stagger.presenter.a0;
import com.kwai.component.homepage_interface.homeitemfragment.presenter.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.t;
import eja.a1;
import kga.c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;

public class a0 extends h	// class@001207
{
    public HomeFollowFragment H;

    public void a0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "2")) {
          return;
       }
       super.E8();
       this.X7(new FragmentCompositeLifecycleState(this.H).k().subscribe(new a1(this), c.a));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a0.class, "1")) {
          return;
       }
       super.j8();
       this.H = this.r8("FRAGMENT");
       return;
    }
}
