package com.kwai.performance.fluency.trace.monitor.TraceMonitor$b;
import erd.a;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import kotlin.io.FilesKt__UtilsKt;
import org.json.JSONObject;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import yf7.i;
import yf7.d;
import yf7.d$a;
import kotlin.jvm.internal.a;
import yf7.h;

public final class TraceMonitor$b implements a	// class@0010f6
{
    public final File b;
    public final File c;
    public final String d;
    public final String e;
    public final long f;

    public void TraceMonitor$b(File p0,File p1,String p2,String p3,long p4){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       super();
    }
    public final void run(){
       FilesKt__UtilsKt.V(this.b);
       this.c.delete();
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("scene", this.d);
       jSONObject.put("mLogUUID", this.c.getName());
       jSONObject.put("did", MonitorBuildConfig.c());
       jSONObject.put("uploadReason", this.e);
       jSONObject.put("traceDurationMS", this.f);
       String str = jSONObject.toString();
       d$a.c(i.a, "chronos_upload_event", str, false, 4, null);
       a.h(str, "it");
       h.d("TraceMonitor", str);
    }
}
