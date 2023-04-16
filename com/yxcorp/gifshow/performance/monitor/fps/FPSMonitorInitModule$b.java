package com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.performance.monitor.fps.FPSMonitorInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import mwb.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import fg6.a;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public final class FPSMonitorInitModule$b implements Runnable	// class@0012b0
{
    public final FPSMonitorInitModule b;

    public void FPSMonitorInitModule$b(FPSMonitorInitModule p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, FPSMonitorInitModule$b.class, "1")) {
          return;
       }
       SharedPreferences a = b.a;
       SharedPreferences$Editor uEditor = a.edit();
       uEditor.putBoolean("FpsMonitorOpen", a.t().d("FluencyFpsRate", false));
       g.a(uEditor);
       uEditor = a.edit();
       uEditor.putBoolean("LiveFpsMonitorOpen", a.t().d("LiveFpsMonitor", false));
       g.a(uEditor);
       SharedPreferences$Editor uEditor1 = a.edit();
       uEditor1.putBoolean("FeaturedMonitorTimeline", a.t().d("FeaturedMonitorTimeline", false));
       g.a(uEditor1);
       uEditor = a.edit();
       uEditor.putBoolean("LandscapeFpsMonitorOpen", a.t().d("LandscapeFpsRate", false));
       g.a(uEditor);
       SharedPreferences$Editor uEditor2 = a.edit();
       uEditor2.putBoolean("FpsMonitorLinkPageMonitor", a.t().d("fpsMonitorLinkPageMonitor", false));
       g.a(uEditor2);
       SharedPreferences$Editor uEditor3 = a.edit();
       uEditor3.putString("FpsSceneConfig", a.a.q(a.t().getValue("fpsSceneConfig", this.b.q, CollectionsKt__CollectionsKt.E())));
       g.a(uEditor3);
       return;
    }
}
