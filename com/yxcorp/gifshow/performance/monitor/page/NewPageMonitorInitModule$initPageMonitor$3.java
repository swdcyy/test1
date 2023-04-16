package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import mwb.b;
import android.content.SharedPreferences;
import java.lang.Long;

public final class NewPageMonitorInitModule$initPageMonitor$3 extends Lambda implements a	// class@000ea7
{
    public static final NewPageMonitorInitModule$initPageMonitor$3 INSTANCE;

    static {
       NewPageMonitorInitModule$initPageMonitor$3.INSTANCE = new NewPageMonitorInitModule$initPageMonitor$3();
    }
    public void NewPageMonitorInitModule$initPageMonitor$3(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, NewPageMonitorInitModule$initPageMonitor$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return b.a.getLong("PageTimeoutSecond", 0x2710);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
