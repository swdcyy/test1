package com.yxcorp.login.userlogin.presenter.phoneverify.b;
import sfc.a;
import com.yxcorp.login.userlogin.presenter.phoneverify.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b extends a	// class@001bce
{
    public final c c;

    public void b(c p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       super.b(p0);
       return;
    }
}
