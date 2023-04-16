package com.yxcorp.gifshow.performance.monitor.memory.MemoryMonitorInitModule$b;
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

public final class MemoryMonitorInitModule$b implements Runnable	// class@000e8b
{
    public static final MemoryMonitorInitModule$b b;

    static {
       MemoryMonitorInitModule$b.b = new MemoryMonitorInitModule$b();
    }
    public void MemoryMonitorInitModule$b(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MemoryMonitorInitModule$b.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = b.a.edit();
       uEditor.putBoolean("PageMonitorSample", a.t().d("PageMemMonitor", false));
       g.a(uEditor);
       a.t().d("PageMemMonitor", false);
       return;
    }
}
