package com.kwai.framework.krn.init.preload.f;
import a96.l;
import com.kwai.framework.krn.init.preload.e;
import brd.v;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import brd.g;
import njd.a;

public class f implements l	// class@001614
{
    public final v a;
    public final e b;

    public void f(e p0,v p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "2")) {
          return;
       }
       this.a.onError(new Throwable(p1));
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       this.a.onNext(p0);
       this.a.onComplete();
       return;
    }
}
