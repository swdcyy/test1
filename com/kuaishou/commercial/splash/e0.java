package com.kuaishou.commercial.splash.e0;
import java.lang.Runnable;
import com.kuaishou.commercial.splash.SplashV2Activity;
import java.lang.Object;
import java.util.Objects;
import tkd.b;
import tkd.d;
import nl9.h0;
import com.kuaishou.commercial.splash.presenter.h;
import yy.t2;
import android.app.Activity;

public final class e0 implements Runnable	// class@0015ab
{
    public final SplashV2Activity b;

    public void e0(SplashV2Activity p0){
       this.b = p0;
    }
    public final void run(){
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       if (d.a(-536296199).Xe() && tb.B == null) {
          SplashV2Activity z = tb.z;
          if (z != null) {
             z.r = true;
          }
          tb.runOnUiThread(new t2(tb));
       }
       return;
    }
}
