package com.yxcorp.gifshow.performance.monitor.page.PageMonitorInitModule$b;
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

public final class PageMonitorInitModule$b implements Runnable	// class@000eb6
{
    public static final PageMonitorInitModule$b b;

    static {
       PageMonitorInitModule$b.b = new PageMonitorInitModule$b();
    }
    public void PageMonitorInitModule$b(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PageMonitorInitModule$b.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean("PageSpeedMonitorOpen", a.t().d("PageSpeedSamplingRate", false));
       g.a(uEditor);
       return;
    }
}
