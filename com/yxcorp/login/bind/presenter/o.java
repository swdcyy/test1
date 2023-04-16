package com.yxcorp.login.bind.presenter.o;
import sfc.a;
import com.yxcorp.login.bind.presenter.m;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.util.f;

public class o extends a	// class@001a90
{
    public final m c;

    public void o(m p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
          return;
       }
       super.b(p0);
       f.a(p0);
       this.c.W8(p0);
       return;
    }
}
