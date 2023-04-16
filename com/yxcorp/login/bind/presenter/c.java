package com.yxcorp.login.bind.presenter.c;
import sfc.a;
import com.yxcorp.login.bind.presenter.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c extends a	// class@001a69
{
    public final a c;

    public void c(a p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       super.b(p0);
       return;
    }
}
