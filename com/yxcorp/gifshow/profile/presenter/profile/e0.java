package com.yxcorp.gifshow.profile.presenter.profile.e0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.yxcorp.gifshow.profile.presenter.profile.e0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.a;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.profile.presenter.profile.c0;
import erd.r;
import j4c.j0;
import z5c.l0;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.profile.presenter.profile.d0;
import j4c.k0;
import java.util.Collections;
import java.util.List;
import ql5.b;
import t3c.f;
import com.yxcorp.gifshow.profile.widget.HorizontalLoadMoreLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.profile.presenter.profile.e0$b;
import com.yxcorp.gifshow.profile.widget.SerialHorizontalLoadMoreLayout$b;
import com.yxcorp.gifshow.profile.widget.SerialHorizontalLoadMoreLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import s1c.r0;
import com.yxcorp.gifshow.profile.http.l;
import com.kwai.framework.model.user.User;

public class e0 extends PresenterV2	// class@00148f
{
    public RecyclerFragment p;
    public r0 q;
    public l r;
    public User s;
    public View t;
    public CustomRecyclerView u;
    public h2 v;
    public List w;
    public b x;
    public SerialHorizontalLoadMoreLayout y;
    public final q z;
    public static final int A;

    static {
       e0.A = a1.e(8.00f);
    }
    public void e0(){
       super();
       this.z = new e0$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "2")) {
          return;
       }
       this.r.h(this.z);
       g a = l0.a;
       this.X7(this.p.m().filter(c0.b).subscribe(new j0(this), a));
       this.X7(this.p.n1().filter(d0.b).subscribe(new k0(this), a));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "11")) {
          return;
       }
       b.b(Collections.EMPTY_LIST);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "3")) {
          return;
       }
       this.r.f(this.z);
       e0 tv = this.v;
       if (tv != null) {
          tv.e();
       }
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "6")) {
          return;
       }
       if (this.w.size() <= 4) {
          this.y.setMEnable(false);
          this.u.setNestedScrollingEnabled(false);
          return;
       }else {
          this.y.setMEnable(true);
          this.u.setNestedScrollingEnabled(true);
          this.y.setMReleaseCallback(new e0$b(this));
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e0.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(r0.class);
       this.r = this.r8("PAGE_LIST");
       this.s = this.r8("PROFILE_PAGE_USER");
       return;
    }
}
