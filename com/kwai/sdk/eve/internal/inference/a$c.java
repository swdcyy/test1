package com.kwai.sdk.eve.internal.inference.a$c;
import java.lang.Runnable;
import brd.v;
import ml5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;

public final class a$c implements Runnable	// class@001568
{
    public final v b;
    public final a c;

    public void a$c(v p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$c.class, "1")) {
          return;
       }
       this.b.onNext(this.c);
       this.b.onComplete();
       return;
    }
}
