package com.yxcorp.gifshow.autoplay.presenter.d$b;
import qvb.q;
import com.yxcorp.gifshow.autoplay.presenter.d;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import u99.d;
import java.util.Objects;
import com.yxcorp.gifshow.autoplay.dispatch.a;
import r99.a;

public class d$b implements q	// class@001c2a
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (p0) {
          d.d("AutoPlayCardAttachPresenter", "resetLastScrollInfo");
          d r = this.b.R;
          Objects.requireNonNull(r);
          if (!PatchProxy.applyVoid(null, r, a.class, "4")) {
             r.a.b();
          }
          r.S = true;
       }
       return;
    }
}
