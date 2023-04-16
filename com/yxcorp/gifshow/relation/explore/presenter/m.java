package com.yxcorp.gifshow.relation.explore.presenter.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.explore.presenter.m$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.relation.explore.presenter.l;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import k2b.f3;
import lnc.i3;
import java.lang.Boolean;
import com.google.android.material.appbar.AppBarLayout$c;
import com.google.android.material.appbar.AppBarLayout;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.refresh.RefreshLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dac.b;

public class m extends PresenterV2	// class@001856
{
    public b p;
    public final AppBarLayout$c q;
    public BaseFragment r;
    public View s;
    public AppBarLayout t;
    public RefreshLayout u;
    public RecyclerView v;
    public i w;
    public boolean x;

    public void m(){
       super();
       this.q = new m$a(this);
       this.x = false;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "4")) {
          return;
       }
       this.t.setOnClickListener(new l(this));
       if (this.x == null) {
          this.x = true;
          f3 uof3 = f3.l("", "SEARCH_BUTTON");
          i3 oi3 = i3.f();
          oi3.a("is_list_loc", Boolean.TRUE);
          uof3.m(oi3.e());
          uof3.n(6);
          uof3.g();
       }
       this.t.c(this.q);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "5")) {
          return;
       }
       this.t.o(this.q);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "3")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a3537);
       this.v = m1.f(p0, 0x7f0a34da);
       this.t = m1.f(p0, 0x7f0a0224);
       this.s = m1.f(p0, 0x7f0a37a6);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.r = this.r8("FRAGMENT");
       this.p = this.q8(b.class);
       return;
    }
}
