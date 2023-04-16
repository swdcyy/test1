package com.yxcorp.gifshow.detail.trigger.b$d;
import yg5.t0;
import com.yxcorp.gifshow.detail.trigger.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import yg5.s0;
import yg5.r0;

public class b$d implements t0	// class@001a21
{
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public void s(boolean p0){
       b$d uod = b$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "1")) {
          return;
       }
       if (p0) {
          this.b.R8(8);
       }else {
          this.b.P8(8);
       }
       return;
    }
    public void wd(int p0,int p1,int p2,float p3,int p4){
       s0.c(this, p0, p1, p2, p3, p4);
    }
    public void xe(boolean p0,r0 p1){
       s0.b(this, p0, p1);
    }
}
