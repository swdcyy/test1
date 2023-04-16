package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$initPageMonitor$4;
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

public final class NewPageMonitorInitModule$initPageMonitor$4 extends Lambda implements a	// class@000ea8
{
    public static final NewPageMonitorInitModule$initPageMonitor$4 INSTANCE;

    static {
       NewPageMonitorInitModule$initPageMonitor$4.INSTANCE = new NewPageMonitorInitModule$initPageMonitor$4();
    }
    public void NewPageMonitorInitModule$initPageMonitor$4(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, NewPageMonitorInitModule$initPageMonitor$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return b.a.getLong("PageWriteScreenSecond", 5000);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
