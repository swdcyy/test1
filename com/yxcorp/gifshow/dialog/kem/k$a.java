package com.yxcorp.gifshow.dialog.kem.k$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class k$a implements Runnable	// class@001ac2
{
    public boolean b;
    public Runnable c;

    public void k$a(Runnable p0){
       super();
       this.c = p0;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "1")) {
          return;
       }
       if (this.b == null) {
          this.b = true;
          this.c.run();
       }
       return;
    }
}
