package com.yxcorp.gifshow.lelink.ScreencastManager$j;
import java.lang.Runnable;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.lelink.util.KLogLelink;
import com.yxcorp.gifshow.lelink.util.KLogLelink$a;
import q87.c;
import wza.a;
import com.yxcorp.gifshow.lelink.ScreencastManager$d;

public final class ScreencastManager$j implements Runnable	// class@001a3a
{
    public final ScreencastManager b;

    public void ScreencastManager$j(ScreencastManager p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager$j.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       KLogLelink.e.a().w(this.b.a, "devices search timeout", objArray);
       ScreencastManager b = this.b.b;
       if (b != null) {
          b.a();
       }
       b = this.b.c;
       if (b != null) {
          b.a();
       }
       return;
    }
}
