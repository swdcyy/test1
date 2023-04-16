package com.kwai.nearby.local.presenter.HomeLocalPermissionChangePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.nearby.local.presenter.HomeLocalPermissionChangePresenter$1;
import com.kwai.nearby.local.presenter.HomeLocalPermissionChangePresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import tw5.d;
import lrb.a;
import srb.b;
import vc7.d0;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import xl8.b;

public class HomeLocalPermissionChangePresenter extends PresenterV2	// class@000fa5
{
    public boolean p;
    public boolean q;
    public d0 r;
    public RecyclerFragment s;
    public d t;
    public b u;
    public String v;
    public final LifecycleObserver w;
    public final b x;

    public void HomeLocalPermissionChangePresenter(){
       super();
       this.p = true;
       this.q = true;
       this.w = new HomeLocalPermissionChangePresenter$1(this);
       this.x = new HomeLocalPermissionChangePresenter$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, HomeLocalPermissionChangePresenter.class, "2")) {
          return;
       }
       this.s.getLifecycle().addObserver(this.w);
       this.v = this.t.e();
       if (!a.a()) {
          a.j(this.x);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, HomeLocalPermissionChangePresenter.class, "3")) {
          return;
       }
       this.s.getLifecycle().removeObserver(this.w);
       a.m(this.x);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomeLocalPermissionChangePresenter.class, "1")) {
          return;
       }
       this.r = this.r8("HOME_LOCAL_PAGE_STATE");
       this.s = this.r8("FRAGMENT");
       this.t = this.r8("local_current_city");
       this.u = this.r8("nearby_header_NEARBY_LIFE_ENTRANCE_UPDATE_SUBJECT");
       return;
    }
}
