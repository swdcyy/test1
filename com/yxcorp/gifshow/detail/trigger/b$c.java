package com.yxcorp.gifshow.detail.trigger.b$c;
import yg5.t0;
import com.yxcorp.gifshow.detail.trigger.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import yg5.s0;
import yg5.r0;

public class b$c implements t0	// class@001a20
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void s(boolean p0){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (p0) {
          this.b.R8(5);
       }else {
          this.b.P8(5);
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
