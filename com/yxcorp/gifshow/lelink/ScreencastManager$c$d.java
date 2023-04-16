package com.yxcorp.gifshow.lelink.ScreencastManager$c$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.lelink.ScreencastManager$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import cgc.d;

public final class ScreencastManager$c$d implements Runnable	// class@001a30
{
    public final ScreencastManager$c b;
    public final long c;

    public void ScreencastManager$c$d(ScreencastManager$c p0,long p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager$c$d.class, "1")) {
          return;
       }
       ScreencastManager d = this.b.a.d;
       if (d != null) {
          d.g(this.c);
       }
       return;
    }
}
