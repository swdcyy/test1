package com.kuaishou.tk.api.loader.TKLoader$c;
import java.lang.Runnable;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import rx4.i;
import tx4.w;

public final class TKLoader$c implements Runnable	// class@000f92
{
    public final Throwable b;

    public void TKLoader$c(Throwable p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, TKLoader$c.class, "1")) {
          return;
       }
       d.a(0x256720e1).Jj(this.b, null, "");
       return;
    }
}
