package com.yxcorp.login.bind.presenter.n;
import sfc.a;
import com.yxcorp.login.bind.presenter.m;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class n extends a	// class@001a8c
{
    public final m c;

    public void n(m p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.W8(p0);
       return;
    }
}
