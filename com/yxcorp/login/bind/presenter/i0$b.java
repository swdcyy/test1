package com.yxcorp.login.bind.presenter.i0$b;
import sfc.a;
import com.yxcorp.login.bind.presenter.i0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class i0$b extends a	// class@001a78
{
    public final i0 c;

    public void i0$b(i0 p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$b.class, "1")) {
          return;
       }
       super.b(p0);
       return;
    }
}
