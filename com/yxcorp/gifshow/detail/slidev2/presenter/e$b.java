package com.yxcorp.gifshow.detail.slidev2.presenter.e$b;
import yg5.t0;
import com.yxcorp.gifshow.detail.slidev2.presenter.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import yg5.r0;
import yg5.s0;

public class e$b implements t0	// class@0018fb
{
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
    }
    public void s(boolean p0){
    }
    public void wd(int p0,int p1,int p2,float p3,int p4){
       e$b uob = this;
       e$b uob1 = e$b.class;
       if (PatchProxy.isSupport(uob1)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Float.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uob1, "1")) {
             return;
          }
       }
       e$b b = uob.b;
       boolean b1 = (p4 == 2)? true: false;
       b.P8(p0, p1, p2, p3, b1);
       return;
    }
    public void xe(boolean p0,r0 p1){
       s0.b(this, p0, p1);
    }
}
