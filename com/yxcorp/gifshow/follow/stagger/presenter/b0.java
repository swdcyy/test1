package com.yxcorp.gifshow.follow.stagger.presenter.b0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import eja.b1;
import kga.c;
import erd.g;
import crd.b;
import dha.l;
import eja.c1;
import y99.i;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import xl8.b;
import dha.d;
import rja.c;

public class b0 extends PresenterV2	// class@001209
{
    public l p;
    public i q;
    public HomeFollowFragment r;
    public b s;
    public d t;
    public c u;
    public b v;
    public boolean w;

    public void b0(){
       super();
       this.w = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "2")) {
          return;
       }
       g a = c.a;
       this.X7(this.r.Vg().f().subscribe(new b1(this), a));
       this.X7(this.p.b().subscribe(new c1(this), a));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b0.class, "1")) {
          return;
       }
       this.p = this.r8("FOLLOW_FEEDS_STATE_USER_LOGIN");
       this.q = this.r8("HOST_PLAY_STATE_SELECT");
       this.r = this.r8("FRAGMENT");
       this.s = this.r8("FOLLOW_PAGE_DATA_LOAD_FAILED");
       this.t = this.r8("FOLLOW_FEEDS_STATE_REFRESH");
       this.u = this.r8("FOLLOW_FILTER_STATE");
       this.v = this.r8("FOLLOW_FILTER_SHOW_STATUS");
       return;
    }
}
