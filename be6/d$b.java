package be6.d$b;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import be6.b;
import com.google.gson.Gson;
import be6.d;
import kotlin.jvm.internal.a;
import com.kwai.framework.plugin.log.PluginRatioLoggerKt;
import k2b.u1;
import java.lang.StringBuilder;

public final class d$b implements Runnable	// class@00046a
{
    public final String b;
    public final boolean c;
    public final String d;
    public final long e;
    public final int f;
    public final String g;

    public void d$b(String p0,boolean p1,String p2,long p3,int p4,String p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, d$b.class, "1")) {
          return;
       }
       b uob = new b(this.b, this.c, this.d, this.e, this.f, this.g);
       String str = d.a().q(v0);
       if (v0.isSuccess != null) {
          a.o(str, "data");
          PluginRatioLoggerKt.a("plugin_warm_up_hit_event", str);
       }else {
          u1.Q("plugin_warm_up_hit_event", str);
       }
       "plugin_warm_up_hit_event "+v0;
       return;
    }
}
