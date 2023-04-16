package com.yxcorp.gifshow.lelink.ScreencastManager$b$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.lelink.ScreencastManager$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import com.yxcorp.gifshow.screencast.ScreencastStatus;
import com.yxcorp.gifshow.lelink.ScreencastManager$d;

public final class ScreencastManager$b$a implements Runnable	// class@001a2b
{
    public final ScreencastManager$b b;

    public void ScreencastManager$b$a(ScreencastManager$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ScreencastManager$b$a.class, "1")) {
          return;
       }
       ScreencastManager$b a = this.b.a;
       ScreencastStatus bREAK = ScreencastStatus.BREAK;
       if (a.n != bREAK) {
          a.n = bREAK;
          ScreencastManager c = a.c;
          if (c != null) {
             c.b();
          }
       }
       return;
    }
}
