package com.yxcorp.gifshow.dialog.kem.k$c;
import java.lang.Runnable;
import java.lang.Object;
import b66.k$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import crd.b;
import lnc.b9;

public class k$c	// class@001ac4
{
    public Runnable a;
    public b b;

    public void k$c(Runnable p0){
       super();
       this.a = p0;
    }
    public void receiveState(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$c.class, "2")) {
          return;
       }
       p0 = p0.a;
       if (p0 != 2 && p0 == 3) {
          u1.b(this);
          b9.a(this.b);
          this.a.run();
       }
       return;
    }
}
