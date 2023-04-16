package com.kwai.nearby.local.presenter.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dd7.f0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import srb.b;
import lrb.a;
import vc7.d0;
import tw5.d;

public class q extends PresenterV2	// class@000fc6
{
    public d0 p;
    public d q;
    public final b r;

    public void q(){
       super();
       this.r = new f0(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q.class, "2")) {
          return;
       }
       a.j(this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       a.m(this.r);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.p = this.r8("HOME_LOCAL_PAGE_STATE");
       this.q = this.r8("local_current_city");
       return;
    }
}
