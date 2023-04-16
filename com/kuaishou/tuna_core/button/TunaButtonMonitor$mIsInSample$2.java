package com.kuaishou.tuna_core.button.TunaButtonMonitor$mIsInSample$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Math;
import com.kwai.sdk.switchconfig.a;
import com.kuaishou.tuna_core.button.TunaButtonMonitor$a;
import java.lang.reflect.Type;

public final class TunaButtonMonitor$mIsInSample$2 extends Lambda implements a	// class@001097
{
    public static final TunaButtonMonitor$mIsInSample$2 INSTANCE;

    static {
       TunaButtonMonitor$mIsInSample$2.INSTANCE = new TunaButtonMonitor$mIsInSample$2();
    }
    public void TunaButtonMonitor$mIsInSample$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       long l;
       TunaButtonMonitor$a obj = PatchProxy.apply(null, this, TunaButtonMonitor$mIsInSample$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       double d = Math.random() * (double)100;
       obj = a.t().getValue("TunaButtonMonitorEnable", TunaButtonMonitor$a.class, null);
       obj = (obj != null)? obj.mSampleRate: 0;
       boolean b = (d - (double)obj <= 0)? true: false;
       return b;
    }
}
