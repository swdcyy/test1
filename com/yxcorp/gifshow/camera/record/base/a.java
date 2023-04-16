package com.yxcorp.gifshow.camera.record.base.a;
import erd.g;
import java.lang.Class;
import java.lang.Object;
import x8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import o56.c;
import o56.a;
import oc9.c;
import java.lang.Exception;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Throwable;
import w46.b;

public final class a implements g	// class@000da3
{
    public final Class b;
    public final g c;

    public void a(Class p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       a tc = this.c;
       a uoa = a.D();
       String str = this.b.getSimpleName()+": "+tc+" accept";
       Object[] objArray = new Object[0];
       try{
          uoa.w("CallerContext", str, objArray);
          tc.accept(p0);
       }catch(java.lang.Exception e7){
          if (a.a().c()) {
             k1.r(new c(e7), 0);
          }else {
             a.D().e("CallerContext", this.b.getSimpleName()+" "+tc, e7);
          }
       }
       return;
    }
}
