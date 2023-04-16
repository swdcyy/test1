package com.yxcorp.gifshow.detail.presenter.o$b;
import jta.a;
import com.yxcorp.gifshow.detail.presenter.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;

public class o$b extends a	// class@0016f5
{
    public final o a;

    public void o$b(o p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       o$b uob = o$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.a;
       boolean b = (p0 - 0x3f800000)? true: false;
       uob.T = b;
       if (b) {
          uob.a9();
       }else {
          uob.d9();
       }
       return;
    }
}
