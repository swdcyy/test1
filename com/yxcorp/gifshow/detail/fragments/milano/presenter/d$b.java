package com.yxcorp.gifshow.detail.fragments.milano.presenter.d$b;
import jta.c;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import jta.b;
import android.view.View;

public class d$b implements c	// class@001521
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "3")) {
          return;
       }
       uob = this.a;
       boolean b = (!p0)? true: false;
       uob.X8(0, b);
       return;
    }
    public void b(float p0){
       b.a(this, p0);
    }
    public void c(float p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.a.t.setAlpha(p0);
       return;
    }
    public void d(float p0){
       d$b uob = d$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.X8(0, 0);
       return;
    }
}
