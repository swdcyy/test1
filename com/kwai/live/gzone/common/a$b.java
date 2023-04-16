package com.kwai.live.gzone.common.a$b;
import qvb.q;
import com.kwai.live.gzone.common.a;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qvb.i;
import h47.c;
import java.lang.Runnable;
import android.view.ViewGroup;

public class a$b implements q	// class@000cac
{
    public final a b;

    public void a$b(a p0){
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
       if (PatchProxy.isSupport(a$b.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, a$b.class, "1")) {
          return;
       }
       if (!this.b.d.isEmpty()) {
          this.b.b.post(new c(this));
       }
       return;
    }
}
