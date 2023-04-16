package com.yxcorp.gifshow.push.init.interceptor.process.KwaiPushTypeInterceptor$vibrateAndSound$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.os.Vibrator;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class KwaiPushTypeInterceptor$vibrateAndSound$2 extends Lambda implements a	// class@001660
{
    public final Vibrator $vb;

    public void KwaiPushTypeInterceptor$vibrateAndSound$2(Vibrator p0){
       this.$vb = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, KwaiPushTypeInterceptor$vibrateAndSound$2.class, "1")) {
          return;
       }
       KwaiPushTypeInterceptor$vibrateAndSound$2 t$vb = this.$vb;
       if (t$vb != null) {
          t$vb.cancel();
       }
       return;
    }
}
