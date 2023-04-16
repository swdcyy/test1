package be6.d$a;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import be6.a;
import com.google.gson.Gson;
import be6.d;
import kotlin.jvm.internal.a;
import com.kwai.framework.plugin.log.PluginRatioLoggerKt;
import k2b.u1;
import java.lang.StringBuilder;

public final class d$a implements Runnable	// class@000469
{
    public final String b;
    public final boolean c;
    public final String d;
    public final long e;
    public final int f;
    public final String g;
    public final String h;

    public void d$a(String p0,boolean p1,String p2,long p3,int p4,String p5,String p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       a uoa = new a(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
       String str = d.a().q(v0);
       if (v0.isSuccess != null) {
          a.o(str, "data");
          PluginRatioLoggerKt.a("plugin_warm_up_download_event", str);
       }else {
          u1.Q("plugin_warm_up_download_event", str);
       }
       "plugin_warm_up_download_event "+v0;
       return;
    }
}
