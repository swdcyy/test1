package com.yxcorp.gifshow.tti.module.BetaSdkInitModule;
import com.kwai.framework.init.TTIInitModule;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import o56.d;
import hlc.a;
import java.lang.Runnable;
import ekd.k1;

public class BetaSdkInitModule extends TTIInitModule	// class@001db8
{
    public static final int q;

    public void BetaSdkInitModule(){
       super();
    }
    public int f0(){
       return 19;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BetaSdkInitModule.class, "1")) {
          return;
       }
       Application uApplication = a.b();
       if (!PatchProxy.applyVoidOneRefs(uApplication, this, BetaSdkInitModule.class, "2") && d.i) {
          k1.o(new a(this, uApplication));
       }
       return;
    }
}
