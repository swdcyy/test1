package com.yxcorp.gifshow.detail.slideplay.presenter.b$c;
import yg5.t0;
import com.yxcorp.gifshow.detail.slideplay.presenter.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import mn6.a;
import yg5.r0;
import yg5.s0;

public class b$c implements t0	// class@00183e
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void s(boolean p0){
    }
    public void wd(int p0,int p1,int p2,float p3,int p4){
       int i = 1;
       if (PatchProxy.isSupport(b$c.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Float.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, b$c.class, "1")) {
             return;
          }
       }
       b e = this.b.E;
       if (e != null) {
          if (p3) {
             i = false;
          }
          e.b(i);
       }
       return;
    }
    public void xe(boolean p0,r0 p1){
       s0.b(this, p0, p1);
    }
}
