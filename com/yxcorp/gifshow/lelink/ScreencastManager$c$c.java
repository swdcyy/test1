package com.yxcorp.gifshow.lelink.ScreencastManager$c$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.lelink.ScreencastManager$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import cgc.d;

public final class ScreencastManager$c$c implements Runnable	// class@001a2f
{
    public final ScreencastManager$c b;

    public void ScreencastManager$c$c(ScreencastManager$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager$c$c.class, "1")) {
          return;
       }
       ScreencastManager d = this.b.a.d;
       if (d != null) {
          d.onPause();
       }
       return;
    }
}
