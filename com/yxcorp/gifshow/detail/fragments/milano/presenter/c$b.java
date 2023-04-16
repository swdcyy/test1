package com.yxcorp.gifshow.detail.fragments.milano.presenter.c$b;
import jta.c;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import jta.b;
import android.view.View;

public class c$b implements c	// class@00151c
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "3")) {
          return;
       }
       uob = this.a;
       boolean b = (!p0)? true: false;
       uob.S8(0, b);
       return;
    }
    public void b(float p0){
       b.a(this, p0);
    }
    public void c(float p0){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "2")) {
          return;
       }
       this.a.B.setAlpha(p0);
       return;
    }
    public void d(float p0){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       this.a.S8(0, 0);
       return;
    }
}
