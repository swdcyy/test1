package com.kuaishou.live.core.show.wealthgrade.privilegedetail.h;
import k51.c;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qm2.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import k17.b;
import lnc.a1;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.d;
import com.kuaishou.live.core.show.wealthgrade.privilegedetail.i$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeItemInfo;
import android.view.View;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class h extends c	// class@001271
{
    public Observer p;
    public RecyclerView q;
    public RecyclerView r;
    public d s;
    public d t;
    public View u;
    public View v;
    public a w;
    public i$a x;
    public static String sLivePresenterClassName = "LiveWealthGradeDetailPrivilegeListPresenter";

    public void h(){
       super();
       this.p = new e(this);
    }
    public void E8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       h tw = this.w;
       tw.b.observe(tw.d, this.p);
       if (!PatchProxy.applyVoid(objArray, this, oh, "4")) {
          b uob = new b(1, a1.e(10.00f));
          d uod = new d(this.x);
          this.s = uod;
          this.q.setAdapter(uod);
          this.q.addItemDecoration(uob);
          uod = new d(this.x);
          this.t = uod;
          this.r.setAdapter(uod);
          this.r.addItemDecoration(uob);
       }
       return;
    }
    public final boolean P8(LiveWealthGradePrivilegeItemInfo p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       p0 = p0.mPrivilegeType;
       if (p0 != 1 && (p0 != 2 && (p0 != 3 && (p0 == 5 || p0 == 6)))) {
          b = true;
       }
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a281e);
       this.r = m1.f(p0, 0x7f0a2828);
       this.u = m1.f(p0, 0x7f0a2829);
       this.v = m1.f(p0, 0x7f0a281f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.w = this.q8(a.class);
       this.x = this.q8(i$a.class);
       return;
    }
}
