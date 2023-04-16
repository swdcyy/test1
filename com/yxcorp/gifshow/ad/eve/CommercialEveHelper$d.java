package com.yxcorp.gifshow.ad.eve.CommercialEveHelper$d;
import erd.g;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import android.os.SystemClock;
import yx.j0;

public final class CommercialEveHelper$d implements g	// class@001765
{
    public final long b;

    public void CommercialEveHelper$d(long p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommercialEveHelper$d.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          j0.f("CommercialEveHelper", "installPluginRx AdLaunchPredict plugin loaded success: "+p0+", "+"cost "+(SystemClock.elapsedRealtime() - this.b)+"ms", objArray);
       }
       return;
    }
}
