package com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$b;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import mwb.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import com.yxcorp.gifshow.performance.monitor.page.NewPageMonitorInitModule$b$a;
import k2b.s1;

public final class NewPageMonitorInitModule$b implements Runnable	// class@000ea1
{
    public static final NewPageMonitorInitModule$b b;

    static {
       NewPageMonitorInitModule$b.b = new NewPageMonitorInitModule$b();
    }
    public void NewPageMonitorInitModule$b(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NewPageMonitorInitModule$b.class, "1")) {
          return;
       }
       SharedPreferences a = b.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putBoolean("PageConfigWithKeep", a.t().d("pageConfigKeepOpenRate", false));
       g.a(uEditor);
       SharedPreferences$Editor uEditor1 = a.edit();
       uEditor1.putLong("PageWriteScreenSecond", a.t().b("pageWriteScreenSecond", 5000));
       g.a(uEditor1);
       uEditor1 = a.edit();
       uEditor1.putLong("PageTimeoutSecond", a.t().b("pageTimeoutSecond", 0x2710));
       g.a(uEditor1);
       uEditor = a.edit();
       uEditor.putBoolean("EnableFluencyPageMonitor", a.t().d("enableFluencyPageMonitor", false));
       g.a(uEditor);
       SharedPreferences$Editor uEditor2 = a.edit();
       uEditor2.putBoolean("EnableScreenshotForFullyDraw", a.t().d("enableScreenshotForFullyDraw", false));
       g.a(uEditor2);
       SharedPreferences$Editor uEditor3 = a.edit();
       uEditor3.putString("ABTestPage", a.t().c("pageMonitorABPageInfo", ""));
       g.a(uEditor3);
       b.a(0x4b316083).T0(NewPageMonitorInitModule$b$a.b);
       return;
    }
}
