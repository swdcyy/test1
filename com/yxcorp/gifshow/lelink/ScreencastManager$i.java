package com.yxcorp.gifshow.lelink.ScreencastManager$i;
import java.lang.Runnable;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import q87.c;
import cgc.b;

public final class ScreencastManager$i implements Runnable	// class@001a39
{
    public final ScreencastManager b;

    public void ScreencastManager$i(ScreencastManager p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager$i.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w("kwaiscreencast", "plugin fail timeout", objArray);
       ScreencastManager u = this.b.u;
       if (u != null) {
          u.a();
       }
       return;
    }
}
